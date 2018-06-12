/**
 * 2018. 6. 5. Dev By Cheon You Gang
   com.kosea.kmove30
   MybatisTest.java
 */
package com.kosea.kmove30;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
  * @author kosea112
  *
  */
public class MybatisTest {

	public static void main(String[] args) {
		
		String resource = "mybatis-config.xml";//src경로
		
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session = sqlSessionFactory.openSession();
			try {
			  // Member member = new Member(101); = 밑에 있는 명령문과 같은 역할
			  
			  // 전체조회
				List<Members> memberList = new ArrayList<Members>();
				memberList = session.selectList("org.mybatis.example.MemberMapper.selectAllMember");
				
				for(Members member : memberList) {
					String logMessage = member.getLID().toString() + "  //  " + 
								        member.getLPASSWORD().toString() + "  //  " +
								        member.getMno();
					member.println(logMessage);
				}
				
				
				
			  // select구문
//				Member member  = (Member)session.selectOne("org.mybatis.example.MemberMapper.selectMember", 101);
//				member.println("아이디 : "   + member.getLID() +
//							   " 비밀번호 : " + member.getLPASSWORD() +
//							   " 번호 : "     + member.getMno());
			    
/*			  // delect구문
			    int deleteCount = session.delete("org.mybatis.example.MemberMapper.deleteMember", 101);
			    System.out.println("삭제건수"+deleteCount);
			    
			  // insert구문
			    Member newMember = new Member("천유강", "0123456789!", 103);
			    int insertCount = session.insert("org.mybatis.example.MemberMapper.insertMember", newMember);
			    System.out.println("추가 건수" + insertCount);
			    
			  // update 구문
			    String queryMapping = "org.mybatis.example.MemberMapper.updateMember";
			    Member member = new Member(102, "abc", "1234567890");
			    int updateCount = session.update(queryMapping, member);		
			    System.out.println("수정건수" + updateCount);*/
			    
			    
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
			  session.commit();
			  session.close();
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
