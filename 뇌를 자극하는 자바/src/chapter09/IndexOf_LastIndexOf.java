/**
 * 2018. 5. 11. Dev By Cheon You Gang
   chapter09
   IndexOf_LastIndexOf.java
 */
package chapter09;

 /**
  * @author kosea112
  *
  */
public class IndexOf_LastIndexOf {

	public static void main(String[] args) {

		String str1 = "Java Programing";
		int index = str1.indexOf("Programing");
		int index2 = str1.indexOf("a");//index - 맨 처음에 있는 문자열
		int index3 = str1.lastIndexOf("a");//lastIndexOf - 맨 마지막에 있는 문자열
		
		if(index < 0) {
			System.out.println("No data");
		}else {
		System.out.println(index + "번째 인덱스에 위치하고 있습니다.");
		System.out.println(index2 + "번째 인덱스에 위치하고 있습니다.");
		System.out.println(index3 + "번째 인덱스에 위치하고 있습니다.");
		}
		
		String str = "꽃나무는 제가 생각하는 꽃나무를 " +
					 "열심으로 생각하는 것처름 열심으로 꽃을 피워가지고 섰소";
		System.out.println(str.indexOf('꽃'));
		System.out.println(str.indexOf('꽃', 3));
		System.out.println(str.indexOf("꽃나무"));
		System.out.println(str.indexOf("꽃나무", 3));
		System.out.println(str.lastIndexOf('꽃'));
		System.out.println(str.lastIndexOf('꽃', 20));
		System.out.println(str.lastIndexOf("꽃나무"));
		System.out.println(str.lastIndexOf("꽃나무", 20));
	}

}
