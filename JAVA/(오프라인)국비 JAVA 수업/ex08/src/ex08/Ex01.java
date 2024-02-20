package ex08;

/*
 * 길이가 같은 두 문자열 str1과 str2가 주어진다.
 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서
 * 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성하라
 */

/*
 legnth()
 charAt()
 substring(int , int)
 indexOf()
 toUpperCase
 tp
 statsWith()
 trim() 공백 제거
 replace()
 split 
 */
public class Ex01 {
	public static void main(String[] args) {
		String a = "aaaaaa";
		String b = "bbbbbb";
		char [] ac = a.toCharArray();
		int [] ints = {1, 2, 3, 4, 5, 6};
		
		String answer = "";
		
		for(int i=0; i<ac.length; i++) {
			System.out.println(ac[i]);
			System.out.println(ac[i]);
		}
		
		for(int aa : ints) {
			System.out.println(aa);
		}
		
		for(char temp : a.toCharArray()) {
			System.out.println(temp);
		}
		
		System.out.println();
		for(int i=0; i<ac.length; i++) {
			System.out.println(ac[i]);
		}

	}
}
