package ex07;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		
		String a = "abcdef";
		System.out.println("string 의 길이는 : " + a.length());
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		int sum = 0;
		for(int temp : arr) {
			System.out.println(temp);
			sum+=temp;
		}
		System.out.println(sum);
		
		System.out.println();
		
		String[] arr1 = {"aa", "bb", "cc", "dd"};
		
		String sums = "";
		
		for(String t : arr1) {
			System.out.println(t);
			sums += t;
		}
		System.out.println(sums);

	}
}
