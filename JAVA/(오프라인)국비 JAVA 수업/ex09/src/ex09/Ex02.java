package ex09;

public class Ex02 {
	
	public static int solution(int[] num_list) {
		int answer = 0;
		
		int result = num_list[0];
		int zz = num_list[0];
		
		for (int i = 1; i < num_list.length; i++) {
			result = result * num_list[i];
			zz += num_list[i];
		}
		
		if(result < zz*zz) {
			answer = 1;
		} else
			answer= 0;
		
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
//		int[] num_list = {3,4,5,2,1};
		int[] num_list = {5,7,8,3};
		solution(num_list);
		
		System.out.println();
		
		
	}
}
