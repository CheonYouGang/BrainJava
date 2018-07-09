package ServerClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread3 extends Thread{
	Socket socket;
	String name;
	
	public SenderThread3(Socket socket) {
		this.socket=socket;
	}
	
	//(Ex4)
	public SenderThread3(Socket socket, String name) {
		this.socket=socket;
		this.name=name;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			//제일먼저 서버로 대화명을 송신합니다.(Ex4)
			writer.println(name);
			writer.flush();
			
			while(true) {
				//키보드로부터 문자열을 받습니다.
				String str = reader.readLine();
				//사용자가 "bye"라고 입력하면 반복문을 빠져나옵니다.
				if(str.equals("bye"))
					break;
				writer.println(str);
				writer.flush();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
