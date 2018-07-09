package ServerClient;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			//서버 소켓생성
			serverSocket = new ServerSocket(9000);
			//연결 요청 들이오면 소켓을 생성
			socket = serverSocket.accept();
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			//수신된 데이터 출력
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			
			//데이터를 송신합니다.
			String str = "Hello, Client";
			out.write(str.getBytes());
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
