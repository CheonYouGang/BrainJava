/**
 * 
 */
package login;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author kosea112
 *
 */
public class Login_View extends JFrame{

//	// ResultSet 인터페이스: SQL결과를 저장하는 객체
//	ResultSet rs = null;
	
	JPanel panel1, panel2;
	JTextField userId;
	JPasswordField password;
	JButton join, login, cancel;
	
	public static void main(String[] args) {
		
	}

	public Login_View() {
		System.out.println("LoginView.LoginView() 생성자");
        // setting
        setTitle("login");
        setSize(280, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //창 가운데로
        setLayout(null);
       
        //JPanel설정
        panel1 = new JPanel(); // pane1을 Frame에 생성.
        panel1.setLayout(new GridLayout(2, 2)); // 2행 2열로 panel1의 화변 분할
        userId = new JTextField(10); // userId 입력란 크기
        password = new JPasswordField(10); // password 입력란 크기
        
        //JPanel을 실제로 보여주는 역할(id, 패스워드 입력란)
        //id
        panel1.add(new JLabel("User  Id", JLabel.CENTER));//JLabel.LEFT: 아이디 입력시 왼쪽부터 채워집니다.
        panel1.add(userId);
        userId.setToolTipText("ID를 입력해주세요.");
        //pw
        panel1.add(new JLabel("Password", JLabel.CENTER));//JLabel.LEFT: 아이디 입력시 왼쪽부터 채워집니다.
        panel1.add(password);
        password.setToolTipText("패스워드를 입력해주세요.");
        
        //로그인 회원가입, 로그인, 취소 버튼
        panel2 = new JPanel(); // pane2을 Frame에 생성.
        
	}

}
