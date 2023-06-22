# 2023년 5월 20일
```java

package com.helloworld.java;

public class HelloWorld {

	public static void main(String[] args) {

//  java란?

//	객체 지향적이다 

//	처음에는 가전재품 내에 탑제해 동작하는 프로그렘 이였다

//		참조형 주소 매모리 주소 저장 

//	jvm을 설치할 수 있는 시스템에서는 어디서나 사용할수있다 

//	매소드
//	특정한 작을 수행라는 코드의 묶음 

//	변수 
//	데이터를 담아주는 상자 
//	사영하기 전, 반즈시 미리 선언해야 한다.->컴하일러에게 어떤 변수를 사용하겠다고 미리 알리는 것

// -------------------------------------------------------------------------

		int value = 9;

		System.out.println("Hello World");

		System.out.printf("Hollo World %d", value);

// -------------------------------------------------------------------------

//		리터널 
//		문자형 리터럴 

//		자료형 
//		기본 자료형 
//		정수 실수 논리형 문자형 

//		참조형 

//	    부동소점형 
//		대부분 double 사용

//		문자형
//		char 는 하나의 문자 르 사용한다

//		리터널
//		소스 코드의 고정된 값을 나타내는 표기법

//		정수형 리너털 
//		정수형 리터널른 부호 있는 int 형으로 저장되는 것이 기본

//		부동소수저명 리터널

//		형상관리 
//		svn, git

//		깃 장점
//       비공게 온로드 가능
//		3명까지 팀 가능 

//		내일 수업 연산자 

//		자바 장점: 객체 지향적
//	처음에는 가전재품 내에 탑제해 동작하는 프로그렘 이였다
//		참조형 주소 매모리 주소 저장 

//		jvm을 설치할 수 있는 시스템에서는 어디서나 사용할수있다 

//      주석

		//

		/*    */

		/*
		 * 상세한 코드들을 적을데 사용
		 * 
		 * 
		 * 
		 */

	}

}
// -------------------------------------------------------------------------
```

# 2023년 5얼 21일 연산자

```java
package com.ldg.seconprojrct.day_2;

public class OperaratorTest {
	
	public static void main(String[] args) {

// -------------------------------------------------------------------------
		
		int velue = 100;            // sum --> value 변수에 10을가한
		int sum = velue + 300;      //sum % 13
		int  restValue = sum % 13;
		
// -------------------------------------------------------------------------
		
		System.out.println("velue is -> " + velue);
		System.out.println("sum is -> " + sum);
		System.out.println(" restValue is " + restValue) ;
		
// -------------------------------------------------------------------------
    
		int num = 10;
		num += 1;
//		num - num  + 1;
		System.out.println ("unm is==>" + num);
		
		int testVeluel1 = 1;
//		++testVeluel1 ;
		int testVeluel2 = 1 ;
//		testVeluel2++;
		
		System.out.println("testVeluel1==>" + (++testVeluel1));

		System.out.println("testVeluel2==>" + (testVeluel2++));
		System.out.println("testVeluel2==>" + (testVeluel2++));
		
	}

// -------------------------------------------------------------------------

}

// -------------------------------------------------------------------------
```


```java
package com.ldg.seconprojrct.day_2;

public class CompairisinOprator {

	public static void main(String[] args) {
		
// -------------------------------------------------------------------------

		int compareValue1 = 3;
		
		int compareValue2 = 4;
		

// -------------------------------------------------------------------------

		System.out.println((compareValue1 == compareValue2));
		
		System.out.println((compareValue1 != compareValue2));
		
		System.out.println((compareValue1 > compareValue2));
		
		System.out.println((compareValue1 < compareValue2));
		
		System.out.println((compareValue1 <= compareValue2));
		
		System.out.println((compareValue1 >= compareValue2));
		
	}
	
}
// -------------------------------------------------------------------------
```
```java
package com.ldg.seconprojrct.day_2;

public class LogicalOpreator {
	
	public static void main(String[] args) {

// -------------------------------------------------------------------------

		 
        int compareValue1 = 3;
		
		int compareValue2 = 4;
		
		System.out.println(
				(compareValue1 == 3) && (compareValue2 == 7) 
				);
		
		System.out.println((compareValue1 == 3) || (compareValue2 == 7) );
		
		System.out.println(!(compareValue1 == 3));
		
		double value = compareValue2;
		
		System.out.println(value);
		
	}
// -------------------------------------------------------------------------
```
```java
package com.ldg.seconprojrct.day_2;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {

// -------------------------------------------------------------------------
		
	   Scanner input = new Scanner(System.in);
	   
	   int firdtInput;
	   int seconrInput;
	   
	   System.out.println("첫 반째 숫자를 입력하세요 :");
	   
	   firdtInput = input.nextInt();
		
		System.out.println("두 번쨰 숫자를 입력하세요 :");
		
		seconrInput = input.nextInt();
		System.out.println("입역받은 값은 " + firdtInput + ", " + seconrInput +" 입니다." );
		
// -------------------------------------------------------------------------

		
	}

}
// -------------------------------------------------------------------------
```

