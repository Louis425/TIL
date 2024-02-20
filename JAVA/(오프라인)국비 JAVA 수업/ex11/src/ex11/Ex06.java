package ex11;

class MyClass{

	@Override
	public String toString() {
		return "MyClass";
	}
	
}

public class Ex06 {
	
	static int doA() {
		return 10;
	}
	
	static MyClass doClass() {
		return new MyClass();
	}
	
	public static void main(String[] args) {
		MyClass mc = doClass();
		System.out.println(mc);
	}
}
