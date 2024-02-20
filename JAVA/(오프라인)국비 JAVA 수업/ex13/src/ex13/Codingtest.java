package ex13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Codingtest {
	public static void main(String[] args) throws Exception{
		int l = 5;
		int r = 555;
		int[] answer = {};
		String[] b = {};
		String a = "";
		int u = 0;
		
		for(int i=l; i<=r; i++) {		
			
			String y = Integer.toString(i);
			//b[i] = Integer.parseInt(y);			
			//System.out.println(b[i]);
			char[] c = y.toCharArray();
			
			System.err.println(c);
						
			for(int j=0; j<b.length; j++) {
				//char cc = b[i].charAt(j);
				//System.out.println(cc);
				if(c[j]==5 || c[j]==0) {
					b[j] += c;
					System.out.println("b = " + Arrays.toString(b));
				}				
			}
		}
	}
}
