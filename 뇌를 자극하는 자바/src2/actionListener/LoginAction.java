/**
 * 2018. 6. 11. Dev By Cheon You Gang
   actionListener
   LoginAction.java
 */
package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.chap19GUI.MainProcess;
import com.kosea.kmove30.Jdbc_Manager;

import jdbc.JdbcManager;

/**
 * @author kosea112
 *
 */
public class LoginAction implements ActionListener {

	private MainProcess main;
	
	JTable table;
	JdbcManager jdbcManager;
	JTextField userText, passwordText;
	
	ResultSet rs;
	
    private boolean bLoginCheck;

	public LoginAction(JTable table, JdbcManager jdbcManager, JTextField userText, JTextField passwordText,
			ResultSet rs) {
		super();
		this.table = table;
		this.jdbcManager = jdbcManager;
		this.userText = userText;
		this.passwordText = passwordText;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String id = null;
		String pw = null;

		String idChkquery = "select LID, LPASSWORD from member where LID = '" + id + "'";
		Jdbc_Manager jdbcManager = new Jdbc_Manager();

		try {
			jdbcManager.DBConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mysql", "root", "12345");// db연결
			rs = jdbcManager.Select(idChkquery);// 생성자 호출

			if (rs.next()) {
				System.out.println("아이디 존재");

				// 아이디 있음
				// ->존재시 패스워드 비교
				if (pw.equals(rs.getString("LPASSWORD"))) {

					System.out.println("패스워드 일치");

					// 로그인 성공
					JOptionPane.showMessageDialog(null, "로그인 성공.");
					bLoginCheck = true;
					System.out.println("LoginView.isLoginCheck()");

					// 로그인 성공이라면 매니져창 뛰우기
					if (isLogin()) {
						main.showFrameTest(); // 메인창 메소드를 이용해 창뛰우기
					}
				} else {
					// 패스워드가 틀림
					JOptionPane.showMessageDialog(null, "패스워드가 틀렸습니다.");
					System.out.println("pass.equals(rs.getString(\"LPASSWORD\")");
				}
				;
			} else {
				// 아이디 없음
				JOptionPane.showMessageDialog(null, "아이디가 없습니다.");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
    public boolean isLogin() {     
        return bLoginCheck;
    }
}
