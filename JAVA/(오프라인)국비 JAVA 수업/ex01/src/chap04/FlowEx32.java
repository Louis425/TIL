package chap04;

import java.util.*;

class FlowEx32 {
	public static void main(String[] args) { 
		int menu = 0;
		int num  = 0;

		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("(1) square / 제곱을 구해라");
			System.out.println("(2) square root / 루트 구해라");
			System.out.println("(3) log / 로그10 구하라");
			System.out.print("1,2,3 중에 선택하세요>");

			String tmp = scanner.nextLine(); 
			menu = Integer.parseInt(tmp);   

			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("다시 메류숫자 입력하세요(종료는 0)");
				continue;		
			} else {
				System.out.println("제곱 = " + menu*menu);
				System.out.println("루트 = " + Math.sqrt(menu));
				System.out.println("log = " + Math.log(menu));
			}
			
			System.out.println("선택하신 메뉴는 "+ menu +"입니다.");
		}
	}
}
