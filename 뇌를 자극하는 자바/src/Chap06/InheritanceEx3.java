/**
 * 2018. 5. 16. Dev By Cheon You Gang
   Chap06
   InheritanceEx3.java
 */
package Chap06;

 /**
  * @author kosea112
  *
  */

class BonusPointAccount extends Account{
	int bonusPoint;
	
	public BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint=bonusPoint;
		System.out.println("BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint)");
	}
	
	public int displayBonusPoint() {
		return bonusPoint;
	}
	@Override
	public void deposit(int amount) {
		balance += amount;
		//super.deposit(amount);
		bonusPoint +=(int)(amount*0.001);
	}
}

public class InheritanceEx3 {

	public static void main(String[] args) {
		BonusPointAccount bpa = new BonusPointAccount("222-33-444444", "훈민정음", 100000, 100);
		
		bpa.deposit(0);
		int balance = bpa.displayBalance();
		System.out.println("잔액: " + balance);
		int bonusPoint = bpa.displayBonusPoint();
		System.out.println("누적 포인트: " + bonusPoint);

	}

}
