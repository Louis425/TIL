package ex10;

/*
 * Tv라는 객체를 클래스로 만들도록 한다.
 */

public class Ex02 {
	public static void main(String[] args) {
		// class 를 main 에서 사용하려고 하면 선언해줘야 한다.
		Tv tv1 = new Tv();
		
		System.out.println(tv1.color);
		System.out.println(tv1.power);
		System.out.println(tv1.channel);
		
		tv1.power();
		System.out.println(tv1.power);
		
		tv1.channelUp();
		System.out.println("현재 채널 : " + tv1.channel);
		
		tv1.channelDown();
		System.out.println("현재 채널 : " + tv1.channel);
		
		tv1.channelDown();
		System.out.println("현재 채널 : " + tv1.channel);
		
		
	}
}
