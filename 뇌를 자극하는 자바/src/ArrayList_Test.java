import java.util.ArrayList;

/**
 * 2018. 5. 9. Dev By Cheon You Gang
   
   ArrayList_Test.java
 */

/**
 * @author kosea112
 *
 */

public class ArrayList_Test {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>(3);
		fruits.add("포도");
		fruits.add("딸기");
		fruits.add("복숭아");
		fruits.add("아보카도");
		fruits.add("사과");
		
		System.out.println("과일 출력: "+fruits);
		
		
		for(int i=0; i<fruits.size(); i++) {
			System.out.printf(fruits.get(i)+" ");
		}
		System.out.println("");
		
		fruits.remove(4);
		
		for(int i=0; i<fruits.size(); i++) {
			System.out.printf(fruits.get(i)+" ");
		}
	}

}