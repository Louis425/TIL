package ex08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int productCnt = 0;
		int calcu_total = 0;
		
		total = scan.nextInt();
		productCnt = scan.nextInt();
		
		int[] itemPrice = new int[productCnt];
		int[] itemCnt = new int[productCnt];
		
		
		for(int i=0; i<productCnt; i++) {
			itemPrice[i] = scan.nextInt();
			itemCnt[i] = scan.nextInt();
		}
		
		for(int i=0; i<productCnt; i++) {
			calcu_total = calcu_total + ( itemPrice[i]*itemCnt[i]);
		}
		
		if(total == calcu_total)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
