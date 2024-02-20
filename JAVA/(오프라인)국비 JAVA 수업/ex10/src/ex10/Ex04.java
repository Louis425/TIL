package ex10;

public class Ex04 {
	public static void main(String[] args) {
		
		Tv[] tv = new Tv[100];
		
		for(int i=0; i<tv.length; i++) {
			tv[i] = new Tv();
		}
		
		System.out.println(tv[0]);
		System.out.println(tv[1]);
		System.out.println(tv[2]);
		
		System.out.println(tv[0].channel);
		System.out.println(tv[1].color);
		System.out.println(tv[2].power);
		
		int[] a = new int[10];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		String[] c = new String[10];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
	}
}
