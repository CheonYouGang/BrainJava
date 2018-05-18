/**
 * 2018. 5. 3. Dev By Cheon You Gang
   
   SubscriberInfo.java
 */

/**
 * @author kosea112
 *
 */
public class Subscriber {
	
	String name, id, password;
	String phoneNo, address;
	
	//생성자(이름, 아이디, 패스워드)
	public Subscriber(String name, String id, String password) {
		this.name=name;
		this.id=id;
		this.password=password;
	}
	//생성자(All)
	public Subscriber(String name, String id, String password, String phoneNo, String address) {
		this.name=name;
		this.id=id;
		this.password=password;
		this.phoneNo=phoneNo;
		this.address=address;
	}
	
	void changePassword(String password) {
		this.password=password;
	}
	void setPhoneNo(String phoneNo) {
		this.phoneNo=phoneNo;
	}
	void setAddress(String address) {
		this.address=address;
	}
	
}
