package ex07;

public class Ex01 {
	
	// String 함수
	
	// charAt()  -> 몇 번째 캐릭터 타입 가져올거니
	// toCharArray()  -> 문자로 배열만들어라
	// replace  -> 대체해라
	// split    -> 분할해라
	// subString  -> 몇번째부터 자르기
	
	
	public static String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		String temp = my_string.substring(0, s) + overwrite_string;
		answer = my_string.substring(0, s) + overwrite_string + my_string.substring(temp.length());
		
		return answer;
	}
	public static void main(String[] args) {
		String answer = solution("He11oWorld", "lloWorl", 2);
		System.out.println(answer);
		
		answer = solution("Program21b8UYP", "merS123", 7);
		System.out.println(answer);
	}
}
