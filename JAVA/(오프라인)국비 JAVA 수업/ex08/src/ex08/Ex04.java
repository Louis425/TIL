package ex08;

import java.util.Arrays;
import java.util.Scanner;

// random한 숫자 3개를 꺼내서 같은 숫자가 나오면 true 출력하고 아니면 false


public class Ex04 {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner scan = new Scanner(System.in);
		int z = scan.nextInt(); 
		int y[] = new int[z];
		
		for(int i=0; i<z; i++) {
			
			y[i] = (int)(Math.random()*5);
			
			a = y[0];
			b = y[1];
			c = y[2];
			
		}
		if(a==b || b==c || a==c) {
			System.out.println("드디어 같아졌군!!!");
		} else
			System.out.println("a: " + a + ", b: " + b + ", c: "+ c);

	}	
}
