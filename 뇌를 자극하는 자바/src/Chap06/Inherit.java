/**
 * 2018. 5. 15. Dev By Cheon You Gang
   Chap06
   Inherit.java
 */
package Chap06;

 /**
  * @author kosea112
  *
  */

//슈퍼클래스(부모)
class Person{
	int money;
	
	public Person() {
		//기본 생성자
		System.out.println("부모클래스에 기본 생성자 Person() 호출");
	}
	
	public Person(int money) {
		this.money=money;
		System.out.println("부모클래스에 생성자 Person(int money) 호출");
	}
	
	public int displayMoney() {
		System.out.println("재산: "+money);
		return money;
	}
}

//서브클래스(자식)
class Child extends Person{
	public Child() {
		System.out.println("자식클래스에 기본 생성자 Child() 호출");
		super.displayMoney();
		super.money = 50;
	}
}

public class Inherit {

	public static void main(String[] args) {
//		Person person = new Person(100000000);
//		System.out.println("재산: "+person.money);
		
		Child child = new Child();
//		System.out.println(child.money);

	}

}
