package ex10;

public class Ex03 {
	// 같은 패키지 내에서는 같은 클래스명이 존재하면 안된다.
	public static void main(String[] args) {
		
		// tv1 과 tv2는 따로 존재하기 때문에 tv1의 변수를 바꿨다고 해서 tv2의 변수가 바뀌지 않는다.
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		tv1.channel = 10;
		System.out.println(tv1.channel);
		System.out.println(tv2.channel);
		
		tv1.channelUp();
		System.out.println(tv1.channel);
		System.out.println(tv2.channel);
	}
}
