/**
 * 2018. 5. 10. Dev By Cheon You Gang
   com.malldb
   JDBCExample1.java
 */
package com.malldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
  * @author kosea112
  *
  */


class JDBCExample1 {
    public static void main(String args[]) {
    	//Connection- 1단계: DB연결을 위한 커넥션 인터페이스
        Connection conn = null;
        // Statement 인터페이스: SQL을 실행하는 객체(작성된 결과를 돌려주기 위해서 필요함)
     	Statement stmt = null;
		// ResultSet 인터페이스: SQL결과를 저장하는 객체(select)
		ResultSet rs = null;
		
        //try~catch문에서 DB연결중 예외가 발생하는지 검사.
        try {
        	
        	//Class.forName - 2단계: JDBC드라이버를 로드
            Class.forName("com.mysql.jdbc.Driver");
            //DriverManager - 3단계: 드라이버매니저 클래스는 getConnection메소드로 DB를 연결한다.
            conn = DriverManager.getConnection(
            //"DBMS의 URL", "포트", "포트비밀번호"
               "jdbc:mysql://localhost:3306/malldb", "root", "12345");
            System.out.println("데이터베이스에 접속했습니다.");
            
			// 커넥션 객체가 Statement객체를 생성
			stmt = conn.createStatement();
			// executeQuery DML쿼리 실행후 결과 저장
			rs = stmt.executeQuery("SELECT now()");
			System.out.println("현재 시간");
			
			if(rs.next())//레코드(데이터)가 있으면 rs를 레코드에 첫줄로 이동한다.
			{
				System.out.println(rs.getString(1));
			}
			
            //4단계 .close(); - DB연결 종료.
            conn.close();

        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + 
                               cnfe.getMessage());
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}
