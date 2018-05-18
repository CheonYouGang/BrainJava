import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 2018. 5. 9. Dev By Cheon You Gang
   
   JDBC_Delete.java
 */

/**
 * @author kosea112
 *
 */
class JDBC_Delete {
	public static void main(String args[]) {
		// Connection- 1단계: DB연결을 위한 커넥션 인터페이스
		Connection conn = null;
		Statement stmt = null;

		// try~catch문에서 DB연결중 예외가 발생하는지 검사.
		try {
			// Class.forName - 2단계: JDBC드라이버를 로드
			Class.forName("com.mysql.jdbc.Driver");
			// DriverManager - 3단계: 드라이버매니저 클래스는 getConnection메소드로 DB를 연결한다.
			conn = DriverManager.getConnection(
					// "DBMS의 URL", "포트", "포트비밀번호"
					"jdbc:mysql://localhost:3306/mysql", "root", "12345");
			// { }
			System.out.println("데이터베이스에 접속했습니다.");
			
			// DB Sql작업
			stmt = conn.createStatement();
			String sql = "DELETE from persons where PName = '" + args[0] + "'";
						//DELETE from persons where PName = 'args[0]'
			int changeRecode = stmt.executeUpdate(sql);

			// 4단계 .close(); - DB연결 종료.
			conn.close();
			if(changeRecode>0)
				System.out.println(changeRecode + "건이 삭제되었습니다.");
			else
				System.out.println("삭제된 데이터는 없습니다.");
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
