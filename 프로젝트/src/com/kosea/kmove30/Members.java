/**
 * 2018. 6. 5. Dev By Cheon You Gang
   com.kosea.kmove30
   Member.java
 */
package com.kosea.kmove30;

import org.apache.log4j.Logger;

/**
  * @author kosea112
  *
  */
public class Members {//변수값은 sql의 컬럼명과 같아야 한다.
	
	//로그
	private final Logger logger = Logger.getLogger(Members.class);
	
	public void println(String logMessage) {
		//읽는 순서 FATAL > ERROR > WARN > INFO > DEBUG
		logger.info(logMessage);
	}
	//로그 끝
	
	
	int mno;
	String LID;
	String LPASSWORD;
	
	//* public Member()를 만들거나 혹은 전부 없애거나 해야 한다.
	public Members() {
		//기본 생성자.
	}
	
	public Members(String lID, String lPASSWORD, int mno) {
		super();
		LID = lID;
		LPASSWORD = lPASSWORD;
		this.mno = mno;
	}


	public Members(int mno, String lID, String lPASSWORD) {
		super();
		this.mno = mno;
		LID = lID;
		LPASSWORD = lPASSWORD;
	}

	public int getMno() {
		return mno;
	}

	public String getLID() {
		return LID;
	}

	public String getLPASSWORD() {
		return LPASSWORD;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public void setLID(String lID) {
		LID = lID;
	}

	public void setLPASSWORD(String lPASSWORD) {
		LPASSWORD = lPASSWORD;
	}

	
}
