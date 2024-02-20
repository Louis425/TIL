package ex04;

public class Ex01 {
	public static void main(String[] args) {
		
		int a = 10;
		double b = 20.2d;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println();
		
		//int 를 double 로 형변환 하려면 강제형변환 해야함
		int c = (int) b;
		//double 을 int 로 형변환할 때는 자동형변환 된다.
		double d = a;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		
		//경우의 수가 3가지 이상하면 ()(괄호) 넣기
		System.out.println((b==c && a==b) || a==d);
		System.out.println(a==b && a==d);
	}
}
