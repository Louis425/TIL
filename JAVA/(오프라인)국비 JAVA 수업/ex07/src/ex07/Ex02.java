package ex07;

public class Ex02 {
	
	public static void doA() {
		System.out.println("doA 매개변수 없는 함수");
		return; // 함수 종료
	}
	
	public static void doB(int a) {
		System.out.println("doA 매개변수 a = " + a);
		if( a==10 ) {
			return;
		}
		else if(a==8){
			System.out.println("종료됩니다.");
			return;
		}
		System.out.println("if구문 else 구문 못갔다");  // 이 부분까지 영원히 못 올 경우의 코드가 위에 있다면 이 부분은 에러 뜸
	}
	
	public static int doC(int a) {
		return a*a;
	}
	
	public static void doD() {
		System.out.println("abcdef".substring(3)); // 문자열 3번부터 출력해라. 3앞까지는 삭제해라
		System.out.println("abcdef".substring(3,5)); //문자열 3번부터 5번전까지 살리고 나머지는 짤라라
	}
	
	public static void main(String[] args) {
		doA();
		doB(7);
		//int a = doC(10);
		System.out.println(doC(10));
		System.out.println(doC(20));
		System.out.println(doC(30));
		doD();
	}
}
