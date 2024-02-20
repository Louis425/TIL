package ex12;

class Point{
	int xPos, yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPorintInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}

class CirCle2{
	Point p;
	int rad;
	
	CirCle2(Point p, int rad){
		this.p = p;
		this.rad = rad;
	}
	public void showCircleInfo() {
		p.showPorintInfo();
		System.out.println("[rad = " + rad + " ] ");
	}
}

public class Circle1 {
	int circel;
	int x;
	int y;
	
	public Circle1(int a, int b, int c) {
		this.x = a;
		this.y = b;
		this.circel = c;
	}
	
	public void showCircleInfo() {
		Point p = new Point(x, y);
		p.showPorintInfo();
		
		System.out.println(circel);
	}
	
	public static void main(String[] args) {
		Circle1 c = new Circle1(2,2,4);
		c.showCircleInfo();
		
		Point p1 = new Point(5,10);
		CirCle2 cc = new CirCle2(p1, 5);
//		CirCle2 c2 = new CirCle2(new Point(5,10), 5);
		cc.showCircleInfo();
	}
}
