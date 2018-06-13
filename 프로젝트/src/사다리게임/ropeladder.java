package 사다리게임;

import java.util.Random;
import java.util.Stack;

public class ropeladder {
	public static final int STRAIGHT = 1; // 직선
	public static final int TURN_RIGHT = 2; // 오른쪽 'ㅏ'
	public static final int TURN_LEFT = 3; // 왼쪽 'ㅓ'

	public static int[][] generateLadder(int width, int height) {
		Random random = new Random(); // 랜덤화
		int[][] ladder = new int[height][width];		 // 세로, 가로
		Stack<Integer> pathStack = new Stack<Integer>(); // 스택구조
		for (int i = 0; i < height; i++) {
			System.out.println("가");
			for (int j = 0; j < width; j++) {			 // 각 배열에다 선 배치 (직선, 오른쪽, 왼쪽)
				if (!pathStack.isEmpty()) {				 //	왼쪽, 오른쪽 결정
					ladder[i][j] = TURN_LEFT;			 // 왼쪽
					pathStack.pop();
				System.out.println("나");
				} else {
					int path = random.nextInt(2) + 1;
				System.out.println("다");
					while (!isValid(path, i, j, width, height)) {
						path = random.nextInt(2) + 1;
						System.out.println("라");
					}
					if (path == TURN_RIGHT)	
						pathStack.push(path);
					System.out.println("마");
					ladder[i][j] = path;
					System.out.println("바");
				}
			}
		}
		return ladder;
	};

	public static void printLadder(int[][] ladder) { // 각 배열에
		for (int i = 0; i < ladder.length; i++) {
			System.out.printf("사");
			for (int j = 0; j < ladder[0].length; j++) {
				System.out.println(ladder[i][j] + " ");
				System.out.printf("아");
			}
			System.out.println();
		}
	}

	public static boolean isValid(int path, int i, int j, int width, int height) { // 오른쪽, 왼쪽 판별 여부
		if (path == TURN_RIGHT && j == width - 1) {
			return false;
		}
		if (path == TURN_LEFT && j == 0) {
			return false;
		}
		System.out.printf("차");
		return true;
	}

	public static int visitLadder(int[][] ladder, int start) {
		int dest = -1;
		int cursorX = start;
		int cursorY = 0;
		if (start < ladder[0].length) {
			System.out.println("카");
			while (cursorY < ladder.length) {
				System.out.println("파");
				if (ladder[cursorY][cursorX] == TURN_RIGHT) {
					cursorX++;
					System.out.println("하");
				} else if (ladder[cursorY][cursorX] == TURN_LEFT) {
					cursorX--;
					System.out.println("A");
				}
				cursorY++;
				System.out.println("B");
			}
			dest = cursorX;
			System.out.println("C");
		}
		System.out.println("D");
		return dest;
	}

	public static void main(String[] args) { // 결과 보여줌
		int[][] ladder = generateLadder(4, 6); // 열 =4, 행=6
		int start = 2;
		while (visitLadder(ladder, start) == 3) {
			ladder = generateLadder(4, 6);
			System.out.println("E");
		}
		printLadder(ladder);
		System.out.println("F");
	}
}