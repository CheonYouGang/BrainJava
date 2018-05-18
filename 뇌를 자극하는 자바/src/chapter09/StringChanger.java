/**
 * 2018. 5. 11. Dev By Cheon You Gang
   chapter09
   StringChanger.java
 */
package chapter09;

 /**
  * @author kosea112
  *
  */
public class StringChanger {

	public static void main(String[] args) {
		String str1 = "뇌를 자극하는 C";
		String str2 = str1.replace("C", "하드웨어");//replace: 치환
		String str3 = str2.concat(" 입문");//concat: 뒤에 이어 붙이기
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		String str4 = "자바 커피";
		int len = str4.length();
		
		for(int cnt = 0; cnt < len; cnt++) {
			char ch = str4.charAt(cnt);
			System.out.print(ch);
		}
		System.out.println("");
		
		
//		String str5 = new String("Hello, Java");
//		String str6 = new String("Hello, Java");
//		String str7 = new String("Hello, Java");
		
		String str5 = "Hello, Java";
		String str6 = "Hello, Java";

		if(str5==str6) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		String str7 = "뇌를 자극하는 자바";
		System.out.println(str7.substring(3));
		System.out.println(str7.substring(3, 7));
		System.out.println(str7.substring(8, 10));		
	}

}
