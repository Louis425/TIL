package ex12;

/*
 * 변수       메서드
 * 반지름으설정, 원 넓이를 계산
 */

public class Circle {
	// private → 다른 클래스에서는 이 변수 참조 불가능입니다.
	private int rad;
	// final -> 값 변경 불가
	final double PI = 3.14;

	public Circle() {
	}

	public Circle(int rad) {
		this.rad = rad;
	}

	public void setRad(int rad) {
		if (rad < 0) {
			this.rad = 0;
			return;
		}
		this.rad = rad;
	}

	public double getArea() {
		return rad * rad * PI;
	}
}
