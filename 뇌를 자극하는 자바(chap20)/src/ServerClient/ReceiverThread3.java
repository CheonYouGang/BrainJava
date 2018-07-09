package ServerClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread3 extends Thread{
	Socket socket;
	
	public ReceiverThread3(Socket socket) {
		this.socket=socket;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				//서버로부터 메시지를 수신해서 모니터로 출력합니다.
				String str = reader.readLine();
				if(str == null)
					break;
				System.out.println("수신>" + str);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