```java
package com.ldg.seconprojrct.day_2;

public class TypeConversion {
	public static void main(String[] args) {

		int value = 129;
		
		byte value1 = (byte) value;

		System.out.println(value1);

	}
}
// -------------------------------------------------------------------------
```

```java
package com.ldg.seconprojrct.day_2;

import java.util.Scanner;

public class DayTest {
	
	public static void main(String[] args) {
		
// -------------------------------------------------------------------------

//		int value1  = 2;
//		
//		int value2 = 2;
//		
//		System.out.println( value2 * value1 );
//		
// -------------------------------------------------------------------------
		 Scanner input = new Scanner(System.in);

		   int firdtInput;
		   int seconrInput;
		   
		    System.out.println("사각형의 가로 넓이를 입력하세요 :");
		   
		    firdtInput = input.nextInt();
			
			System.out.println("사각형의 세로 넓이를 입력하세요 :");
			
			seconrInput = input.nextInt();
			System.out.println("사각형의 넓이값은 " + ( firdtInput * seconrInput) + "입니다. ");
			
//			"문자열" + 저장값 + "문자열"
			
// -------------------------------------------------------------------------

	}
	
}
// -------------------------------------------------------------------------
```

```java
package com.ldg.seconprojrct.day_2;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		int valur1 = 3;
		
		int valur2 = 4;
		
//      삼항연산자 

//		(조건) ? '참에 대한 결과물 (코드)' : '거짓에 대한 결과물 (코드)' 
		
		System.out.println(( valur1 > valur2) ? "valur1 이 valur2 보다 큽니다 " : "valur1 이 velur2 보다 작습니다.");
		
		
	}

}
// -------------------------------------------------------------------------
```

# 2023년 6월 3일

## 조건문.

* 조건에 따라 여러 개의. 실행 경로 가운데 하나를 선택해야 하는 경우 사용 되는 문장

* If ~ else 문

* Switch 문

* 삼항 연산자

```java
package com.LDG.KoreaJavaBasicProjec;

public class ConditionTest {

	public static void main(String[] args) {

// -------------------------------------------------------------------------

		boolean isGoodWeather = true;

		if (isGoodWeather) {
			// 해당 조건문이 true 일 떄, 수행하는 동작을 작성
			System.out.println("날씨가 좋은니까 나갑니다.");
			
		} else {
			// 해당 조건무이 false 일 떄, 수행하는 동작을 작성
			System.out.println("날씨가 안좋으니까 집에 있을겁니다. ");
		}

		/**
		 * 우리가 파악하고자 하는 조건을 다음과 같다. 
		 * 1. 학생은 시험을 치르고 성적을 받는다. 
		 * 2. 성적에 따라서 학점을 부여한다. 
		 * 2.1 90점
		 * 이상은 A 2.2 그 외는 F
		 * 
		 * v1
		 */
		
		
		
		/**
		 * 우리가 파악하고자 하는 조건을 다음과 같다. 
		 * 1. 학생은 시험을 치르고 성적을 받는다. 
		 * 2. 성적에 따라서 학점을 부여한다. 
		 * 2.1 90점 이상은 A (srore >= 90)
		 * 2.2 80점 이상은 B (90 > srore >= 80)
		 * 2.3 70점 이상은 C (70 > srore >= 60)
		 * 2,4 그 외 F 
		 * 
		 * v2
		 */
		
		// 의문사향
				// 1. 과연 조건이 이게 전부일까?
				// 2. 이게 최선일가?
				//ex) 시험을 수학만 치를까?
				//ex) 다른 시럼을 쳤을데? 수학점수와 다른 과목의 점수에 따라서 다른 점수체계를 부여 할 수 있지 않을까?
				//ex) 우리는 수학시점을 치르고 점수도 받고, 학점도 받았습니다.
				//ex) 그런데 선생님이 국어시험도 치자고 합니다.
				//ex) 국어시험의 결과로 성적도 받고 학점도 부여 받을 예졍입니다.
		
				//제약사항 - 국어성적의 학점은 수학성적에 영향을 받습니다.
		        //       - 수학성적이 90점 이상이면서 국어성적이 90 이상 
                //	학생, 시험, 성적, 학정, A, B, C, F,

		String studentName = "LDG"; // 학생이름

		String IicenseName = "수학시험"; // 시험명

		int mathscore = 90; // 학생의 성적 (점수)

		int koreamscore = 90; // 국어성적 
		
		String GradesA = "A"; // 학점 A
		String GradesB = "B"; // 학점 B
		String GradesC = "C"; // 학점 C
		String GradesF = "F"; // 학점 F

//		== 같은지 비교
//		!= 같지 않은지
		
		
		// 제약사항 - 국어성적의 학점은 수학성적에 영향을 받습니다.
		//        - 수학성적이 90점 이상이면서 국어성적이 90점 이상이면 합격입니다.
		
		if (mathscore >= 90 && koreamscore >= 90) {
			System.out.println(studentName + "는 합격입니다! ");
		}
		
		if (mathscore >= 90) {
			// 성적이 90점 이상일 때,
			// 학생은 A 학생을 부여받는다.

			
			System.out.println(studentName + "은 " + IicenseName + "에서 학점 " + GradesA + "를 받았습니다.");
			
			if(koreamscore >= 90) {
				
				System.out.println(studentName + "는 합격입니다! ");
				
		} else if (mathscore >= 80){
			// 성적이 80점 이상일 때,
			// 학생은 B 학생을 부여받는다.
			
			System.out.println(studentName + "은 " + IicenseName + "에서 학점 " + GradesB + "를 받았습니다.");
			}
		}else if (mathscore >= 70){
			// 성적이 70점 이상일 때,
			// 학생은 C 학생을 부여받는다.

			System.out.println(studentName + "은 " + IicenseName + "에서 학점 " + GradesC + "를 받았습니다.");

		}else
			// 성적이 70점 이상일 때,
			// 학생은 F 학생을 부여받는다.
			
			System.out.println(studentName + "은 " + IicenseName + "에서 학점 " + GradesF + "를 받았습니다.");
			
			
//		System.out.println(score >= 90 ? studentName + "은 " + IicenseName + "에서 학점 " + GradesA + "를 받았습니다."
//				: studentName + "은 " + IicenseName + "에서 학점 " + GradesF + "를 받았습니다.");
		
	}

}
// -------------------------------------------------------------------------
```

