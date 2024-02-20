package ex10;

class AA{
	int a = 10;
	
	// static 변수는 공유변수라고도 한다. 
	// static 변수는 프로그램 시작과 동시에 초기화해서 프로그램 끝날때까지 공유되는 변수이다.
	static int b = 20;
}

public class Ex05 {
	public static void main(String[] args) {
		AA a1 = new AA();
		AA a2 = new AA();
		
		a1.a++;
		System.out.println(a1.a);
		// AA의 a가 공유되는 변수가 아니때문에 a1과 a2의 a 가 다름
		System.out.println(a2.a);
		
		a1.b++;
		System.out.println(a1.b);
		// AA의 b가 공유되는 변수(static)이기 때문에 a1과 a2의 a 가 같음
		System.out.println(a2.b);
		
		AA.b++;
		System.out.println(AA.b);
		// a2.b -> 노란색 부분 should AA.b 로 쓰는게 좋지 않겠니?
		System.out.println(a2.b);
		
		// 에러
//		System.out.println(AA.a);
	}
}
