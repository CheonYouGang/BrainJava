/**
 * 2018. 5. 11. Dev By Cheon You Gang
   com.geometry.polygon
   Rectangle.java
 */
package com.geometry.polygon;

 /**
  * @author kosea112
  *
  */
public class Rectangle {
	/*
	public 시켜주는 이유
	=> PackageEx2의 Rectangle 참조변수(래퍼런스)가
              다른 패키지인 com.geometry.polygon의 Rectangle 클래스를 참조해야하기 때문
	*/
	public int width, height;
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	public int getArea() {
		return width*height;
	}
}
