import java.sql.Connection;//패키지
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 2018. 5. 3. Dev By Cheon You Gang
   
   JDBCExample1.java
 */

/**
 * @author kosea112
 *
 */
class JDBCExample1 {
    public static void main(String args[]) {
    	//Connection- 1단계: DB연결을 위한 커넥션 인터페이스
        Connection conn = null;
        //try~catch문에서 DB연결중 예외가 발생하는지 검사.
        try {
        	//Class.forName - 2단계: JDBC드라이버를 로드
            Class.forName("com.mysql.jdbc.Driver");
            //DriverManager - 3단계: 드라이버매니저 클래스는 getConnection메소드로 DB를 연결한다.
            conn = DriverManager.getConnection(
            //"DBMS의 URL", "포트", "포트비밀번호"
               "jdbc:mysql://localhost:3306/mysql", "root", "12345");
            System.out.println("데이터베이스에 접속했습니다.");
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
