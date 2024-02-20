package ex11;

public class Ex02 {
	
	Ex02(){
		// 참조자료형타입으로 선언된 변수는 값이 유동적이다. 힙 영역
		int x[] = {10,20};
		
		// 기본형타입으로 선언된 변수는 값이 변하지 않는다. 스택 영역
		int y = 10;
		
		System.out.println("y = " + y);
		doArr(y);
		System.out.println("y = " + y);
		
		System.out.println("기본생성자 x[0]= " + x[0]);
		System.out.println("기본생성자 x[1]= " + x[1]);
		
		doArr(x);
		
		System.out.println("기본생성자 x[0]= " + x[0]);
		System.out.println("기본생성자 x[1]= " + x[1]);
	}
	
	// 이름같아도 받는 타입이 다르면 다른 게 인식한다.
	public void doArr(int y) {
		y = 200;
		System.out.println("doArr = " + y);
	}
	
	public void doArr(int x[]) {
		x[0] = 100;
		System.out.println("doArr = " + x[0]);
	}
		
	public static void main(String[] args) {
		new Ex02();
	}
}
