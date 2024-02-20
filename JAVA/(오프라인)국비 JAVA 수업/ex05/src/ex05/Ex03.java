package ex05;

public class Ex03 {
	public static void main(String[] args) {
		
		char a = 'a';		
		for(int i=0; i<26; i++) {
			System.out.println(i + "\t" + a++);
		}
		
		a = 'A';
		for(int i=0; i<26; i++) {
			System.out.println(i + "\t" + a++);
		}
		
		// 0부터 하면 숫자 끝나고 특수 문자 나옴
		a = '0';
		for(int i=0; i<26; i++) {
			System.out.println(i + "\t" + a++);
		}
		
		// 변수 먼저 선언하고 for 구문 하려면 ; 적어야 함.
		int i = 0;
		for(; i<26; i++) {
			System.out.println(i + "\t" + a++);
		}
		
	}
}
