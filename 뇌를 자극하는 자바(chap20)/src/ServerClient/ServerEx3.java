package ServerClient;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx3 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			
			//스레드 생성
			Thread thread1 = new SenderThread3(socket);
			Thread thread2 = new ReceiverThread3(socket);
			//두 스레드 시작
			thread1.start();
			thread2.start();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				serverSocket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
