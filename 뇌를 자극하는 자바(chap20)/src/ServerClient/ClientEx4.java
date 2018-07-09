package ServerClient;

import java.net.Socket;

public class ClientEx4 {
	public static void main(String[] args) {
		//명령형 피라미터로 대화명을 입력받아야합니다.
		if(args.length != 1) {
			System.out.println("Usage: java ClientEx4 <user-name>");
			return;
		}
		try {
			Socket socket = new Socket("192.168.0.28", 9002);
			
			//스레드 생성
			Thread thread1 = new SenderThread3(socket, args[0]);
			Thread thread2 = new ReceiverThread3(socket);
			//두 스레드 시작
			thread1.start();
			thread2.start();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
