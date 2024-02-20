package ex03_1;

public class Ex01 {
	public static void main(String[] args) {
		// 나머지 구하기
		System.out.println(3%2);
		
		// 비트 연산
		// 0010 = 2   비트 연산 하면 1을 왼쪽으로 2번 옮기면 1000
		// 1000 => 8  1000은 8이다
		System.out.println(2<<2);
		
		System.out.println(10>3);
		System.out.println(10<=3);
		
		System.out.println(10==10);
		System.out.println(10!=10);
		
		int a = 10;
		int b = 20;
		System.out.println(a==b);
		System.out.println(a!=b);
	}
}
