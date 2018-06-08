/**
 * 2018. 6. 8. Dev By Cheon You Gang
   com.kosea.kmove30
   logTest1.java
 */
package com.kosea.kmove30;

import org.apache.log4j.Logger;

/**
  * @author kosea112
  *
  */
public class LogTest1 {
	
	private final Logger logger = Logger.getLogger(LogTest1.class);
	
	public void println(String msg) {
		//읽는 순서 FATAL > ERROR > WARN > INFO > DEBUG
		logger.info(msg);
		logger.debug(msg);
	}
	
	public static void main(String[] args) {
		LogTest1 logTest1 = new LogTest1();
		logTest1.println("로그 테스트 중입니다.");
	}
}
