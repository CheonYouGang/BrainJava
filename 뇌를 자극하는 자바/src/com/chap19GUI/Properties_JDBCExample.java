/**
 * 2018. 6. 4. Dev By Cheon You Gang
   com.chap19GUI
   Properties_JDBCExample.java
 */
package com.chap19GUI;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author kosea112
 *
 */
public class Properties_JDBCExample {
	public static void main(String args[]) {

		String driver 	 = null;
		String url  	 = null;
		String username  = null;
		String password  = null;
		
		try {
			// 프로퍼티 파일 위치
			String propFile = "db.properties";

			// 프로퍼티 객체 생성
			Properties props = new Properties();

			// 프로퍼티 파일 스트림에 담기(파일 시스템으로부터 입력 바이트를 가져옴)
			FileInputStream fis = new FileInputStream(propFile);

			// 프로퍼티 파일 로딩
			props.load(new java.io.BufferedInputStream(fis));

			// 드라이버 읽기
			driver 	 = props.getProperty("jdbc.driver");
			url 	 = props.getProperty("jdbc.url");
			username = props.getProperty("jdbc.username");
			password = props.getProperty("jdbc.password");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Connection- 1단계: DB연결을 위한 커넥션 인터페이스
		Connection conn = null;

		// try~catch문에서 DB연결중 예외가 발생하는지 검사.
		try {
			// Class.forName - 2단계: JDBC드라이버를 로드
			if (driver != null) {
			    Class.forName(driver) ;
			}

			// DriverManager - 3단계: 드라이버매니저 클래스는 getConnection메소드로 DB를 연결한다.
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("데이터베이스에 접속했습니다.");

			// 4단계 .close(); - DB연결 종료.
			conn.close();
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
