package ServerClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			//서버 소켓생성
			serverSocket = new ServerSocket(9000);
			socket= serverSocket.accept();
			//연결 요청 들이오면 소켓을 생성
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			//수신된 데이터 출력
			String str = reader.readLine();
			System.out.println(str);
			
			//데이터를 송신합니다.
			writer.println("Hello Server");
			writer.flush();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				serverSocket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
