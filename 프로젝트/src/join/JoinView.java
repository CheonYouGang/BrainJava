package join;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import login.MainProcess;
import login.TestFrm;

public class JoinView extends JFrame {
	private MainProcess main;
	private TestFrm testFrm;

	private JButton btncancel;
	private JButton btnjoin;
	private JTextField userText;
	private JTextField nameText;
	private JPasswordField pwText;
	private JCheckBox M, F;

	ResultSet rs = null;

	public static void main(String[] args) {
		// new LoginView();
	}

	public JoinView() {
		System.out.println("LoginView() 생성자");

		// setting
		setTitle("login");
		setSize(400, 200); // 윈도우 창 사이즈
		setResizable(false);
		setLocation(800, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// panel
		JPanel panel = new JPanel();
		placeJoinPanel(panel);
		add(panel);
		setVisible(true);
	}

	public void placeJoinPanel(JPanel panel) {
		// 이름 라벨 및 입력란
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setBounds(60, 60, 80, 25);
		panel.add(nameLabel);
		nameText = new JTextField(30);
		nameText.setBounds(210, 60, 160, 25);
		panel.add(nameText);
		// 이름 라벨 및 입력란
		
		// id 라벨 및 입력란
		JLabel userLabel = new JLabel("User ID");
		userLabel.setBounds(60, 20, 80, 25);
		panel.add(userLabel);
		userText = new JTextField(30);
		userText.setBounds(210, 20, 160, 25);
		panel.add(userText);
		// id 라벨 및 입력란

		// pw 라벨 및 입력란
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(60, 60, 80, 25);
		panel.add(passwordLabel);
		pwText = new JPasswordField(30);
		pwText.setBounds(210, 60, 160, 25);
		panel.add(pwText);
		// pw 라벨 및 입력란

		// 성별 입력란
		JLabel genderLabel = new JLabel("성별");
		genderLabel.setBounds(60, 20, 80, 25);
		panel.add(genderLabel);
		
	    M = new JCheckBox("남자"); 
	    panel.add(M); 
	    F = new JCheckBox("여자"); 
	    panel.add(F); 
	    
	    
		// 성별 입력란

		// 회원가입 버튼
		JButton joinButton = new JButton("회원가입");
		joinButton.setBounds(10, 120, 90, 25);
		panel.add(joinButton);
		// 회원가입 버튼

		btnjoin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 회원가입 승인 리스너.
			}
		});

		// 취소 버튼
		JButton cancelButton = new JButton("취소");
		cancelButton.setBounds(295, 120, 80, 25);
		panel.add(cancelButton);
		// 취소 버튼

		btncancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				userText.setText("");
				pwText.setText("");
			}
		});

	}
	// **************************************************************************
}
