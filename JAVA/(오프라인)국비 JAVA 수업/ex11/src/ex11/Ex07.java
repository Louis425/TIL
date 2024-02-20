package ex11;

class A{
	public void doA() {
		System.out.println("A doA");
	}
}
class B{
	public void doA() {
		System.out.println("B doA");
	}
}
class C{
	public void doA() {
		System.out.println("C doA");
	}
}

public class Ex07 {
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.doA();
		b.doA();
		c.doA();
	}
}
