/**
 * 2018. 5. 18. Dev By Cheon You Gang
   Chap06
   SeparateVolume.java
 */
package Chap06;

 /**
  * @author kosea112
  *
  */
public class SeparateVolume implements Landable {

	String requestNo;	//책번호
	String bookTitle;	//책 제목
	String writer;		//저자
	String borrower;	//대출인
	String checkOutDate;//대출 날짜
	byte state;			//대출 상태
	
	public SeparateVolume(String requestNo,	String bookTitle, String writer) {
		this.requestNo=requestNo;
		this.bookTitle=bookTitle;
		this.writer=writer;
	}
	
	@Override
	public void checkOut(String borrower, String date){
		if(state == STATE_BORROWED)
			return;
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=STATE_BORROWED;
		System.out.println("*"+bookTitle+" 이(가) 대출되었습니다.");
		System.out.println("대출인: "+borrower);
		System.out.println("대출인: "+date+"\n"); 
	}

	@Override
	public void checkIn() { 
		this.borrower=null;
		this.checkOutDate=null;
		this.state=STATE_NORMAL;
		System.out.println("*"+bookTitle+" 이(가) 반납되었습니다.\n");
	}

}
