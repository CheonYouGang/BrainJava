/**
 * 
 */
package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author kosea112
 *
 */
public class JdbcManager {
	public static void main(String args[]) {

		String driver 	 = null;
		String url  	 = null;
		String username  = null;
		String password  = null;
		
		//0단계 프로퍼티 설정
		try {
			// 프로퍼티 파일 위치
			String propFile = "db.properties";

			// 프로퍼티 객체 생성 == 인스턴스
			Properties props = new Properties();

			// 프로퍼티 파일 스트림에 담기(파일 시스템으로부터 입력 바이트를 가져옴)
			FileInputStream fis = new FileInputStream(propFile);

			// 프로퍼티 파일 로딩
			props.load(new java.io.BufferedInputStream(fis));

			// 드라이버 읽기
			driver 	 = props.getProperty("driver");
			url 	 = props.getProperty("url");
			username = props.getProperty("username");
			password = props.getProperty("password");

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Connection- 1단계: DB연결을 위한 커넥션 인터페이스
		Connection conn = null;
		// try~catch문에서 DB연결중 예외가 발생하는지 검사.
		try {

			if (driver != null) {
			    Class.forName(driver) ;
			}
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("데이터베이스에 접속했습니다.");
			// 4단계 .close(); - DB연결 종료.
			conn.close();
		}

		catch (ClassNotFoundException cnfe) {
			System.out.println
			("해당 클래스를 찾을 수 없습니다." +cnfe.getMessage());
		}
		catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
