/**
 * 2018. 5. 18. Dev By Cheon You Gang
   Chap06
   InterfaceEx2.java
 */
package Chap06;

 /**
  * @author kosea112
  *
  */
public class InterfaceEx2 {

	public static void main(String[] args) {
		Landable arr[] = new Landable[3];
		
		arr[0] = new SeparateVolume("883ㅇ326ㅍ2", "푸코의진자", "에코");
		arr[1] = new SeparateVolume("609.2ㄱ428ㅅ", "서양미술사", "곰브리치");
		arr[2] = new AppCDInfo("2002-1742", "XML자바 프로그래밍");
		checkOutAll(arr,"윤지혜","20060315");
	}
	
	static void checkOutAll(Landable arr[], String borrower, String date) {
		for (int cnt = 0; cnt < arr.length; cnt++) {
			try {
				arr[cnt].checkOut(borrower, date);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
