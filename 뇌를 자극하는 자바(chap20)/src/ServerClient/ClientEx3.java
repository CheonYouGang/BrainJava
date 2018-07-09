package ServerClient;

import java.net.Socket;

public class ClientEx3 {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.0.28", 9001);
			
			//스레드 생성
			Thread thread1 = new SenderThread3(socket);
			Thread thread2 = new ReceiverThread3(socket);
			//두 스레드 시작
			thread1.start();
			thread2.start();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
