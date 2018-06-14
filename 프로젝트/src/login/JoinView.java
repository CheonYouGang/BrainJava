package login;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import jdbc.JdbcManager;

public class JoinView extends JFrame {

 //회원가입 db연동 체크*****************************************************************
    
    public void Insert(String id, String pw, String name, String gender){
    	
    	String idCheckQuery = "insert into Persons(LID, LPASSWORD, LNAME, Gender) values(?, ?, ?, ?);";
    	JdbcManager jdbcManager = new JdbcManager();
    	
    	try {
    		jdbcManager.DBConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mysql", "root", "12345");
    		
    	}catch (Exception e) {
    		e.getMessage();
    	}
    }
}
