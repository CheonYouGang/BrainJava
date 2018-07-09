package ServerClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientEx2 {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.0.28", 9000);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
						
			//데이터 송신
			writer.println("Hello Server");
			writer.flush();
			
			//수신된 데이터 출력
			String str = reader.readLine();
			System.out.println(str);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				socket.close();
			} catch (Exception e2) {

			}
		}
	}
}
