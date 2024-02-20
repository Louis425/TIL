package ex02;

import java.util.Scanner;

class AA{
	public void doA() {
		System.out.println("AA.doA()");
	}
}

public class Ex07 {
	public static void main(String[] args) {
		// 기본형
		int a = 10;

		//참조형 타입 변수 선언
		Scanner scan = new Scanner(System.in);
		// Scanner scan1 = new File("c:\\a.txt");  //import java.io.File;
		System.out.println("입력하세요: ");
		String inputString = scan.nextLine();
		System.out.println("scan: " + inputString);
		
		//참조형 타입 변수 선언
		//참조형: 내가 만들수도 있고 java 회사에서 만든것도 있어서 많음.
		AA aa = new AA();
		aa.doA();
		
		
	}
}
