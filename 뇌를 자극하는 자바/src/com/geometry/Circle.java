/**
 * 2018. 5. 11. Dev By Cheon You Gang
   com.geometry
   Circle.java
 */
package com.geometry;

 /**
  * @author kosea112
  *
  */
public class Circle {
	int radius;
	
	Circle(int radius){
		this.radius =  radius;
	}
	
	double getArea() {
		return radius*radius*3.14;
	}
}
