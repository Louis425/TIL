package ex09;

import java.util.Arrays;

public class Ex03 {
	
	public static void solution(int[] temp) {
		temp[0] = 100;
		System.out.println(Arrays.toString(temp));
	}
	public static void doA(int temp) {
		temp = 200;
		System.out.println(temp);
	}
	

	public static void main(String[] args) {
		
		//배열의 규칙
		//같은 주소를 가지게 됨
		int[] a = {1,2,3,4,5};
		int[] b = a;

		solution(a);
		System.out.println(Arrays.toString(a));
		
		int c = 100;
		doA(c);
		System.out.println(c);
	}
}