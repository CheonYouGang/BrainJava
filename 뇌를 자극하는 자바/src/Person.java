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
	public Person(String name, int age) {//매개변수 2개있는 생성자
		this.name=name;
		this.age=age;
	}
	public void showPerson() {
		System.out.println("이름: "+name+" 나이: "+age);
	}
}
