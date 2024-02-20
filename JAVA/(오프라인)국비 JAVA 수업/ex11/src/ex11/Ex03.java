package ex11;

import java.util.Scanner;

/*
 	배열을 선언하고 배열을 정렬하고 배열의 모든값을 더해서 출력해보기
 	메서드를 이용해서
*/

public class Ex03 {
	
	Ex03() {
		int arr[] = new int[] { 10, 20, 5, 2, 11 };
		
		ArrayU myU = new ArrayU();
		myU.sort(arr);		
		myU.print(arr);
	}

	public void aArr(int[] z) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < z.length; i++) {
			z[i] = scan.nextInt();
		}
	}

	public static void main(String[] args) {
		new Ex03();
	}
}
