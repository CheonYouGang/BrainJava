/**
 * 2018. 6. 1. Dev By Cheon You Gang
   com.login
   LoginView.java
 */
package com.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kosea.kmove30.Jdbc_Manager;

/**
  * @author kosea112
  *
  */
public class LoginView extends JFrame{
	
    private MainProcess main;
    private TestFrm testFrm;
   
    private JButton btnLogin;
    private JButton btnInit;
    private JPasswordField passText;
    private JTextField userText;
    private boolean bLoginCheck;
	
	// ResultSet 인터페이스: SQL결과를 저장하는 객체
	ResultSet rs = null;
    
    public static void main(String[] args) {
        //new LoginView();
    }
 
    public LoginView() {
    	System.out.println("LoginView.LoginView()");
        // setting
        setTitle("login");
        setSize(280, 150);
        setResizable(false);
        setLocation(800, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        // panel
        JPanel panel = new JPanel();
        placeLoginPanel(panel);
        // add
        add(panel);
        // visiible
        setVisible(true);
    }
   
    public void placeLoginPanel(JPanel panel){
        panel.setLayout(null);     
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);
       
        JLabel passLabel = new JLabel("Pass");
        passLabel.setBounds(10, 40, 80, 25);
        panel.add(passLabel);
       
        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);
       
        passText = new JPasswordField(20);
        passText.setBounds(100, 40, 160, 25);
        panel.add(passText);
        passText.addActionListener(new ActionListener() {          
            @Override
            public void actionPerformed(ActionEvent e) {
              // isLoginCheck();        
            }
        });
       
        
        btnInit = new JButton("Reset");
        btnInit.setBounds(10, 80, 100, 25);
        panel.add(btnInit);
        btnInit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passText.setText("");
            }
        });
       
        btnLogin = new JButton("Login");
        btnLogin.setBounds(160, 80, 100, 25);
        panel.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck(userText.getText(), new String(passText.getPassword()));
            }
        });
    }
   
    public void isLoginCheck(String id, String pass){
    	String idChkquery = "select LID, LPASSWORD from member where LID = '" + id + "'";
    	Jdbc_Manager jdbcManager = new Jdbc_Manager();

    	try {
    		jdbcManager.DBConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mysql", "root", "12345");//db연결
    		rs=jdbcManager.Select(idChkquery);//생성자 호출
    		
    		if(rs.next()) {
    			System.out.println("아이디 존재");
    			
    			//아이디 있음
    			//->존재시 패스워드 비교
    			if(pass.equals(rs.getString("LPASSWORD"))) {
    				
    				System.out.println("패스워드 일치");
    				
    				//로그인 성공
    	            JOptionPane.showMessageDialog(null, "로그인 성공.");
    	            bLoginCheck = true;
    	            System.out.println("LoginView.isLoginCheck()");
    	            
    	            // 로그인 성공이라면 매니져창 뛰우기
    	            if(isLogin()){
    	                main.showFrameTest(); // 메인창 메소드를 이용해 창뛰우기
    	            }      
    			}else{
    				//패스워드가 틀림
    				JOptionPane.showMessageDialog(null, "패스워드가 틀렸습니다.");
    				System.out.println("pass.equals(rs.getString(\"LPASSWORD\")");
    			};
    		}else {
    			//아이디 없음
    			JOptionPane.showMessageDialog(null, "아이디가 없습니다.");
    		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
 
   
    // mainProcess와 연동
    public void setMain(MainProcess main) {
        this.main = main;
    }
   
 
    public boolean isLogin() {     
        return bLoginCheck;
    }
}
