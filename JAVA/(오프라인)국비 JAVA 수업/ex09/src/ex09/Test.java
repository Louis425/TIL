package ex09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) throws Exception {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] z = new int[n];
		int count = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			z[i] = Integer.parseInt(st.nextToken());
		}
		
		int y = Integer.parseInt(br.readLine());

		for(int i=0; i<z.length; i++) {
			if(z[i]==y) {
				count++;
			}
			
		}
		System.out.println(count);
		br.close();
		bw.close();
	}
}
