package ex13;

class AA{
	public void doPrint() {
		System.out.println("스태틱 doPrint()");
	}
}

 class AAA{
	 public static AA aa = new AA();
	 public void doA() {
		 System.out.println("AAA doA");
	 }
 }

public class Ex03 {
	public static void main(String[] args) {
		AAA aa = new AAA();
		aa.doA();
		
		// System.out.println() -> out 이 static 변수이다.
		AAA.aa.doPrint();
		System.out.println("테스트");
	}
}
