/**
 * 2018. 5. 3. Dev By Cheon You Gang
   
   PersonInfo.java
 */

/**
 * @author kosea112
 *
 */
public class PersonInfo {

	public static void main(String[] args) {
		Person obj;//클래스 변수
		//매개변수 없는 디폴트 생성자 호출하여 객체 생성
/*		person = new Person();*/

		//매개변수 1개(name)있는 생성자 호출하여 객체 생성
/*		person = new Person("Kim");*/
		
		//매개변수 2개(name,age)있는 생성자 호출하여 객체 생성
		obj = new Person("kim", 26);
		
		//매개변수 2개(age,name)있는 생성자 호출하여 객체 생성
/*		obj = new Person(28, "kim");*/
		
		//메소드 호출
		obj.showPerson(obj);
		obj.showPerson();
//		System.out.println(obj);
	}

}
