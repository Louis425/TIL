package ex09;

public class Ex07 {
	
	public static String solution(String code) {
		String answer = "";
		
		int mode = 0;
		
		char[] ch = code.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(mode == 0) {
				if(ch[i]!= '1')
					answer += ch[i];
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		solution("abc1abc1abc");
		
	}
}
