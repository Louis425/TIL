package ex03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.printf("a = %d , b = %d\n", a, b);
		
		int c = 300;
		byte d = (byte)c;   //byte 의 범위(-127~+127)를 벗어났기 때문에 값 손실 생김
		System.out.printf("c = %d , d = %d", c, d);
		
		Scanner s = new Scanner(System.in);
        String str = s.nextLine();
  
        System.out.println(str);
        
	}
}
