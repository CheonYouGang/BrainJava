package RussianRoulette;
import java.util.*;

class Revolver {
	int[] a = new int[6];
	int b = 0, c = 0;

	public Revolver() {
		System.out.println("�������� �ʱ�ȭ �մϴ�.");
		Random rand = new Random();
		b = rand.nextInt(6);
		a[b] = 1;
		System.out.println("������ �ʱ�ȭ�� �Ϸ��Ͽ����ϴ�.");
	}

	public void shoot(int ui, String ur) {
		if (a[ui] == 0) {
			System.out.println("��!!! ���? �ҹ��̳׿�.");
		} else if (a[ui] == 1) {
			System.out.println(ur + "�� �׾����ϴ�.");
		}
	}
}