```java
package com.LDG.KoreaJavaBasicProjec;

import java.beans.Customizer;

public class SwitchTest {
	
	public static void main(String[] args) {
		
//		상황 - 우리는 쇼핑몰을 운여하고 있습나다.
//		    - 고객에게 쿠폰을 지금하려고 합니다
//		    - 일반고객은 10원 쿠폰을 줍니다.
//		    - VIP는 100원 쿠폰릉 줍니다.
//		    - VVIP 1,000원 쿠폰을 줍니다
//		    
//		    쇼핑몰의 고객은 다음과 같습니다.
		
//		    1. 일반고겍
//		    1.1 일반고겍은 회원가입만 한 고겍입니다.                     (deprecated)
//		    2. VIP 
//		    2.1 는 회원가입을 했고, 100,000원 이상을 구매한 고겍입니다.    (deprecated)
//		    3. VVIP
//		    3.1 vvip은 회원가을 헸고, 1,000,000원 이상 구매한 고겍입니다. (deprecated)
//		    
		   String customer = "일반고객"; // 고객
		   
		   switch (customer) {
		case "일반고객":
			// 해당 조건일 수행할 코드를 입력 
			System.out.println("일반고객 입니다.");
			break;
		case "vip":
			// 해당 조건일 수행할 코드를 입력 
			System.out.println("VIP 입니다.");
			break;
		case "vvip":
			// 해당 조건일 수행할 코드를 입력 
			System.out.println("VVIP 입니다.");
			break;
		default:
			// 해당 조건일 수행할 코드를 입력 
			System.out.println("예외 입니다.");
			break;
		}
		
		if (customer == "일반고객") {
			System.out.println("일반고객 입니다.");
		} else if (customer == "VIP"){
			System.out.println("VIP 입니다.");
		} else if (customer == "VVIP"){
			System.out.println("VVIP 입니다.");
		} else 
			System.out.println("예외 입니다.");
		}
		
	}
// -------------------------------------------------------------------------
```

