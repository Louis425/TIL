package ex08;

import java.util.Arrays;

public class Ex08 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] brr = arr;
		
		int[] c = Arrays.copyOf(arr, arr.length);
		
		// 새로운 배열 만들어서 다른 주소값 가지게 만들기
		int[] r = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			r[i] = arr[i];
		}
		
		arr[0]=100;
		
		r[0]=5;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(c));
	}
}
