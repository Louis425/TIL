package ex03_1;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// && || ! & | ^ ~
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		// 입력받은 값이 a와 b 사이인지 확인하는 것 출력하세요
		// a<15<b
		int input = 15;
		System.out.println(a<input && input <b);
		
		//a>input || b>input
		System.out.println(a>input || b>input);
		
		//최소 공배수 인가? 최대 공약수 인가?
		//30을 5로 나누었을 때 나머지가 0 or 30을 7으로 나누었을때 나머지 0 인가요?
		System.out.println(30%5==0 || 30%7==0);
		
		boolean aa = false;

		if(aa) {
			System.out.println("aa 값은 참입니다.");
		} else {
			System.out.println("aa 값은 거짓입니다.");
		}
		
		if(30%5==0 && 30%7==0) {
			System.out.println("aa 값은 참입니다.");
		}
		
		String my_string = "He11oWor1d";
		String overwrite_string = "lloWorl";
		int s = 2;
        String answer = "";
        answer = my_string.substring(0, s) + overwrite_string;
        
        if(my_string.length() > answer.length()) {
        	answer += my_string.substring(answer.length());
        }
        System.out.println(answer);
        
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String answers = "";
        for(int i=0; i<str1.length(); i++) {
        	char c2 = str1.charAt(i);
        	char c3 = str2.charAt(i);
        	answers += c2;
        	answers += c3;
//        	for(int j=0; j<str2.length(); j++) {
//        		
//        		char c3 = str2.charAt(j);
//        		answers += c3;
//        		
//        	}
       }
        System.out.println(answers);
	}
	
}
