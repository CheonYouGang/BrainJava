/**
 * 2018. 6. 8. Dev By Cheon You Gang
   dao
   JoinDAO.java
 */
package dao;

import java.io.FileInputStream;
import java.util.Properties;

import dto.JoinDTO;

/**
  * @author kosea112
  *
  */
//데이터베이스에 접근하는 객체
public class JoinDAO {

	public JoinDAO() {
		//기본클래스
	}
	
	//회원 정보를 얻는 메소드
	public JoinDTO getJoinDTO(String LID) {
		JoinDTO dto = new JoinDTO();
		
		return dto;
	}
	//회원 정보를 얻는 메소드
}
