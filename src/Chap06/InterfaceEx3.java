/**
 * 2018. 5. 18. Dev By Cheon You Gang
   Chap06
   InterfaceEx3.java
 */
package Chap06;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
  * @author kosea112
  *
  */
public class InterfaceEx3 {

	public static void main(String[] args) {
		SeparateVolume obj = new SeparateVolume("863?774개", "개미", "베르나르 베르베르");
	
		Date date = new Date();
		SimpleDateFormat sf= new SimpleDateFormat("yyyy-MM-dd");
		String strDate = sf.format(date);
		
		try { 
			obj.checkOut("ABC", strDate);
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
		printState(obj);
		
		obj.checkIn();
		printState(obj);
	}

	private static void printState(SeparateVolume obj) {
		if(obj.state==Landable.STATE_NORMAL) {
			System.out.println("=====================");
			System.out.println("대출상태: 대출 가능");
			System.out.println("=====================");
		}else{
			System.out.println("=====================");
			System.out.println("대출상태: 대출 중");
			System.out.println("대출인: "+obj.borrower);
			System.out.println("대출 날짜: "+obj.checkOutDate);
			System.out.println("=====================");
		}
			
	}

}
