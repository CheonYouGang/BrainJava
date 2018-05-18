/**
 * 2018. 5. 18. Dev By Cheon You Gang
   Chap06
   InterfaceEx1.java
 */
package Chap06;

/**
 * @author kosea112
 *
 */
public class InterfaceEx1 {

	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume("863?774개", "개미", "베르나르 베르베르");
		// (책번호, 책제목, 저자)
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");
		// (관련번호, 타이틀)

		obj1.checkOut("가나다", "20060315");// (대출인, 대출 날짜)
		obj2.checkOut("라마바", "20060317");
		obj1.checkIn();
		obj2.checkIn();

		System.out.println("===============================");
	
		
		// 인터페이스 다형성
		Landable obj = new SeparateVolume("863?774개", "개미", "베르나르 베르베르");
										// (책번호, 책제목, 저자)
		try {
			obj.checkOut("가나다", "20060315");// (대출인, 대출 날짜)
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		obj.checkIn();
		

		obj = new AppCDInfo("2005-7001", "Redhat Fedora");
							// (관련번호, 타이틀)
		try {
			obj.checkOut("라마바", "20060317");
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
 		}
		obj.checkIn();
	}

}
