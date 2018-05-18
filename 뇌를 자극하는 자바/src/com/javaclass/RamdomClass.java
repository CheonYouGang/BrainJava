/**
 * 2018. 5. 15. Dev By Cheon You Gang
   com.javaclass
   RamdomClass.java
 */
package com.javaclass;

import java.util.Date;
import java.util.Random;

/**
  * @author kosea112
  *
  */
public class RamdomClass {

	public static void main(String[] args) {
		
		
		//sin, cos, tan
		System.out.println("sin(pi) = " + Math.sin(Math.PI));
		System.out.println("cos(pi) = " + Math.cos(Math.PI));
		System.out.println("tan(pi) = " + Math.tan(Math.PI));
		System.out.println();
		
		//단순 랜덤
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println();
		
		//1~100까지의 random value
		for(int i=1; i<=6; i++) {
			double rv = Math.random();
			int value = (int)(rv*45)+1;
			System.out.println(i+"번째 난수: "+value);
		}
		System.out.println();
		
		//날짜
		Date date = new Date();
		System.out.println(date.getTime());
		
		Random random4 = new Random();
		System.out.println(random4.nextInt(100));
		System.out.println(random4.nextInt(100));
		System.out.println(random4.nextInt(100));
		System.out.println();
			
		//nextInt - int형 반환되는 100까지의 정수
		Random random = new Random();
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println();
		System.out.println(random.nextBoolean());
		System.out.println(random.nextFloat());
		System.out.println();
		
		Random random2 = new Random(349239L);
		System.out.println(random2.nextInt(100));
		System.out.println(random2.nextInt(100));
		System.out.println(random2.nextInt(100));
		System.out.println();
	}

}
