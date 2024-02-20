package ex09;

import java.util.Arrays;

/*
 * 버블정렬
 * 버블정렬을 했을 때에 다음에 보기에서 2회전 했을때 맞는 것은?
 * 1) 90,30,40,100,120  2) 60,40,90,100,120
 *  1회전
 *  { 100,90,60,40,120 } 
 *  { 90,100,60,40,120 }
 *  { 90,60,100,40,120 }  
 *  { 90,60,40,100,120 }  
 * 
 *  2회전
 *  { 60,90,40,100,120 }
 *  { 60,40,90,100,120 }
 *  
 *  3회전
 *  { 40,60,90,100,120 }
 * 
 * 요소중 제일 큰수
 * 요소중 제일 작은 수
 * 
 * 내림차순
 * 오름차순
 * 
 */

public class Ex04 {
	public static void main(String[] args) {
		int a[] = {100,90,60,40,120};
		
		int max = a[0];
		int min = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(max< a[i]) {
				max = a[i];
			} else if(min > a[i]){
				min = a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}
