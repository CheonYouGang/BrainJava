/**
 * 2018. 5. 28. Dev By Cheon You Gang
   com.kosea.kmove30
   Jdbc_Manager.java
 */
package com.kosea.kmove30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author kosea112
 *
 */
public class Jdbc_Manager {
	/* 속성(필드) */
	// Connection- 1단계: DB연결을 위한 커넥션 인터페이스
	Connection conn = null;
	// Statement 인터페이스: SQL을 실행하는 객체
	Statement stmt = null;
	// ResultSet 인터페이스: SQL결과를 저장하는 객체
	ResultSet rs = null;

	/*생성자*/
	public Jdbc_Manager(Connection conn, Statement stmt, ResultSet rs) {
		this.conn = conn;
		this.stmt = stmt;
		this.rs = rs;
	}

	public Jdbc_Manager() {
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

	// Select query = "select cname, age, gender from persons"
	public ResultSet Select(String query) throws Exception {
		// 커넥션 객체가 Statement객체를 생성
		stmt = conn.createStatement();
		// executeQuery DML쿼리 실행후 결과 저장
		rs = stmt.executeQuery(query);
		return rs;
	}
	
	// Insert - insert into Persons(PName, Gender, Age) values('Gang', 'M', 21);
	public void Insert(String[] arr) throws Exception{
		// 커넥션 객체가 Statement객체를 생성
		String name = arr[0];
		String gender = arr[1];
		String age = arr[2];
		
		/*콤보박스가 남이면 m, 아니면 f가 들어간다*/
		gender = gender.equals("남")?"m":"f";
		
		String query = "insert into Persons(PName, Gender, Age) values("+
					   "'"+name+"', "+
					   "'"+gender+"', "+
					   age+")";
		int insertCount = stmt.executeUpdate(query);
		
		System.out.println("query: " + query);
		if(insertCount>0)
			System.out.println(insertCount+" 건이 추가 되었습니다.");
	}
	
	// Update - update Persons	set Age = 30 where PName = 'abc';
	public void Update(String name, String age) throws Exception{
		String query =  "update Persons " + 
						"set  Age = " + age +
						" where PName = '" + name +"'";
		stmt = conn.createStatement();
		int updateCount = stmt.executeUpdate(query);
		
		System.out.println("query: " + query);
		if(updateCount>0)
			System.out.println(updateCount+" 건이 추가 되었습니다.");
	}
	
	// Delete query = "delete from Persons	where 이름 = 'delName'";
	public void Delete(String delName) throws Exception{
		String query = "delete from Persons	where PName = '" + delName + "'";
		stmt = conn.createStatement();
		int deleteCount = stmt.executeUpdate(query);
		
		if(deleteCount>0)
			System.out.println(deleteCount+" 건이 삭제 되었습니다.");
	}

	// DB 연결해제
	public void DBClose() throws Exception {
		conn.close();
	}

}
