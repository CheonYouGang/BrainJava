package RussianRoulette;
import java.util.*;

class Revolver {
	int[] a = new int[6];
	int b = 0, c = 0;

	public Revolver() {
		System.out.println("리볼버를 초기화 합니다.");
		Random rand = new Random();
		b = rand.nextInt(6);
		a[b] = 1;
		System.out.println("리볼버 초기화를 완료하였습니다.");
	}

	public void shoot(int ui, String ur) {
		if (a[ui] == 0) {
			System.out.println("빵!!! 놀랬죠? 불발이네요.");
		} else if (a[ui] == 1) {
			System.out.println(ur + "은 죽었습니다.");
		}
	}
}