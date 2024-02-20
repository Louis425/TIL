package ex14;

public class AA {
	
	public int doC() {
		System.out.println("AA doA");
		return 10;
	}
	
	// 메서드 오버로딩
	public void doAA() {
		System.out.println("AA doA");
	}
	public void doAA(int a, int b) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	public void doAA(String c) {
		System.out.println("c = " + c);
	}
	
	public static void doB() {
		System.out.println("AA doB");
	}
	public static void doB(int a, int b) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	public static void doB(String c) {
		System.out.println("c = " + c);
	}
}