```java
package com.LDG.KoreaJavaBasicProjec;

import java.util.Scanner;

public class DayTest {
	public static void main(String[] args) {
		/**
		 * 
		상황.

		1.학생 성적을 입력 받습니다.
		1.1 수학 성적을 입력한다.
		1.2 국어 성적을 입력한다
		1.3 영어성적을 입력한다.

		2. 각 과목별 성적에 따라서 다음의 학점을 부여한다.

		2.1 90점 이상은 A 학점입니다.
		2.1 80점 이상은 B 학점입니다.
		2.1 70점 이상은 C 학점입니다.
		2.1 60점 이상은 F 학점입니다.

		3. 각 과목별 평균에 따라서 합격 / 불합격 여부를 판단합니다.

		3.1 평균이 80점 이상은 합격입니다.
		3.2 그외는 불합격 입니다.
		
		*/

		Scanner input = new Scanner(System.in);

		int A;
		int B;
		int C;

		System.out.println("수학 성적을 입력하세요 :");

		A = input.nextInt();

		System.out.println("국어 성적을 입력하세요 :");

		B = input.nextInt();

		System.out.println("영어 성적을 입력하세요 :");

		C = input.nextInt();

		if (A >= 90) {
			System.out.println(" 수학 성적 A입니다 ");

		} else if (A >= 80) {
			System.out.println(" 수학 성적 B입니다 ");

		} else if (A >= 70) {
			System.out.println(" 수학 성적 C입니다 ");

		} else
			System.out.println("수학 성적 F입니다 ");
		
		if (B >= 90) {
			System.out.println(" 국어 성적 A입니다 ");

		} else if (B >= 80) {
			System.out.println(" 국어 성적 B입니다 ");

		} else if (B >= 70) {
			System.out.println(" 국어 성적 C입니다 ");

		} else
			System.out.println(" 국어 성적 F입니다 ");
		
		if (C >= 90) {
			System.out.println(" 영어 성적 A입니다 ");

		} else if (C >= 80) {
			System.out.println(" 영어 성적 B입니다 ");

		} else if (C >= 70) {
			System.out.println(" 영어 성적 C입니다 ");

		} else
			System.out.println(" 영어 성적 F입니다 ");
		
		if( A == B == C >= 80) {
			System.out.println("합격입니다");
		}else if(A == B == C >= 70)
		System.out.println("불합격입니다");

	    switch ( A ) {
		case 100 : 
		case 90 : 
			System.out.println(" 수학 성적 A입니다 ");
			break;
		case 80 : 
			System.out.println(" 수학 성적 B입니다 ");
			break;
		case 70 : 
			System.out.println(" 수학 성적 C입니다 ");
			break;
		case 60 : 
			System.out.println(" 수학 성적 F입니다 ");
			break;

	    }
	    switch ( B ) {
		case 100 : 
		case 90 : 
			System.out.println(" 국어 성적 A입니다 ");
			break;
		case 80 : 
			System.out.println(" 국어 성적 B입니다 ");
			break;
		case 70 : 
			System.out.println(" 수학 국어 C입니다 ");
			break;
		case 60 : 
			System.out.println(" 수학 국어 F입니다 ");
			break;

	    }
	    switch ( C ) {
		case 100 : 
		case 90 : 
			System.out.println(" 영어 성적 A입니다 ");
			break;
		case 80 : 
			System.out.println(" 영어 성적 B입니다 ");
			break;
		case 70 : 
			System.out.println(" 영어 성적 C입니다 ");
			break;
		case 60 : 
			System.out.println(" 영어 성적 F입니다 ");
			break;

	    }
	    if( A == B == C >= 80) {
			System.out.println("합격입니다");
		}else if(A == B == C >= 70)
		System.out.println("불합격입니다");

	}
}
// -------------------------------------------------------------------------
```

# 2023/6/4

## 제약사황 - 비기능 요구사항

공통사항 다수의 사용자가 공통괸 내용을 확인할 수 있어야 한다.

```
자바 스프링프레임워크
          ↓
        서버
          ↓
     통신방법 - HTTP(REST API), TCP, UDP, 블루투스….
          ↓
    클라이언트
```
# 반복문

## 1. while 문

어떤 조건을 정해놓고 반복을 하는구조.

```java
package com.LDG.KoreaJavaBasicProjec.day_4;

public class LoopTest {

	public static void main(String[] args) {

//	i 변수가 10 미만일때, 문자열을,출력하는 동작을 작성하고자 한다.

//	  필요사항
//	1. 변수 : i
//	2. 조건 : i < 10
//  3. 동작 : 문자열 출

//	완전함 문장 연습

//		(정이)
		int i = 0;
//		(실현)
		while (i < 10) {
			System.out.println("i -> " + i);
			i++;
		}
		System.out.println("끝났습니다. i -> " + i);
	}

}
//-------------------------------------------------------------------------
```

## 1. do while 문

반복 조건을 루프의 끝나

```java
package com.LDG.KoreaJavaBasicProjec.day_4;

public class LoopTest {

	public static void main(String[] args) {
		
		int j = 13;
		
		do {
			System.out.println("j -> " + j);
			j++;
		} while (j  < 10);
		System.out.println("끝났습니다. j -> " + j);
		
		
		
		
	}
	
}
//-------------------------------------------------------------------------
```

## 2. for문

정해진 횟수만큼 반복할 때 사용하는 반복 구조

```java
package com.LDG.KoreaJavaBasicProjec.day_4;

public class ForLoopExample {
	public static void main(String[] args) {

//		int j = 0;
//		while (j < 10) {
//			j++;
//		}
//		중간로 안에있는데 바이다

		for (int i = 0; i < 10; i++) {
			System.out.println("i -> " + i);
		}

//		Q. for 문 밖에서 int i 를 사용하면 어떻게 될까요?
//		개념 - 지역변수

	}

//	void test( ) {
//		System.out.println(args);
//	}
}
// -------------------------------------------------------------------------
```

반복문의 중첩

반복문은 중첩괴어 사용할수 있다
```java
package com.LDG.KoreaJavaBasicProjec.day_4;

public class NestedLoop {

	public static void main(String[] args) {
//		********** 1
//		********** 2
//		********** 3
//		********** 4
//		********** 5
//		********** 6
//		********** 7
//		********** 8
//		********** 9
//		********** 10

//		제약상황
//		1.가로축 x
//		2.세로축 Y

		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
// -------------------------------------------------------------------------
```
```java
package com.LDG.KoreaJavaBasicProjec.day_4;

public class LoopPractice {
//		함수(메소드)

//	메서드의 구조
//	반환형 메소드명(매개변수) {
//	바디
//	}

//	메서드 -> 함수

	static void makeSpuare() {
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		makeSpuare();
	}

}
// -------------------------------------------------------------------------
```

