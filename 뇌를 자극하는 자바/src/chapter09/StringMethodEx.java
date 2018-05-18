/**
 * 2018. 5. 11. Dev By Cheon You Gang
   chapter09
   StringMethodEx.java
 */
package chapter09;

 /**
  * @author kosea112
  *
  */
public class StringMethodEx {

	public static void main(String[] args) {
		
		String str1 = "   Let it be.   ";
		String str2 = str1.trim();
		
		System.out.println(str2);
		System.out.println(str2.concat("Speaking words of wisdom."));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.replace('e', 'a'));
		System.out.println(str1);
		System.out.println(str2);
	}

}
