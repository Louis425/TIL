package ex06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 성적을 입력받아 90점이상이면 A
 * 			  80점이상이면 B
 * 			  70점이상이면 C
 * 		 	  그외에... D
 */
public class Ex03 {
	
	public static void solution(int a) {
		if(a>=90 && a<=100) System.out.println("90점이상이라 A 입니다.");
		else if (a>=80 && a<89) System.out.println("80점이상이라 B 입니다.");
		else if (a>=70 && a<79) System.out.println("70점이상이라 C 입니다.");
		else System.out.println("그 외라서 D 입니다.");
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("src/abc.txt"));
		
		int a = scan.nextInt();
		System.out.println("a = " + a);
		int b = scan.nextInt();
		System.out.println("b = " + b);
		
		solution(a);
		solution(b);
//		if(a>=90 && a<=100) System.out.println("90점이상이라 A 입니다.");
//		if(a>=80 && a<89) System.out.println("80점이상이라 B 입니다.");
//		if(a>=70 && a<79) System.out.println("70점이상이라 C 입니다.");
//		else System.out.println("그 외라서 D 입니다.");
		
		int z = 90;
		int c = z/10;
		switch(c) {
		case 90:
			if(z >=91 && z<=100)
			System.out.println("90점이상이라 A 입니다.");
			default:
		};
	}
}


/*
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
int z = scan.nextInt();
for(int i=0; i<z; i++){
int a = i[0];
int b = i[1
]sysOut
 */
