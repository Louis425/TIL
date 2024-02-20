package ex06;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		System.out.println(hour);
		System.out.println(min);
		
		if(hour == 0)
			hour = 24;
		if(min < 45) {
			hour = hour-1;
			min = (min+60)-45;
		}else {
			min = min -45;
		}
		System.out.println(hour);
		System.out.println(min);
	}
}
