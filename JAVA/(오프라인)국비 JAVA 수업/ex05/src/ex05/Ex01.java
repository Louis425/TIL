package ex05;

import java.util.Scanner;

/*
 * 자연수 n의 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수면 "n is odd"를 출력하는 코드를 작성해 보세요. 
 */

// 참조형 타입
class A{
	public void doA() {}
}
public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		// 삼항 연산자
		String result = n%2==0 ? "n is even" : "n is odd";
		System.out.println(result);
	}
}
