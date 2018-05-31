/**
 * 2018. 5. 31. Dev By Cheon You Gang
   com.login
   Login.java
 */
package com.login;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
  * @author kosea112
  *
  */
public class Login {

	public static void main(String[] args) {
		Login_JDBC jdbcManager= new Login_JDBC();
		
		FlowLayout layout = new FlowLayout();
		
		JFrame frame = new JFrame("LOGIN!");
		frame.setPreferredSize(new Dimension(300, 200));
		
		Container contpane = frame.getContentPane();

//		DefaultTableModel model = new DefaultTableModel(0, 0);
//		JTable table = new JTable();
		
		JPanel panel = new JPanel();
		JTextField id = new JTextField(14);
		JTextField password = new JTextField(14);
		JButton loginButton = new JButton("확인");
		
		panel.add(new JLabel("ID"));
		panel.add(id);
		panel.add(new JLabel("Password"));
		panel.add(password);
		panel.add(loginButton);
		
		contpane.add(panel, BorderLayout.CENTER);
		
		//loginButton.addActionListener(new loginButtonAction());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		try {
			jdbcManager.DBConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mysql", "root", "12345");
			System.out.println("데이터베이스에 접속했습니다.");
			frame.setTitle("Login-DB접속 성공");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
			frame.setTitle("Login-DB접속 실패");
		} catch (Exception e) {
			e.getMessage();
			frame.setTitle("Login-DB접속 실패");
		}
	}

}
