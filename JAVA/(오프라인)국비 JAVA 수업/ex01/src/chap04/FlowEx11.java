package chap04;

import java.util.*;

class FlowEx11 {
	public static void main(String[] args) { 
		char gender;
		String regNo = "";
		System.out.println("이렇게 출력하세요 : 011231-111231 ");
		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();

		gender = regNo.charAt(7);

		switch(gender) {
			case '1':
			case '3':
				switch(gender) {
					case '1':
					System.out.println("2000년 이전에 태어난 남자입니다.");
						break;
					case '3':
					System.out.println("2000년 이후의 출생한 남자입니다.");
				}
				break; 
			case '2':
			case '4':
				switch(gender) {
					case '2':
					System.out.println("2000년 이전에 출생한 여자입니다.");
						break;
					case '4':
					System.out.println("2000년 이후에 출생한 여자입니다.");
						break;
				}
				break;
			default:
				System.out.println("아무것도 아닙니다.");
		}
	} // main�� ��
}
