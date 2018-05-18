/**
 * 2018. 5. 14. Dev By Cheon You Gang
   com.stringbuilder
   stringBuilder.java
 */
package com.javaclass;

 /**
  * @author kosea112
  *
  */
public class stringBuilder {

	public static void main(String[] args) {
		//StringBuilder sb = new StringBuilder("역사를 하노라고 맨땅을 파다가 ");
		StringBuilder sb = new StringBuilder("역사를 하노라고 맨땅을 파다가 ");
		sb.ensureCapacity(50);
		
		System.out.println(sb.capacity());

		
		System.out.println(sb);
		System.out.println(sb.append("커다란 고인돌을 끄집어 내어놓고 보니"));
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.insert(26, "하나"));
		System.out.println(sb.delete(21, 23)); //21번째, 23번째 인덱스-1 까지(21~22까지만 빼짐)
		System.out.println(sb.deleteCharAt(9));
		
		System.out.println(sb.capacity());
		
		sb.trimToSize();
		System.out.println(sb.capacity());

	}
}
