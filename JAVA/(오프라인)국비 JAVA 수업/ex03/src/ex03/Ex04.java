package ex03;


class AA{
	public void doA() {
		System.out.println("doA");
	}
}
public class Ex04 {
	public static void main(String[] args) {
		String a = "abcd";
		String b = "ABCD";
		System.out.println(a.toUpperCase());	//대문자로 만들기
		System.out.println(b.toLowerCase());	//소문자로 만들기
		
		// 참조변수 형식
		String c = new String("abc");
		System.out.println(c);
		
		AA a2 = new AA();
		a2.doA();
		
		System.out.println(Integer.toBinaryString(10)); // 10을 2진수로 바꿔줘.
	}
}
