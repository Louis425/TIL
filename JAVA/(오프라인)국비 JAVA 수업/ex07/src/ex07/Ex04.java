package ex07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) throws Exception{
		// 5
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
//		for(int i=0; i<5; i++) {
//			for(int z=4; z>i; z--) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=0; i<5; i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.print("!");
//			}
//			System.out.println();
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String s;
		while((s=br.readLine())!= null) {
			st = new StringTokenizer(s, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
            bw.write( (a+b) + "\n");
		}
		br.close();
		bw.flush();
        bw.close();
		
	}
}
