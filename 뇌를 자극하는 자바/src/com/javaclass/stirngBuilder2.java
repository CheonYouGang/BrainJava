/**
 * 2018. 5. 14. Dev By Cheon You Gang
   com.stringbuilder
   stirngBuilder2.java
 */
package com.javaclass;

 /**
  * @author kosea112
  *
  */
public class stirngBuilder2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("어떤 돌이 내 얼굴을 물끄러미 쳐다보는 것만");
		
		System.out.println(sb);
		sb.replace(17, 21, "치어다보는");//17다음번째부터 21번째까지(18~21째 구문을 통째로 바꾼다.)
		sb.setCharAt(3, '꽃');//3번째 문자를 '꽃'으로 바꿈
		System.out.println(sb);
		sb.reverse();//순서 역변
		System.out.println(sb);
	}

}
