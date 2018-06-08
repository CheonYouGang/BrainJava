/**
 * 
 */
package dto;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.kosea.kmove30.Member;

/**
 * @author kosea112
 *
 */
//한명의 회원정보를 저장하는 클래스
//DTO: 데이터 전송(이동) 객체 , DB처리하는데 이용; 테이블의 한 레코드
public class JoinDTO {
	
	//로그
	private final Logger logger = Logger.getLogger(Member.class);
	
	public void println(String logMessage) {
		//읽는 순서 FATAL > ERROR > WARN > INFO > DEBUG
		logger.info(logMessage);
	}
	//로그 끝
	
	private String LID;
	private String LPASSWORD;
	private String LNAME;
	private String Gender;
	
	public String getLID() {
		return LID;
	}
	public String getLPASSWORD() {
		return LPASSWORD;
	}
	public String getLNAME() {
		return LNAME;
	}
	public String getGender() {
		return Gender;
	}
	public void setLID(String lID) {
		LID = lID;
	}
	public void setLPASSWORD(String lPASSWORD) {
		LPASSWORD = lPASSWORD;
	}
	public void setLNAME(String lNAME) {
		LNAME = lNAME;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	//DTO 객체 확인
	@Override
	public String toString() {
		return  "JoinDTO [id=" + LID + ", pwd=" + LPASSWORD + ", name=" + LNAME
				+ ", gender=" + Gender + "]";
	}
}
