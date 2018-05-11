/**
 * 2018. 5. 11. Dev By Cheon You Gang
   com.math
   PackageEx2.java
 */
package com.math;

import com.geometry.polygon.Rectangle;

/**
  * @author kosea112
  *
  */
public class PackageEx2 {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(2, 3);
		System.out.println("넓이 " + rec.width);
		System.out.println("높이 " + rec.height);
		System.out.println("면적 " + rec.getArea());

	}

}
