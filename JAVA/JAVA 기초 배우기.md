# JAVA 기초 배우기

<!-- TOC -->

- [1강 자바 및 이클립스 설치/ 첫 번째 프로그램 실행하기](#1강-자바-및-이클립스-설치-첫-번째-프로그램-실행하기)
- [2강 println/ print/ printf (출력)](#2강-println-print-printf-출력)
- [3강 Scanner](#3강-scanner)
- [4강 String(문자열)](#4강-string문자열)

<!-- /TOC -->

# 1강 자바 및 이클립스 설치/ 첫 번째 프로그램 실행하기

# JAVA란?

- 미국 Sun Microsystems사에서 개발한 객체 지향 프로그래밍 언어이다

- c, c++에 비해 쉬운 언어이다.

# JAVA특징

- 객체지향 언어이다.
- jvm(JAVA로 만들어진 프로그램을 실행해주는 프로그램) 만 있으면 어떤 플랫폼에서도 실행 가능한 독립적인 성향이 있다.

# JAVA설치

- 자바설치
  [오라클](https://www.oracle.com/kr/) 사이트에서 다운받을수 있다.

# 이클립스 설치

- [이클립스](https://www.eclipse.org/downloads/) 사이트를 눌러 들어가서 설치 하면된다.

# 첫 번째 프로그램 실행하기

- 이클리스 들어가서 매뉴바에
  > File
  >
  > > New
  > >
  > > > Java Project
- Java Project 로 들어온 다음
- 파일명을 01day 작성하고 Finish 클릭 그리고
  > 01dey
  >
  > > src
  > >
  > > > 우클릭 New -> Class누른다
- Name에 HelloJava 작성하고 Finish 클릭

* 첫번째 글자는 꼭 대문자로 적어야한다!(중요)

```java
public class HelloJava{

}
```

클레스 하고 클레스 이름이 뜬다!

# 2강 println/ print/ printf (출력)

```java
public class PrintTest {


	public static void main(String[] args) {

// 서식 없는 출력(print() :출력후 줄을 바꾸지 않는다.  , prirtln() :  출력후 줄을 바꾼다. )

		System.out.print("안녕 \n자바");
		System.out.println();   //아무것도 출력하지 않고 줄을 바꾼다. 한 줄 바꾸기
		System.out.println("안녕 자바");

// -------------------------------------------------------------------------

//		"+"    연산자는 "+" 연산자의 양쪽에 모두 숫자가 나올경우 하고 한 쪽이라도 문자열을 열결 하는 연결 연산자로 사용된다.

		System.out.println(" 5 + 3 = " + (5 + 3) );
		System.out.println(" 5 - 3 = " + (5 - 3) );
		System.out.println(" 5 / 3 = " + 5 / 3 );
		System.out.println(" 5 * 3 = " + 5 * 3);    //      정수와 정수의 연산은 결과도 정수다.   묵시작 형변환
		System.out.println(" 5 % 3 = " + 5 % 3 ); //     나머지

// -------------------------------------------------------------------------
//		묵시적 형변환 :  자료형의 크기가 서로 다른 자료의 연산 결과는 크기다 큰 자료형으로 자동 변환된다.
//		자바의 기본 자료형
//		정수 ↓
//		boolesn  :  1바이트(8비트), true  또는 false를 기역한다.
//		char  : 2바이트, 1문자를 기억한다.
//		short : 2바이트, -32768 ~ 32767 사이의 정수를 기억한다.
//		*int* : 4바이트,  -2147483648 ~ 2147483647 사이의 정수를 기억한다.
//		long : 8바이트, -2의 63승 ~ 2의 63승 - 1 사이이의 정수를 기억한다.
//		실수 ↓
//		float : 4바이트,  단정도 실수, 소수점 아래로 6자리 정도를 표현한다.
//		*double* : 8바이트, 배정도 실수, 소수점 아래로 18자리 정도를 표현한다. float 보다 더 정밀한 연산이 가능하다.
//		<   int    double  많이 사용한다>
// -------------------------------------------------------------------------

//		(예시)
		System.out.println(" 5. / 3 = " + 5./ 3);
		System.out.println(" 5 / 3. = " + 5 / 3. );
		System.out.println(" A  +  32  = " + ( 'A' + 32) );
		System.out.println(" a  -  32  = " + ( 'a' - 32) );
//		 (a,A 는 아스키 코드 사용)


//		명시적 형변환 : 프로그래머 그 순간의 자료형을 변경 할 수 있다. castig.  형변환
		System.out.println(" 5 /  (double) 3 = " + 5/ (double) 3);
		System.out.println(" A  +  32  = " + (char) ( 'A' + 32) );
		System.out.println(" a  -  32  = " + (char) ( 'a' - 32) );

// -------------------------------------------------------------------------

//		서식 있는 출력(priutf() ==> c언어의 printf 사용법과 같다.
//		printf( "출력서식",출력할 내용 ) ;
//	   출력  서식 출 서식 문자를 제외한 나머지 문자는 입력한 그대로 출력된다.
//		출력 서식 문자 : d(정수), f(실수),  c(문자) s(문자열)
//	출력 서식의 형식 : %[-] [0] [n] [.m] 서식문자
//		-  : 출력할 전체 자리수가 지정된 경우 왼쪽에 맞춰 출력한다.
//		- 0 : 출력할 전체 자리수가 지정된 경우 왼쪽의 남는 자리에 0을 채워 풀력한다.
//		-n : 출력할 전체 자리수
//		- .m : 소수점 아래 자리수, 잘리는 자리에서 반올림 시켜 출력한다. 윈래 데이터 값은 변경되지 않는다.
// -------------------------------------------------------------------------
//		(예시)
		System.out.printf(" 5 + 3 =%d\n " + 5 + 3 ) ;
		System.out.printf(" %d + %d =%d\n",  + 5 + 3 ) ;


	}

}
// -------------------------------------------------------------------------
```

# 3강 Scanner

```java
import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {

//		키보드를 통해서 데이터를  입력받는 스캐너
		Scanner sc = new Scanner (System.in);
// -------------------------------------------------------------------------
//		next() : 문자열을 입력받는다. 띄어쓰기 전까지 입력받는다.
//		nextLine() : 문자열을 입력받는다. 한 줄 전체를 입력받는다.
//		nextLine() 메소드는 키보드 버퍼가 비어있을 경우 입력을 요구하며 대기하고 키보드 버퍼가 비어있지 않으면 키보드 버퍼 전체의 내용을
//		읽어들인다.
// -------------------------------------------------------------------------

		String addr ="";
		System.out.print("주소를 입력하세 : ");
		addr = sc.nextLine();
		String name = "";
		System.out.println("이름을 입력하세요: ");
		name = sc.nextLine();

		System.out.println( name + " 님은 : " +  addr + "에 삽니다.  ");

		sc.close();


	}
}
// -------------------------------------------------------------------------
```

```java
import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age = 0;
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();

// -------------------------------------------------------------------------

//		문자열을 제외한 데이터를 입력받은 후 nextLine() 메소드가 실행 되야 한다면 키보드 버퍼의 엔터키를 읽어들이는 문제가 발생된다.
//		문자열을 제외한 데이터를 입력받은 후 키보드 버퍼를 입워주는 동작을 실행하고 nexrLine() 메소드를 실행한다.

// -------------------------------------------------------------------------

		sc .nextLine();        //키보드 버퍼를 비운다.


		String name = "";
		System.out.print("이름을 입력하세요 : ");
		name = sc .nextLine();

		System.out.println(name + "님은 " + age + "살 입니다. ");

		sc. close();

	}
}
// -------------------------------------------------------------------------
```

# 4강 String(문자열)

```java

public class StringTest1 {

	public static void main(String[] args) {

//		클래스로 만드는 모든 객체(변수)는 주소를 기역하는 참조형 변수이다.

//		문자열이 최초로 만들어지면 메모리 어딘가에 문자열이 생성되고 문자열이 생겅된 주소값이 변수에 저장된다.
//      (AAA)                                                                                                                             (str)

		String str1 = "AAA";    // str1에는 "AAA"가 생성된 메모리의 주소가 저장돤다.

//		메모리에 같은 내용의 문자열이 있으면 다시 만들지 않고 기존에 있는 문자열의 주소값이 변수에 저장된다.

		String str2 = "AAA";   // str2에서 str1에 저장된 "AAA"가 생성된 메모리의 주소가 저장된다.

//		관계 연산자 : 연산 결과는 true (참), false (거짓) 둘 중의 하나이다.
//		>(크다, 초과,) >=(크거나 같다, 이상), <(작다, 미만), <+(작거나 같다, 이하) ==(같다), !=(같지 않다)
//		"=="를 사용해서 같은가 비교할 수 있는 데이터는 기본자  자료형과 NULL (아무것도 없는 상태)만 가능하다.

// -------------------------------------------------------------------------
//		논리  연산자
//		&& :논리곱. AND, 두 조건이 모두 참일 경우에만 참, ~이고 ~이면서, ~중에서
//		|| : 논리합, OR, 두 조건 중에서 한 개  이상 참일 경우에 참, ~또는, ~이거
//		! : 논리부정, NOT
// -------------------------------------------------------------------------
//		if(조건식) {
//		 조건식이 참일 경우 실행할 문자;
//		   ...;
//		} else {
//		     조건식이 거짓일 경우 실행할 문장;
//		      ...;
//		}
// -------------------------------------------------------------------------
//		"=="을 사용해서 비교했으므로 변수에 저장된 문자열 자체를 비교한게 아니고 변수에 저장된 주소를 비교하게 된다.
// -------------------------------------------------------------------------
		if(str1 == str2) {
			System.out.println("같다 ");
		} else {
			System.out.println("다르다 ");
		}

//		new라는 예약어를 사용해서 객체를 생성하게되면 메모리에 같은 내용이 있나 상관하지 않고 무조건 다시 만든다.

		String str3 = new String ("AAA");

//		문자열을 비교하려 하는 경우 반드시 equals() 메소드를 사용해서 비교해야 한다.

		if(str1.equals(str3)) {
			System.out.println("같다 ");
		} else {
			System.out.println("다르다 ");
		}

	}

}
// -------------------------------------------------------------------------
```

```java
import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();

//		length() : 변수에 저장된 문자열을 구성하는 문자의 개수를 얻어온다.
		System.out.println("입력한 문자열의 크기 :" + str.length());
// -------------------------------------------------------------------------
//		trim() : 문자열 앞, 뒤의 불필요한 공백을 제거한다.
		System.out.println("입력한 문자열에서 불필요한 공백을 제거한 문자열의 크기 :" + str.trim().length());
// -------------------------------------------------------------------------
//		toUpperCase() : 영문자를 무조건 대문자로 변환한다.
		System.out.println("무조건 대문자로 출력 : "  + str.toUpperCase());
// -------------------------------------------------------------------------
//		toUpperCase() : 영문자를 무조건 소문자로 변환한다.
		System.out.println("무조건 대문자로 출력 : "  + str.toLowerCase());
// -------------------------------------------------------------------------
//		charAt(index) : 문자열에서 index 번째 문자 1문자를 얻어온다. 문자의 위치를 계산할 때 맨 앞의 문자 index가 0부터 시작된다.
		System.out.println("3번째 문자 : "+ str.charAt(2));

		sc.close();
	}

}
// -------------------------------------------------------------------------
```

# 5강 if문(성적 처리)

```java

import java.util.Scanner;

public class IfTest1 {


	public static void main(String[] args) {

// -------------------------------------------------------------------------

		Scanner sc = new Scanner(System.in);

		System.out.println("3과목 점수를 입력하세요 : " );
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();

		int total = java + jsp + spring ;

		double average = (double) total  / 3.;

// -------------------------------------------------------------------------

//		System.out.println( "평균 점수 : " + average );
		System.out.printf(" 펑균 점수  : %6.2f\n" , average);

		if(average >= 90) {
			  System.out.println("수");
		}else if( average >=80) {
			System.out.println("우");
		}else if(average >=70) {
			System.out.println("미");
		}else if(average >=60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}

		sc. close();

	}

}
// -------------------------------------------------------------------------
```

# 6강 if문(윤년 평년 계산하기)

```java
import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("윤년/평년을 판별할 년도를 입력하세요 : ");
	    int year = sc.nextInt();


// -------------------------------------------------------------------------

//	    프로그램에서 여러번 사용되는 값은 변수에 저장시켜 사용하면 편리하다.
//	   논리갓을 기억하는 변수나 논리값을 리턴하는 메소드의 이름은 "is"로 시작하게 하는 것이 관행이다.
	    boolean isLeapYear = year % 4 == 0 && year  % 100 != 0 || year % 400 == 0;

// -------------------------------------------------------------------------

//	   원리
//	    1:  2016(year) %(나누기) 4 = 0 == 0 (T)
//	    2: 2016(year) %(나누기) 100  = 16 != 0 (T)
//	    3: 2016(year) %(나누기) 400 +16 == 0 (F)
//	   T && T || F == T

// -------------------------------------------------------------------------

//	   연산자 우선순이 : 산술 연산자 > 관계 연산자 > 논리연산자 이다.
//	    년도가 4로 나눠 떨어지고(&&) 100으로 나눠 떨어지지 않고나(||) 400을 나눠 떨어지면 윤년, 그렇치 않으면 평년

// -------------------------------------------------------------------------

	    if(isLeapYear) {
	    	System.out.println(year + "년은 윤년입니다.");
	    } else {
	    	System.out.println(year + "년은 평년입니다.");
	    }

// -------------------------------------------------------------------------

//	   삼향 연산자(?:)
//	    if의 조선을 비교한 결과 조건이 참일때와 거짓일때 실항할 문장이 각각 1문장인 경우 사용하면 편리하다.
//	    조건식 ? 조건식이 참일 경우 실행할 내용 : 조건식 거짓일 경우  실행할 내용
	        System.out.println(year + "년은 " + (isLeapYear ? "윤" : "평" ) +"년입니다.");

		sc. close();

	}

}
// -------------------------------------------------------------------------
```

# 7강 switch문(성적 처리)

```java
import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		Scanner sc = new Scanner(System.in);

		System.out.println("3과목 점수를 입력하세요  : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();

		int total = java + jsp + spring;
		double average = (double) total / 3;

// -------------------------------------------------------------------------

//		key 값은 정수를 기억하는 변수 또는 연산 결과가 정수인 수식, 자바 1.7 부터는 문자열도 가능하다.
//		switch (key) {
//		       case value:           // ";"임을 주의한다.
//		            key와 value가 일치할 경우 실행할 문장;
//		             ...;
//		            [break;]      // if문을 제외한 나머지 제어문의 {} 블록을 탈출한다.
//		       ...;
//		       [default:
//		             key와 일치하는 value가 없을 경우 실행할 문장;
//	                 ...;
//		            break; ]
//		   }

// -------------------------------------------------------------------------

		switch ((int) average / 10) {
		case 10:
			System.out.println("참잘했어요");
//			System.out.println("수"); break;
		case 9:
			System.out.println("수"); break;
		case 8:
			System.out.println("우"); break;
		case 7:
			System.out.println("미"); break;
		case 6:
			System.out.println("양"); break;
//			같은 작업을 하는 case는 나열하 수 있다.
//		case 5: case 4: case 3: case 2: case 1: case 0:
			default:
			System.out.println("가"); break;

		}

		sc. close();

	}

}
// -------------------------------------------------------------------------
```

# 8강 for문

```java

public class ForTest {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

//		반복 횟수가 몇 번인지 알 경우 for를 사용한다.
//		for가 실행되는 원리
//		1.변수에 저장된 값으로 조건식을 실행해서 참이면  반복을 시작한다. 거짓이면 반복문을 실행하지 않는다.
//		2. {}  블록을 한 번 실행한 후 변수 값을 증감 만큼 변셩시키고 조건식을 실행해서 참이면 {} 블록을 탈출한다.

// -------------------------------------------------------------------------

//		fo(자료형 변수명=초기치 ; 증감){
//		    조건식이 참인 경우 실행할 문장;
//		    ...;
//		}

// -------------------------------------------------------------------------

//		변수를 선언만 하면 변수에 어떤 내용이 저장되어있는지 모르기 때문에 반드시 사용하기 전에 초기화를 시켜야 한다.
		int sum = 0;
//		for(int i=1 ; i>100 ; i++) {
		for(int i=1 ; i<=100 ; i++) {
//	          대입 연산자 : +=, -=, *=, /=, %=
//			  sum에 저장된 값에 i 저장된 값을 더해서 sum에 저장시켜라.
			  sum += i;          // sum = sum  + i;와 같은 기능이 실행된다.

// -------------------------------------------------------------------------

		}
		System.out.println("1~100의 함계 : " + sum );

// -------------------------------------------------------------------------

//		증감 연산자(++: 1증가, -- : 1감소)
//		++a : 변수 a에 저장된 값을 1증가 시키고 사용한다.
//	    a++ : 변수 a에 저장된 사용하고 1증가 시킨다.    현재 문장을 실행하고 ";" 만나서 문장이 종료되는 순간 실행된다.
//		--a : 변수 a에 저장된 값을 1감소 시키고 사용한다.
//	    a-- : 변수 a에 저장된 사용하고 1감소 시킨다.    현재 문장을 실행하고 ";" 만나서 문장이 종료되는 순간 실행된다.

// -------------------------------------------------------------------------

		int a = 1, b, c;
		b = a++;
		c = ++a;
		System.out.println("a =" + a + ", b =" + b + ", c = " + c );

// -------------------------------------------------------------------------

//		() 안의 수식 ==> 산술 연산자(*, /, %) ==> (+, -) 관계 연산자 ==> 논리 연산자 ==> 대입 연산
//	    단향 연산자 ==> 이헝 연산자 ==> 심향 연산자

// -------------------------------------------------------------------------
		int d = 1 , e;
		e = ++d + ++d + ++d + ++d;
		System.out.println("d = " + d + ", e = " + e );

	}

}
// -------------------------------------------------------------------------
```

# 9강 for문(주사위 눈의 개수)

```java
import java.util.Random;

public class Random {

public static void main(String[] args) {

// -------------------------------------------------------------------------

    for(int i=1 ; i<=10 ; i++ ) {
        System.out.println((int) (Math.random() * 6) + 1);

// -------------------------------------------------------------------------
    }
	  System.out.println("=================");
// -------------------------------------------------------------------------



   Random random = new Random();
   for(int i=1 ; i<=6 ; i++ ) {
      System.out.println(random.nextInt(6) + 1;
   }

    }
}
// -------------------------------------------------------------------------
```

```java
import java.util.Random;

// -------------------------------------------------------------------------
//  주사위를 10번 굴렸을 때 얻어지는 눈의 개수

public class ContTest {

	public static void main(String[] args) {


		Random random =new Random();

//		int a = 0, b =0, c = 0, d = 0, e = 0, f = 0;

// -------------------------------------------------------------------------

//		배열이란 같은 이름으로 여러개의 기억장소를 만들어 사용할겨우 쓴다.
//		배열을 선언하면 숫자는 0, 문자는 공백 boolean은 false, 클레스로 만든 베열은 null 로 자동으로 초기화 된다.
//		배열의 위치를 지정하는 첨가(index)는 0부터 시작하는 것이 주의하자
//		자료형[] 배열명 = new 자료형[배열의 크기];         // 1차원 배열

// -------------------------------------------------------------------------

		int[] count = new int[6];

		for(int i=1 ; i<=10 ; i++) {
			int r = random.nextInt(6) + 1;
			System.out.println(r);

			/*
			switch (r) {
			case 1:a++; break;
			case 2:b++; break;
			case 3:c++; break;
			case 4:d++; break;
			case 5:e++; break;
			case 6:f++; break;

// -------------------------------------------------------------------------

			case 1:count[0]++; break;
			case 2:count[1]++; break;
			case 3:count[2]++; break;
			case 4:count[3]++; break;
			case 5:count[4]++; break;
			case 6:count[5]++; break;

			}
			*/

// -------------------------------------------------------------------------

			count[r - 1]++;
		}

// -------------------------------------------------------------------------

		/*
		System.out.println("1의 개수 : " + a);
		System.out.println("2의 개수 : " + b);
		System.out.println("3의 개수 : " + c);
		System.out.println("4의 개수 : " + d);
		System.out.println("5의 개수 : " + e);
		System.out.println("6의 개수 : " + f);
		*/

// -------------------------------------------------------------------------

//		System.out.println("1의 개수 : " + count[0]);
//		System.out.println("2의 개수 : " + count[1]);
//		System.out.println("3의 개수 : " + count[2]);
//		System.out.println("4의 개수 : " + count[3]);
//		System.out.println("5의 개수 : " + count[4]);
//		System.out.println("6의 개수 : " + count[5]);

// -------------------------------------------------------------------------

//	    배열명.length : 배열의 크기를 얻어온다.

		for(int i=0 ; i<count.length ; i++) {
			System.out.println("1의 개수 : " + count[i]);


		}


	}


}
// -------------------------------------------------------------------------
```

# 10강 요일계산

```java
import java.util.Scanner;

public class WeekDayTest {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		Scanner sc = new Scanner  (System.in);

		System.out.println("요일을  께산할 년, 월 , 일 : ");

		int year = sc.nextInt();
		int  month = sc.nextInt();
		int day = sc.nextInt();

// -------------------------------------------------------------------------

//		1년 1월 1일 부터 입력한 년도의 전년도 12월  31일 까지 지난 날짜를 계산한다.

//		int sum = year * 365; X

		int sum = (year - 1) * 365 + (year - 1)  /  4 - (year - 1) / 100 + (year - 1) / 400;

//	    전년도 12월 31일 까지 지난 날짜수에 올해 전달 까지 지난 날짜를 더한다.

		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,} ;
		m[1] = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
	     for(int i=1 ; i<month ; i++) {

// -------------------------------------------------------------------------
	    	 /*
	    	 switch (i) {
			     case 2:
			    	       sum += year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
				        break;
			     case 4: case 6: case 9: case 11:       //  짧은달
			    	        sum += 30;
			    	        break;
			    	        default:                                     // 긴달
			    	        	sum += 31;
			    	        	 break;
	    }
	    */
// -------------------------------------------------------------------------

	    	 sum += m[i - 1];
	  }

// -------------------------------------------------------------------------

//	     전달 까지 지난날수에 일을 더한다.

	     sum += day;
//	     System.out.println(sum % 7);

//	     1년 1월 1일 부터 입력한 날짜까지 지난 날짜늬 합계를 7로 나눈 나머지에 따라 요일이 결정된다.  (0-일, 1-월 , 2-화, 3-수, 4-목, 5-금, 6-토 )

	     /*
	     switch (sum % 7) {
	 	     case 0;
	 	          System.out.println("일요일 "); break;
	 	          System.out.println("월요일 "); break;
	 	          System.out.println("화요일 "); break;
	 	          System.out.println("수요일 "); break;
	 	          System.out.println("목요일 "); break;
	 	          System.out.println("토요일 "); break;
		}
	     */

//	     배열을 선언할 떄 new를 사용하지 않고 {} 안에 초기치를 지정하면 초기치의 개수만큼 자동으로 배열을 만들고 초기치로 초기화 시켜준다.

// -------------------------------------------------------------------------

	     String[] week = {"일요일 ","월요일 ","화요일 ","수요일 ","목요일 ","금요일 ","토요일 "};
	     System.out.println(week [sum % 7]);

	     sc. close();

	   }

  }
// -------------------------------------------------------------------------
```

# 11강 while

```java
import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		Scanner sc = new Scanner(System.in);

		int meun = 0;

		while(meun != 5){
//	    while(true) {

//		int meun ;
		do {
		    System.out.println("=============================");
		    System.out.println(" 1.저장 2.보기 . 3.수정 4.삭제 5.종료  ");
		    System.out.println("=============================");
		    System.out.print("원하는 메뉴를 선택하세요 : ");

		    meun = sc.nextInt();
		} while (meun < 1 || meun > 5 );

// -------------------------------------------------------------------------
//		여기에 왔는다는 것은 메뉴가  1~5 사이의 숫자가 입력되었다는 것이다.
// -------------------------------------------------------------------------

	     switch ( meun ) {
		      case 1 : System.out.println("입력 "); break;
		      case 2 : System.out.println("보기 "); break;
		      case 3 : System.out.println("수정 "); break;
		      case 4 : System.out.println("삭제 "); break;

// -------------------------------------------------------------------------

		      /*
		      case 5 :
		    	  System.out.println("바이바이 ");
		    	  System.exit(0);      //프로그램을 강제로 종료한다.
		    	  break;
		     */

// -------------------------------------------------------------------------

		     }

		}
		   System.out.println("바이바이 ");
         	sc.close();

	}
}
// -------------------------------------------------------------------------
```

```java

public class WhileTest {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

//	   while의 최초 진입 조건이 거짓이면 {} 블록을 한 번도 실행하지 않는다.

//		while (조건식 ){
//		   조건이 참인 동란 실행할 문장;
//		...;
//		}

// -------------------------------------------------------------------------

		int sum = 0,  i = 0 ;
		while(i > 100) {
			sum  += ++i;

		}

		System.out.println("1~100의 합계 : " + sum);

// -------------------------------------------------------------------------



//	  while의 최초 진입 조건이 거직이더라도 {} 블록을 한 번 실행한다.

//		do {
//		        조건이 참인 실행할 문자;
//		        ...;
//		} while(조건식);       //  ";"을 빼멱으면 안된다.

// -------------------------------------------------------------------------

		sum = i = 0;             //  변수를 선언할 때는 사용할 수 없다.
		do {
			sum += ++i;
		} while( i > 100);
		System.out.println("1~100의 합계 : " + sum);

	}

}
// -------------------------------------------------------------------------
```

# 카드섞기

```java
import java.util.Random;

public class CardTest {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		String number[] = {  "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

//		char symbol[] = {'♦', '♠', '♣', '♥' };
		String symbol[] = {"♦", "♠", "♣", "♥" };

// -------------------------------------------------------------------------

		int card[]  = new int [52];
		for(int i=0 ; i<card.length  ; i++) {
			card[i] = i;
		}
		for(int i=0 ; i<card.length  ; i++) {

//			System.out.printf("%2s", number [card[i] % 13]);      // 숫자만
//			System.out.printf("%s", symbol[card[i] / 13] );           // 무늬만

			System.out.printf("%s%2s ", symbol[card[i] / 13] ,  number[card[i] % 13] );
			if (( i + 1) % 13 ==0 ) {
				System.out.println();
			}
		}

		System.out.println("=================섞기전================");

// -------------------------------------------------------------------------

		Random random = new Random();
		for(int i=0 ; i<1000000 ; i++) {
			int r = random.nextInt(51) + 1;
			int temp = card[0];
			card[0] = card[r];
			card[r] = temp ;
		}

// -------------------------------------------------------------------------

		for(int i=0 ; i<card.length  ; i++) {
			System.out.printf("%s%2s ", symbol[card[i] / 13] ,  number[card[i] % 13] );
			if (( i + 1) % 13 ==0 ) {
				System.out.println();
			}
		}

		System.out.println("=================섞은후=================");
	}

}
// -------------------------------------------------------------------------
```

# 14강 야구(숫자맞추기)게임

```java
import java.util.Random;
import java.util.Scanner;

public class Baseballgame {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		int[] ball = {0, 1, 2, 3, 4,  5, 6, 7, 8, 9, };
		Random random =  new Random();
		for(int i=0 ; i<100000 ; i++) {
			int r = random.nextInt(9) + 1;
			int temp =ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
		}

// -------------------------------------------------------------------------v

		System.out.println("레벨을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();

		System.out.println("CPU : ");
		for(int i=0 ; i<level ; i++) {
			System.out.println(ball[i]);
		}
		System.out.println();

		sc.nextLine();          // 키보드 버퍼를 비운다.

// -------------------------------------------------------------------------

//		맞출때까지 반복한다.

//		int s = 0, b = 0;
		int count = 0;

//		System.currentTimeMillis() : 1900년 1월 1일 부터 이 메소드가 실행되는 순간까지 지난 시간을 1/1000초  단위로 얻어온다.

// -------------------------------------------------------------------------

		long start = System.currentTimeMillis();      //  게임 시작 시간
		while(true) {
			System.out.println("USER : ");
			String  user = sc.nextLine();
			count++;

//			스트라이크와 볼의 개수를 센다.
//			스트라이크와 볼의 개수는 반복마다 다시 계산해야 하므로 반복안에서 초기화 시켜야 한다.
			int s = 0, b = 0;
			for(int i=0 ; i<level ; i++) {

//				스트라이크의 개수
				if(ball[i] == user.charAt(i) - 48) {
					s++;
				}

// -------------------------------------------------------------------------

//				indecOf() : 문자열에서 괄호 안의 문자나 문자열이 최초로 나타나는 위치를 얻어온다.  없으면 -1을 리턴한다.
//				문자열에 특정한 문자 또는 문자열이 포함되는 문자열이 포함되어 있는가를 알  수 있다.
//				System.out.println( user.indexOf(ball[i] + ""));
//				볼의 개수
				if( user.indexOf(ball[i] + "") >= 0 ) {
					b++;
			}

			}

//			맞췄으면 반복을 탈출한다.

			if (s == level) {
				break;
			}

			System.out.println(s + "  스트라이크 " + (b - s) + " 볼 ");

		}
		long end = System.currentTimeMillis();      //  게임 종료 시간
		System.out.println((end - start) / 1000 + "초 걸려서 " + count + "번 만에 맞췄다.");



		sc.close();

	}

}

```
