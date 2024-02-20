package ex05;

public class Ex04 {
	 public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		
		System.out.println(a==b);
		
		String c = "abc";
		
		// String 만 new String 으로 선언할 수 있다.
		// JVM(java 컴파일러) a 선언되고 b 선언하면 같은 내용이라면 있다고 판단하여 이미 선언된 a의 주소를 가지게 됨.
		// new String 하면 새로 메모리를 쓰는 거기 때문에 안에 같은 내용이라도 주소가 다르게 됨.
		String d = new String("abc");
		System.out.println(c==d);

		//문자열 비교연산자
		System.out.println(c.equals(d));
	}
}
