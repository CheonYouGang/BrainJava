package RussianRoulette;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class RussianRoulette {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Revolver c1 = new Revolver();
		Random rand = new Random();
		String fr = null, se = null;
		String[] ur = new String[6];
		try {
			System.out.println("������ ������ ������ ���մϴ�.(�ƹ��ų� �Է��ϼ���)");
			String d = br.readLine();
		} catch (IOException e) {
		}
		int c = rand.nextInt(2);
		if (c == 1) {
			System.out.println("��� ���� �����մϴ�.");
			fr = "���";
			se = "��ǻ��";
		} else {
			System.out.println("��ǻ�� ���� �����մϴ�.");
			fr = "��ǻ��";
			se = "���";
		}
		for (int j = 0; j < 6; j++) {
			for (int k = 1; k < 6; k = k + 2) {
				ur[j] = fr;
				ur[k] = se;
			}
		}

		for (int i = 0; i < 6; i++) {
			try {
				System.out.println(ur[i] + "�Ӹ��� ��� �սô�(�ƹ��ų� �Է��ϼ���)");
				String d = br.readLine();
			} catch (IOException e) {
			}
			c1.shoot(i, ur[i]);
		}
	}
}