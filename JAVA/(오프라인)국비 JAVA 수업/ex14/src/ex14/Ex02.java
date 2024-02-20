package ex14;

public class Ex02 {
	public static void main(String[] args) {
		
		AA a1 = new AA();
		a1.doAA();
		a1.doAA(10,20);
		a1.doAA("문자열");
		
		AA.doB();
		AA.doB(30,40);
		AA.doB("static 은 바로 호출 가능하다.");
		
		a1.doC();
	}
}
