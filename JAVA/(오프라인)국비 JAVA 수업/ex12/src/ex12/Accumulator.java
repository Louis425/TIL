package ex12;

/*
 * main 메소드와 함께 동작하는 Acc 클래스를 정의하고 Acc 클래스에 main 메서드도 넣어서 컴파일 및 실행을 하자 
 * 
 */

class Acc{
	static int sum = 0;
	
	public static void add(int i) {
		sum = sum + i;
	}
	public static void showResult() {
		System.out.println("sum = " + sum);
	}
}


public class Accumulator {
	static int sum = 0;

	public static int showResult() {
		System.out.println(sum);
		return sum;
	}

	public static int add(int num) {
		sum += num;
		return sum;
	}	
	
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Accumulator.add(i);
		}
		
		Accumulator.showResult();
		
		for(int i=0; i<10; i++) {
			Acc.add(i);
		}
		
		Acc.showResult();
	}
}