```java
package com.LDG.KoreaJavaBasicProjec.day_4;

public class MestedLoopTest {

	static void makeSquare(int width, int height) {
		System.out.println("사각형을 만듭니다.");
		System.out.println("사각형의 가로 길이 : " + width);
		System.out.println("사각형의 새로 길이 : " + height);
	}

	static void makeSquare() {
	System.out.println("삼각형을 만듭니다.");
	}

	public static void main(String[] args) {
		makeSquare(10, 20);
	}
	
}
// -------------------------------------------------------------------------
```

#  생각을 구체화 하는 방범
  - 표현방법의 입장에서는 
  - 완전한 문장으로 기술한다.
  - 누나 / 무엇을 / 언제 / 어디서 / 어떻게 / 왜?


- ‘누구’ 의 관점에서 기술하는지가 중요합니다.
  * 사용자 입장에서 동작이 어떤 의미를 가지는지
   * 어떤 결과를 보여줘야 하는지

## <예시>

/고객/은 아픕니다.

아파서 /약/을 사먹어야 합니다.

고객은 어떤 약을 먹을지 몰라서 “약을 처방”받고 싶습니다.

/의사/는 고객의 질병을 확인하고 맞는약을 처방합니다.

의사는 처방에 앞서 고객이 “기존에 복용하고 있는 약이 있는지 확인”합니다.

의사는 고객이 복용 중인 약을 확인하고, 적절한 약을 처방합니다.

----------------

# 2022년 6월 10일

주제 : 여러분들에게 무한도전이란?

```
학생 A - 가족들과 함께 재밌는 시간을 보내는 용도
학생 B - 별로 흥미가 없어서 이거 크게….
학생 C - 심심하면 그냥 스윽 보는거…
학생 D - 그냥 나한테는 알기만 아는 유명한 방송…
학생 E -  토요일 저녁을 책임져준 소중한 존재.
```

페르소나 (Persona)

회원가입

```
1. 로그인을 하기 위한 용도
2. 귀찮지만 꼭 해야하는 것
3. 가상의 자기 이름(?) 정보 같은 것?
```

- 정리 : 사용자가 서비스를 이용하기 위해서 본인의 정보를 입력하는 것 입니다.

우리가 사용할 서비스는 ‘배달의 민족’ 입니다
‘배달의 민족’을 사용하는 사용자는 누가 있습니까?

```
1. 가게주인 - 동종 업계의 매출정보, 주문정보, 배달원 정보,….etc
2. 배달원 - 배달품목의 종류, 배송지, 픽업지,…etc
3. 고객 - 가게 정보, 가격, 배달 시간,…etc
```

페르소나를 고려하는 이유

```
1. 내가 개발하고자 하는 서비스를 ‘누가’ 사용하는지에 따라서 개발의 목적성이 달라집니다.
```

분석하는 방법, 그리고 분석하는 방법을 훈령하는 방법을 알아보겠습니다.

관심이 있는 사람 (나와 일면식이 없습니다.) 에게 친해지는 법

```
1. 말을 걸어야한다
2. 날씨?
3. 소통?
4. 공감대 형성

* 인스타 아이 물어보기
```
상대장의 정보가 필요합니다.
```
- 관심, 관찰 -> 상대방의 정보 생깁니다. -> 대화의 소재
```
무엇을 ‘개발’할지 -> 연결되는 부분

- 관찰
- 관찰한 내용을 완전한 문장으로 표현한다.
```
친해지고 싶은 사람이 있습니다.
친해지고 싶은 사람이 게임을 하고 있습니다.
친해지고 싶은 사람이 무슨 게임을 하는지?
친해지고 싶은 사람이 언제 게임을 하는지?
```
유저스토리

요약
```
1. 사용자 관점에서 ‘목적’을 정의하고 완전한 문장으로 표현한다.
```


- 소프트웨어 공학의 모든 것

요구 분석

자바 강의

2주차 : 배열

배열이란?

If. 학생 10명이 있고 이들의 성적의 평균을 계산한다.
```
1. 학생 10명의 점수를 변수에 저장
2. 편군값 계산
```
1.배열
```
 * 여러 개의 변수를 하나로 붂어 넣은 것
도일한 타입의 데이터를여러 개 저장할 수 있는 저장 장소
```

배열의 선언과 사용
```
배열의 자료형 / 배열의 이름 / 배열의 크기
```

고급배열

무명배열
```
 + 배열의 이름을 지정하지 않고 단순히  초기값만으로 생성한 배열
```

ArrayList
```
실행 도중에 배열의 크기를 변경할 수 있는 동적 배열
```

페르소나

페르소나(사용자)를 기준으로 ‘목적’을 설정하고 완전한 문장으로 표현한다.

```
분석을 하는 방법 -> 어떻게 할까요?
```
```
1. 관찰 -> 사용자를 기준으로 사용다가 무엇을 하려고 하는지?
 
언재 하려고 하는지?
어디서 하려고 하는지?
 (육하원칙)
```

