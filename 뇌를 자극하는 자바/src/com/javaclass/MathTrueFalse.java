/**
 * 2018. 5. 15. Dev By Cheon You Gang
   com.javaclass
   MathTrueFalse.java
 */
package com.javaclass;

import java.util.GregorianCalendar;
import java.util.Random;

/**
  * @author kosea112
  *
  */
public class MathTrueFalse {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		Random rd = new Random(gc.getTimeInMillis());
		
		for(int i = 1; i<=10; i++) {
			boolean tf =  rd.nextBoolean();
			if(tf==true) {
				System.out.println(i+"번째는 " + "앞(True)");
			}else {
				System.out.println(i+"번째는 " + "뒤(False)");
			}
		}
	}

}
