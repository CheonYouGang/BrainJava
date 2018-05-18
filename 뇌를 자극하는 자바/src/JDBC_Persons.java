/**
 * 2018. 5. 8. Dev By Cheon You Gang
   
   JDBC_Persons.java
 */

/**
 * @author kosea112
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Persons {
	String jumincd = null;
	String pname = null;
	String gender = null;
	int age = 0;

	public Persons() {// 기본생성자
		this.jumincd = "주민번호 입력 누락";
		this.pname = "이름입력 누락";
		this.gender = "성별입력 누락";
		this.age = 0;
	}

	public String getJumincd() {
		return jumincd;
	}

	public void setJumincd(String jumincd) {
		this.jumincd = jumincd;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class JDBC_Persons {

	public static void main(String args[]) {

		Persons[] persons = new Persons[3]; // 배열객체
		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Persons(); // 생성자 호출하여 배열 래퍼런스 생성.
		}

		/*
		 * for(int i = 0; i<persons.length; i++) {
		 * System.out.println("주민번호: "+persons[i].getJumincd());
		 * System.out.println("이      름: "+persons[i].getPname());
		 * System.out.println("성      별: "+persons[i].getGender());
		 * System.out.println("나      이: "+persons[i].getAge()); System.out.println("");
		 * }
		 */

		/*
		 * Persons persons; //래퍼런스 변수 선언 persons = new Persons(); //객체생성 = new 연산자
		 */
		// persons객체에 멤버필드를 셋팅
		/*
		 * persons.setJumincd("456789-9123456"); persons.setPname("Jong");
		 * persons.setGender("M"); persons.setAge(10);
		 */

		/* System.out.println(persons.getAge()); */

		/*
		 * System.out.println(persons.jumincd); System.out.println(persons.pname);
		 * System.out.println(persons.gender); System.out.println(persons.age);
		 */

		// JDBC 연결문 시작

		// Connection- 1단계: DB연결을 위한 커넥션 인터페이스
		Connection conn = null;
		// Statement 인터페이스: SQL을 실행하는 객체
		Statement stmt = null;
		// ResultSet 인터페이스: SQL결과를 저장하는 객체
		ResultSet rs = null;

		// try~catch문에서 DB연결중 예외가 발생하는지 검사.
		try {
			String jumincd = null;
			String pname = null;
			String gender = null;
			int age = 0;

			// Class.forName - 2단계: JDBC드라이버를 로드
			Class.forName("com.mysql.jdbc.Driver");
			// DriverManager - 3단계: 드라이버매니저 클래스는 getConnection메소드로 DB를 연결한다.
			conn = DriverManager.getConnection(
					/*
					 * "DBMS의 URL", "포트", "포트비밀번호" getConnection(String url, String user, String
					 * password);
					 */
					"jdbc:mysql://localhost:3306/mysql", "root", "12345");
			System.out.println("데이터베이스에 접속했습니다.");

			// 커넥션 객체가 Statement객체를 생성
			stmt = conn.createStatement();
			// executeQuery DML쿼리 실행후 결과 저장
			rs = stmt.executeQuery("select Jumincd, PName, Gender, Age " + "from persons ");
			System.out.println("주민번호		이름	성별	나이");

			int i = 0;

			while (rs.next()) {// .next() - boolean타입
				persons[i].setJumincd(rs.getString(1));
				persons[i].setPname(rs.getString(2));
				persons[i].setGender(rs.getString(3));
				persons[i].setAge(rs.getInt(4));

				i++;
				// jumincd = rs.getString(1);//("Jumincd");
				// pname = rs.getString(2);//("PName");
				// gender = rs.getString(3);//("Gender");
				// age = rs.getInt(4);//("Age");

				// System.out.println(jumincd+" "+pname+" "+gender+" "+age);
			}
			// 4단계 .close(); - DB연결 종료.
			conn.close();
			System.out.println("========================================");
			for (i = 0; i < persons.length; i++) {
				System.out.println("주민번호: " + persons[i].getJumincd());
				System.out.println("이      름: " + persons[i].getPname());
				System.out.println("성      별: " + persons[i].getGender());
				System.out.println("나      이: " + persons[i].getAge());
				System.out.println("");
			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		// JDBC 연결문 종료
	}
}
