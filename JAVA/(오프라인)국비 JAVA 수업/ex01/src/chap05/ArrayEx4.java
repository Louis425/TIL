package chap05;

import java.util.Arrays;

class ArrayEx4 {
	public static void main(String[] args) {
		
		char[] abc = { 'A', 'B', 'C', 'D'};
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		int[] a = {1,2,3,4};
		System.out.println(a);

		char[] result = new char[abc.length+num.length];
		
		int resultIndex = 2;
		for(int i=0; i<abc.length; i++) {
			result[resultIndex++] = abc[i];
		} 
		System.out.println(Arrays.toString(result));
		System.out.println(result);
		
		//    abc 0번째부터 result 0번째에 abc 길이만큼
		//    == result 배열에 abc 배열 전체를 다 넣어라
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.out.println(result);
		
		//    num 0번째부터 result abc 길이에(result[4]에) num 길이만큼
		// result 에 result의 abc.length 의 배열번호에 num의 0번째 배열을 num.length 만큼 result에 넣겠다
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);

		System.arraycopy(abc, 0, num, 0, abc.length);	
		System.out.println(num);

		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}
}
