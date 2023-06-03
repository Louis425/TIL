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