/**
 * 2018. 5. 2. Dev By Cheon You Gang
   
   Circle.java
 */

/**
 * @author kosea112
 *
 */
public class Circle {
	
	public int radius;
	public String name;
	
	public Circle() {//매개변수 없는 원의 생성자
		radius = 1;
		name = ""; 
	}
	
	public Circle(int r, String n) { // 매개 변수를 가진 생성자
		radius = r;
		name = n;
	}
	
	public double getArea() {//메소드
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {//메인메소드

		Circle pizza = new Circle(10, "자바피자"); // Circle 객체 생성,반지름 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle donut = new Circle(); // Circle 객체 생성, 반지름 1
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);

	}

}
