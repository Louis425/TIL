package chap03;


class OperatorEx26 {
	public static void main(String[] args) { 
		int a = 5;
		int b = 0;

		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
		System.out.printf("a=%d, b=%d\n", a, b);
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);
		
		System.out.println();
		
		// 1~30 까지 수 중에서 2로 나누었을 때 0이고 3으로 나누었을 때 0인 숫자는 무엇이냐?
		for(int i=1; i<=30; i++) {
			if(i%2==0 && i%3==0) {
				System.out.println("i =" + i);
			}
		}
	}
}
