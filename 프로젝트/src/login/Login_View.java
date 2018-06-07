/**
 * 
 */
package login;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Login_View {

	
	public static void main(String[] args) {
		JFrame frame = new JFrame("로그인 창");
		frame.setSize(400, 200); //윈도우 창 사이즌
		
		
		
		//판넬 생성
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);

//		//id 라벨 및 입력란
//		JLabel userLabel = new JLabel("User ID");
//		userLabel.setBounds(60, 20, 80, 25);
//		panel.add(userLabel);
//		JTextField userText = new JTextField(30);
//		userText.setBounds(210, 20, 160, 25);
//		panel.add(userText);
//
//		//pw 라벨 및 입력란
//		JLabel passwordLabel = new JLabel("Password");
//		passwordLabel.setBounds(60, 60, 80, 25);
//		panel.add(passwordLabel);
//		JPasswordField passwordText = new JPasswordField(30);
//		passwordText.setBounds(210, 60, 160, 25);
//		panel.add(passwordText);
//
//		//회원가입 버튼
//		JButton joinButton = new JButton("회원가입");
//		joinButton.setBounds(10, 120, 90, 25);
//		panel.add(joinButton);
//		
//		//로그인 버튼
//		JButton loginButton = new JButton("로그인");
//		loginButton.setBounds(155, 120, 80, 25);
//		panel.add(loginButton);
//		
//		//취소 버튼
//		JButton registerButton = new JButton("취소");
//		registerButton.setBounds(295, 120, 80, 25);
//		panel.add(registerButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

}
