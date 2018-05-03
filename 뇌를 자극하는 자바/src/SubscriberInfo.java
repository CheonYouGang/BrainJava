/**
 * 2018. 5. 3. Dev By Cheon You Gang
   
   Subscriber.java
 */

/**
 * @author kosea112
 *
 */
public class SubscriberInfo {

	public static void main(String[] args) {
		Subscriber obj1, obj2;
		obj1 = new Subscriber("Kim", "A", "1234");
		obj2 = new Subscriber("Lee", "B", "4567", "010-1234-5678", "abc1234@naver.com");
		
		printSubscriberInfo(obj1);//static void printSubscriberInfo() 메소드를 만들어야 함
		printSubscriberInfo(obj2);
	}
	static void printSubscriberInfo(Subscriber obj) {//객체 필드값을 모두 출력하는 메소드
		System.out.println("이름: " + obj.name);
		System.out.println("아이디: " + obj.id);
		System.out.println("패스워드: " + obj.password);
		System.out.println("전화번호: " + obj.phoneNo);
		System.out.println("주소: " + obj.address);
		System.out.println();//줄바꿈

	}
}
