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

/**
 * @author kosea112
 *
 */
public class Join_View extends Login_View{
	JScrollPane scrollPane;
	ImageIcon icon;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("회원가입 창");
		frame.setSize(400, 300); //윈도우 창 사이즌
		
		//판넬 생성
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);
		//판넬 생성

		//이름 입력란
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setBounds(60, 20, 80, 25);
		panel.add(nameLabel);
		JTextField nameText = new JTextField(30);
		nameText.setBounds(180, 20, 160, 25);
		panel.add(nameText);
		//이름 입력란
		
		//id 라벨 및 입력란(이메일)
		JLabel userLabel = new JLabel("User ID/Email");
		userLabel.setBounds(60, 70, 80, 25);
		panel.add(userLabel);
		JTextField userText = new JTextField(30);
		userText.setBounds(180, 70, 160, 25);
		panel.add(userText);
		//id 라벨 및 입력란

		//pw 라벨 및 입력란
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(60, 120, 80, 25);
		panel.add(passwordLabel);
		JPasswordField passwordText = new JPasswordField(30);
		passwordText.setBounds(180, 120, 160, 25);
		panel.add(passwordText);
		//pw 라벨 및 입력란

		//회원가입 버튼
		JButton joinButton = new JButton("회원가입");
		joinButton.setBounds(50, 200, 90, 25);
		panel.add(joinButton);
		//회원가입 버튼
		
		//취소 버튼(로그인 화면으로 돌아가야 함)
		JButton cancelButton = new JButton("취소");
		cancelButton.setBounds(245, 200, 80, 25);
		panel.add(cancelButton);
		//취소 버튼
		
		//이벤트 리스너
//		joinButton.addActionListener(new JoinAction());
//		cancelButton.addActionListener(new CancelAction());
		//이벤트 리스너
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
