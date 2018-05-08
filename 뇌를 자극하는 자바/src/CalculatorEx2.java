/**
 * 2018. 5. 1. Dev By Cheon You Gang
   
   CalculatorEx2.java
 */

/**
 * @author kosea112
 *
 */
public class CalculatorEx2 {

	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		if(++num1>0||++num2>0)
			System.out.println("num1이 0보다 크거나 num2가 0보다 큽니다.");
		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);
		
		int a = 20, b = 30, max;
		max = (a < b)? a : b;
		System.out.println("max의 값: " + max);

		int d =2, e=3, f=5;
		double g=4.0, h=0.5, i;
		i = ((d+e)==f)?g:h;
		
		System.out.println(i);
		
	}

}
