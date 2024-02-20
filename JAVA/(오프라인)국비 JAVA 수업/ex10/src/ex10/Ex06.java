package ex10;

/*
 * 생략가능한 자바 문법, 표현
 * import java.lang.*;
 * 기본생성자
 */

public class Ex06 {
	
	// 클래스 함수는 인스턴스화 해야지만 사용할 수 있다.
	public void doA() {
		System.out.println("doA 메서드 입니다.");
	}
	// static 은 메모리 공간에 항상 상주 한다.
	public static void doB() {
		System.out.println("doB 메서드 입니다.");
	}
	
	// 생성자(constructor)
	public Ex06(){
		System.out.println("기본생성자");
	}
	
	public static void main(String[] args) {
		// 인스턴스함수 호출
		Ex06 ex06 = new Ex06();
		ex06.doA();
		
		// static 함수 호출
		Ex06.doB();
		
		System.out.println();
	}
}
