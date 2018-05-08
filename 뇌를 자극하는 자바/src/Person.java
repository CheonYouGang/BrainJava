/**
 * 2018. 5. 3. Dev By Cheon You Gang
   
   Person.java
 */

/**
 * @author kosea112
 *
 */
public class Person {

	String name;
	int age;
	
	public Person(){//생성자
	}
	public Person(String name) {//매개변수 있는 생성자
		this.name=name;
	}
	public Person(String name, int age) {//매개변수 2개있는 생성자(이름, 나이)
		this.name=name;
		this.age=age;
		System.out.println("public Person(String name, int age) 매개변수 2개있는 생성자");
	}
	public Person(int age, String name) {//매개변수 2개있는 생성자(나이, 이름)
		this.age=age;
		this.name=name;
		System.out.println("public Person(int age, String name) 매개변수 2개있는 생성자");
	}
	public void showPerson() {
		System.out.println("이름: "+name+" 나이: "+age);
	}
	public void showPerson(Person obj) {
		System.out.println("showPerson(Person obj) 메소드 호출");
		System.out.println("이름: "+obj.name);
		System.out.println("나이: "+obj.age+"입니다.");
		
		obj.name = "Lee";
		obj.age = 10;
	}
}
