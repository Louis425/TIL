package ex06;

/*
 * 프로그래머스 "더 크게 합치기" 
 */
import java.util.Scanner;

public class Ex01 {
	/*
	 * String -> int 
	 * Integer.parseInt(변수명);
	 * 
	 * String -> double
	 * Double.parseDouble(변수명);
	 * 
	 * String -> float
	 * Float.parseFloat(변수명);
	 */
	
	public static int solution(int a, int b) {
		String result1 = a +""+b;
		String result2 = b +""+a;
		
		System.out.println(Integer.parseInt(result1)<Integer.parseInt(result2));
		if(Integer.parseInt(result1)<Integer.parseInt(result2))
			return Integer.parseInt(result2);
		else
			return Integer.parseInt(result1);
	}
	
	public static void main(String[] args) {
		int a = 12;
		int b = 3;
		
		int result = solution(a,b);
		System.out.println(result);		
		
		Scanner scan = new Scanner(System.in);
		int z = scan.nextInt();
		
		for(int i=0; i<z; i++) {
	        int aa = i;
	        int bb = scan.nextInt();
		}

        
        System.out.println();
	}
}
