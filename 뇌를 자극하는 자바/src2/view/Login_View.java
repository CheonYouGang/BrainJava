/**
 * 
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class Login_View {

	JScrollPane scrollPane;
	ImageIcon icon;
	
	public Login_View() {
		icon = new ImageIcon("D:\\iogin.png");
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("로그인 창");
		frame.setSize(400, 200); //윈도우 창 사이즌
		
		//판넬 생성
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);
		//판넬 생성

		//id 라벨 및 입력란
		JLabel userLabel = new JLabel("User ID");
		userLabel.setBounds(60, 20, 80, 25);
		panel.add(userLabel);
		JTextField userText = new JTextField(30);
		userText.setBounds(210, 20, 160, 25);
		panel.add(userText);
		//id 라벨 및 입력란

		//pw 라벨 및 입력란
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(60, 60, 80, 25);
		panel.add(passwordLabel);
		JPasswordField passwordText = new JPasswordField(30);
		passwordText.setBounds(210, 60, 160, 25);
		panel.add(passwordText);
		//pw 라벨 및 입력란

		//회원가입 버튼
		JButton joinButton = new JButton("회원가입");
		joinButton.setBounds(10, 120, 90, 25);
		panel.add(joinButton);
		//회원가입 버튼
		
		//로그인 버튼
		JButton loginButton = new JButton("로그인");
		loginButton.setBounds(155, 120, 80, 25);
		panel.add(loginButton);
		//로그인 버튼
		
		//취소 버튼
		JButton cancelButton = new JButton("취소");
		cancelButton.setBounds(295, 120, 80, 25);
		panel.add(cancelButton);
		//취소 버튼
		
		//페이지 이동
		
		//페이지 이동
		
		//이벤트 리스너
		loginButton.addActionListener(new LoginAction());
		cancelButton.addActionListener(new CancelAction());
		//이벤트 리스너
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

}
