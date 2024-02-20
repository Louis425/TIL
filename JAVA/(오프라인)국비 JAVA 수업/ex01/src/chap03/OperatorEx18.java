package chap03;

class OperatorEx18 {
	public static void main(String args[]) { 
		
		/*
		 * 반올림 함수
		 * Math.round()
		 * 
		 * 0< x <1 사이에 값 랜덤하게 구하기(범위 지정하지 않으면 0에서 1사이 값 출력 됨) 
		 * Math.random()  -> 랜덤한 숫자 출력됨.
		 */
		
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;

		System.out.println(shortPi);
	}
}
