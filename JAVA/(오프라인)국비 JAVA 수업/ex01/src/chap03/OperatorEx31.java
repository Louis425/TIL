package chap03;

class OperatorEx31 {
	public static void main(String[] args) {
		int dec  = 1234; 
		int hex  = 0xABCD;
		int mask = 0xF;
		
		System.out.println(hex);
		System.out.println(mask);
		
		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask);  // 16진수로 출력
		System.out.printf("%d%n", hex & mask);  // 10집수로 출력
		
			  //비트연산
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
	}
}
