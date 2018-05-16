/**
 * 2018. 5. 16. Dev By Cheon You Gang
   Chap06
   InheritanceEx2.java
 */
package Chap06;

 /**
  * @author kosea112
  *
  */
class CreditLineAccount extends Account{
	int creditLine;//마이너스 한도
	
	CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
		System.out.println("CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine)");
	}
	
	public int displayCreditLine() {
		return creditLine;
	}
	
	int withdraw(int amount) throws Exception{//인출기능
		if((balance+creditLine)<amount)
			throw new Exception("더 이상 인출하실 수 없습니다.");
		balance -= amount;
		return amount;
	}
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		CreditLineAccount cla = new CreditLineAccount("000-11-222222", "가나다", -60000, 100000);
		
		try {
			int amount  = cla.withdraw(40000);
			System.out.println("인출액: "+amount);
			int balance = cla.displayBalance();
			System.out.println("잔액: "+balance);
			//System.out.println("잔액: "+cla.balance);
			int creditLine = cla.displayCreditLine();
			System.out.println("마이너스 한도: "+creditLine);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			String msg = e.getMessage();
			System.out.println("예외메세지: "+msg);
		}

	}

}
