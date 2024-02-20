package ex03;

/*
 * int -> char unicode A=>65 65=>A
 * 
 * 실수 -> 정수
 * double -> int 소수점을 버려서 형변환된다.
 * 
 * 정수 -> 실수
 * 10 -> 10.0
 * 20 -> 20.0
 * 
 */

public class Ex09 {
	public static void main(String[] args) {
		double d = 853.433d;
		int score = (int)d;
		System.out.println("score = " + score);
		System.out.println("d = " + d);
		
		// 비트 체계가 작은거에서 큰걸로 바꿀때는 자료의 소실이 없기 때문에 안적어도 자동 형변환 된다.
		int aa = 10;
		double ee = aa;
		System.out.println("aa = " + aa);
		System.out.println("ee = " + ee);
	}
}
