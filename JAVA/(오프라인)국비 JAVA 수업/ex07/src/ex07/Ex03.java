package ex07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

// 백준 10952번 문제 : A+B -5

public class Ex03 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int z = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=z; i++) {
			st = new StringTokenizer(br.readLine());
			
			bw.write(Integer.parseInt(st.nextToken()));
		}
		bw.close();
		
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; ; i++) {
			String temp = scan.nextLine();
			
			if(temp.equals("0 0")) {
				System.out.println("종료됩니다.");
				break;   // 제일 가까이에 있는 switch 구문이나 while 구문이나 for 구문 종료됨
			}
			
			int num1 = Integer.parseInt(temp.split(" ")[0]);
			int num2 = Integer.parseInt(temp.split(" ")[1]);
//			System.out.println("num1 = " + num1);
//			System.out.println("num2 = " + num2);
			
			System.out.println(num1 + num2);
			
//			System.out.println(temp);
		}
	}
}
