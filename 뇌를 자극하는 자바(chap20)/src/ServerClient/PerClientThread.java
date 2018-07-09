package ServerClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClientThread extends Thread{
	
	static List<PrintWriter> list =
			Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	Socket socket;
	PrintWriter writer;
	
	public PerClientThread(Socket socket) {
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void run() {
		String name = null;
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			//수신된 첫번째 문자열을 대화명으로사용하기위해 저장합니다.
			name = reader.readLine();
			sendAll("#" + name + " 님이 들어오셨습니다.");
			while(true) {
				String str = reader.readLine();
				if(str == null)
					break;
				//수신된메시지 앞에 대화명을붙여서 모든클라이언트로송신합ㄴ디ㅏ.
				sendAll(name + " > " + str);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			list.remove(writer);
			sendAll("#" + name + " 님이 퇴장하셨습니다.");
			try {
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	private void sendAll(String str) {
		for(PrintWriter writer : list) {
			writer.println(str);
			writer.flush();
		}
	}
}
