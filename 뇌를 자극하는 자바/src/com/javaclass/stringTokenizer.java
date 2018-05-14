/**
 * 2018. 5. 14. Dev By Cheon You Gang
   com.javaclass
   stringTokenizer.java
 */
package com.javaclass;

import java.util.StringTokenizer;

/**
  * @author kosea112
  *
  */
public class stringTokenizer {

	//Token: 문자열을 구성하는 단위
	
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("사과, 배? 복숭아 ", ", ?");
		StringTokenizer token2 = new StringTokenizer("고슴도치,앵무새|토끼", ", |");
		
			while(token.hasMoreTokens()) {
				String str = token.nextToken();
				
				System.out.println(str);
			}
			
			System.out.println("");
			
			while(token2.hasMoreTokens()) {
				String str2 = token2.nextToken();
				
				System.out.println(str2);
			}
	}
}