```java
package com.LDG.KoreaJavaBasicProjec.day_5;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {

//	    를 선런하고 생
		ArrayList<String> list = new ArrayList<>();

//		 에 겂을 넣는 방
		list.add("자바");
		list.add("바");
		list.add("자");
		list.add("자바");

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list{" + i + "]" + list.get(i));
		}

//	liet 의 값을 지우기
		list.remove(0);

		System.out.println("지운 후");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list{" + i + "]" + list.get(i));
		}
		list.set(0, "다른 값");

		System.out.println("수정 후");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list{" + i + "]" + list.get(i));

//		

		}

	}
}
// -------------------------------------------------------------------------
```

```java

package com.LDG.KoreaJavaBasicProjec.day_5;

public class ArrayTest {

	public static void main(String[] args) {
//		1. 배열을 선언
//		int[] array = new int[10];

//		
//		
//		인덱스는 0 에서부터 시작합니다.
//		array[0] = 10;
//		
//	    System.out.println(array[0]);
//		
//		
//		
//		for (int i = 0; i < array.length; i++) {
//			array[i] = i;
//		}
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("array[" + i + "[ -> + " + array[i]);
//		}
//		
//		
//		Q. 인덱스의 범위를 벗어난 배열의 사용은 어떻게 될까?
//		System.out.println(array[10]);
//		
//		
//		
//		 Q. 배열을 선언함과 동시에 배열을 정의는 할 수 없을까?
//		
//		전재조건 : 배열의 크기를 지정해야 사용할 수 있다.
//		int[] scores = {10, 20, 30, 40 };
//		for (int i = 0; i < scores.length; i++) {
//		System.out.println("scores[" + i + "] -> " + scores[i] );
//		}
//		
//	}
//	
//	메서드의 구조
//	(접근권한) 반환형 메서드명(매개변수){
//	메서드가 수행할 내용
//}

//	학생 10명의 성적을 입력 받아서, 평균을 구해보겠습니다.
//	무영배열 사용하는 예시를 보고싶습니다.
//	System.out.println(
//			getAverage(
//					new int[] {1,2,3,4}
//					)
//			);
//	
//	
//	public static double getAverage(int[] scores) {
//		double average = 0;

//		int형 배열로 전달받은 성적으로 평균을 구해야 합니다.
//		평균은 어떻게 구할까요?
//		학생이 10명의 성적을 입력받아서 그 합을 구하고, 학생수로 나누면 편균이 됩니다.
//		그리고 그 값을 반환한다.

//		1. 학생 10명의 성적을 모두 더한다.
//		int total = 0;
//		
//		for( int i = 0; i < scores.length; i++) {
//		total += scores[i];
//		
//		
//		for (int score : scores) {
//			total += score;
//		}
//		
//		2.더한 값을 학생수로 나눠서 평균값을 구한다.
//		average = total / scores.length;
//		
//		return average;
	}

}
// -------------------------------------------------------------------------
```
```java
package com.LDG.KoreaJavaBasicProjec.day_5;

public class ArrayTest1 {
	public static void main(String[] args) {
//	Call By Value
		int value = 10;
		int copvValue = value;

		copvValue = 200;

		System.out.println(value);
		System.out.println(copvValue);

//	
//	
//	int[] list = {1,2,3,4};
//	int[] copylists = list;
//	
//	
//	System.out.println("list 출력");
//	for (int data : list) {
//		System.out.println(data);
//	}
//	System.out.println("copylists출력");
//  for(int data : copylists) {
//	  System.out.println(data);
//  }
//	

	}

}
// -------------------------------------------------------------------------
```

# 2023/6/17

자바 강의

1 접근 제어 

접근 제어 
 * 클래스의 멤버에 접근하는 것을 제어하는 것
 * 클래스 내부에 선언된변수 중에서 민감한 정보를능 클래스 내부에서만 사용하도록 할 필요가 있다.

2 접근 제어 지정자

public
protected
없음
private


정규표햔식

```java
package com.LDG.KoreaJavaBasicProjec.day_7;

public class GetterSetterTest {

	private String name;
	private int scoreKorean;
	private int scoreEnglish;
	private int scoreMath;

	public double getAverage();

	{
		double average = (scoreKorean + scoreMath + scoreEnglish) / 3;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScoreKorean() {
		return scoreKorean;
	}

	public void setScoreKorean(int scoreKorean) {
		this.scoreKorean = scoreKorean;
	}

	public int getScoreEnglish() {
		return scoreEnglish;
	}

	public void setScoreEnglish(int scoreEnglish) {
		this.scoreEnglish = scoreEnglish;
	}

	public int getScoreMath() {
		return scoreMath;
	}

	public void setScoreMath(int scoreMath) {
		this.scoreMath = scoreMath;
	}

	@Override
	public String toString() {
		return "GetterSetterTest [name=" + name + ", scoreKorean=" + scoreKorean + ", scoreEnglish=" + scoreEnglish
				+ ", scoreMath=" + scoreMath + "]";
	}

}

```

