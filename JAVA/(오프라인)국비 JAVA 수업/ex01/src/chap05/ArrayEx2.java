package chap05;

import java.util.*;  // Arrays.toString()�� ����ϱ� ���� �߰�

class ArrayEx2 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		// i=0부터 9까지 진행
		// i= 0,1,2,3,4,5,6,7,8,9
		// iArr1[0] = 1; iArr1[1] = 2; iArr1[2] = 3; iArr[3] = 4; 등등
		for (int i=0; i < iArr1.length ; i++ ) {
			iArr1[i] = i + 1; 
		}

		for (int i=0; i < iArr2.length ; i++ ) {
			iArr2[i] = (int)(Math.random()*10) + 1;
		}

		for(int i=0; i < iArr1.length;i++) {
			System.out.print(iArr1[i]+",");	
		}
		
		System.out.println();

		for(int i=0; i < iArr2.length;i++) {
			System.out.print(iArr2[i]+",");	
		}
		System.out.println();			
		
		// 배열을 문자로 출력하기
		String a = "[abcedf]";
		a = a.replace("[", "");
		a = a.replace("]", "");
		System.out.println(a);
		
		System.out.println(Arrays.toString(iArr1).replace("[", "").replace("]", ""));
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);   // 주소값
		System.out.println(chArr);
	}
}
