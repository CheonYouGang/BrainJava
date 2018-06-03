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
			System.out.println("동전을 던져서 순서를 정합니다.(아무거나 입력하세요)");
			String d = br.readLine();
		} catch (IOException e) {
		}
		int c = rand.nextInt(2);
		if (c == 1) {
			System.out.println("당신 부터 시작합니다.");
			fr = "당신";
			se = "컴퓨터";
		} else {
			System.out.println("컴퓨터 부터 시작합니다.");
			fr = "컴퓨터";
			se = "당신";
		}
		for (int j = 0; j < 6; j++) {
			for (int k = 1; k < 6; k = k + 2) {
				ur[j] = fr;
				ur[k] = se;
			}
		}

		for (int i = 0; i < 6; i++) {
			try {
				System.out.println(ur[i] + "머리에 쏘도록 합시다(아무거나 입력하세요)");
				String d = br.readLine();
			} catch (IOException e) {
			}
			c1.shoot(i, ur[i]);
		}
	}
}