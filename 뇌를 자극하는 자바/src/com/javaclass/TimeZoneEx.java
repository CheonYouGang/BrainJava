/**
 * 2018. 5. 14. Dev By Cheon You Gang
   com.javaclass
   TimeZoneEx.java
 */
package com.javaclass;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/**
  * @author kosea112
  *
  */
public class TimeZoneEx {

	public static void main(String[] args) {
		String[] ids = TimeZone.getAvailableIDs();
		for(String id:ids) {
			System.out.println(DtimeZone(TimeZone.getTimeZone(id)));
		}
		System.out.println("\nTotal TimeZone ID"+ids.length);

	}
	
	private static String DtimeZone(TimeZone tz) {
		long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
		long min = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()-TimeUnit.HOURS.toMinutes(hours));
		
		// avoid -4:-30 issue
		min = Math.abs(min);

		String result = "";
		if (hours > 0) {
			result = String.format("(GMT+%d:%02d) %s", hours, min, tz.getID());
		} else {
			result = String.format("(GMT%d:%02d) %s", hours, min, tz.getID());
		}

		return result;

	}

}
