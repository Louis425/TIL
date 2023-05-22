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
