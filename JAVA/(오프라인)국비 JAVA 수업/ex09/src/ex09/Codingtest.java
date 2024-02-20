package ex09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Codingtest {
	public static void main(String[] args) throws Exception{
		int I = 5;
		int r = 555;
		int[] answer = {};
//		String[] a = {};
		String a = "";
		int u = 0;
		
		for(int i=I; i<=r; i++) {		
			
			String y = Integer.toString(i);

			char[] c = y.toCharArray();
			
			//System.out.println(c);
			
			for(int j=0; j<c.length; j++) {
				char cc = y.charAt(j);
				//System.out.println(cc);
				if(cc==5) {
					u = cc;
					System.out.println(u);
				}				
			}
		}
		System.out.println("\r\n"
				+ "██████╗ ██╗██████╗ ████████╗██╗  ██╗██████╗  █████╗ ██╗   ██╗\r\n"
				+ "██╔══██╗██║██╔══██╗╚══██╔══╝██║  ██║██╔══██╗██╔══██╗╚██╗ ██╔╝\r\n"
				+ "██████╔╝██║██████╔╝   ██║   ███████║██║  ██║███████║ ╚████╔╝ \r\n"
				+ "██╔══██╗██║██╔══██╗   ██║   ██╔══██║██║  ██║██╔══██║  ╚██╔╝  \r\n"
				+ "██████╔╝██║██║  ██║   ██║   ██║  ██║██████╔╝██║  ██║   ██║   \r\n"
				+ "╚═════╝ ╚═╝╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═╝   ╚═╝   \r\n"
				+ "                                                             \r\n"
				+ "");
	}
}
