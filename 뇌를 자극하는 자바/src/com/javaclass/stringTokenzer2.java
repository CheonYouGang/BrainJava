/**
 * 2018. 5. 14. Dev By Cheon You Gang
   com.javaclass
   stringTokenzer2.java
 */
package com.javaclass;

import java.util.StringTokenizer;

/**
  * @author kosea112
  *
  */
public class stringTokenzer2 {

	public static void main(String[] args) {

		StringTokenizer token = new StringTokenizer("사과=10|초콜렛=3|삼페인=1", "=|, true");
		
		while(token.hasMoreTokens()) {
			String token2 = token.nextToken();
			if(token2.equals("="))
				System.out.print("\t");
			else if(token2.equals("|"))
				System.out.print("\n");
			else
				System.out.print(token2);
		}
	}

}