```java
package com.LDG.KoreaJavaBasicProjec.day_7;

public class DayTest {
	
	
	public static void main(String[] args) {
//		ClassInquiry

		ClassInquiry classInquiry = new ClassInquiry();
		
//		classInquiry.personNumber = 100;
//		classInquiry.acconutNumber =100;
		
//		classInquiry.setPersonNumber(100); // setter 호출
		
		
		
//		callpersonNumber(classInquiry);
		
//		System.out.println(classInquiry.getPersonNumber()); // getter 호
		
//		classInquiry.readAcconutNumber();
		
		
		
//	}
//	static void callpersonNumber(ClassInquiry classInquiry) {
//		classInquiry.personNumber = 1000;
//	}
	
	
		
		
//		getAverage
		
		
//	평균을 구하는 메서드
	static void getAverage() {
	   
	   // 클래스로 인스턴를 생성
	   // 아직은 setter 호출X
		GetterSetterTest getterSetterTest = new GetterSetterTest();
		getterSetterTest.setScoreKorean(100);
		getterSetterTest.setScoreEnglish(90);
		getterSetterTest.setScoreMath(50);
		
	}

}
```

```java
package com.LDG.KoreaJavaBasicProjec.day_7;

public class ClassInquiry {
//	필드
	public int personNumber;     // 주민등록번 -> 이 형식 아니면?
	public int acconutNumber;   // 계좌번호       //private 접근권한은 해당 클래스의 내부에서만 유효하게 사용이 사능하다.
	public Strin name;         // 이름
	public String email;       // 이메일 
	



//	public int getPersonNumber() { // 접근자 (getter)
//		return personNumber;
//	}
//
//
//
//	public void setPersonNumber(int personNumber) { // 설정자 (setter)
//	if (주민등록번호가 맞으면) {     //정규
//		this.personNumber = personNumber;
//	}else
//		 System.err.println("잘못된 입력입니다");
//		
//	}



//
//
//	public void readAcconutNumber() {
//		acconutNumber = 1000;
//		System.out.println("call readAcconutNumber() -> " + acconutNumber) ;
//	}
	
}
```

```java

package com.LDG.FakeDiabio;

public class Character {

	private String nickname;
	private int strength;
	private int dexterity;
	private int spirit;
	private int intelligence;
	private int power;
	private int defncr;
	private int hp;

	
//	생성자의 특징
//	1. 메서드명이 클래스명과 동일하다.
//	2. 반환형 자체가 없다.
	public Character() {   // 기본 생성자
		super();
		// TODO Auto-generated constructor stub
	}
	
//          메서드 
	public Character(String nickname, int strength, int dexterity) {    //생성자
	super();
	this.nickname = nickname;
	this.strength = strength;
	this.dexterity = dexterity;
	
	
	System.out.println(nickname + "이(가) 생성되었습니다.");
	System.out.println("힘은 " + this.strength);
	System.out.println("민첩은 " + this.dexterity);
}


	private void useItem(String itemName) {
		System.out.println(nickname + "이(가)" + itemName + "을(를) 사용했습니다.");
	}

	public void useItem(String itemName, int count) {
		System.out.println(nickname + "이(가)" + itemName + "을(를)" + count + "개 사용했습니다." );
	}
	
	
	@Override
	public String toString() {
		return "Character [nickname=" + nickname + ", strength=" + strength + ", dexterity=" + dexterity + ", spirit="
				+ spirit + ", intelligence=" + intelligence + ", power=" + power + ", defncr=" + defncr + ", hp=" + hp
				+ "]";
	}
	
	
	

}

```

```java
package com.LDG.FakeDiabio;

public class Character {

	private String nickname;
	private int strength;
	private int dexterity;
	private int spirit;
	private int intelligence;
	private int power;
	private int defncr;
	private int hp;

	
//	생성자의 특징
//	1. 메서드명이 클래스명과 동일하다.
//	2. 반환형 자체가 없다.
	public Character() {   // 기본 생성자
		super();
		// TODO Auto-generated constructor stub
	}
	
//          메서드 
	public Character(String nickname, int strength, int dexterity) {    //생성자
	super();
	this.nickname = nickname;
	this.strength = strength;
	this.dexterity = dexterity;
	
	
	System.out.println(nickname + "이(가) 생성되었습니다.");
	System.out.println("힘은 " + this.strength);
	System.out.println("민첩은 " + this.dexterity);
}


	private void useItem(String itemName) {
		System.out.println(nickname + "이(가)" + itemName + "을(를) 사용했습니다.");
	}

	public void useItem(String itemName, int count) {
		System.out.println(nickname + "이(가)" + itemName + "을(를)" + count + "개 사용했습니다." );
	}
	
	
	@Override
	public String toString() {
		return "Character [nickname=" + nickname + ", strength=" + strength + ", dexterity=" + dexterity + ", spirit="
				+ spirit + ", intelligence=" + intelligence + ", power=" + power + ", defncr=" + defncr + ", hp=" + hp
				+ "]";
	}
	
	
	

}
```

```java
package com.LDG.FakeDiabio;

public class DiabloTest {

	public static void main(String[] args) {
		Character charactr1 = new Character(); // 여기까지는 선언
//		                             생성자
		
		System.out.println(charactr1.toString());
		
		Character character2 = new Character("LDG", 1, 4);
		
		System.out.println(character2.toString());
		
		
		
		
		
	}

}
```

