package ex10;

public class Tv {
	
	// Tv의 속성(멤버변수) - color, power, channel 
	String color;
	boolean power;
	int channel;
	Tv(){};  // 생성자 호출
	
	// 함수는 () 있어야 한다.
	// 변수는 () 없다.
	void power() {
		System.out.println("power 버튼 누름");
		// power 를 부정하겠다. power 가 true 면 power 에 false 넣고, power 가 false 면 power 는 true 다
		power = !power;
	}
	void channelUp() {
		System.out.println("< 채널 올리기 >");
		channel++;
	}
	void channelDown() {
		System.out.println("< 채널 내리기 >");
		channel--;
		if(channel < 0) {
			System.out.println("더 이상 내려갈 채널이 없습니다.");
			channel=0;
		}
	}
}