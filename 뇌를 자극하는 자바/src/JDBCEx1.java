import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCEx1 {
    public static void main(String args[]) {
    	//Connection- 1단계: DB연결을 위한 커넥션 인터페이스
        Connection conn = null;
        //Statement 인터페이스: SQL을 실행하는 객체
        Statement stmt = null;
        //ResultSet 인터페이스: SQL결과를 저장하는 객체
        ResultSet rs = null;
        
        //try~catch문에서 DB연결중 예외가 발생하는지 검사.
        try {
        	//Class.forName - 2단계: JDBC드라이버를 로드
            Class.forName("com.mysql.jdbc.Driver");
            //DriverManager - 3단계: 드라이버매니저 클래스는 getConnection메소드로 DB를 연결한다.
            conn = DriverManager.getConnection(
           /* "DBMS의 URL", "포트", "포트비밀번호"
            getConnection(String url, String user, String password);*/
               "jdbc:mysql://localhost:3306/mysql", "root", "12345");
            System.out.println("데이터베이스에 접속했습니다.");

            //커넥션 객체가 Statement객체를 생성
            stmt = conn.createStatement();
            //executeQuery DML쿼리 실행후 결과 저장
            rs = stmt.executeQuery("select Jumincd, PName, Gender, Age from persons");            
            System.out.println("주민번호		이름	성별	나이");
            while(rs.next()) {//.next() - boolean타입
            
            String jumincd = rs.getString("Jumincd");
            String pname = rs.getString("PName");
            String gender = rs.getString("Gender");
            int age = rs.getInt("Age");
            
            System.out.println(jumincd+"	"+pname+"	"+gender+"	"+age);
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
