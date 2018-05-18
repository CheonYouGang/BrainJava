/**
 * 2018. 5. 16. Dev By Cheon You Gang
   Chap06
   InheritanceEx1.java
 */
package Chap06;

 /**
  * @author kosea112
  *
  */
class Account{
	String accountNo;
	String ownerName;
	int balance;

/*	public Account() {
		System.out.println("Account() 기본생성자");
	}*/

	//밑에 super로 지정되어서 기본생성자중 가장 먼저 생성된다.
	Account (String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		System.out.println("Account (String accountNo, String ownerName, int balance)");
	}
	
	public int displayBalance() {
		return balance;
	}
	public void deposit(int amount) {
		balance += amount; 
	}
	int withdraw(int amount) throws Exception{//인출기능
		if(balance<amount)
			throw new Exception("잔액이 부족합니다");
		balance -= amount;
		return amount;
	}
}

//일반 통장
class CheckingAccount extends Account{
	String cardNo;
	
/*	public CheckingAccount() {
		System.out.println("CheckingAccount() 기본생성자");
	}*/
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		//super. : 부모(슈퍼클래스)호출 [Account (String accountNo, String ownerName, int balance) 생성자 값 불러옴]
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
		System.out.println("CheckingAccount(String accountNo, String ownerName, int balance, String cardNo)");
	}
	
	int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo))
			throw new Exception("계좌번호가 일치하지 않습니다.");
		if(!cardNo.equals(this.cardNo)||(balance<amount))
			throw new Exception("(pay(cardNo, amount) 금액이 부족합니다");
		return withdraw(amount);
	}
}

public class InheritanceEx1 {

	public static void main(String[] args) {
		//래퍼런스(참조)변수 = 기본 생성자 호출문
		CheckingAccount ca = new CheckingAccount("111-22-333333", "ABC", 100000, "5555-6666-7777-8888");;
	
/*	
 		CheckingAccount ca = new CheckingAccount();
 		ca.accountNo = "111-22-333333";
		ca.ownerName = "ABC";
		ca.cardNo = "5555-6666-7777-8888";
		
		ca.deposit(100000);*/
		
		
		
		try {
			int paidAmount = ca.pay("5555-6666-7777-8888", 50000);
			System.out.println("지불액: " + paidAmount);
			System.err.println("잔액" + ca.balance);
		} catch (Exception e) {
			System.out.println(e.hashCode());
			System.out.println(e.getMessage());
			String msg = e.getMessage();
			System.out.println("예외메세지: "+msg);
		}

	}

}
