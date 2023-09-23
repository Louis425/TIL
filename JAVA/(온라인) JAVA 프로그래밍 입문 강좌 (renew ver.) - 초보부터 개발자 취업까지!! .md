<!-- TOC -->

- [1강\_JAVA 프로그래밍이란?](#1강-java-프로그래밍이란)
- [2강\_JAVA 프로그램의 실행 구조](#2강_java-프로그램의-실행-구조)
- [3강\_변수](#3강_변수)
- [4강\_기본자료형](#4강_기본자로형)
- [5강\_특수분자와 서식문자](#5강_특수-문와-서식-문자)
- [6강\_연산자](#6강_연산자)
- [7강\_배열](#7강_배열)
- [8강\_배열관 메모리](#8강_배열과-메모리)
- [9강\_조간문](#9강_조건문)
- [10강\_반복문](#10강_-반복문)
- [11강\_객체지향 프로그래밍이란](#11강_-객체-지향-프로그래밍이란)
- [12강\_클래스 제작과 객체 생성](#12강_클래스-제작관-객체-생성)
- [13강\_메서드](#13강_메서드)
- [14강\_객체와 메모리](#14강_객체와-메모리)
- [15강\_생성자와 소멸자 그리고 this키워드](#15강_생성자와-소멸자-그리고-this-키워드)
- [16강\_패키지 static](#16강_패키지와-static)
- [17강\_데이터 은닉](#17강_데이터-은닉)
- [18강\_상속](#18강_상속)
- [19강_Controller 객체 구현 - II](#19강_controller-객체-구현---ii)
- [20강_내부 클래스와 익명 클래스](#20강_내부-클래스와-익명-클래스)
- [21강_인터페이스](#21강_인터페이스)
- [22강_추상클래스](#22강_추상클래스)
- [23강_람다식](#23강_람다식)  
- [24강_문자열 클래스](#24강_문자열-클래스)
- [25강_Collections]()
- [26강_예외처리]()
- [27강_입력과 출력]()
- [28강_네트워킹]()

#

<!-- /TOC -->

# 1강 JAVA 프로그래밍이란?

## 1-1 : 프로그래밍이란?

```
개발자 업무 영역  --> 소스 --> 컴파일러 --> 기계어 --> 기계
```

## 1-2 : JAVA 언어의 탄생

Games Godling <br>
(제임스 고슬링)

- 1995년 제임스 고슬린(James Gosling)에 의해서 탄생.
- 썬 마이크로시스템즈(Sum Microsystems) 에서 발표.
- 오크 (Oak) 언어에서 시작해서 JAVA 언어로 발전.
- 가전제품에 탑재할 수 있는 프로그램을 개발하기 위한 목적으로 탄생.

## 1-3 : JAVA 언어의 특징

```
     FORTRAN
     ↓     ↓
 COBOL     ALGOL
           ↓   ↓
      SIMULA   B
          ↓    ↓
        C++  ← C
        ↓ ↓
       C# JAVA
```

### 초창기 시절에 Java 언어의 단점

- 기존 C/C++에 비해서 속도가 굉장히 느린다.
- 리소스(메모리, CPU)를 많이 사용한다.

  발전<br>
  ↓ ↓

### 현재 Java 언어의 장점

- 객체지향언어로기능을부품화할수있다.
- JRE를 이용해서 운영체제로부터 자유롭다.
- 웹 및 모바일 프로그래밍이 쉽다.
- GC를 통한 자동 메모리 관리를 지원한다.
- 실행 속도가 많이 개선되어 빨라졌다.

### 1-5 : Hello Java World!!

```java

package lec01Pjt001;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Hello Java World!!");

	}

}

// -------------------------------------------------------------------------
```

# 2강\_JAVA 프로그램의 실행 구조

## 2-1 : 환경변수 설정

- javac.exe, java.exe를 다른 디렉토리에서도 실행할 수 있도록 하기 위해 환경 변수(Path)에 bin 경로를 등록 한다.

## 2-2 : Java 컴파일러와 JVM

```


                                    LINK
                       메모리 로딩 / 실행 준비 / 실행 결정 / 초기화
                                  ↓       ↓
                                  ↓       ↓
JAVA 소스   ->  바이트 코드 파일 ->  기계어 ->  실행
(xxx.java)  ↓   (xxx.class) ↓
            ↓               ↓
          java 컴파일러     jvm 구동
          (javac.exe)    (java.exe)
```

## 2-3 : Java 프로그램 실행

- 이클립스가 아닌 메모장, 컴파일러(javac.exe) 그리고 JVM을 구종시키는 java.exe를 이용해서 java 프로그램을 실행 한다.

## 2-4 : 이클립스 사용의 장점

- 이클립스를 사용하면 컴파일, 디버깅 그리고 실행까지 쉽게 할 수 있다.

```
                        eclipse
↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
                                    LINK
                       메모리 로딩 / 실행 준비 / 실행 결정 / 초기화
                                  ↓       ↓
                                  ↓       ↓
JAVA 소스   ->  바이트 코드 파일 ->  기계어 ->  실행
(xxx.java)  ↓   (xxx.class) ↓
            ↓               ↓
          java 컴파일러     jvm 구동
          (javac.exe)    (java.exe)
```

## 2-5 : 가비지 컬렉터(Gabage Collector)

- 프로그램 실행에 필요한 메모리를 Gabage Collector가 자동으로 관리 한다.

```
C계열 프로그램                                 Java 프로그램


개발자가 직접 메모리를 관리해야 함.                 개발자가 메모리에 접근할 수 없음.
만약 메모리 관리를 잘못할 경우          VS         따라서개발자는메모리관리를할수없고,
메모리 누수가 발생하고                           가비지 컬렉터가 불필요한 메모리를 회수해서
타 프로그램 동작이 멈출 수 있음.                   메모리를최적화함.
```

## 3강\_변수

## 3-1 : 변수란?

### 데이터(자료)를 임시로 담을 수 있는 상자(메모리 공간)

```java



    선언부     초기화
      ↓        ↓
   ______     __
   int  i  =  10;
    ↑   ↑  ↑   ↑
  자료형  ↑  ↑   변수값
    변수이름  ↑
      대입연산자

//변수선언후초기화진행

int i; // 변수 선언
i = 10; // 변수 초기화
System.out.println("i = " + i);

// 변수 선언과 초기화를 동시에 진행

int j = 20; // 변수 선언&초기화
System.out.println("j = " + j);

```

## 메모리 할당과 진법

```java

int i;
i = 10;
                  10진수 : 10
int i - 10;  ⇉
                  2진수 : 1010

```

```java

       int 자료형은 메모리에서 4byte 공간은 차지함.
<----------------------------->
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0
                              ⇿
                            1 bit
                <------------->
                   8bir = 1byte

```

## 3-4 : 변수 데이터 변경

### 변수에 저장된 데이터 언제든지 변경할 수 있다.

```java

package lec03Pjt001;

public class MainClass {

	public static void main(String[] args) {

		int num = 0;
		System.out.println("num = " + num);

		num = 10;
		System.out.println("num = " + num);

		num = 100;
		System.out.println("num = " + num);

		num = 0;
		System.out.println("num = " + num);

	}

}

```

# 4강\_기본자로형

## 4-1 : 기본자료형과 객체자료형

### 기본 자로형은 데이터가 변수에 직접 저장되고, 객체 자로형은 객체 메모리 주소가 변수에 저장된다.

```java

                           기본 자료형                 객체 자로형
                             메모리(여기저기)             메모리
int i = 39;                      10                 odj      0x44ec56
                           39  8.5 40              ↗            ↓
                               20             0x44ec56         odj

                                                C진영에서 포인터라고 하고,
                                               JAVA진영에서는 레퍼런스라고 한다.


```

## 4-1 : java 기본자료형

```java

                         ㅣ  byte   1byte
                         ㅣ  *char  2byte*
                 정수형 →  ㅣ  short  2byte
                         ㅣ *int    4byte*
                         ㅣ  long   8byte
  기본자로형
                 실수형 →  ㅣ float   4byte
                         ㅣ *double 8byte*

                 논리형 →  ㅣ*boolean 1byte*

```

## 4-2 : java 기본자료형

```java

package lec04Pjt001;

public class MainClass {

	public static void main(String[] args) {

		char c = 'a';
		System.out.println("c = " + c);

		int i = 10;
		System.out.println("i = " + i);

		double d = 10.258;
		System.out.println("d = " + d);

		boolean b = false;
		System.out.println("b = " + b);

		String s = "Hello Java Wrold!!";
		System.out.println("s = " + s);

  }

}

console

C = a
i = 10
d = 10.258
b = false
s = Hello java Wrold!!

```

## 4-3 : 형 변환

```java

package lec04Pjt001;

public class MainClass {

	public static void main(String[] args) {

//자동(묵시적) 형 변환:
//작은 공간의 메모리에서 큰 공간의 메모리로 이동 byte by = 10;
int in = by;
System.out.println("in = " + in);

//명시적 형 변환:
//큰 공간의 메모리에서 작은 공간의 메모리로 이동 int iVar = 100;
byte bVar = (byte)iVar;
System.out.println("bVar = " + bVar);

//명시적형변환은데이터가누실될수있다.
iVar = 123456; bVar = (byte)iVar;
System.out.println("bVar = " + bVar);
  }

}

console
in = 10
bVar = 100
bVer = 64

```

# 5강\_특수 문와 서식 문자

## 5-1 : 특수 문자

### 일반 문자가 아닌 특수한 목적으로 사용되는 문자

```java

 \t  탭
*\n  줄바꿈*
 \’  작은 따옴표
 \”  큰따옴표
 \\  역슬래쉬

package lec05Pjt001;

public class MainClass {

	public static void main(String[] args) {

 System.out.println("Good\tMorning~");     // \t
*System.out.println("Good\nMorning~");*     // \n
 System.out.println("Good\'Morning~\'");   // \'
 System.out.println("Good\"Morning~\"");   // \"
 System.out.println("Good\\Morning~\\");   // \\


  }

}

```

## 5-2 : 서식 문자

### 일반 문자가 아닌 서식에 사용되는 문자

```java

printf() 메서드 이용
: f는 format(형식)을 뜻함.

%d 10진수
%o 8진수
%x 16진수
%c 문자
%s 문자열
%f 실수

```

```java

package lec05Pjt001;

public class MainClass {

	public static void main(String[] args) {

 // 서식문자
 System.out.println("오늘의 기온은 10도 입니다.");
 System.out.printf("오늘의 기온은 %d도 입니다.\n", 10);

int num1 = 20;
System.out.println("오늘의 기온은 " + num1 +"도 입니다.");
System.out.printf("오늘의 기온은 %d도 입니다.\n", num1);

System.out.printf("홍길동's Info. : %d학년 %d반 %d번\n", 6, 2, 10);

// 정수
int num2 = 30;
System.out.printf("num2(10진수) : %d\n", num2);
System.out.printf("num2(8진수) : %o\n", num2);
System.out.printf("num2(16진수) : %x\n", num2);

// 문자
System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", 'a', 'B');

// 문자열
System.out.printf("\'%s\'을 대문자로 바꾸면 \'%s\'입니다.\n", "java", "JAVA");

// 실수
float f = 1.23f;
System.out.printf("f = %f\n", f);

double d = 1.23456d;
System.out.printf("d = %f\n", d);

  }

}

```

## 5-3 : 서식 문자의 정렬과 소수점 제한 기능

### 서식 문자를 이영해서 풀력 문자의 정렬 및 소수점 제한 기능을 사용할 수 있다.

```java

package lec05Pjt001;

public class MainClass {

	public static void main(String[] args) {

// 서식문자 정렬 기능
System.out.printf("%d\n", 123);
System.out.printf("%d\n", 1234);
System.out.printf("%d\n", 12345);

System.out.println();

System.out.printf("%5d\n", 123);
System.out.printf("%5d\n", 1234);
System.out.printf("%5d\n", 12345);

System.out.println();

// 서식문자 소수점제한 기능
System.out.printf("%f\n", 1.23);
System.out.printf("%.0f\n", 1.23);
System.out.printf("%.1f\n", 1.23);
System.out.printf("%.2f\n", 1.23);
System.out.printf("%.3f\n", 1.23);

  }

}

```

# 6강\_연산자

## 6-1 : 피연산자 개수에 의한 연산자 구분

### 피연산자 개수에 따라서 단항, 이항 그리고 삼향 연산자로 구분할 구 있다.

```java

   단항 연산자                 이항 연산자                      삼향 연산자

피연산자가 하나 존재          피연산자가 두개 존재                피연산자가 세개 존재

  +x, -x, !x            x = y, x < y, x != y          조건식 : true ? false

```

## 6-2 : 대입 연산자

### 대입 연산자는 오른쪽의 결과를 왼쪽에 대입(할당) 한다.

```java

‘=’는 수학에서 ‘오른쪽 값과 왼쪽 값이 같다’ 라는 의미 이지만,
프로그램에서는 ‘오른쪽 값을 왼쪽에 대입’ 하는 의미로 쓰인다.

프로그램에서 ‘오른쪽와 왼쪽이 같다’ 의미는 ‘==’이다.

int x = 10;
int y = 20;

// 대입 연산자
System.out.println("x = " + x);
System.out.println("y = " + y);

x = y;
System.out.println("x = " + x);
System.out.println("y = " + y);

```

## 6-3 : 산술 연산자

### 치연산자를 이용해서 +,-,\*,/,% 등을 수행한다.

```java

+ 덧셈
- 뺄셈
* 곱셈
/ 나눗셈
% 나머지

x = 10; y = 20;
// 산술 연산자
System.out.println("x + y = " + (x + y));
System.out.println("x - y = " + (x - y));
System.out.println("x * y = " + (x * y));
System.out.println("x / y = " + (x / y));
System.out.println("x % y = " + (x % y));

```

## 6-4 : 복합 대입연산자

### 산술 연산자와 대입 연산자를 결합한 연산자이다.

```java

+= 더하고 대입
-= 빼고 대입
*= 곱하고 대입
/= 나누고 대입
%= 나머지를 대입

// 복합대입 연산자
x = 10;
System.out.println("x += 10 : " + (x += 10));
x = 10;
System.out.println("x -= 10 : " + (x -= 10));
x = 10;
System.out.println("x *= 10 : " + (x *= 10));
x = 10;
System.out.println("x /= 10 : " + (x /= 10));
x = 10;
System.out.println("x %= 10 : " + (x %= 10));

```

## 6-5 : 관계 연산자

### 두개의 피연산자를 비교해서 참/거짓의 결론 을 돌출한다.

```java

>    a>b : a가 b보다 크면 참
<    a<b : a가 b보다 작으면 참
>=   a>=b : a가 b보다 크거나 같으면 참
<=   a<=b : a가 b보다 작거나 같으면 참
==   a==b : a와 b가 같으면 참
!=   a!=b : a와 b가 같지 않으면 참

// 관계 연산자
x = 10; y = 20;
System.out.println("x > y : " + (x > y));
System.out.println("x < y : " + (x < y));
System.out.println("x >= y : " + (x >= y));
System.out.println("x <= y : " + (x <= y));
System.out.println("x == y : " + (x == y));
System.out.println("x != y : " + (x != y));

```

## 6-6 : 증가 연산자

### 1만큼 증가 하거나 감소를 수행한다.

```java

++ 1만큼 증가
-- 1만큼 감소

 증감 연산자
x = 10;
System.out.println("++x : " + (++x));
x = 10;
System.out.println("--x : " + (--x));
x = 10;
System.out.println("x++ : " + (x++));
System.out.println("x : " + x);
x = 10;
System.out.println("x-- : " + (x--));
System.out.println("x : " + x);

```

## 6-7 : 논리 연산자

### 피연산자의 논리곱(AND), 논리합(OR), 논리부정(NOT)을 수행한다.

```java

&& 논리곱(AND)     a && b : a와 b가 모두 참이면 참
|| 논리합(OR)      a || b : a와 b중 하나라도 참이면 참
! 논리부정(NOT)     ! a : a의 상태를 부정

// 논리 연산자
boolean b1 = false;
boolean b2 = true;
System.out.println("b1 && b2 : " + (b1 && b2));
System.out.println("b1 || b2 : " + (b1 || b2));
System.out.println("!b1 : " + !b1);
System.out.println("!b2 : " + !b2);

```

## 6-8 : 조건(삼항) 연산자

### 삼항 연산자로 두개의 피연산자 연산 결과에 따라서 나머지 피연산자가 결정된다.

```java

조건식?식1:식2     조건식이 참이면 식1이 실행되고,
                조건식이 거짓이면 식2가 실행된다.

// 조건(삼항) 연산자
x = 10; y = 20;
int result = 0;
result = (x > y) ? 100 : 200;
System.out.println("result : " + result);

result = (x < y) ? 100 : 200;
System.out.println("result : " + result);

result = (x == y) ? 100 : 200;
System.out.println("result : " + result);

```

## 6-9 : 비트 연산자

### 데이터를 비트(bit)단위로 환산하여 연산을 수행하며, 다른 연산자보다 연산 속도가 향상된다.

```java

& : AND 연산     a & b : a와 b가 모두 1이면 1
| : OR 연산      a | b : a와 b중 하나라도 1이면 1
^: XOR연산       a^b : a와 b가 같지 않으면 1

// 비트 연산자
x = 2;
y = 3;
System.out.println("x & y : " + (x & y));
System.out.println("x | y : " + (x | y));
System.out.println("x ^ y : " + (x ^ y));

```

# 7강\_배열

## 7-1 : 베열이란?

### 인덱스를 이용해서 자료형이 같은 데이터를 관리하는 것이다.

```java

   데이터    데이터    데이터    데이터    데이터    ...   데이터
   인덱스0   인덱스1   인덱스2   인덱스3   인덱스4         인덱스n-1
   ←-----------------------------------------------------→
                            배열길이 : n

배열사용 예

아파트 호수 관리 : 101호, 201호, 301호 ... 401호, 501호
회사 사번 관리 : 홍길동(k-0001), 홍길자(k-0002), 홍길순(k-0003), ... 홍길똥(k-0004)
학급 학생 관리 : 박찬호(01), 이승엽(02), 박용택(03), ... 홍성흔(04)

```

## 7-2 : 배열 선언 및 초기화

### 배열도 변수와 마찬가지로 선언과 초기화 과정을 거쳐 사용한다.

```java

// 배열 선언 후 초기화
int[] arr1 = new int[5];
arr1[0] = 100;
arr1[1] = 200;
arr1[2] = 300;
arr1[3] = 400;
arr1[4] = 500;

System.out.println("arr1[0] : " + arr1[0]);
System.out.println("arr1[1] : " + arr1[1]);
System.out.println("arr1[2] : " + arr1[2]);
System.out.println("arr1[3] : " + arr1[3]);
System.out.println("arr1[4] : " + arr1[4]);

```

```java

// 배열 선언과 초기화를 동시에
int[] arr2 = {10, 20, 30, 40, 50};

System.out.println("arr2[0] : " + arr2[0]);
System.out.println("arr2[1] : " + arr2[1]);
System.out.println("arr2[2] : " + arr2[2]);
System.out.println("arr2[3] : " + arr2[3]);
System.out.println("arr2[4] : " + arr2[4]);

```

## 7-3 : 배열을 이용한 학사관리

### 배열은 주로 많은 데이터를 쉽게(효율적) 관리하기 위해서 사용한다.

```java

// 배열을 이용한 학사관리
String[] name = {"박찬호", "이승엽", "박병호", "이병규", "류현진"};
int[] score = new int[5];
Scanner scanner = new Scanner(System.in);
System.out.printf("%s의 점수를 입력하시오. : ", name[0]);
score[0] = scanner.nextInt();

System.out.printf("%s의 점수를 입력하시오. : ", name[1]);
score[1] = scanner.nextInt();

System.out.printf("%s의 점수를 입력하시오. : ", name[2]);
score[2] = scanner.nextInt();

System.out.printf("%s의 점수를 입력하시오. : ", name[3]);
score[3] = scanner.nextInt();

System.out.printf("%s의 점수를 입력하시오. : ", name[4]);
score[4] = scanner.nextInt();

System.out.printf("%s 점수 : \t%.2f\n", name[0], (double)score[0]);
System.out.printf("%s 점수 : \t%.2f\n", name[1], (double)score[1]);
System.out.printf("%s 점수 : \t%.2f\n", name[2], (double)score[2]);
System.out.printf("%s 점수 : \t%.2f\n", name[3], (double)score[3]);
System.out.printf("%s 점수 : \t%.2f\n", name[4], (double)score[4]);

double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
System.out.printf("-----------------------\n평 점 : \t%.2f", ave);

scanner.close();

```

# 8강\_배열과 메모리

## 8-1 : 배열의 메모리 크기

### 배열을 구성하는 데이터의 자료형에 따라서 배열의 메모리 크기가 결정된다.

```java

int[] arr = new int[3];

    1byte 1byte 1byte 1byte  1byte 1byte 1byte 1byte  1byte 1byte 1byte 1byte
    <--------------------->  <--------------------->  <--------------------->
         int형 : 4byte            int형 : 4byte             int형 : 4byte
    <----------------------------------------------------------------------->
                                  arr : 12byte

```

## 8-2 : 배열을 가리키는 배열이름

### 기본 자료형 데이터를 담고 있는 변수와 달리 배열 변수는 배열 데이터의 주소를 담고 있다.

```java

int i = 10;       10 = 변수 i

int [] i = new int[3]     i[]주소 -->  10    20    30
                           배열i      i[0]  i[1]  i[2]

```

## 8-3 : 배열 기본속성

### 기본 자료형 데이터를 담고 있는 변수와 달리 배열 변수는 배열 데이터의 주소를 담고 있다.

```java

// 배열 기본속성
int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
int[] arrAtt2 = null;
int[] arrAtt3 = null;

// 배열 길이
System.out.println("arrAtt1.length : " + arrAtt1.length);

// 배열 요소 출력
System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));

// 배열 요소 복사
arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));

// 배열 레퍼런스
arrAtt2 = arrAtt1;
System.out.println("arrAtt1 : " + arrAtt1);
System.out.println("arrAtt2 : " + arrAtt2);
System.out.println("arrAtt3 : " + arrAtt3);

```

## 8-4 : 다차원 배열

### 배열 안에 또 다른 배열이 존재한다.

```java

// 다차원 배열
int[][] arrMul = new int[3][2]; arrMul[0][0] = 10;
arrMul[0][1] = 100;
arrMul[1][0] = 20;
arrMul[1][1] = 200;
arrMul[2][0] = 30;
arrMul[2][1] = 300;

System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));
System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));

```

# 9강\_조건문

## 9-1 : 조건문이란?

### 조건의 결과에 따라서 양다 택일 또는 ㄷ다자 택일 진행한다.

```java
                  조건문
                  ↓  ↓
                ↓     ↓
               ↓       ↓
          양자택일       다자 택일
  (주로 if문이 쓰임)      (주로 switch문이 쓰임)

```

## 9-2 if문

### if(조건식), if(조건식) else, if(조건식) else if(조건식)

```java

int num1 = 10;
int num2 = 20;

// if(조건식)
if(num1 < num2) {
  System.out.println("num1는 num2보다 작다.");
}

System.out.println();

// if(조건식) else
if(num1 < num2) {
  System.out.println("num1는 num2보다 작다.");
} else {
  System.out.println("num1는 num2보다 크거나 같다.");
}

System.out.println();

// if(조건식) else if(조건식)
if(num1 < num2) {
System.out.println("num1는 num2보다 작다.");
} else if(num1 > num2){
  System.out.println("num1는 num2보다 크다.");
} else {
  System.out.println("num1과 num2는 같다.");
}

```

## 9-3 : switch문

### 비교대상이 되는 결과값과 선택사항이 많을 경우 주로 사용한다.

```java

// switch문
System.out.print("점수를 입력하세요. : ");
Scanner inputNum = new Scanner(System.in);
int score = inputNum.nextInt();

switch (score) {
case 100:
case 90:
  System.out.println("수");
break;

case 80:
  System.out.println("우");
break;

case 70:
  System.out.println("미");
break;

default:
  System.out.println("try again!!");
break;
}

inputNum.close();

```

# 10강\_ 반복문

## 10-1 : 반복문이란?

### 프로그램 진행을 특정 조건에 따라 반복적으로 진행하는 것이다.

```java

              for, while문 : 조건이 참일 때까지 반복 수행

                           [예1]
     구구단을 구하기 위해서 1에서부터 1씩 더하면서 9까지 곱셉 연산을 진행한다.

                           [예2]
     조도 센서를 센싱한 데이터가 10미만이면 건물의 LED를 1초 간격으로 계속 점등한다.

```

## _ 10-2 : for문_

### for(int i = 0; i < 10;i++) {...}

```java

for (int i = 1; i < 10; i++)
i가1부터10보다작을때까지i에 1씩 더해가며 프로그램 반복 진행

for (int i = 1; i < 10; i = i + 2)
i가1부터10보다작을때까지i에 2씩 더해가며 프로그램 반복 진행



// for문
System.out.print("INPUT NUMBER : ");
Scanner scanner = new Scanner(System.in);
int inputNum = scanner.nextInt();

for (int i = 1; i < 10; i++) {
  System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
}

```

## 10-3 : while문

### while(trur or false) {...}

```java

while(rNum < 10)
rNum이가 10보다 작을 때 까지 프로그램 반복 진행

// while문
System.out.print("INPUT NUMBER : ");
int num = scanner.nextInt();
int i = 1;
while (i < 10) {
  System.out.printf("%d * %d = %d\n", num, i, (num * i));
  i++;
}

```

## 10-4 : do ~ while문

### while문과 비슷하며, 차이점은 조건 결과에 상관없이 무조건 최초한번은 {...}의 프로그램을 수행한다.

```java

do{...}while(rNum < 10)
rNum이가 10보다 작을 때 까지 프로그램 반복 진행. 단, rNum의 조건에 상관없이 {...}의 프로그램 은 1번 수행한다.


// do ~ while문
do {
  System.out.println("무조건 1번은 실행합니다.");
} while (false);

```

# 11강\_ 객체 지향 프로그래밍이란?

## 11-1 : 객체란?

### 세강에 존재한는 모든 것을 끗하며, 프로그램에서 송성과 기능을 가진는 프로그램 단위이다.

```java

          객체(인간세걔)                     객체(프로그램)

      사람             체중계               날씨 프로그램
  속성:키,몸무게       속성 : 바늘, 눈금        속성 : 온도. 미세먼지
  기능:의사           기능 : 몸무게 측정       기능 : 날씨 예보

      자전거            승용차               시칙연산 프로그램
  속성 : 채널,사운드   속성 : 바퀴, 엔지       속성 : +, -, *, /
  기능 : 미디어 방출   기능 : 이동수단         기능 : 연산기능

```

## 11-2 : 클래스란?

### 객체를 생성하기 위한 틀로 모든 객체는 클래스로부터 생성된다.

```java

                  ㅣ→→→→→→→→→→그랜저
                  ㅣ      색상(검정), 바퀴(일반)
                  ㅣ      배기량(2000cc)
      그랜저 →→→→→→→ㅣ→→→→→→→→→→ 그랜저
  속성 : 색상, 바퀴   ㅣ       색상(흰색), 바퀴(광폭)
  기능 : 배기량      ㅣ        배기량(2500cc)
                  ㅣ→→→→→→→→→→→→→그랜저
                  ㅣ         색상(회색), 바퀴(일반)
                  ㅣ         배기량(3000cc)
                  ↓
                 복제

```

## 11-3 : 클래스 구성요소

### 클래스는 속성(맴버 변수)와 기능(메서드)로 구성 된다.

```java

        자전자

  속성(멤버 변수)
  안장, 챈들, 바구니, 기어 ,페달, 바퀴

  기능(메서드)
  기어 변속, 가속, 브레이크

```

# 12강\_클래스 제작관 객체 생성

## 12-1 : 클래스 제작

### 클래스는 멤버 변수(속성), 메서드 (기능), 생성다 등으로 구성돤다.

```java

package lec11Pjt001;

 public class Grandeur {  <-------------------------- 클래스 이름 : 일반적으로 첫글자는 대문자로 한다.

 public String color; ㅣ
 public String gear;  ㅣ  <--------------------------- 멤버 변수(속성)
 public int price;    ㅣ

 public Grandeur() {  <------------------------------ 생성자
  System.out.println("Grandeur constructor");
 }

 public void run() { <------------------------------- 메서드(기능)
  System.out.println("-- run --");
 }
 public void stop() { <------------------------------ 메서드(기능)
  System.out.println("-- stop --");
 }

}

```

## 12-2 : 객체 생성

### 클래스로 부터 'new'를 이용해서 객체를 생성 한다.

```java

Grandeur myCar1 = new Grandeur();
myCar1.color = "red";
myCar1.gear = "auto";
myCar1.price = 30000000;

myCar1.run();
myCar1.stop();
myCar1.info();

System.out.println();

Grandeur myCar2 = new Grandeur();
myCar2.color = "blue";
myCar2.gear = "manual";
myCar2.price = 25000000;

myCar2.run();
myCar2.stop();
myCar2.info();

```

```java

      myCar1 --> Grandeur
       주소         객체
      레퍼런스

      myCar2 --> Grandeur
       주소         객체
      레퍼런스

```

## 12-3 : 생성자

### 클래스에서 객체를 생성할 때 가장 먼저 호출된다.

```java

public class Bicycle {

String color;
int price;

public Bicycle() {  <------------------------------- 생성자
  System.out.println("Bicycle constructor - I");
}
자
public Bicycle(String c, int p) {  <---------------- 생성자
  System.out.println("Bicycle constructor - II");

  color = c;
  price = p;
  }

public void info() {
  System.out.println("-- info --");
  System.out.println("color : " + color);
  System.out.println("price : " + price);
  }

}

```

```java

Bicycle myBicycle1 = new Bicycle();
myBicycle1.info();

Bicycle myBicycle2 = new Bicycle("red", 100000);
myBicycle2.info();

```

---

# 13강\_메서드

## 13-1 : 메서드 선언과 호출

### 메서드도 변수와 같이 선언 및 정의 후 필요시에 호출해서 사용한다.

```java

 접근자        메서드 이름
   ↓   반환 형    ↓  메개변수
   ↓     ↓      ↓    ↓
------ ---- ------- --
public void getInfo () { <--------------------- 메서드 선언

  System.out.println(" i = " + i); ㅣ
  System.out.println(" b = " + b); ㅣ
  System.out.println(" d = " + d); ㅣ <-------- 메서드 정의
  System.out.println(" c = " + c); ㅣ
  System.out.println(" s = " + s); ㅣ

}

```

```java

ChildClass childClass = new ChildClass();
childClass.getInfo();

```

---

## 13-2 : 매개변수(parameter)

### 메서드를 호출할 때 데이터를 전달할 수 있다.

```java

public void getInfo() { <---------------------- 매개변수(parameter)는 필요시에만 정의된다.
                                                ↓
  ...                                           ↓
                                                ↓
}                                               ↓
                   ----------------------------------------------
public void setInfo(int i, boolean b, double d, char c, String s) {
                           ---------
  ...                         ↓
                              ↓
}                             ↓
                              ↓
        매개변수(parameter)는 자료형과 변수(지역변수)로 이루어진다.

```

## 13-3 : 중복 메서드(overloading)

### 이름은 같고, 매개변수의 개수 또는 타입이 다른 메서드를 만들 수 있다.

```java

public void getIngo() {
            ---------
  System.out.println("-- getInfo - I --");

}
public void getIngo(int x, int y) {
            ---------------------
  System.out.println("-- getInfo - II --");
  System.out.printf("parameter --> x : %d, y : %d\n", x, y);

}

public void getIngo(String s1, String s2) {
            -----------------------------
  System.out.println("-- getInfo - III --");
  System.out.printf("parameter --> s1 : %s, s2 : %s\n", s1, s2);
  
}

```

## 13-4 : 접근자

### 메서드를 호출할 때 접근자에 따라서 호출이 불가할 수 있다.

```java

         ㅣ----- X ----> privatr 메서드
         ㅣ            ------------
         ㅣ              ↓    ↑
메서드 --> ㅣ              O    O
         ㅣ              ↓    ↑
         ㅣ            ----------
         ㅣ----- O ----> pubic 메서드

```

# 14강_객체와 메모리

## 14-1 : 메모리에서 객체 생성(동적 생성)

### 객체는 메모리에서 동적으로 생성되며, 객체가 더 이상 필요 없게 되면 GC(Gabage Collector)에 의해서 제거된다.

---

## 14-2 : 레퍼런스(가리킨다)

### 생성한 객체의 주소를 변수에 저장하는 것을 레퍼런스라고 한다.

```java

ObjectClass obj1 = new ObjectClass();
ObjectClass obj2 = new ObjectClass();
ObjectClass obj3 = new ObjectClass();

System.out.println("obj1 ----> " + obj1);
System.out.println("obj2 ----> " + obj2);
System.out.println("obj3 ----> " + obj3);

```

## 14-3 : 자료형이 같아도 다른 객체

### 자료형이 같아도 다른 공간에 존재하는 객체는 다른 객체이다.

```java

ObjectClass obj1 = new ObjectClass();
ObjectClass obj2 = new ObjectClass();
ObjectClass obj3 = new ObjectClass();


if(obj1 == obj2) {
  System.out.println("obj1 == obj2");
} else {
  System.out.println("obj1 != obj2");
}

if(obj2 == obj3) { 
  System.out.println("obj2 == obj3");
} else {
  System.out.println("obj2 != obj3");
}

if(obj1 == obj3) { 
  System.out.println("obj1 == obj3");
} else {
  System.out.println("obj1 != obj3");
}

```

## 14-4 : null과 NullPointException

### 레퍼런스에 null 저장되면 객체의 연결이 끊기며, 더 이상 객체를 이용할 수 없다.

```java

System.out.println("obj1 ----> " + obj1);
obj1.getInfo();

obj1 = null;
System.out.println("obj1 ----> " + obj1);
obj1.getInfo();

```

---

# 15강_생성자와 소멸자 그리고 this 키워드

## 15-1 : 디폴트 생성자

### 객체가 생성될 때 가장 먼저 호출되는 생성자로, 만약 개발자가 명시하지 않아도 컴파일 시점에 자동 생성된다.

```java

ObjectEx obj1 = new ObjectEx();
            ↓
           호출
            ↓

디폴트 생성자
public ObjectEx() {

  System.out.println("Default constructor");

}

```

```java

ObjectEx obj1 = new ObjectEx();
            ↓
           호출
            ↓

디폴트 생성자가 없는 경우 컴파일러가 자동 생성
public ObjectEx() {

}

```

## 15-2 : 사용자 정의 생성자

### 디폴트 생성자 외에 특정 목적에 의해서 개발자가 만든 생성자로, 매개변수에 차이가 있다.

```java

ObjectEx obj2 = new ObjectEx(10);
            ↓
           호출
            ↓

사용자 정의 생성자
public ObjectEx(int i) {

  System.out.println("UserDefined constructor");
  num = i;

}

```

```java

int arr[] = {10, 20, 30};
ObjectEx obj3 = new ObjectEx("Java", arr);
            ↓
           호출
            ↓
사용자 정의 생성자
public ObjectEx(String s, int i[]) {

  System.out.println("UserDefined constructor");
  str = s;
  nums = i;

}

```

---

## 15-3 : 소멸자

### 객체가 GC에 의해서 메모리에서 제거 될 때 finalize() 메서드가 호출된다.

```java

 System.gc(); 를 사용한다고 해서 GC가 바로 작동하는 것 이 아니라,
 가급적 빨리 작동하도록 요청하는 것이다.

• java는 기본적으로 메모리를 개발자가 직접 관리하지 않으므 로 일반적으로 System.gc(); 를 사용하는 경우는 드물다.




// 소멸자
ObjectEx obj4;

obj4 = new ObjectEx();
obj4 = new ObjectEx(); 

System.gc();
ㅣ
ㅣ
ㅣ
ㅣ
ㅣ 
ㅣ    @Override
ㅣ -> protected void finalize() throws Throwable { 

      System.out.println(" -- finalize() method --"); 

      super.finalize();

     }

```

## 15-4 : this 키워드

### 현재 객체를 가리킬 때 this를 사용한다

```java

// this 키워드
int ints[] = {10, 20, 30};
ObjectEx obj5 = new ObjectEx(10, "Java", ints);



public ObjectEx(int i, String s, int is[]) {

  System.out.println("UserDefined constructor");

  this.num = i;
  this.str = s;
  this.nums = is;

}

```

# 16강_패키지와 static

## 16-1 : 패키지

### java 프로그램은 많은 클래스로 구성되고, 이러한 클래스를 폴더 형식으로 관리하는 것을 패키지라고 한다.

---

### 패키지이름결정요령

---

- 패키지이름은패키지에속해있는클래스가최대한다 른 클래스와 중복되는 것을 방지하도록 만든다.
- 패키지 이름은 일반적으로 도메인을 거꾸로 이용한다.
- 개발중에패키지의이름과구조는변경될수있다.
- 패키지이름만보고도해당패키지안에있는클래스가
  어떤속성과기능을가지고있는예상이될수있도록이 름을 만든다.

## 16-2 : import

### 다른 패키지에 있는 클래스를 사용하기 위해서는 import 키워드를 이용한다.

```java

 package com.java.main;

 import com.java.dailyJournal.DailyJournal; 
 import com.java.employee.Employee;
 import com.java.pay.Payment;
 import com.java.pay.fullTime.FullTime; 
 import com.java.util.Util;
 import com.java.welfare.Welfare;

public class MainClass {

  public static void main(String[] args) {

    DailyJournal dailyJournal = new DailyJournal(); 
    Employee employee = new Employee();
    Payment payment = new Payment();
    FullTime fullTime = new FullTime();
    com.java.pay.partTime.PartTime partTime = new com.java.pay.partTime.PartTime();
    Util util = new Util();
    Welfare welfare = new Welfare();

  }

}

```

---

## 16-3 : static

### 클래스의 속성과 메서드에 static 키워드를 사용하면 어디서나 속성과 메서드를 공유할 수 있다.

```java

  package com.java.employeeBank; 

  public class EmployeeBank {

    String name;
    static int amount = 0;

    public EmployeeBank(String name) { 
      this.name = name;
    }

    public void saveMoney(int money) {
      amount += money; 
      System.out.println("amount : " + amount);
    }

    public void spendMoney(int money) {
      amount -= money; 
      System.out.println("amount : " + amount);
    }

    public void getBankInfo() { 
      System.out.println("Employee name : " + this.name); 
      System.out.println("amount : " + amount);
    }

}

```

---


# 17강_데이터 은닉

## 17-1 : 멤버 변수의 private 설정

### 멤버 변수(속성)는 주로 private으로 설정해서, 외부로부터 데이터가 변질되는 것을 막는다.

```java

DATA ----O---> public 속성

DATA ----X---> private 속성

```


데이터(속성) 변질이 우려되는 시나리오
---
+ 직원 급여 프로그램에서, 급여 담당자가 실수로 급여액 을 잘못 입력하는 경우.
+ 변경될수없는사번이변경되는경우.

```java

package com.java.employee;

public class Employee {

  String name;  ㅣ
  String no;    ㅣ--------> 외부에서 쉽게 데이터를 변경할 수 있다.
  int pay;      ㅣ

public Employee(String name, String no, int pay) {
  this.name = name;
  this.no = no;
  this.pay = pay;
  }
} 

```

## 17-2 : setter, getter

### 멤버 변수를 외부에서 변경할 수 있도록 하는 메서드이다.

### MainClass

```java

import com.java.employee.Employee;

public class MainClass {

  public static void main(String[] args) {

    Employee employeePark = new Employee("박찬호", "2018-00001", 1000000);

    employeePark.getInfo();

    //employeePark.no = "2018-00002";
    //employeePark.pay = 900000;

    employeePark.setName("박병호");  // 1
    employeePark.setPay(900000);   // 2

    employeePark.getInfo();
  }
}

```

### Employee

```java

public void setName(String name) {                              ㅣ
  System.out.println(" -- The name can not be modified.-- ");   ㅣ
}                                                               ㅣ
                                                                ㅣ--------> 1
public void setNo(String no) {                                  ㅣ
System.out.println(" -- The no can not be modified.-- ");       ㅣ
}                                                               ㅣ
                                                                ㅣ
public void setPay(int pay) {                                                               ㅣ
  if(pay < 1000000) {                                                                       ㅣ
    System.out.println(" -- The salary can not be reduced to less than 1,000,000 won.-- "); ㅣ
  } else {                                                                                  ㅣ--> 2
    System.out.println(" -- The salary has been modified -- ");                             ㅣ
    this.pay = pay;                                                                         ㅣ
  }                                                                                         ㅣ
}                                                                                           ㅣ

```

---


# 18강_상속

## 18-1 : 상속이란?

### 부모 클래스를 상속받은 자식 클래스는 부모 클래스의 속성과 기능도 이용할 수 있다.

```java

     할아버지
      (집)
       ↑
      상속
       ↑
     아버지
   (집 + 자동차)
       ↑
      상속
       ↑
      아들 
(집 + 자동차 + 요트)

```

---

## 18-2 : 상속의 필요성

### 기존의 검증된 class를 이용해서 빠르고 쉽게 새로운 class를 만들 수 있다.

```java

     A음식점      모든 메뉴를 새롭게 만들어야 한다.
  (할아버지 운영)
       ↓
    비법 계승
       ↓
     B음식점      B음식점의 메뉴는 A음식점의 메뉴에 -----> ㅣ
   (아버지 운영)   새로운 몇 가지만 추가하면 된다.          ㅣ
       ↓                                          ㅣ ----> 검증된 메뉴를 이용해서 쉽고                                        ㅣ
    비법 계승                                       ㅣ        빠르게 개업할 수 있다.
       ↓                                          ㅣ
     C음식점      C음식점의 메뉴는 P음식점의 메뉴에 ----->  ㅣ
   (아들 운영)     새로운 몇 가지만 추가하면 된다.

```

---

## 18-3:상속구현

### extend 키워드를 이용해서 상속을 구현한다.

```java

package lec18Pjt001;

public class ParentClass {

  public ParentClass() {
    System.out.println("ParentClass constructor");
  } 
  public void parentFun() {
    System.out.println("-- parentFun() START -- ");
  }
}
                  ↑  
                 상속
                  ↑ 
package lec18Pjt001;

public class ChildClass extends ParentClass {
                        -------------------
  public ChildClass() { 
    System.out.println("ChildClass constructor");
  }

  public void childFun() {
    System.out.println("-- childFun() START -- ");
  } 
}

```

```java

ChildClass child = new ChildClass();

child.parentFun();
child.childFun();

```

---

## 18-4 : 부모 클래스의 private 접근자

### 자식 클래스는 부모 클래스의 모든 자원을 사용할 수 있지만, private 접근자의 속성과 메서드는 사용할 수 없다.

---

# 19강_Controller 객체 구현 - II

## 9-1 : @ModelAttribute

```java

@ModelAttribute를 이용하면 커멘드 객체의 이름을 변경할 수 있고, 이렇게 변경된 이름은 뷰에서 커멘드 객체를 참조할 때 사용된다.

컨트롤러

pubilc String memJoin(Member member)
↓
ID : ${member.memlb}

pubilc String memLogin(Member member)
↓
ID : ${member.memlb}

pubilc String memRemove(@ModelAttribute("mem") Member member)
↓
ID : ${mem.memld}

```

## 19-2 : 커맨드 객체 프로퍼티 데이터 타입

```java
데이터가 기초데이터 타입인 경우

memberJoin.html

ID : <input type="text" name="memId" >
PW : <input type="password" name="memPw" >
MAIL : <input type="text" name="memMail" >
AGE : <input type="text" name="memAge" size="4" value="0">
↓
Member.java

private String memId;
private String memPw;
private String memMail;
private int memAge;

```

---

## 19-2 : 커맨드 객체 프로퍼티 데이터 타입

```java
데이터가 중첩 커멘드 객체을 이용한 List 구조인 경우

memberJoin.html

PHONE1 : <input type="text" 
name="memPhones[0].memPhone1" size="5"> -
<input type="text" 
name="memPhones[0].memPhone2" size="5"> -
<input type="text" 
name="memPhones[0].memPhone3" size="5"> 
PHONE2 : <input type="text" 
name="memPhones[1].memPhone1" size="5"> -
<input type="text" 
name="memPhones[1].memPhone2" size="5"> -
<input type="text" 
name="memPhones[1].memPhone3" size="5">
↓
Member.java

private List<MemPhone> memPhones;

```

---

## 19-3 : Model & ModelAndView

```java
컨트롤러에서 뷰에 데이터를 전달하기 위해 사용되는 객체로 Model과 ModelAndView가 있다.두 객체의 차이점은 Model은 뷰에 데이터만을 전달하기 위한 객체이고, ModelAndView는 데이터와 뷰의 이름을 함께 전달하는 객체이다.

Model
@RequestMapping(value = "/memModify", method = RequestMethod.POST)
public String memModify(Model model, Member member) {

    Member[] members = service.memberModify(member);

    model.addAttribute("memBef", members[0]);
    model.addAttribute("memAft", members[1]);

   return "memModifyOk";

```

---

```java
Model 이용

@RequestMapping(value ="memModify", method = RequestMethid.POST)
public String memModify(Model model, Member member) {
    
    Member[] members = service.memberModify(member);

    model.addAttribute("memBef", members[0]); *
    model.addAttribute("memAft", members[1]); *

    return "memModifyOK"; **
}
```

```java
ModelAndView 이용

@RequestMapping(value ="memModify", method = RequestMethid.POST)
public String memModify(Model model, Member member) {
    
    Member[] members = service.memberModify(member);

    ModelAndView mav = ModelAndView();
    model.addAttribute("memBef", members[0]); *
    model.addAttribute("memAft", members[1]); *

    mav.setViewNama("memModifyOK"); **

    return mav;
}


* : 데이터 이름 & 데이터
** : 뷰이름

```

---

# 20강_내부 클래스와 익명 클래스

## 20-1 : 내부(inner) 클래스

### 클래스 안에 또 다른 클래스를 선언하는 것으로 이렇게 하면 두 클래스의 멤버에 쉽게 접근할 수 있다.

```java
public class MainClass {

public static void main(String[] args) {

  OuterClass oc = new OuterClass(); *
  System.out.println("oc.num : " + oc.num); 
  System.out.println("oc.str1 : " + oc.str1);

  System.out.println();

  // 멤버 inner 클래스
  OuterClass.InnerClass in = oc.new InnerClass(); **

  System.out.println("in.num : " + in.num); 
  System.out.println("in.str2 : " + in.str2);

  System.out.println();

  // static inner 클래스
  OuterClass.SInnerClass si = new OuterClass.SInnerClass(); ***
  System.out.println("si.num : " + si.num); 
  System.out.println("si.str3 : " + si.str3);

  System.out.println();
  } 
}
```

```java
public class OuterClass {
  int num = 10;
  String str1 = "java";
  static String str11 = "world"; 
  public OuterClass() {
   System.out.println("OuterClass constructor");
  }
  class InnerClass {
      int num = 100;
      String str2 = str1;

      public InnerClass() { 
      System.out.println("InnerClass constructor");
      }

  }    
  static class SInnerClass {

      int num = 1000;
      String str3 = str11;

      public SInnerClass() {
       System.out.println("static InnerClass constructor");
      }     
   }
}
```

## 20-2 : 익명(anonymous) 클래스

### 이름이 없는 클래스로 주로 메서드를 재정의 하는 목적으로 사용된다.

```java
package lec20Pjt001;

public class AnonymousClass {

  public AnonymousClass() { 
    System.out.println("AnonymousClass constructor");
  }

  public void method() {
    System.out.println(" -- AnonymousClass's method START -- ");
  } 

}

익명클래스는 인터페이스나 추상클래스에서 주로 이용된다.
```

```java
new AnonymousClass() {

  @Override
  public void method() {
    System.out.println(" -- AnonymousClass's Override method START -- ");
  };
}.method();
```

# 21강_인터페이스

## 21-1 : 인터페이스란?

```java
class -- 생성 --> 객체

-------------------------

interpace -- 생성 X -> 객페
   ↑
  구현
   ↑
 class -- 생성 --> 객체
```

## 21-2 : 인터페이스를 사용하는 이유

### 인터페이스를 사용하는 이유는 많지만, 가장 큰 이유는 객체가 다양한 자료형(타입)을 가질 수 있기 때문이다.

```java
         ㅣ->interpaceA
         ㅣ
         ㅣ->interpaceB
class -->ㅣ
         ㅣ->interpaceC
         ㅣ
         ㅣ->interpaceD
--------------------------------
public class ImplementClass implements InterfaceA, InterfaceB, InterfaceC, InterfaceD {
  public ImplementClass() {
    System.out.println("ImplementClass constructor"); 
  }
}
```

## 21-3 : 인터페이스 구현

### class 대신 interface 키워드를 사용하며, extend 대신 implements 키워드를 이용한다.

```java
public interface InterfaceA {  
  public void funA();
}

public interface InterfaceB {
  public void funB();
}

public interface InterfaceC {
  public void funC();
}

public interface InterfaceD {
  public void funD();
}

-----------------------------

public class ImplementClass implements InterfaceA, InterfaceB, InterfaceC, InterfaceD { 

  @Override
  public void funA() { System.out.println(" -- funA START --"); } 

  @Override
  public void funB() { System.out.println(" -- funB START --"); } 
  
  @Override
  public void funC() { System.out.println(" -- funC START --"); } 

  @Override
  public void funD() { System.out.println(" -- funD START --"); } 
  
}
```

## 21-4 : 장난감 인터페이스

### interface를 이용하면 객체가 다양한 자료형(타입)을 가길 수 있다.

```java
      ㅣ-> ToyRobot
Toy ->ㅣ
      ㅣ-> ToyAirplane

-----------------------

Toy robot = new ToyRobot();
Toy airplane = new ToyAirplane();

Toy toys[] = {robot, airplane};

for (int i = 0; i < toys.length; i++) {
  toys[i].walk();
  toys[i].run();
  toys[i].alarm();
  toys[i].light(); 

  System.out.println();
}
```

# 22강_추상클래스

## 22-1 추상클래스란?

### 클래스의 공통된 부분을 뽑아서 별도의 클래스(추상클래스)로 만들어 놓고, 이것을 상속해서 사용한다.

```java
abstract class
      ↑
     상속
      ↑
    class - 생성 -> 객체

---------------------------
abstract 클래스의 특징

• 멤버변수를 가진다.
• abstract 클래스를 상속하기 위해서는 extends 를 이용한다.
• abstract 메서드를 가지며, 상속한 클래스에서 반듯이 구현해야 한다.
• 일반메서드도가질수있다.
• 일반 클래스와 마찬가지로 생성자도 있다.
```

---

## 22-2 추상클래스 구현

### 클래스 상속과 마찬가지로 extends 키워드를 이용해서 상속하고 abstract(추상)메서드를 구현한다.

```java
public abstract class AbstractClassEx {

int num;
String str;

public AbstractClassEx() { 
System.out.println("AbstractClassEx constructor"); 
}

public AbstractClassEx(int i, String s) { 
System.out.println("AbstractClassEx constructor");

this.num = i; 
this.str = s; 
}

public void fun1() {
System.out.println(" -- fun1() START -- "); 
}

public abstract void fun2(); <-- 강제로 반듯이 구현하도록 함

}

--------------------------------------------
public class ClassEx extends AbstractClassEx {

public ClassEx() { 
System.out.println("ClassEx constructor"); 
}

public ClassEx(int i, String s) { 
super(i, s);
}

@Override 
public void fun2() {
System.out.println(" -- fun2() START -- ");  <-- 강제로 반듯이 구현하도록 함
}

}

-----------------------------------------
AbstractClassEx ex = new ClassEx(10, "java"); 
ex.fun1();
ex.fun2();
```

## 22-3 Bank 추상클래스

```java
abstract Bank 클래스
       ↑
      상속
       ↑
   MyBank 클래스

------------------
Bank myBank = new MyBank("박찬호", "123-4567-89012", 10000);
myBank.deposit();// 예금 
myBank.withdraw();// 출금 
myBank.installmentSavings();// 적금 
myBank.cancellation();// 해약

System.out.println(); 

myBank.getInfo();
```

## 22-4 인터페이스 vs 추상클래스

```java
     interface                         abstract class
                        공통점
                   추상 메서드를 가진다
          객체 생성이 불가하며 자료형(타입)으로 사용된다.

                        차이점
상수, 추상메서드만 가진다.           클래스가 가지는 모든 속성과 기능을 가진다.
추상 메서드를 구현만 하도록 한다.      추상 메서드 구현 및 상속의 기능을 가진다.
다형성을 지원한다.                  단일 상속만 지원한다.
 
```

# 23강_람다식

## 23-1 : 람다식이란?

### 익명 함수(anonymous function)를 이용해서 익명 객체를 생성하기 위한 식이다.

```java
 기존 방법: InterfaceType 변수 <- 할당(대입) -- Interface 구현
                                                ↓
랍다식 방법: InterfaceType 변수 <- 할당(대입) -- Lambda Expressions
```

## 23-2 : 람다식 구현

### 람다식은 기본적으로 함수를 만들어 사용한다고 생각하면 된다.

```java
// 매개변수와 실행문만으로 작성한다.(접근자, 반환형, return 키워드 생략)
LambdaInterface1 li1 = (String s1, String s2, String s3) ->
{ System.out.println(s1 + " " + s2 + " " + s3); };
li1.method("Hello", "java", "World");

System.out.println();

// 매개변수가 1개이거나 타입이 같을 때, 타입을 생략할 수 있다.
LambdaInterface2 li2 = (s1) -> { System.out.println(s1); };
li2.method("Hello");

// 실행문이 1개일 때, '{}'를 생략할 수 있다.
LambdaInterface2 li3 = (s1) -> System.out.println(s1); 
li3.method("Hello");

// 매개변수와 실행문이 1개일 때, '()'와 '{}'를 생략할 수 있다.
LambdaInterface2 li4 = s1 -> System.out.println(s1); 
li4.method("Hello");

// 매개변수가 없을때, '()'만 작성한다.
LambdaInterface3 li5 = () -> System.out.println("no parameter"); 
li5.method();
```

```java
// 반환값이 있는 경우
LambdaInterface4 li6 = (x, y) -> {
int result = x + y;
return result;
};
System.out.printf("li6.method(10, 20) : %d\n", li6.method(10, 20));

li6 = (x, y) -> {
int result = x * y;
return result;
};
System.out.printf("li6.method(10, 20) : %d\n", li6.method(10, 20));

li6 = (x, y) -> {
int result = x - y;
return result;
};
System.out.printf("li6.method(10, 20) : %d\n", li6.method(10, 20));
```

---

# 24강_문자열 클래스

## 24-1 String 객체와 메모리

### 문자열을 다루는 String 클래스(객체)는 데이터가 변화면 메모리상의 변화가 많아 속도가 느리다.

```java

String str = "JAVA";

 J A V A
 ↑
 ↑
 ↑
 str

------------------------
str = str + "_8"
 
 J A V A
 J A V A _ 8
 ↑
 ↑
 ↑
 str

문자열이 변경되면 기존의 객체를 버리고,
새로운 객체를 메모리에 생성한다.
이때, 기존 객체는 GC에 의해서 메모리 회수가 이루어진다.
```

---

## 24-2 StringBuffer, StringBuilder

### String 클래스의 단점을 보완한 클래스로 데이터가 변경되면 메모리에서 기존 객체를 재활용한다.

```java
StringBuffer sf = new StringBuffer(“JAVA");

 J A V A
 ↑
 ↑
 ↑
 str
--------------------------------------------------
sf.append(" _8");

 J A V A _ 8
 ↑
 ↑
 ↑
 str

• 문자열이 변경되면 기존의 객체를 재활용한다.
• 속도는 StringBuilder가 조금 더 빠르며,
  데이터 안정성은 StringBuffer가 조금 더 좋다.
```

---