package ex09;

import java.util.Arrays;

public class Prac {
	
	public static void main(String[] args) {
		int[] a = new int[10];
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*10);
			for(int j=0; j<i; j++) {
					
				if(a[i] == a[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<a.length; j++) {
				
				if(a[j] >a[i]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	
	}
}
