<!-- TOC -->

- [1강\_JAVA 프로그래밍이란?](#1강-java-프로그래밍이란)
- [2강\_JAVA 프로그램의 실행 구조](#2강_java-프로그램의-실행-구조)
- [3강\_변수](#3강_변수)
- [4강\_기본자료형](#4강_기본자로형)
- [5강\_특수분자와 서식문자]()
- [6강\_연산자]()
- [7강\_배열]()
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
