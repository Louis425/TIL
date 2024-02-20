package ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;

public class Text {
	public static String ss(String my, int k) {
		String answer = "";
		for(int i=0; i<k; i++) {
			answer = answer + my;
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		
		String my = "abcde";
		int num = 10;
		
		String tmp = ss(my,num);
		System.out.println(tmp);

//		Scanner scan = new Scanner(System.in);
//		int y = scan.nextInt();
//		for(int i=1; i<=y; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st;
		int z = Integer.parseInt(bb.readLine());
		//bw.flush();  // 남아있는 데이터를 모두 출력시킨다.
		
		//int T = scan.nextInt();
		for(int i=0; i<z; i++) {
			for(int j=0; j<=i; j++) {
				st = new StringTokenizer(bb.readLine());
				bw.write((Integer.parseInt(st.nextToken()))+(Integer.parseInt(st.nextToken())));
			}
			//bw.newLine();
		}
		
		bw.close();

	}
}
