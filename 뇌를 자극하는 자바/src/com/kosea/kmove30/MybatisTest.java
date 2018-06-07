/**
 * 2018. 6. 5. Dev By Cheon You Gang
   com.kosea.kmove30
   MybatisTest.java
 */
package com.kosea.kmove30;

import java.io.InputStream;

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
			  // select구문
				Member member  = (Member)session.selectOne("org.mybatis.example.SelectMapper.selectMember", 101);
			    System.out.println("회원 아이디: " + member.getLID());
			    
			  // delect구문
			    int deleteCount = session.delete("org.mybatis.example.SelectMapper.deleteMember", 101);
			    System.out.println("삭제건수"+deleteCount);
			    
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
