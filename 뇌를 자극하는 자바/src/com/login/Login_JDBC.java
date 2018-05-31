/**
 * 2018. 5. 31. Dev By Cheon You Gang
   com.login
   Login_JDBC.java
 */
package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
  * @author kosea112
  *
  */
public class Login_JDBC {
		 /* 속성(필드) */
		 // Connection- 1단계: DB연결을 위한 커넥션 인터페이스
		 Connection conn = null;
		 // Statement 인터페이스: SQL을 실행하는 객체
		 Statement stmt = null;
		 ResultSet rs = null;

		 /*생성자*/
		 public Login_JDBC(Connection conn, Statement stmt, ResultSet rs) {
		  this.conn = conn;
		  this.stmt = stmt;
		  this.rs = rs;
		 }

		 public Login_JDBC() {
		  System.out.println("Jdbc_Manager() 기본 생성자 호출");
		 }
		 
		 /* 기능메소드 */
		 // DB 연결
		 public Connection DBConnection(String driver, String  url, String  user, String  password) throws Exception {
		  // Class.forName - 2단계: JDBC드라이버를 로드
		  Class.forName(driver);
		  // DriverManager - 3단계: 드라이버매니저 클래스는 getConnection메소드로 DB를 연결한다.
		  conn = DriverManager.getConnection(url, user, password);
		  return conn;
		 }
		 

		 // DB 연결해제
		 public void DBClose() throws Exception {
		  conn.close();
		 }

}
