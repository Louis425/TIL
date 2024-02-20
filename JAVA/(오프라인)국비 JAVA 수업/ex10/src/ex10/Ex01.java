package ex10;

/*
 *  5*5 배열에다가
 *  임의의 랜덤한 숫자 넣어 출력하기(1~100)
 * 
 * 
 * 
 */

public class Ex01 {
	
	public static void main(String[] args) {
		// 크기를 동적으로 넣을수도 있기 때문에 아래와 같이 한 배열만 크기 지정해줘도 된다.
		//int[][] arr = new int[5][];
		
		// 배열의 초기값을 0 으로 선언한다.
		int[][] arr = new int[5][5];
		int[][] brr = new int[5][5];
		
		doPrintArr(arr);
		doPrintArr(brr);
		
	}
	
	public static void doPrintArr(int[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*100)+1;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
