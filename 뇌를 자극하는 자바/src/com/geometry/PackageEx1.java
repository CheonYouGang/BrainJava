/**
 * 2018. 5. 11. Dev By Cheon You Gang
   com.geometry
   PackageEx1.java
 */
package com.geometry;

 /**
  * @author kosea112
  *
  */
public class PackageEx1 {

	public static void main(String[] args) {

		Circle obj = new Circle(5);
		
		System.out.println("반지름= " + obj.radius);
		System.out.println("원의 넓이= " + obj.getArea());
	}
}
