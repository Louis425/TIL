package ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String temp = scan.nextLine();
		System.out.println(temp.charAt(0));
		System.out.println(temp.charAt(1));
		System.out.println(temp.charAt(2));
		System.out.println(temp.charAt(3));
		System.out.println(temp.charAt(4));
		
		String[] a = {"a", "c", "v" ,"d" };
		System.out.println("a[0] : " + a[0]);
		System.out.println("a[1] : " +a[1]);
		System.out.println("a[2] : " +a[2]);
		System.out.println("a[3] : " +a[3]);
		
		String c = "10 20 30 40";
		String test[] = c.split(" ");   // 빈 공백 기준으로 잘라라
		System.out.println(test[0]);
		System.out.println(test[1]);
		System.out.println(test[2]);
		System.out.println(test[3]);
		
		String d = "10, 20, 30 40";
		String test1[] = d.split("2");   // , 기준으로 잘라라
		System.out.println(test1[0]);
		System.out.println(test1[1]);
		
		//System.out.println(test1[2]);
		//System.out.println(test1[3]);
	}
}
