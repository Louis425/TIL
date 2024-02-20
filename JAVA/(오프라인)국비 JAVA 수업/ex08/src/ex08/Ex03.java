package ex08;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		String todolist[] = new String[100];

		while(true) {
			Scanner scan = new Scanner(System.in);
			int select = scan.nextInt();
			
			if(select == 1) {
				// 할일 추가 만들어야함.
				todolist[0] = "공부";
				System.out.println("할일 추가 만들어야함." + todolist[0]);
				
			} else if(select == 2) {
				// 할일 삭제 만들어야함.
				todolist[0] = "";
				System.out.println("할일 삭제 만들어야함." +todolist[0]);
				
			} else if(select == 3) {
				// 우선순위 부여
				System.out.println("우선순위 분여");
			} else {
				System.out.println("잘못 입력했습니다.");
				break;  // break 만나게 되면 if 구문이 아니라 while 구문을 탈출하게 된다.
			}
		}
		
		System.out.println(todolist[0]);
	}
}
