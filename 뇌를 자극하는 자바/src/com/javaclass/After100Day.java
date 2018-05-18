/**
 * 2018. 5. 15. Dev By Cheon You Gang
   com.javaclass
   Chap9_3.java
 */
package com.javaclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
  * @author kosea112
  *
  */
public class After100Day {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//new Calender()로 만들 수가 없음.
		cal.setTime(new Date());//시간 기준.
		cal.add(cal.DATE, 100);//add: 날짜나 시간 등을 더함.
		
		//.getTime()현재 시간을 보여줌
//		System.out.println(cal.getTime());
	
		//SimpleDateFormat로 국내 규격으로 수정.
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd EEEE");
		String date = df.format(cal.getTime());
		System.out.println(date);
	}

}
