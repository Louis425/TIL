package aa;

public class Test1 {
	/*
	 * 최빈값 구하기
	 * 
	 * [1, 2, 3, 3, 3, 4] 3
	 * [1, 1, 2, 2] -1 (같은 수량의 최빈 값은 -1 출력하기)
	 * [1] 1
	 * 
	 */
	
	public static int solution(int[] array) {
		
		int[] realArr = new int[array.length];
		int[] cntArr = new int[array.length];
		
		// 시작하기전에 realArr 에 있는거는 비교조차 안해야 함
		int rcnt = 0;
		for(int i=0; i<realArr.length; i++) {
			int count = 0;
			for(int j=0; j<realArr.length; j++) {
				if(array[i] == realArr[i]) {
					System.out.println("넘어가야함. 비교조차 안해야 함.");
					count++;
				}
			}
			if(count==0) {
				realArr[rcnt++] = array[i];
			}
		}
		rcnt = 0;
		for(int i=0; i<realArr.length; i++) {
			int count = 0;
			for(int j=0; j<realArr.length; j++) {
				if(realArr[i]==array[j]) {
					count++;
				}
			}
			cntArr[rcnt++] = count-1;
		}
		int max = cntArr[0];
		for(int i=0; i<cntArr.length; i++) {
			if(max < cntArr[i])
				max = cntArr[i];
		}

		for(int i=0; i<cntArr.length; i++) {
			if(cntArr[i]==0 || cntArr[i]==-1)
				continue;

		}
		
		System.out.println("최빈값은 " + max + " 입니다.");
		return max;
	}
	
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 3, 3, 4};
		int arr2[] = {1, 1 ,2, 3};
		int arr3[] = {1};
		
		solution(arr1);
		solution(arr2);
		solution(arr3);
	}
}
