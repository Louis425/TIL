<!-- TOC -->

- [1강 자바 및 이클립스 설치/ 첫 번째 프로그램 실행하기](#1강-자바-및-이클립스-설치-첫-번째-프로그램-실행하기)
- [2강 println/ print/ printf (출력)](#2강-println-print-printf-출력)
- [3강 Scanner](#3강-scanner)
- [4강 String(문자열)](#4강-string문자열)
- [5강 if문(성적 처리)](#5강-if문성적-처리)
- [6강 if문(윤년 평년 계산하기)](#6강-if문윤년-평년-계산하기)
- [7강 switch문(성적 처리)](#7강-switch문성적-처리)
- [8강 for문](#8강-for문)
- [9강 for문(주사위 눈의 개수)](#9강-for문주사위-눈의-개수)
- [10강 요일계산](#11강-while)
- [11강 while](#12강-lotto추천기)
- [12강 Lotto추천기](#12강-lotto추천기)
- [13강 카드섞기](#13강-카드섞기)
- [14강 야구(숫자맞추기)게임](#14강-야구숫자맞추기게임)
- [15강 주민등록번호유효성검사](#15강-주민등록번호유효성검사)
- [16강 메소드](#16강-메소드)
- [17강 만년달력만들기1](#17강-만년달력만들기1)
- [18강 만년달력만들기2](#18강-만년달력만들기2)
- [19강 지그재그채우기2023](#19강-지그재그채우기)
- [20강 달팽이채우기](#20강-달팽이채우기)
- [21강 2차원 배열(마방진)](#21강-2차원-배열마방진)
- [22강 클래스만들기(접근권한지정자)](#22강-클래스만들기접근권한지정자)
- [23강 클래스 만들기(생성자)](#23강-클래스-만들기생성자)
- [24강 클래스만들기(getter/setter)](#24강-클래스만들기gettersetter)
- [25강 arrayList](#25강-arraylist)
- [26강 도서관리예제1](#26강-도서관리예제1)
- [27강 도서관리예제2](#27강-도서관리예제2)
- [28강 도서관리예제3](#28강-도서관리예제3)
- [29강 상속](#29강-상속)
- [30강 추상클래스\_다형성](#30강-추상클래스_다형성)
- [31강 인터페이스 (종강)](#31강-인터페이스-종강)

#

<!-- /TOC -->

# 1강 자바 및 이클립스 설치/ 첫 번째 프로그램 실행하기

# JAVA란?

- 미국 Sun Microsystems사에서 개발한 객체 지향 프로그래밍 언어이다

- c, c++에 비해 간편한 언어이다.

- 웹 게발 안드로이드 또는 소프트웨어 게발 애 많이 사용된다

# JAVA특징

- 객체지향 언어이다.
- jvm(JAVA로 만들어진 프로그램을 실행해주는 프로그램) 만 있으면 어떤 플랫폼에서도 실행 가능한 독립적인 성향이 있다.
- 스프링, 스피링 부트 배울때 도움이 된다

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

# 12강 Lotto추천기

```java
import java.util.Random;

public class LoottoTest {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

//		추천기를 준비한다.
		int[] lotto = new int[45];

//		추첨기에 공을 넣는다.
		for(int i=0 ; i<lotto.length ; i++) {
			lotto[i] = i +1;
		}

		for(int i=0 ; i<lotto.length ; i++) {
			System.out.printf("%2d",lotto[i]);
			if((i + 1) % 10 == 0) {
			 System.out.println();
			}
		}

		System.out.println("\n===================섞기전=================");

// -------------------------------------------------------------------------

//		추첨기의 공을 썪는다.
//		lotto[0]에 저장된 값과 lotto[1]~[44] 사이의 핸덤한 위치의 값을 교환한다.
		Random random = new Random();
		for(int i=0 ; i<1000000 ; i++) {
			int r = random.nextInt(44) + 1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}

		for(int i=0 ; i<lotto.length ; i++) {
			System.out.printf("%2d",lotto[i]);
			if((i + 1) % 10 == 0) {
			 System.out.println();
			}
		}

		System.out.println("\n===================섞기후==================");

// -------------------------------------------------------------------------

		System.out.println("1등 번호 : ");
		for(int i=0 ; i<6 ; i++) {
			System.out.println(lotto[i] + " ");

//			sieep() : 괄호 안에ㅔ 지정된 시간(1/1000초) 만큼 프로크햄을 잠깐 멈춘다.
			try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("보너스 : " + lotto[6]);

	}

}
// -------------------------------------------------------------------------
```

# 13강 카드섞기

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
// -------------------------------------------------------------------------
```

# 15강 주민등록번호유효성검사

```java
import java.util.Scanner;

public class JuminCheck {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 13자리를 '-'없이 입력하세요 : ");
		String juminNo =  sc.nextLine();

// -------------------------------------------------------------------------

//	    i :          0   1   2   3   4   5   6   7   8   9   10  11  12
//		i % 8 :      0   1   2   3   4   5   6   7   0   1    2   3
//		주민등록번호 :   8   3   0   4   2   2   1   1   8   5   6   0   0
//		              *   *   *   *   *   *   *   *   *   *   *   *
//		가중치:         2   3   4   5   6   7   8   9   2   3   4   5
//		               =   =   =   =   =   =   =   =   =   =   =   =
//		              16 + 9 + 0 + 20 +12 +14 +8 + 9 + 16 +15 +24 +0=  143

//		143 % 11 = 0    11 - 0 = 11   11에서 나머지 를 뺀 결과가 2자리 숫자면 10자리는 버리고 1자리만 취한다.
//		           1         1 = 10
//		           2         2 =  9
//		          10        10 =  1

// -------------------------------------------------------------------------

//		String check = "234567892345";         // 가중치

		int sum = 0;
		for(int i=0 ; i<12 ; i++) {
//			문자를 곱셈 연산하면  문자의 유니 코드 값으로 곱한다.
//			sum +=(juminNo.charAt(i) - 48) * (check.charAt(i) - '0');
//			sum +=(juminNo.charAt(i) - 48) * (i < 8 ? i + 2 : i -6);
			sum +=(juminNo.charAt(i) - 48) * (i % 8 + 2);

		}

// -------------------------------------------------------------------------

//		System.out.println(sum);

		int result = (11 - sum % 11) % 10;

		if(result == juminNo.charAt(12) - 48) {
			System.out.println("정상 ");
		} else {
			System.out.println("오류 ");
		}

		sc.close();

	}

}
// -------------------------------------------------------------------------
```

# 16강 메소드

```java

public class MethodClass {

//	메소드의 형식
//	[접근권한지정자] [static] 메소드의리턴타입 메소드이름([인수, ...]) {      //메소드의 머리
//	    메소드가 실행알 문장;
//	    ...;
//	    [retutn 값;]     //   리턴 값이 없는 메소드는 리턴 타입에 "void"라고 적는다.
//	}

//	메소드를 호출할 때는 메소드의 이름으로 호출 하고 return 또는 "}"를 만나면 메소드가 호출된 문장으로 되돌아간다.

// -------------------------------------------------------------------------

//	접근 권한 지정자
//	private : 현재 클래스 외부에서 접근할 수 없다. 상속 불가능
//	protected : 현재 클래스와 현재 클래스를 상속받은 자식 클래스만 접근가능, 상속 가능
//	package : 현재 패키지 에서는 public 처럼 사용되되 다른 패키지에서는 private 처럼 사용된다.  상속 가능, 접근 권한을 생략하면 package가 된다.
//	public : 아무곳에서나 자유롭게 사용할 수 있다. 상속 가능

//	정적(static) 메소드 : 클래스의 객체를 생성하지 않고 클래스 이름에 "."을 찍어서 실행할 수 있다. 자주 사용하는 메소드에 쓴다.

	public static int total() {
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			sum += i;
		}
		return sum;
	}

}
// -------------------------------------------------------------------------
```

```java

public class MainClass {

	public static void main(String[] args) {

		System.out.println(Math.sqrt(2));

		MethodClass methodClass = new MethodClass();

		System.out.println("1~100의 합계 : " +  methodClass.total());

		System.out.println("1~100의 합계 : " + MethodClass.total());

	}

}
// -------------------------------------------------------------------------
```

# 17강 만년달력만들기1

```java

// -------------------------------------------------------------------------

//  달력 작업에 사용할 메소드가 저장된 클래스
public class MyCalen {

// -------------------------------------------------------------------------

//	인수로 년도를 넘겨잗아 윤년, 평년을 판단해  윤년이면 true, 평년이면 false를 리턴하는 메소드

	public static  boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

// -------------------------------------------------------------------------

//	인수로 년, 월을 넘겨받아 그 달의 마지막 날짜를 리턴하는 메소드
	public static int lastDay(int year, int month) {
		int[] m  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		m[1] = isLeapYear(year) ? 29 : 28;
		return m[month - 1];
	}

// -------------------------------------------------------------------------

//	인수로 년, 월, 일를 넘겨박아 1년 1월 1일 부터 지나온 날짜의 함계를 계산해 리턴하는 메소드
	public static int tota1Day(int year, int month, int day) {
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1 ) / 400;
		for(int i=1 ; i<month ; i++) {
			sum += lastDay(year, i);
		}
		return sum + day;
	}

// -------------------------------------------------------------------------

//	인수로 년, 월, 일을 넘겨받아 요일을 숫자로 리턴하는 메소
//  일요일(0), 월요일(1), 화요일(2), 수요일(3), 목요일(4), 금요일(5), 토요일(6)
    public static int weekDay(int year, int month, int day) {
		return tota1Day(year, month, day) % 7;
	 }

	}
// -------------------------------------------------------------------------
```

# 18강 만년달력만들기2

```java
import java.util.Scanner;

//  달력을 출력하는 클래스
public class MyCalendar {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		Scanner sc = new Scanner(System.in);
		System.out.println("달력을 출력할 년, 월 : ");
		int year = sc.nextInt();
		int month = sc.nextInt();

// -------------------------------------------------------------------------

		System.out.println("==================");
		System.out.printf("    %4d년 %2d월\n ", year, month);
		System.out.println("==================");
		System.out.println(" 일 월 화 수 목 금 토 ");
		System.out.println("==================");

// -------------------------------------------------------------------------

//		1일의 요일만큼 반복하며 빈칸을 출력한다.
		for(int  i=1 ; i<=MyCalen.weekDay(year, month, 1) ; i++)
			System.out.println("   ");

//		1일 부터 달력을 출력할 달의 마지막 날짜 만큼 반복하면 날짜를 출력한다.
		for(int i=1 ; i<=MyCalen.lastDay(year, month) ; i++) {
			System.out.printf(" %2d ", i);

//			출력한 날짜가 토요일이고 그 달의 마지막 날까가 아니면 줄을 바꾼다.
			if(MyCalen.weekDay(year, month, i) == 6 && MyCalen.lastDay(year, month) != i) {
				System.out.println();
			}
		}

		System.out.println("\n==================");

	}

}
// -------------------------------------------------------------------------
```

# 19강 지그재그채우기

```java

public class ZigzagTest1 {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		int[][] a =  new int[4][5];
		int count = 0;

// -------------------------------------------------------------------------

		for(int i=0 ; i<4 ; i++) {          // 행

//			짝수행은 숫자가 왼쪽에서 오른쪽으로 채워지고 홀수행은 숫자가 오른쪽에서 왼쪽으로 채워진다.
			if(i % 2 == 0) {

				for(int j=0 ; j<5 ; j++) {  // 열(왼쪽 ==> 오른쪽)
					a[i][j] = ++count;
				}

			}else {

				for(int j=4 ; j>=0 ; j--) {   // 열(오른쪽 ==> 왼쪽)
					a[i][j] = ++count;
				}

			}

		}

// -------------------------------------------------------------------------

		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				System.out.printf("%2d ",a[i][j]);
			}
		System.out.println();

		}

	}

}
// -------------------------------------------------------------------------
```

```java

public class ZigzagTest2 {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		int[][] a =  new int[4][5];
		int count = 0, start = 0, end = 4, sw = 1;

		for(int i=0 ; i<4 ; i++) {

			for(int j=start ; j != end + sw ; j +=sw) {
				a[i][j] = ++count;
			}

			int  temp = start;
			start = end;
			end = temp;
			sw *= -1;

		}

// -------------------------------------------------------------------------

		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				System.out.printf("%2d ",a[i][j]);
			}

		System.out.println();

// -------------------------------------------------------------------------

		}

	}

}
// -------------------------------------------------------------------------

```

# 20강 달팽이채우기

```java
import java.util.Scanner;

public class SnailTest {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 치수를 홀수로 입력하세요 : ");
		int n = sc.nextInt();

// -------------------------------------------------------------------------

		int[][] a = new int[n][n];
//		count : 1에서 25까지 증가하는 변수, i : 행 j : 열, sw : 부호 변경,k : 반복횟수
		int count = 0, i = 0, j = -1, sw = 1,  k = n;

// -------------------------------------------------------------------------

		while(true) {

//			행 방향 채우기

			for(int p=0 ; p<k ; p++) {
				j += sw;
				a[i][j] = ++count;
			}

			if(--k == 0) {
				break;
			}

// -------------------------------------------------------------------------

//			열 방행 채우기

			for(int p=0 ; p<k ; p++) {
				i += sw;
				a[i][j] = ++count;
			}

			sw *= -1;

		}

// -------------------------------------------------------------------------

		for(i=0 ; i<n ; i++) {
			for(j=0 ; j<n ; j++) {
				System.out.printf("%2d ",a[i][j]);

			}
			System.out.println();

		}

	}

}
// -------------------------------------------------------------------------
```

# 21강 2차원 배열(마방진)

```java

public class MagicSquareTest {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		int[][] data =  new int [5][5];
//		마반진의 첫 번쪠 숫자(1)가 채워지는 자리는 첫 줄 가운데 열 이다.
		int i =0, j = 2;

// -------------------------------------------------------------------------

//		Math.pow(x, y) : x의 y승을 계산한다.
		for(int k=1 ; k<=Math.pow(5, 2) ; k++) {

			data[i][j] = k;
//			방금 배열에 채운 숫자(k)가 5으 배수면 다음 숫자가 채워질 위치는 행만 1 증가 시킨다.
//			5의 배수가 아니면 다음 숫다가 채워질 위치는 오른쪽, 위 방향(행은 -1, 열은 +1)으로 변셩한다.
			if(k % 5 == 0) {
				i++;
			} else {
				if(--i < 0) {
//					행이 배열의 범위를 벗어나면 마지막 행으로 변경한다.
					i = 4;
				}

				if(++j == 5) {
//					열이 배열의 범으를 벗어나면 첮 번째(0) 열로 변경한다.
				  j = 0;
				}

			}

		}

// -------------------------------------------------------------------------

		for(i=0 ; i<5 ; i++) {
			for(j=0  ; j<5 ; j++) {
				System.out.printf("%2d ", data[i][j]);
			}
			System.out.println();
		}

	}

}
// -------------------------------------------------------------------------
```

```java

import java.util.Scanner;

public class MagicSquareTest2 {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		Scanner sc = new Scanner(System.in);

		int n;
		while(true) {
		 System.out.println("배열의 차수를 홀수로 집역하세요 : ");
		 n = sc.nextInt();
		 if(n % 2 == 1) {
			break;
		}

		System.out.println("홀수를 입력하라니까는~~~~~~꽉~~~~~");
	}

//		입력받은 배열의 차수만큼 배열을 선언한다.
		int[][] data =  new int [n][n];

//		숫자가 채워질 첫 번째 위치(첫 줄 가운데)를 계산한다.
		int i =0, j = (n - 1)/ 2;

		for(int k=1 ; k<=Math.pow(n, 2) ; k++) {

			data[i][j] = k;
			if(k % n == 0) {
				i++;

			} else {
				if(--i < 0) {
					i = n - 1;
				}

				if(++j == n) {
				  j = 0;

				}

			}

		}
// -------------------------------------------------------------------------

		for(i=0 ; i<n ; i++) {
			for(j=0  ; j<n ; j++) {
				System.out.printf("%3d ", data[i][j]);
			}
			System.out.println();
		}

	}


}
// -------------------------------------------------------------------------
```

# 22강 클래스만들기(접근권한지정자)

```java

//  VO(velue object) 클레스 : 처리한 테이터 한 건을 기억하는 클래스,DTO(Data Transfer Object)
//  Bean : 테이터를 저장할 맴버 변수(필드)와 멤버 변수에 데이터를 입출력할 수 있는 gettet  & setter 메소드로만 구성된 클래스를 말한다.
public class MemberVO {

// -------------------------------------------------------------------------

//	멤버 변수 (필드)를 선언한다.
//	멤버 변수를 선언하고 포기화 시키지 않으면 숫다는 0, 문자 공백,boolean은 false, 클래스로 만든 모든 벰버는 null로 자동 초기화 된다.
//	멤버 변수에  저장된 데이터를 클래스 외부에서 함부로 수정할 수 없도록 일반적으로 멤버 변수의 접근 권한은 private으로 지정한다.
//	데이터만 정확하다면 언제 어디서 메소드를 실행하더라도 같은 결과를 얻을 수 있으므로 일반적으로 메소드의 접근 권한은 public으로 지정한다.

// -------------------------------------------------------------------------

//  [접근 권한 지정자][static] 자료형 변수명 [= 초기치] ;

	public int no;
	public String name;
	public boolean gender;
	public double height;

//	접근 권한 지정자
//	*private* : 현재 클래스 외부에서 접근할 수 없다. 상속은 가능하지만 접근할 수 없다.
//	protected :현재 클래스와 현재 클래스를 상속받은 자식 클래스에서만 접근할 수 있다. 상속 가능
//	package : 기본값(접근 권한 생략시), 현재 패키지에서는 public처럼 사용하고 다른 패키지에서는 pruvate처럼 사용된다.
//	*public* : 현재 클래스 외부에서 자유롭게 근이 가능하다.

// -------------------------------------------------------------------------

//	정적(static)변수
//	최초에 한 번만 생성되고 초기화 되는 변수로  현재 클래스로 생성한 조든 객체에서 공유해서 사용한다.
//	변수를 사용하기 위해 클래스의 객제를 선언할 필료 없이 클래스 이름에 "."을 찍어서 바로 접근이 가능하다.

}
// -------------------------------------------------------------------------
```

```java

public class MemberTest {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

//		클래스 객체를 생성하는 방법
//		클래스이름 객페명 = new 생성자();
		MemberVO vo = new MemberVO();
//		생성된 객체의 멤버에 접근하려면 객체 이름에 "."을 찍어서 접근한다.

		System.out.println(vo.no);
		System.out.println(vo.name);
		System.out.println(vo.gender);
		System.out.println(vo.height);


	}

}
// -------------------------------------------------------------------------
```

# 23강 클래스 만들기(생성자)

```java
import java.util.Date;

import javax.xml.crypto.Data;

// -------------------------------------------------------------------------

public class MemoVO {

	private int no;                 // 객체가 생성될 때 마다 자동으로 1씩 증
	private String name ;
	private boolean gender;
	private String memo ;
	private Date writeDate ;         // 객체가 생성되는 순간의 날짜와 시간

//	생성자 메소드(이하 생성자)
//	생성자 이름은 반드시 클래스 이흠과 같아야 한다.
//	생성자는 return을 가지지 않는다. return을 가지지 않은 메소드는 접근 권한에 "void"를 입력하는데 생성자는 접근 권한을 쓰지 않는다.
//	생성자를 선언하지 않으면 자바 컴파일러사 아무런 일도 하지 않는 기본 생성자를  만들어 준다. 하지만 사용자가 생성자를 선언하면 지본 생성자는
//	자동으로 생성되지 않는다.
//	생성다는 객에가 생성될 때 자동으로 실행되면 멤버 변수를 초기화 시키는 목적으로 사용된다.
//	public NemoVO() {
//
//	}

// -------------------------------------------------------------------------

	public MemoVO() {
//		 System.out.println("기본 생성자가 실행됩니다.");
//	     name = "무명씨";
//	     gender  = false;
//	     memo = "없음";
	     this("무명씨", false, "없음 "  );       // 생성자 MemoVO(String name, boolean gender, String memo)를 실행한다.

	}

// -------------------------------------------------------------------------

    public MemoVO(String name, boolean gender, String memo) {

//	같은 {} 블록에 같은 이를을 가지는 지역 변수와 멤버 변수가 있를 경우 지역 변수에 우건권을  준다.
//	super() : 부모 클래스의 생성자를 의미한다. 생략하면 super()를 컴파일러가 자동으로 넣어준다.
//	this() : 현재 클래스의 생성자를 의미한다.
//	super()와 this()는 반드시 생성자의 첫줄에 코딩해야 한다.
//	super : 부모 클래스를 의미한다.
//	this : 현재 클래스를 의미한다.

	this.name = name;
	this.gender = gender;
	this.memo = memo;

    }

//객체에 저장된 내용을 출력해야 한다면 toString() 메소드를 overrid(재정의) 한다.

    @Override
    public String toString() {
	     return name + "(" + (gender ? "남" : "여") + ")이 남신말 " + memo;
}

//   객체에 저장된 내용을 출력해야 한다면 toString() 메소드를 overrid(재정의) 한다.

}
// -------------------------------------------------------------------------
```

```java

public class MemoTest {

	public static void main(String[] args) {

		MemoVO vo1 = new MemoVO();
		MemoVO vo2 = new MemoVO("홍길동", true, "1등 입니다.");

		System.out.println(vo1);
		System.out.println(vo2.toString());


	}

}

```

# 24강 클래스만들기(getter/setter)

```java
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class MemoVO {

// -------------------------------------------------------------------------

//	멤버 면수의 종류는 정적(static) 멤버 변수와 인스턴스 멤버 변수가 있는데 신스턴스 멤버 변수는 현재 클래스로 생성도는 모든 객체에서
//  독립된 디억 공간을 가지지 만 정적 멤버 변수는 현재 클래스로 생성되는 모든 객체에서 공유해서 사용한다.

	public static int count;
	private int no; // 객체가 생성될 때 마다 자동으로 1씩 증
	private String name;
	private boolean gender;
	private String memo;
	private Date writeDate; // 객체가 생성되는 순간의 날짜와 시간

// -------------------------------------------------------------------------

	public MemoVO() {
		this("무명씨", false, "없음 ");
	}
	public MemoVO(String name, boolean gender, String memo) {
		no = ++count;
		this.name = name;
		this.gender = gender;
		this.memo = memo;
		writeDate = new Date();
	}

// -------------------------------------------------------------------------

//	privete 권한으로 설정된 멤버 변수는 클래스 외부에서 접근할 수 없다.
//	이 규칙이 너무 엄격히 적용되므로 이 규칙에 대한 예외 지정을 getter & setter 메소드를 사용해서 한다.
//  getter는 pruvate 권한을 가지는 멤버 변수의 값을 얻어올 때 사용한다.
//	setter는 pruvate 권한을 가지는 멤버 변수의 값을 수정할 때 사용한다.

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

// -------------------------------------------------------------------------

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM,dd(E) HH:mm:ss.SSS");
		return no + "." + name + "(" + (gender ? "남" : "여") + ")님이 " + sdf.format(writeDate) + "남긴말 " + memo;
	}

}
// -------------------------------------------------------------------------
```

```java

public class MemoTest {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		MemoVO vo1 = new MemoVO();
		MemoVO vo2 = new MemoVO("홍길동", true, "1등 입니다.");

		System.out.println(vo1);
		System.out.println(vo2.toString());

		MemoVO vo3 = new MemoVO("성춘향", false, "이쁘이에요");
		System.out.println(vo3);

		vo2.count =100;
		System.out.println(vo3.count);

//		System.out.println(vo2.name);      // name은 private 권한을 가지는 멤버이므로 에러가 발생된다.

		System.out.println(vo2.getMemo());
		vo2.setName("임꺽정");
		System.out.println(vo2.getMemo());

	}

}
// -------------------------------------------------------------------------
```

# 25강 arrayList

```java

import java.text.SimpleDateFormat;
import java.util.Date;

// -------------------------------------------------------------------------

import javax.xml.crypto.Data;

public class MemoVO {

// -------------------------------------------------------------------------

//	멤버 면수의 종류는 정적(static) 멤버 변수와 인스턴스 멤버 변수가 있는데 신스턴스 멤버 변수는 현재 클래스로 생성도는 모든 객체에서
//  독립된 디억 공간을 가지지 만 정적 멤버 변수는 현재 클래스로 생성되는 모든 객체에서 공유해서 사용한다.

	public static int count;
	private int no; // 객체가 생성될 때 마다 자동으로 1씩 증
	private String name;
	private boolean gender;
	private String memo;
	private Date writeDate; // 객체가 생성되는 순간의 날짜와 시간

// -------------------------------------------------------------------------

	public MemoVO() {
		this("무명씨", false, "없음");
	}

	public MemoVO(String name, boolean gender, String memo) {
		no = ++count;
		this.name = name;
		this.gender = gender;
		this.memo = memo;
		writeDate = new Date();
	}

//	privete 권한으로 설정된 멤버 변수는 클래스 외부에서 접근할 수 없다.
//	이 규칙이 너무 엄격히 적용되므로 이 규칙에 대한 예외 지정을 getter & setter 메소드를 사용해서 한다.
//  getter는 pruvate 권한을 가지는 멤버 변수의 값을 얻어올 때 사용한다.
//	setter는 pruvate 권한을 가지는 멤버 변수의 값을 수정할 때 사용한다.

// -------------------------------------------------------------------------

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM,dd(E) HH:mm:ss.SSS");
		return no + "." + name + "(" + (gender ? "남" : "여") + ")님이 " + sdf.format(writeDate) + "남긴말 " + memo;

	}

}
// -------------------------------------------------------------------------
```

```java
import java.util.ArrayList;

public class ArrayListTest1 {

// -------------------------------------------------------------------------

	public static void main(String[] args) {

//		배열은 한 번 선언하면 프로그램에서 크기를 변경할 수 없다.
		int[] data = new int[10];

// -------------------------------------------------------------------------

//		<E> : 제네릭리한 부르면 ArrayList에 저장할 자료형을 반드시 클래스로 적는다.
//	    ArraYList에 저장할 자료가 기본 자료형이라면 기본 자료형을 클래스화 시켜놓은 랩퍼 클래스를 사용한다.
//		랩퍼 클래스는 지본 자료형의 첫 문자만 대문자로 적으면 되고 Character와 Integer는 풀네임을 사용한다.

//		ArrayList list = new ArrayList();                        // JDK 1.4 이후의 코딩 방법
//		ArrayList<Integer> list = new ArrayList<Integer>();      // JDK 1.5 이후의 코딩 방법
		ArrayList<Integer> list = new ArrayList<>();             // JDK 1.7 이후의 코딩 방법

// -------------------------------------------------------------------------

		for(int i=0 ; i<10 ; i++) {
			data[i] = i + 1;
			list.add(i + 1);
		}
		for(int i=0 ; i<10 ; i++) {
		System.out.println("data[" + i + "] =" + data[i] + ", list.get(" + i + ") = " + list.get(i));
		}

		for(int i=10 ; i<20 ; i++) {
//			data[i] = i + 1;
			list.add(i + 1);
		}
		for(int i=10 ; i<20 ; i++) {
//		System.out.println("data[" + i + "] =" + data[i]);
	    System.out.println("list.get(" + i + ") = " + list.get(i));
		}

	}

}
// -------------------------------------------------------------------------
```

# 26강 도서관리예제1

```java
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

//	책 한 권의 정보를 기억하는 클래스(생성자)
public class BookVo {

//  맴버 구현
	public String title; // 도서명
	public String author; // 저자명
	public String publisher; // 출판사명
	public Date date; // 출판일
	public double price; // 가격

	public BookVo() {
	}
// 맴버 구현을 넘겨 받을 생성자!

	public BookVo(String title, String author, String publisher, Date date, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;

		date.setYear(date.getYear() - 1900);
		date.setMonth(date.getMonth() - 1);
		this.date = date;

		this.price = price;
	}

//  게터 세터

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	투 스트링
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		return String.format("%s %s %s %s %f", title, author, publisher, sdf.format(date), price);
	}

}

```


```java
import java.util.Date;

//      객체
public class BookShop {

	public static void main(String[] args) {

		BookList bookList = new BookList(5);

//      Date date = new Date();              // 현재 컴퓨터 시스템의 날짜와 시간을 얻어온다.
//		Date date = new Date(년, 월, 일);      // 입력한 년, 월 일에 해당되는 날짜를 만든다.
//		날짜를 만들거니 입력하는 경우 Date 클래스는 1900년 기준으로 처리하므로 년은 1900을 뺴서 입력한다.
//      월을 입력할 때는 1을 뺴서 입력해야 정상적으로 처리된다.

		BookVo book1 = new BookVo("자바", "홍길", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book2 = new BookVo("자바", "홍길동", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book3 = new BookVo("자바", "홍동", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book4 = new BookVo("자바", "길동", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book5 = new BookVo("자바", "릿", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book6 = new BookVo("자바", "릿", "코리아출판사", new Date(2023, 5, 15), 35000);
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);

		System.out.println(bookList);
	}

}
```

```java
import java.util.Arrays;

//   여려 권 책 정보(BookVo)를 기억할 클래스
public class BookList {

//	배열
	private BookVo[] bookList; // 책 정보를 기억할 배열을 선언만 한 상태
	private int size; // 배열의 크기
	private int count; // 배열의 첨자, 배열에 저장된 데이터의 개수

// 기본 생성자가 실행되면 30권의 책을 저장할 수 있는 배열을 만들고 배열의 크기를 넘겨받는 생성자가 실행되면 넘겨받은 크기만큼 배열을 만든다.
	public BookList() {
		this(30);
	}

	public BookList(int size) {
		this.size = size;
		bookList = new BookVo[size];

	}

	public BookVo[] getBookList() {
		return bookList;
	}

	public void setBookList(BookVo[] bookList) {
		this.bookList = bookList;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "BookList [bookList=" + Arrays.toString(bookList) + "]";
	}

// bookList에 BookVoo 클래스 객체를 저장하는 메소드
	public void addBook(BookVo book) {
		bookList[count++] = book;
	}

}

```

# 27강 도서관리예제2

```java
import java.awt.DefaultKeyboardFocusManager;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

//	책 한 권의 정보를 기억하는 클래스(생성자)
public class BookVo {

//  맴버 구현
	public String title; // 도서명
	public String author; // 저자명
	public String publisher; // 출판사명
	public Date date; // 출판일
	public double price; // 가격

	public BookVo() {
	}
// 맴버 구현을 넘겨 받을 생성자!

	public BookVo(String title, String author, String publisher, Date date, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;

		date.setYear(date.getYear() - 1900);
		date.setMonth(date.getMonth() - 1);
		this.date = date;

		this.price = price;
	}

//  게터 세터

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	투 스트링
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");

//		DecimalFormat 클래스는 숫자의 출력서식을 저장한다.
//		#,##0의 의미는 천 단위마다 컴마를 찍어주라는 의미이므로 무조건 적어주고 별도로 필요한 내용을 #,##0의
//	    앞,뒤로 붙여주면 된다.

		DecimalFormat df = new DecimalFormat("#,##0원"); // 천 단위 컴마
		return String.format("%s %s %s %s %s", title, author, publisher, sdf.format(date), df.format(price));
	}

}

```

```java
import java.util.Date;

//      객체
public class BookShop {

	public static void main(String[] args) {

		BookList bookList = new BookList(5);

//      Date date = new Date();              // 현재 컴퓨터 시스템의 날짜와 시간을 얻어온다.
//		Date date = new Date(년, 월, 일);      // 입력한 년, 월 일에 해당되는 날짜를 만든다.
//		날짜를 만들거니 입력하는 경우 Date 클래스는 1900년 기준으로 처리하므로 년은 1900을 뺴서 입력한다.
//      월을 입력할 때는 1을 뺴서 입력해야 정상적으로 처리된다.

		BookVo book1 = new BookVo("자바", "홍길", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book2 = new BookVo("자바", "홍길동", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book3 = new BookVo("자바", "홍동", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book4 = new BookVo("자바", "길동", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book5 = new BookVo("자바", "릿", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book6 = new BookVo("자바", "릿", "코리아출판사", new Date(2023, 5, 15), 35000);
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);

		System.out.println(bookList);
	}

}

```

```java
import java.awt.print.Book;
import java.text.DecimalFormat;
import java.util.Arrays;

//   여려 권 책 정보(BookVo)를 기억할 클래스
public class BookList {

//	배열
	private BookVo[] bookList; // 책 정보를 기억할 배열을 선언만 한 상태
	private int size; // 배열의 크기
	private int count; // 배열의 첨자, 배열에 저장된 데이터의 개수

// 기본 생성자가 실행되면 30권의 책을 저장할 수 있는 배열을 만들고 배열의 크기를 넘겨받는 생성자가 실행되면 넘겨받은 크기만큼 배열을 만든다.
	public BookList() {
	}

	public BookList(int size) {
		this.size = size;
		bookList = new BookVo[size];

	}

	public BookVo[] getBookList() {
		return bookList;
	}

	public void setBookList(BookVo[] bookList) {
		this.bookList = bookList;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		String str = "";
		str += "==============================\n";
		str += " 도서명 저자명 출판사명 출판일 가격\n";
		str += "==============================\n";

		double total = 0.0;
		for (int i = 0; i < bookList.length; i++) {
			if (bookList[i] == null) {
				break;
			}
			str += bookList[i] + "\n";
			total += bookList[i].getPrice();
		}

		str += "==============================\n";
		DecimalFormat df = new DecimalFormat("#,##0원");
		str += " 합계 금액 : " + df.format(total) + "\n";
		str += "==============================\n";
		return str;

//		return "BookList [bookList=" + Arrays.toString(bookList) + "]";
	}

// bookList에 BookVoo 클래스 객체를 저장하는 메소드
	public void addBook(BookVo book) {

//		if를 사용하는 전통적인 예외처리
//		if(count < size) {
//
//	} else {
//		System.out.println("배열이 가득차서 " + book.getAuthor() + "의 책을 추가할 수 없습니다.");
//
//	}

//  try - catch를 사용하는 자바의 예외처리
//  예외가 발샹될 것으로 예상되는 문자을 try 블록에 쓴다.
//  예외가 발생되면 처리할 문장을 catch 블록에 쓴다.
//	try 블록의 내용을 실행하다가 예외 발생되면 더 이상 try 블록을 싱행하지 않고 햐당 예외의 catch 블록을 실행한다.
		try {
			bookList[count++] = book;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열이 가득차서 " + book.getAuthor() + "의 책을 추가할 수 없습니다.");
		} catch (Exception e) {
//	    Exception 클레스는 예외의 최상위 클래스로서 모든 예외를 감지할 수 있다.
//		catch 블록에 Exception을 적을 경우 반드시 맨 마지 catch 블록에 적어야 한다.
//	    printStackTrace() : 발생된 예외 이름과 예외가 발생된 문장을 발생 순서 역순으로 추적한다.
			e.printStackTrace();
		} finally {
//			finally 블록은 선택 사항으로서 예외 발생 여부와 관계 없이 무조건 실행애야 할 문장이 있으면 적는다.
//			System.out.println("안됨");
		}
	}
}

```

# 28강 도서관리예제3

```java
import java.awt.DefaultKeyboardFocusManager;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class BookVo {

	public String title;
	public String author;
	public String publisher;
	public Date date;
	public double price;

	public BookVo() {
	}

	public BookVo(String title, String author, String publisher, Date date, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;

		date.setYear(date.getYear() - 1900);
		date.setMonth(date.getMonth() - 1);
		this.date = date;

		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");

		DecimalFormat df = new DecimalFormat("#,##0원");
		return String.format("%s %s %s %s %s", title, author, publisher, sdf.format(date), df.format(price));
	}

}
```

```java
import java.util.Date;

//      객체
public class BookShop {

	public static void main(String[] args) {

		BookList bookList = new BookList();

		BookVo book1 = new BookVo("자바", "홍길", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book2 = new BookVo("자바", "홍길동", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book3 = new BookVo("자바", "홍동", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book4 = new BookVo("자바", "길동", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book5 = new BookVo("자바", "릿", "코리아출판사", new Date(2023, 5, 15), 35000);
		BookVo book6 = new BookVo("자바", "릿", "코리아출판사", new Date(2023, 5, 15), 35000);
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);

		System.out.println(bookList);
	}

}

```

```java

import java.text.DecimalFormat;
import java.util.ArrayList;

public class BookList {

	public ArrayList<BookVo> bookList = new ArrayList<>(); // 여러 권의 책 정보를 기억할 ArrayList

	public ArrayList<BookVo> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<BookVo> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		String str = "";
		str += "==============================\n";
		str += " 도서명 저자명 출판사명 출판일 가격\n";
		str += "==============================\n";

		double total = 0.0;
//		ArrayList에 저장된 테이터의 개수 만큼 반복한다.
//		for (int i = 0; i < bookList.size(); i++) {
//			str += bookList.get(i) + "\n";
//			total += bookList.get(i).getPrice();
//		}

//	 향상된 for : 배열이나 ArrayList에 저장된 내용을 0번째 값부터 마지막 값가지 전체를 처리할 때 사용하면 효과적인다.
//	 for(배열이나 ArrayList의 자료형 변수명 : 배열니나 ArrayList이름){
//	 반복해 실행할 문장;
//		...;
//		}

		for (BookVo book : bookList) {
			str += book + "\n";
			total += book.getPrice();
		}

		str += "==============================\n";
		DecimalFormat df = new DecimalFormat("#,##0원");
		str += " 합계 금액 : " + df.format(total) + "\n";
		str += "==============================\n";
		return str;
	}

	public void addBook(BookVo book) {
		bookList.add(book);
	}
}
```

# 29강 상속

```java
//  자식 (하위, 서브, 파생) 클래스
//  Parent 클래스를 상속받아 Child 클래스를 만든다.
public class child extends Parent {

//	Parent 클래스를 상속 받았으므로 Parent 클래스의 모든 멤버 변수와 메소드를 별로도 정의하지 않아도 사용할 수 있다.

//  부모 클래스의 private 권한을 가진 멤버는 상속은 받았지만 접근할 수 없다.
	private int age;
	private String nickName;

	public child() {
	}
//	자동 완성 가능을 사용해도 현댜 클래스에서 직업 입력해 겅의하지 않은 멤버는 보이지 않는다.
	/*
	 * // 부모 클래스로 부터 상속받은 멤버 변수의 접근 권한이 private일 경우 부모 클래스의 생성자를 호출해서 초기화 시킨다.
	 *
	 * public child(String name, boolean gender,int age, String nickName) {
	 * super(name,gender); this.age = age; this.nickName = nickName; }
	 */
//	부모 클래스로 부터 상속받은 멤버 변수의 접근 권한이 private일 경우 부모 클래스에 setter 메소드사 작성되어 있다면
//	srtter 메소드를 사용해서 초기화 시킬수 있다.

	public child(String name, boolean gender, int age, String nickName) {
		setNeme(name);
		setGender(gender);
		this.age = age;
		this.nickName = nickName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
//	   부모 클래스로 부터 상속받은 멤버 변수의 접근 권한이 private이면 접근할 수 없으므로 gettet 메소드를 사용해야 한다.
		return getNeme() + "(" + (isGender() ? "남" : "여") + ") - " + age + "," + nickName;
	}

}

```

```java

public class InheritanceTest {

	public static void main(String[] args) {

		Parent parent1 = new Parent();
		System.out.println(parent1);
		Parent parent2 = new Parent("이몰루", true);
		System.out.println(parent2);

		child child = new child("미카사", false, 17, "이쁜이");
		System.out.println(child);

	}

}

```

```java
import javax.sound.sampled.BooleanControl;

//   부모 (상위, 슈퍼, 기반) 클래스
public class Parent {

	private String neme;
	private boolean gender;

	public Parent() {
		this("무명씨", false);
	}

	public Parent(String neme, boolean gender) {
		super();
		this.neme = neme;
		this.gender = gender;
	}

	public String getNeme() {
		return neme;
	}

	public void setNeme(String neme) {
		this.neme = neme;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return neme + "(" + (gender ? "남" : "여") + ")";
	}

}

```

# 30강 추상클래스\_다형성

```java
//  추상 클래스 : 한 개 이상의 푸상 메소드를 포함한 클래스로 불완전한 클래스이기 때문에 객체를 만들어 사용할 수 없다.
//  추상 클래스는 상속을 시키기 위해 만드는 클래스로 추상 클래스를 상속받은 자식 클래스는 상속받은 추상 메소드를 반드시 오버라이드 시켜서 사용해야 한다.
abstract class Product {

//  추상 메소드 : 아무런 일도 하지 않은 메소드로 {} 블록을 가지지 않는 메소드를 abstract 예약어를 사용해서 만든다.
//  추상 메소드를 만드는 이유는 상속받을 자식 클래스에서 무조건 오버라이드 시켜서 사용해야 할 메소드는 부모 클래스에서 코딩을 해봐야 어차피 무시되므로
//  그냥 내용이 없는 메소드로 만드는 것이다. 상속받은 자식 클래스에서  무조건 재정의 시켜 사용해야 할 메소드임을 강제한다.
	// public void move() { } // 아무런 일도 하지 않는 일반 메소드
	public abstract void move();

}

// 추상 클래스 Product를 상속받아 Camera 클래스를 만든다.
class Camera extends Product {

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

}

//  파일 이름과 같은 이름을 가지는 클래스에만 public을 붙여줄 구 있다.
public class AbstractClass {

	public static void main(String[] args) {

//		Product product = new Product();   // 추상 크래스는 객체를 만들어 사용할 수 없으므로 에러가 발생된다.

	}

}

```

```java
import java.util.Scanner;

//  다형성이란 하나의 메소드가 서로 다른 클래스에서 다양하게 사용되는 것을 말한다.
//  다형을 구현할 메소그를 포함한 클래스는 같은 부모 클래스를 가져야 한다.
//  부모 클래스와 자긷 클래스에 반드시 같은 메소드가 있어야 하고 자식 클래스는 이를 반드시 오버라이드 해서 사용해야 한다.
//  부모 클래스의 객체에 자식 클래스의 객체를 대입해서 실행해야 한다.

abstract class Shape {

	public abstract void draw(); // 다형성을 구현할 메소드, 추상 메소드

}

class Point extends Shape {

	@Override
	public void draw() {
		System.out.println("점으 찍는다.");
	}

}

class Line extends Shape {

	@Override
	public void draw() {
		System.out.println("선을 그린다.");
	}

}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("원을 그린다.");
	}

}

class Rect extends Shape {

	@Override
	public void draw() {
		System.out.println("사각형을 그린다.");
	}

}

class TriAngle extends Shape {

	@Override
	public void draw() {
		System.out.println("삼각형을 그린다.");

	}

}

public class PolymorphismTest {

	public static void main(String[] args) {

//	Shape shape = new Point();
//	shape.draw();

		Shape[] shapes = { new Point(), new Line(), new Circle(), new Rect(), new TriAngle() };

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 메누를 선택하세요 : ");
		int menu = sc.nextInt();

		shapes[menu - 1].draw();

	}

}
```

# 31강 인터페이스 (종강)

```java

class Point {
	int x, y;

	public void move() {
	}
}

class Shape {
//	변수 앞에 final이 붙으면 그 변수는 프로그램에서 값을 변경할 수 없다.
//	프로그램에서 자주 사용하는 데이터는 변수에 저장시켜 사용하면 편리하고 프로그램에서 임의로 값을 변경할 수 없도록 상수로 만들어 사용한다.
	public static final double PI = 3.141592; // 정적 멤버 변수, 상수

	public void draw() {
	}

	public void erase() {
	}

}

//class Line  extends Point, Shape {}  //자바는 다중 상속을 허용하지 않으므로 에러가 발생된다.

//  인터페이스란 정적(statin) 멤버 변수와 추상 메소드로만 구성된 크래스으 특별한 형태이다.
interface Draw {
	public static final double PI = 3.141592; // 정적 멤버 변수, 상수
//  인터페이스는 멤버 변수 선언시 앞의 내영을 아래와 같이 생략해도 자동으로 public static final을 붙여준다.
	int LIMIT = 1000;

	public abstract void moveTo(); // 추상 메소드
//  인터페이스는 메소드 선언시 앞의 내용을 생략하면 자동으로  public abstract을 붙여준다.

	void erade();

}

interface Graphic {
	void rotate();

	void resize();
}

//class Line extends Draw {  }        // 클래스는 인터페이스를 상속받은 수 없으므로 에러가 발생된다.
//interface Graphics extends Point { }  // 인터페이스는 클래스를 상속받은 수 없으므로 에러가 발생된다.
//   클래스는 클래스끼리 인터페이스 인터페이스끼리 상속을 시켜야 한다.

interface Graphics extends Draw, Graphic { // 인터페이스는 자중 상속을 허용한다.
//	 아무런 내용도 가지지 않는 인터페이스를 표시(marker) 인터페이스라 부른다.

}

// 클래스 선언시 인터페이스에서 정의한 내용을 사용하려면 상속(extends)을 사용할 수 없고 구현(implements을 사용한다.
// Line 클래스는 Point 클래스를 상받고 Draw 인터페이스와 Graphic 인터페이스를 구현해서 만든다.
class Line extends Point implements Draw, Graphic {

	@Override
	public void rotate() {

	}

	@Override
	public void resize() {

	}

	@Override
	public void erade() {

	}

	@Override
	public void moveTo() {

	}

}

public class InterfaceTest {

	public static void main(String[] args) {

		System.out.println(Shape.PI);
		System.out.println(Draw.PI);
		System.out.println(Draw.LIMIT);

	}

}
```

# 2023/6/26

# 상속

## 메서드 오버라이딩

```
자식 클래스이 메서드가 부모 클래스의 메서드를 재정의 한다.

부모 클래스의 메서드를 자식클래스가 자신의 필요에 맞춰서 변셩하는 것.

부모 클래스의 메서드와 자식 클래스의 메서드가 완벽하게 일치 (반환형,메서드명,매갸변수 일치) 하여야 오버라이딩으로 처리한다.

불일치의 결우 오버로딩으로 처리 (중복처리)
```

# 키워드 super 를 이영한 무보 클래스 멤버 접근

## 상속과 다양성

```
Polymorphism

도일한 코드로 다양한 타입의 캑체를 처리할 수 있는 기법.

자방의 자료형 검사는 엄격하다.

클래스도 하나의 자료형으로 간주
서로 다른 클래스들이 인스턴스들은 서로 참조할 수 없다.

예외 부모는자식을 받을 수이지만 자식은부모를 받을 수 없다,
```

# 종단 클래스 (final)

```
더이상 상곡을 시킬 수없는 클래스
상속불가
```
