/**
 * 2018. 5. 17. Dev By Cheon You Gang
   Chap06
   InheritanceEx8.java
 */
package Chap06;

 /**
  * @author kosea112
  *
  */

//InheritanceEx6과 연동 된 상태.
public class InheritanceEx8 {

	public static void main(String[] args) {
		//다형 (abstract class를 가져야 함.)
		EmailSender em = new EmailSender("생일 축하합니다", "고객센터",
									"abc@naver.com", "10% 할인쿠폰");
		SMSSender sms = new SMSSender("2주년 기념", "괴상한게임",
									"070-1238-4567", "200G 증정");
		
		send(sms, "qwerty@naver.com");//static void send의(위의 타입변수'래퍼런스'(em, sms 중 하나) 선택해)
		send(em, "zxcvbn@naver.com");//(recipient)에 넣을 "내용"을 넣음.
		send(em, "010-7894-5065");
	}

	static void send(MessageSender obj, String recipient) {
		obj.sendMassage(recipient);
	}
}
