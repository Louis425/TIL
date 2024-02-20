package ex04;

public class Ex06 {
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		
// 		a*b=300 인데 byte 는 -127+127로 숫자의 범위를 벗어난다. 
//		벗어난 300은 44로 표현된다.
		byte c = (byte)(a*b);
		System.out.println(c);
	}
}
