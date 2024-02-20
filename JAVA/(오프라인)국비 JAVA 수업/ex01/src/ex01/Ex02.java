package ex01;

public class Ex02 {
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a = " + a);
		
		int b = 20;
		//"a + b = " 자체가 스트링 타입이기에 a+b 가 문자로 인식되서 숫자 더하기가 아닌 문자로 인식에서 출력 
		System.out.println("a + b = " + a+b);
		//a+b 적으면 숫자로 인식해서 더하기로 출력 됨
		System.out.println(a+b);
		System.out.println("a + b = " + (a+b));
		
		String c = "a";
		String d = "b";
		System.out.println(c+d);
		
	}
}
