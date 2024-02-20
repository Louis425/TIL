package chap04;

import java.util.*;

class FlowEx7 {
	public static void main(String[] args) { 
		int user, com;

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); 
		user = Integer.parseInt(tmp);   
		
		// Math.random()
		
		// 0<x<1
		// 0<x<3
		// 0.00000000000003 -> int 로 바꾸면 0 -> 더하기 1 하면 1
		// 2.99999999999999 -> int 로 바꾸면 2 -> 더하기 1 하면 3
		// com 1~3 중에 랜덤으로 출력해라
		com = (int)(Math.random() * 3) + 1; 
		System.out.println("user : " +user);
		System.out.println("com : " + com);
		
		switch(user-com) {
			case 2: case -1:
				System.out.println("user-come의 값은 2이거나 -1입니다.");
				break;
			case 1: case -2:
				System.out.println("user-come의 값은 1이거나 -2입니다.");
				break;
			case 0:
				System.out.println("user-come의 값은 0입니다.");
				break;		
			default:
				System.out.println("이쪽으로 옵니다.");
		}
	}  
}
