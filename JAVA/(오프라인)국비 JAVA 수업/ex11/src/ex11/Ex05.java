package ex11;

/*
 * import java.lang.*;
 * 기본생성자
 * toString() 
 * 
 */

public class Ex05 {
	public static void main(String[] args) {
		Data d1 = new Data();
		System.out.println("d1 = " + d1.toString());
		System.out.println("d1 = " + d1);
		
		// new 선언했다면 새로운 Data 메모리가 생겼겠지만
		// d1 을 가리켰기 때문에 d1 주소를 가지는 참조변수 d2 임.,
		Data d2 = d1;
		
		// static 안적혀있으면 이렇게 인스턴스화 해서 쓸 수 있다.
//		Ex05 ex05 = new Ex05();
//		
//		Data d2 = ex05.copy(d1);
		
		System.out.println("d2 = " + d2);
		System.out.println("d2 = " + d2.toString());
		
		//같은 주소를 가리키는 거라서 값이 바뀜
		d2.x = 100;
		System.out.println("d2 = " + d2);
		System.out.println("d1 = " +d1);
		
		// copy 에서 새로운 메모리를 가진 Data 설정 해서 값 바뀜
//		d2.x = 100;
//		System.out.println("d2 = " + d2);
//		System.out.println("d1 = " +d1);
	}
	
	static Data copy(Data d) {
		Data data = new Data();
		return data;
	}
	
//	Data copy(Data d) {
//		Data data = new Data();
//		return data;
//	}
}
class Data{
	int x = 10;

	@Override
	public String toString() {
		return "Data [x=" + x + "]";
	}
	
	
}
