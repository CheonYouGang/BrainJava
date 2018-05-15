/**
 * 2018. 5. 15. Dev By Cheon You Gang
   com.javaclass
   FiveNumbers.java
 */
package com.javaclass;

import java.util.Random;

/**
  * @author kosea112
  *
  */
public class FiveNumbers {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Random rd = new Random();
		int index = rd.nextInt(5);
		System.out.println(arr[index]);

	}

}
