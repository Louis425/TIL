package ex12;

public class Tri {
	int width;
	int height;

	public Tri() {}
	
	public Tri(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Tri [width=" + width + ", height=" + height + "]";
	}
	
	public double area() {
		return width * height * 0.5;
	}
}
