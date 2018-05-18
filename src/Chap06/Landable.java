/**
 * 2018. 5. 18. Dev By Cheon You Gang
   Chap06
   Landable.java
 */
package Chap06;

 /**
  * @author kosea112
  *
  */
public interface Landable {
	//상수 필드
	final static byte STATE_BORROWED=1;	//대출 중(대출 불가)
	final static byte STATE_NORMAL=0;	//대출되지 않은 상태
	
	//추상메소드
	abstract void checkOut(String borrower, String date) throws Exception;	//대출
	abstract void checkIn();								//반납 
	//abstract는 java에서 컴파일할때 자동 생성되서 선언 안해도 됨.
}
