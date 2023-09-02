<!-- TOC -->

- [1강\_JAVA 프로그래밍이란?](#1강-java-프로그래밍이란)
- [2강\_JAVA 프로그램의 실행 구조](#2강_java-프로그램의-실행-구조)
- [3강\_변수](#3강_변수)
- [4강\_기본자료형](#4강_기본자로형)
- [5강\_특수분자와 서식문자](#5강_특수-문와-서식-문자)
- [6강\_연산자](#6강_연산자)
- [7강\_배열](#7강_배열)
- [8강\_배열관 메모리]()
- [9강\_조간문]()
- [10강\_반복문]()
- [11강\_객체지향 프로그래밍이란]()
- [12강\_클래스 제작과 객체 생성]()
- [13강\_메서드]()
- [14강\_객체와 메모리]()
- [15강\_생성자와 소멸자 그리고 this키워드]()
- [16강\_패키지 static]()
- [17강\_데이터 은닉]()
- [18강\_상속]()

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
