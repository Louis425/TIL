package ex10;

public class Ex08 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = t1;
		
		System.out.println("t1 = " + t1.channel);
		System.out.println("t1 = " + t1.power);
		
		System.out.println("t2 = " + t2.channel);
		System.out.println("t2 = " + t2.power);
		
		// 참조한 다른 클래스에 있는 메서드 찾아가기
		// ctrl + 마우스 왼쪽 or f3
		// alt + <-(화살표)
		t1.channel++;
		t1.power();
		System.out.println();
		
		System.out.println("t1 = " + t1.channel);
		System.out.println("t1 = " + t1.power);
		
		System.out.println("t2 = " + t2.channel);
		System.out.println("t2 = " + t2.power);
	}
}
