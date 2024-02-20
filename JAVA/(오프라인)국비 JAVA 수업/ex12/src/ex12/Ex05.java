package ex12;

class CapA{
	public void take() {
		System.out.println("CapA 약 먹음");
	}
}

class CapB{
	public void take() {
		System.out.println("CapB 약 먹음 콧물 나음");
	}
}

class CapC{
	public void take() {
		
		System.out.println("CapC 약 먹음 열이제 안남");
	}
}

class ColdPatient{
	void takA(CapA a) {
		a.take();
	}
	void takB(CapB a) {
		a.take();
	}
	void takC(CapC a) {
		a.take();
	}
	
	void takeAll(CapA a, CapB b, CapC c) {
		a.take();
		b.take();
		c.take();
	}
}

public class Ex05 {
	public static void main(String[] args) {
		ColdPatient cp = new ColdPatient();
		
		// 캡슐화의 잘못된 사용 예시. 이렇게 하면 순서가 바뀔 수가 있음.
		cp.takC(new CapC());
		cp.takA(new CapA());
		cp.takB(new CapB());

		
		System.out.println();
		
		// 캡슐화의 잘된 사용 예시. 이렇게 하면 takeAll 자체에 순서를 정해놨기 때문에 순서가 바뀔 염려 없음.
		cp.takeAll(new CapA(), new CapB(), new CapC());
	}
}