```
클래스                클래스
CladdInquiry       DayTest

1, 클래스를 사용하는 방법
  1.1 인스턴스를 생성해서 사용하는 방범(ㅇ)
           'new'
  1.2 클래스 자체를 그냥 호출하는 방범 
```

## 접근자와 설정자

1. 접근자
   필드값을 반환
2. 설정자 
 필드값을 설정
 3. 접근자와 설정자 의 사용 이유
 * 접근자와 설정자를 사용해야만 나중에 클래스를 업그레이드 할 때 편한다.
 * 설정자에서 매개 변수를 통하여 잘못된 값이 넘오는 경우, 이름 사전에 차단할 수 있다.
 * 필요한 태마다 필드값을 계산하여 반환할 수 있다.
 * 접근자만을 제공하며 자동적으로 잆기만 가능한 필드를 만들 수 있다.

## 생성자

1. 생성자
 * 객체가 생성될 때 객체를 초기화하는 특수한 메소드
  클래스 이름과 동일한 메소드가 바로 생성자
  리턴 타입 X






  # 2023/6/18
   생성자
    this -> 해당 인스턴를 가리킵니다

	메서드로 캑체 전달 및 반환 
	 자바레서 인수   메개 변수 로 값이 전달 되는 방법은 기본적으로 call-by-value
	 call-by-value -> 값에 의한 전달 -> 실제 값을 복사해서 준다.
	 (primitive 기본 자료형)
	 call-by-value -> 참조헤 의한 전달 -> 실제 값이 위피한 주소값을 전달 -> 값을수정하게 되면 다른 참조 변수의 값에 연양이 생긴다

	 1. 객페가 전달되는 겨우
	 참조변수의 경. 참조값이 복사되어 서 매개변수로 전달.

	 게층 레이어를 구분 합니다.

	 MVC 패턴

	 Model

	 Controller = 서버
	     
	 View

정적 멤버

정적 멤버는 하나의 내용을 여러 곳에서 공통으로 사용하고 싶은 때,
-> 미리 만들어 놓고 여러 곳에서 접근이 가능하다.

java -> Compile ->  Byte Code -> 한줄한줄 읽어서 실행.

1. 정적 멤버
 모든 객체를 통틀어서 하나만 생성되고 모든 객체가 이것을 공유
 
* static 멤버는 static 멤버끼리만 호출 가능하다 -> static 으로 정의된 메서드의 경우

1. 주의사항
 객체가 생성되지 않은 상태에서 호출되는 메서드이로 객체 안에서만 존제하는 인스터스
 변수들은 사영할 수 없다. 정적 변와 지역 변수만을 사용할 수 있다.

2. 상수
 + static, final 수식어를 공유한다

 상수, Convention 전부 태문자, 두 개 이상의 단어 조합일때, _로 구분

## 숙제

1942
1. 게임플에이 화면을 시청
2. '사용자' 입장에서 게임을 플레이 하는 동안의 일련의 '모든' 과정을 순차적으로 기술한다.
3. 꼼꼼이,

제출 기한 : 6월 25일 오후6시 까지
재출 양식 : 이메일
이메일 재목 코리아IT_과제_게임분석

## 상속1
1. 상속
 + 기존에 존재하는 클래스로부터 코드와 데이터를 이어받고 자식이 필요한 기능을 추가하는 기법
 + 부모클래스 , 자식클래스
 + 'extends'
 
 무엇이 상속이 되는가?
   부모 클래스의 필드
   부모 클래스의 메소드

## 왜 상속이 필요한다?
 + 유지보수 증가
 + 코드 재사용성이 증가
 + 중복 코드 제거
 + *다중상속은 허용하지 않느다!*

 상속과 접근 제어

 상속관걔애서는 상속시킬 멤버와 상속시키지 않을 멤버를 지장할 수 있다.
 자식클래스는 부모 클래스의 public멤버,    를 상속받음
 부모클래스의 privare 멤버는 상속되지 않습니다
 
 ```java
package com.LDG.KoreaJavaBasicProjec.day_8;

public class SedanTest {

	public static void main(String[] args) {
		Sedan sedan = new Sedan();	
	      sedan.setCerNumber("90나 1234");
	      
	      System.out.println(sedan.getCerNumber());
	
	}
	
}
```

```java
package com.LDG.KoreaJavaBasicProjec.day_8;

public class Sedan extends Car{ // 세단도 자동차 입니다.
	// 상속을 받았기 때문에
	// 부모의 필드와 메서드를 이어받을 수 있습니다.
	// Q, car 클래스를 상속받지 않고 구현한다면?
	// 자동차도 자동차인데, 세단도 자동차 아닙니까?
	// 세단은 자동차랑 똑같은 속성과 동작을 가지는데?
	
	

	private String wing;

	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}
	
	

}

```

```java
package com.LDG.KoreaJavaBasicProjec.day_8;

public class Car {
	private String cerNumber;
	private int MaxSpeed;
	public String getCerNumber() {
		return cerNumber;
	}
	public void setCerNumber(String cerNumber) {
		this.cerNumber = cerNumber;
	}
	public int getMaxSpeed() {
		return MaxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		MaxSpeed = maxSpeed;
	}
	

}
```


