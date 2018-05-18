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
		this.radius = 1;
		this.name = "";
		//name = "";
		
		
	}
	
	public Circle(int radius, String name) { // 매개 변수를 가진 생성자
		this.radius = radius;
		this.name = name;
	}
	
	public double getArea() {//메소드
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {//메인메소드(1번)

		Circle pizza = new Circle(10, "자바피자"); // Circle 객체 생성(radius '10', name '자바피자')
		double pizza_area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + pizza_area);

/*		Circle donut = new Circle(); // Circle 객체 생성, 반지름 1
		donut.name = "자바도넛";
		donut.radius = 2;
		double donut_area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + donut_area);*/
	}

}
