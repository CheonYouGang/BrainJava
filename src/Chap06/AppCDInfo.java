/**
 * 2018. 5. 18. Dev By Cheon You Gang
   Chap06
   AppCDInfo.java
 */
package Chap06;

 /**
  * @author kosea112
  *
  */
public class AppCDInfo extends CDInfo implements Landable {

	String borrower;		//대출인
	String checkOutDate;	//대출 날짜
	byte state;				//대출 상태
	 
	
	
	public AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}

	@Override
	public void checkOut(String borrower, String date) {	//대출
		if(state == STATE_BORROWED)
			return;
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=STATE_BORROWED;
		System.out.println("*"+title+" 이(가) 대출되었습니다.");
		System.out.println("대출인: "+borrower);
		System.out.println("대출인: "+date+"\n");
	}

	@Override
	public void checkIn() {		//반납
		this.borrower=null;
		this.checkOutDate=null; 
		this.state=STATE_NORMAL;
		System.out.println("*"+title+" CD가 반납되었습니다.\n");
	}

}
