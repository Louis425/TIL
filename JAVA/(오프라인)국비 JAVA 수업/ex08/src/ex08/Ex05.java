package ex08;

import java.util.Scanner;
import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		//3, 6, 9일때 출력하지 마라
		// j==7 일 때 j 값이 증가해라
		// 
//		for(int i=0; i<10; i++) {
//			System.out.println("i = " + i);
//			for(int j=0; j<10; j++) {
//				
//				if(j ==3 || j ==6 || j ==9) {
//					continue;
//				}
//				if(j==7) {
//					i = i+1;
//					System.out.println("여기인가");
//					break;
//				} 
//				System.out.println("\t j = " + j);
//			}
//		}
		Scanner scan = new Scanner(System.in);
        int answer = 0;
        String control = "wsdawsdassw";
        int n = 0;
        
        for(int i=0; i<control.length(); i++){
            char c = control.charAt(i);
            
            switch(c){
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
 //          System.out.println(n);
            
        }
        answer = n;
 //      System.out.println("answer : " + answer); 
 
        
        
        
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		String answer1 = "";
		int a = 0;
		int t = 0;
		
		for(int i=0; i<numLog.length; i++) {
			int z = numLog[i];
			t += numLog[i];
			
			for(int j=0; j<i; j++) {
				
			}
			
			
			
		}
		System.out.println("a + " + answer1);
		System.out.println(t);
		
		
		
		
		
//		int[] y = new int[numLog.length+1];
//        System.arraycopy(numLog, 0, y , 0, numLog.length);
//        
//        
//        // 새로운 배열의 마지막 요소에 numLog[0] 값을 추가
//        y [y .length - 1] = numLog[0];
//		int[] y = {1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1, 0};
//		
//        for (int i = 0; i < numLog.length; i++) {
//        	y [i] = numLog[numLog.length - 1 - i];
//        }
		
//        System.out.println("numLog : " + Arrays.toString(numLog));
//		System.out.println("y:       " + Arrays.toString(y) );
//		
//		
//			
//		for(int i=0; i<numLog.length-1; i++) {
//						
//			if(((numLog[i] -y[i+1]) == (-1)) && numLog[i] >=0) {
//							answer1 += "w";
//			}else if((numLog[i] + y[i+1]) == (+1)) {
//							answer1 += "s";
//			}else if((numLog[i] - y[i+1]) == (-10)) {
//							answer1 += "d";
//			}else if((numLog[i] + y[i+1]) == (+10)) {
//							answer1 += 'a';
//			}else if(((numLog[i] + y[i+1]) < 0) && (numLog[i] > y[i+1])) {
//							answer1 += 's';
//			}else if(((numLog[i] + y[i+1]) < 0) && (numLog[i] < y[i+1])) {
//							answer1 += 'w';
//			}
//						
//		}
//	
//		System.out.println("answer1 : " + answer1);
	}
}
