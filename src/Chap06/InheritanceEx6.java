/**
 * 2018. 5. 17. Dev By Cheon You Gang
   Chap06
   InheritanceEx6.java
 */
package Chap06;

 /**
  * @author kosea112
  */

//메시지 발송
//abstract void sendMassage(String recipient);이 추상메소드라 MessageSender클래스도 추상 클래스.
abstract class MessageSender{
	String title;
	String senderName;
	
	public MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}

	abstract void sendMassage(String recipient);//추상메소드
}

//이메일 송신
class EmailSender extends MessageSender{//abstract 때문에 메소드 구현을 반드시 해줘야 함.
	String senderAddr;
	String emailBody;
	
	public EmailSender(String title, String senderName,
			String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	@Override
	void sendMassage(String recipient) {
		System.out.println("******************************");
		System.out.println("제목: "+title);
		System.out.println("보내는 사람: " + senderName + " (" + senderAddr + ")");
		System.out.println("받는 사람: " + recipient);
		System.out.println("내용: " + emailBody);
	}
	
}

//문자메세지 송신
class SMSSender extends MessageSender{//abstract 때문에 메소드 구현을 반드시 해줘야 함.
	String returnPhoneNo;
	String message;
	
	public SMSSender(String title, String senderName, String returnPhoneNo, String message) {
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}

	@Override
	void sendMassage(String recipient) {
		System.out.println("******************************");
		System.out.println("제목: " + title);
		System.out.println("보내는 사람: " + senderName);
		System.out.println("전화번호: " + recipient);
		System.out.println("회신 전화번호: " + returnPhoneNo);
		System.out.println("메세지 내용: " + message);	
	}
}

//사용하는 프로그램
public class InheritanceEx6 {

	public static void main(String[] args) {
		//상속
		EmailSender em = new EmailSender("생일 축하합니다", "고객센터",
									"abc@naver.com", "10% 할인쿠폰");
		SMSSender sms = new SMSSender("2주년 기념", "괴상한게임",
									"070-1238-4567", "200G 증정");
		
		em.sendMassage("qwerty@naver.com");
		em.sendMassage("zxcvbn@naver.com");
		sms.sendMassage("010-7894-5065");
		
//		//다형 (abstract class를 가져야 함.)
//		MessageSender mes = new EmailSender("생일 축하합니다", "고객센터",
//											"abc@naver.com", "10% 할인쿠폰");
//		mes.sendMassage("uiop@naver.com");
	}
}