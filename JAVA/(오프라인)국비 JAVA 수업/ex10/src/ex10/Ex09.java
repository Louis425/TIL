package ex10;

public class Ex09 {
	
	Ex09(){
		System.out.println("기본생성자");
	}	
	public static void doA() {
		System.out.println("static 함수");
	}
	public void doB() {
		System.out.println("non-static 함수");
	}
	
	public static void main(String[] args) {
		// static 없으면 참조변수 만들어서 메모리상에 올려놓고 써야한다.
		Ex09 ex09 = new Ex09();
		ex09.doB();
		
		//static 함수는 참조변수 없이 사용할수 있다.
		doA();
		Ex09.doA();  // <--- 이렇게 적는적이 제일 맞는 표현이다.
		ex09.doA();  // <--- 이렇게 적어도 출력은 되지만 ! 표시 뜬다.
	}
}
