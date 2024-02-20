package ex03;

import java.util.Scanner;

/*
 * 실수는 소수 두번째
 * 
 * 숫자를 입력받아 소수 둘째자리까지만 보여주세요
 * 
 * ex)
 * 23.456
 * 23.45
 * 
 * ex)
 * 11.1356712
 * 11.13
 */

public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		
		// next() 문자열입력, 빈공백전까지
		// nextLine() 문자열 한줄
		// nextInt() 정수 입력
		// nextDouble() 살수 입력
		double d = scan.nextDouble();
		
		System.out.println("d = " + d);
		
		// 41.123457861 * 100
		// 4112.3457861 -> int
		// 4112 / 100.0 -> double
		// 41.12
		
		int t = (int)(d*100);
		double tt = (int)(d*100)/100.0;
		System.out.println("t = " + t);
		System.out.println("tt = " + tt);
		System.out.println("d = " + (int)(d*100)/100.0);
		
		double dd = t/100.0;
		double ddd = (double)t/100;
		System.out.println("dd = " +dd);
		System.out.println("ddd = " + ddd); 
	}
}
