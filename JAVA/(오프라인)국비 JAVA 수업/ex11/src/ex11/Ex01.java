package ex11;

/*
 * 연락처 관리 프로그램 
 */

public class Ex01 {
	public static void main(String[] args) {
		
		Person[] p = new Person[10];
		
		// 주소값 가지게 됨.
		p[0] = new Person("이길동", "010-1234-5678", "남성", "잘생김", 25);
		p[0].name = "홍길동";
		
//		p[0].setPerson("이길동", "010-1234-5678", "남성", "잘생김");
		
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
	}
}
