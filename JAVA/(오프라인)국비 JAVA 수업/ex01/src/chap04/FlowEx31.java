package chap04;

class FlowEx31 {
	public static void main(String[] args) {
		
		for(int i=0;i <= 10;i++) {
			if (i%3==0)
				System.out.println(i+"일때 cotinue 됨");
				continue;
			
		}
		System.out.println();
		
		// i = 0 ~100까지 4의 배수를 출력해주세요.
		for(int i=0; i<=100; i++) {
			if(i%4==0) {
				System.out.print(i + " ");
				continue;
			}
		}
	}
}
