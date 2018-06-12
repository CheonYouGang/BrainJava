package login;

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

import jdbc.JdbcManager;

public class LoginView extends JFrame{
    private MainProcess main;
    private TestFrm testFrm;
   
    private JButton btnLogin;
    private JButton btncancel;
    private JButton btnjoin;
    private JPasswordField pwText;
    private JTextField userText;
    private boolean bLoginCheck;
    
    ResultSet rs = null;
   
    public static void main(String[] args) {
        //new LoginView();
    }
 
    public LoginView() {
    	System.out.println("LoginView() 생성자");
    	
        // setting
        setTitle("login");
        setSize(400, 200); //윈도우 창 사이즈
        setResizable(false);
        setLocation(800, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        // panel
        JPanel panel = new JPanel();
        placeLoginPanel(panel);
        add(panel);
        setVisible(true);
    }
   
    public void placeLoginPanel(JPanel panel){
		//id 라벨 및 입력란
    	panel.setLayout(null);    
		JLabel userLabel = new JLabel("User ID");
		userLabel.setBounds(60, 20, 80, 25);
		panel.add(userLabel);
		userText = new JTextField(30);
		userText.setBounds(210, 20, 160, 25);
		panel.add(userText);
		//id 라벨 및 입력란

		//pw 라벨 및 입력란
    	panel.setLayout(null); 
		JLabel pwLabel = new JLabel("Password");
		pwLabel.setBounds(60, 60, 80, 25);
		panel.add(pwLabel);
		pwText = new JPasswordField(30);
		pwText.setBounds(210, 60, 160, 25);
		panel.add(pwText);
		//pw 라벨 및 입력란
       
		pwText.addActionListener(new ActionListener() {          
            @Override
            public void actionPerformed(ActionEvent e) {
                //isLoginCheck(userText.getText(), passText.getPassword().toString());        
            }
        });
       
		
		//회원가입 버튼
		btnjoin = new JButton("회원가입");
		btnjoin.setBounds(10, 120, 90, 25);
		panel.add(btnjoin);
		//회원가입 버튼
		
		btnjoin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //회원가입 페이지로 가는 액션 리스너.
            }
        });
		
		//취소 버튼
		btncancel = new JButton("취소");
		btncancel.setBounds(295, 120, 80, 25);
		panel.add(btncancel);
		//취소 버튼
        
		btncancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                pwText.setText("");
            }
        });
       
		//로그인 버튼
		btnLogin = new JButton("로그인");
		btnLogin.setBounds(155, 120, 80, 25);
		panel.add(btnLogin);
		//로그인 버튼
        
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	isLoginCheck(userText.getText(), new String(pwText.getPassword()));
            }
        });
    }
   
    //로그인 체크*****************************************************************
    
    public void isLoginCheck(String id, String pass){
    	
    	String idCheckQuery = "SELECT LID, LPASSWORD FROM member where LID = '" + id + "'";
    	JdbcManager jdbcManager = new JdbcManager();
    	
    	try {
    		jdbcManager.DBConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mysql", "root", "12345");
//    		jdbcManager.DBConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mysql", "root", "12345");
    		rs=jdbcManager.Select(idCheckQuery);
    		if(rs.next()) {  // 아이디가 존재하면 
    			System.out.println(rs.getString(1) + "---" + rs.getString(2));
    			System.out.println("아이디 존재");
    			
    			if(pass.equals(rs.getString("LPASSWORD"))) {  // 패스워드 비교해서 같다면("sql")
    				System.out.println("패스워드 일치");
    				
    				JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
    	            bLoginCheck = true;
    	            	            
    	            if(isLogin()) //로그인 성공이라면 매니져창 뛰우기
    	                main.showFrameTest(); // 메인창 메소드를 이용해 창뛰우기
    	            
    			}else {
    				// 패스워드 틀렸다.
    				JOptionPane.showMessageDialog(null, "패스워드가 틀렸습니다.");
    			}
    		}
    		else {
    			// 아이디가 없음
    			JOptionPane.showMessageDialog(null, "아이디가 존재하지 않습니다.");
    		}
    	}
    	catch (Exception e) {
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