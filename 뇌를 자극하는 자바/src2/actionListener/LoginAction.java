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
	
	JTable table;
	JdbcManager jdbcManager;
	JTextField userText, passwordText;
	
	ResultSet rs;
	
    private boolean bLoginCheck; // 로그인 성공 유무

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
		String query = "SELECT LID, LPASSWORD FROM member";
	}
}
