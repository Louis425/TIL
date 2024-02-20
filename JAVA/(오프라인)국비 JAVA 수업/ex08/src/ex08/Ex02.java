package ex08;

import java.util.Scanner;

// 자판기

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("---  자판기  ---");
		System.out.println("잔돈을 입력해주세요: ");
		int coin = scan.nextInt();
		int num = 0;
		
		String c = "1. 콜라: 500원";
		String h = "2. 환타: 300원";
		String w = "3. 물: 100원";
		
		if(coin <= 0) {
			System.out.println("돈이 부족합니다.");
		} else 
			System.out.println("음료 번호를 선택해주세요: ");
			System.out.println(c);
			System.out.println(h);
			System.out.println(w);
			
			num = scan.nextInt();
		
		
	}
}
