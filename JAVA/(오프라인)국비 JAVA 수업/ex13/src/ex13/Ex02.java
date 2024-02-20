package ex13;

public class Ex02 {
	public static void main(String[] args) {
		// 기본생성자 출력
		InstClass ic = new InstClass();
		
		System.out.println(ic.num++);
		System.out.println(InstClass.num++);
		System.out.println(InstClass.num);
	}
}
