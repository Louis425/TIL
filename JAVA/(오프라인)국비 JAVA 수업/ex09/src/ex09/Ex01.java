package ex09;

public class Ex01 {
	
	public static int solution(int a, int b, int c) {
		int answer = 0;
		
		if( a==b && a==c) {
			System.out.println("세개 다 같음");
			answer = (a+b+c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c);
		} else if(a==b || a==c || b==c) {
			answer = (a+b+c)*(a*a + b*b + c*c);
		} else {
			answer = a+b+c;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int result = solution(2,6,1);
		System.out.println(result);
	}
}
