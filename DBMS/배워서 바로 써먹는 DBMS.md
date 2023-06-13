# 1강 DBMS란?

## DB(DataBase)

- 데이터가 모여있는 기지.
- 추상적인 용어.

## DBMS(DateBase Management System)

- 데이터를 관리할 수 있는 구체적인 시스템.
- 오라클, 마리아DB, MySQL, MS-SQL, Mongo,...

# 2강 오라클 DBMS 계정 설정

## 오라클 DBMS 버전

- i : internet
- g : grid
- c : cloud

---

## 계정

    sys : 모든 권한
    system : 계정 관리
    일반 계정 해당 스키마 괸리(hr, op, he, scott,...)

## CMD

```
Sqlplus sys as sysdba
(비번)

SQL> alter user system identified by (비번);

SQL> conn system/(비번);

SQL>alter user hr account unlock:

SQL>alter user hr identified by hr;

SOL> conn hr/hr
```

---

## 스키마

- 정리가 잘 되어 있는 표들의 묶음, 상태

---

## RDBMS(관계형 데이터베이스 시스템)

- 테이블끼리 서로 관계를 맺는다.

---

# 3강 통합개발 환경 IDE DBeaver 설치

## IDE(통합 개발 환경)

```
DBeaver IDE 설치

    dbeaver 검색 후 Download링크 클릭 > 페이지 하단에 있는 archive 링크 클릭
    > 5.2.5 클릭 > dbeaver-ce-5.2.5-win 32.win32.x86 64.zip 링크 클릭
```

## SQL(인터프리터 언어), 쿼리문

- 한 줄 씩 번역되고 빈번한 수정이 있을 때 효율적이다.
- 전체를 실행하지 않고 부분만 실행하고 싶을 때에도 편리한 언어이다.
- 일괄처리를 할 때에는 컴파일 언어보다 효율이 떨어진다.

DBMS의 소통방식

```
----------------------------------
              사용자
----------------------------------
   ↕︎            ↕︎            ↕︎
고객 관리         ↕︎         주문 관리
응용 프로그램      ↕︎        응용 프로그램
   ↕︎            ↕︎            ↕︎
----------------------------------
              DBMS
----------------------------------
```

# 4강 IDE DBeaver와 Oracle DBMS 연동

```
 DBMS의 소통방식
----------------------------------
              사용자
----------------------------------
   ↕︎            ↕︎            ↕︎
고객 관리         ↕︎         주문 관리
응용 프로그램      ↕︎        응용 프로그램
   ↕︎            ↕︎            ↕︎
----------------------------------
              DBMS
  (고객 아이디, 고객명, 연락처, 주소) 공유
      주문번호, 제품명, 수량
----------------------------------
```

## Table A

```
번호.   이름.    나이
1      한동석.   20
2.     루이스.   21
3.     마카롱.   22
```

```DBMS
SELECT * FROM EMPLOYEHR.JOBSES ;

```

# 5강 테이블과 제약조건

## RDMBS(관계형 데이터베이스 관리 시스템)

```
Table A (USER)            Table B(ORDER)
번호(PK)   이름.  나이. 아이디(UK)   구매번호.(PK)   번호(FK)    날짜.              상품
1.   한동석.  20      dfg1234    2023050501.     1.     2023050501.        공기청정기
2.   마키.    20     fjd1234    2023050502      3      2023050501.        4K 모니터
3.   쿠로미   22      fdp1234    2023050503.     4.     2023050501.         목도리
4.  시나모롤   22     thd1234    2023050504.     4.     2023050501.         빨래집게
```

- 이러한 구조를 가지는 것을 Table, Relation(오라클) class라고 부른다.

## COLUMN(열, 속성, 필드)

      공통된 값들의 주제

## ROW(행, 레코드, 튜플)

       하나의 정보

## Primary key

      1. 고유한 값(가 행의 구분점으로 사용된다).
      2. 중복이 없고 NULL값을 허용하지 않는다.
      * NULL : 아직 어떤 값을 넣을 지 모르겠다라는  뜻을 가진 값.

## Foreign Key

     다른 테이블의 PK를 의미한다.
     보통 테이블끼리 관계를 맺을 때 사용된다.
     중복이 가능하다.
     *위의 표 참고
     Table A 에 없는 값을 Table B의 FK 컬럼에 사용할 수 없다.

## Unique Key

    NULL은 허용하지만 중복을 허용하지 않는 Key

# 6강 DDL과 자료형

## SQL문

    DDL(Data Definition Laguage) : 데이터 정의언어
    - 테이블 조작, 제어 관련 쿼리문

    1.CREATE : 테이블 생성
    2.DROP : 테이블 삭제
    3.ALTER : 테이블 수정
            - 테이블명 수정 : RENAME TO [새로운 테이블명]
            - 컬럼 추가 : ADD ([새로운 컬럼명][컬럼 타입])
            - 컬러명 변경 : RENAME COLUMN[생성된 컬럼명] OT [t새로운 컬럼명]
            - 컬럼 삭제 : DROP COLUMN [생성된 컬럼명]
    4.TRUNCATE : 테이블 내용 전체 삭제

## 자료형(TYPE)

    숫자
      NUMBER(precision) : 정수
      NUMBER(precision, 소수덤 자리수) : 실수
      NUMBER : 생략 시 22byte까지 입력 가능(38자리 정수)
    문자열
      CHAR(길이) 고정형
          CHAR(4)에 'A'를 넣으면 A^^^ 빈 자리가 공백으로 채워짐
          형식을 정한 날짜, 주민등록번호처럼 글자 수가 절대 변하지 않는 값을 넣는다.

      VARCHAR(길이),VARCHAR2(길이) : 가변형
          값의 길이만큼 공간이 배정된다. 글자 수에 변화가 있는 값을 넣는다.

      DATE : FORMAT에 맞춰서 날짜를 저장하는 타입

```DBMS
CREATE TABLE TBL_MRMBR(
  NAME VARCHAR2(500),
  AGE NUMBER
);
```

# 7강 DDL과 제약조건1

```DBMS
-- TBL_MEMBER 삭제
DROP TABLE TBL_MEMBER;

-- 해당 영역 전체화면 : 클릭 후 CTRL + M
-- 주석 : 해석하지 못하게 하는 문법
--1. 쿼리문에 설명글을 달 때
--2. 지금당장 사용하지 않는 소스코드를 해석하고 싶지 않을 때

--자동차 테이블 생성
--제약 조건 : 테이블을 생성할 때 특정 컬럼에 조건을 부여하여 들어오는 데이터 검

CREATE TABLE TBL_CAR(
   ID NUMBER,
   BRANW VARCHAR2(100),
   COLOR VARCHAR2(100),
   PRICE NUMBER,
   CONSTRAINT CAR_PK PRIMARY KEY(ID)
);

DROP TABLE TBL_CAR;

--제약 조건 삭제
ALTER TABLE TBL_CAR DROP CONSTRAINT CAR_PK;

--제약 조건 추가
ALTER TABLE TBL_CAR ADD CONSTRAINT CAR_PK PRIMARY KEY(ID);

SELECT * FROM TBL_CAR;
----------------------------------------------------------
-- 동물 테이블 생
CREATE TABLE  TBL_ANKIMAL(
 ID NUMBER PRIMARY KEY,
 "TYPE" VARCHAR2(100),
 AGE NUMBER(3),
 FEED VARCHAR2(100)
);

SELECT * FROM TBL_ANIMAL;
```

# 8강 DDL과 제약조건2, 무결성

```
무결성
   데이터의 정확성, 일관성, 유지성이 유지되는 것.

   정확성
     데이터는 애매하지 않아야 한다.

   일관성
     각 사용자가 일관된 데이터를 볼 수 있도록 해야한다.

  유효성
     데이터가 실제 존재하는 데이터여야 한다.

1. 개체 무결성
     모든 테이블이 PK로 선택된 컬럼을 가져야 한다.
     PK로 선택된 컬럼은 고유한 값을 가져야 하며, 빈 값, NULL값은 허용하지 않는다.

2.참조 무결성
   두 테이블의 데이블의 테이더가 항상 일관된 값을 가지도록 유지하는 것.

3.도메인 무졀성
  컬럼의 타입, NULL값의 허용 등에 대한 사항을 정의하고
  올바른 데이터가 입력 되었는 지를 확인하는 것

```

```DBMS
--제악 조건 DELETE와 CHECK
--학생 테이블 생성

CREATE TABLE TBL_STUDENT(
ID NUMBER,
NAME VARCHAR2(100),
MAJOR VARCHAR2(100),
GENDER CHAR(1) DEFAULT 'W' NOT NULL CONSTRAINT BAN_CHAR CHECK(GENDER IN('M', 'W')),
BIRTH DATE CONSTRAINT BAN_DATE CHECK(BIRTH >= TO_DATE('1980-01-01', 'YYYY-MM-DD')),
CONSTRAINT STD_PK PRIMARY KEY(ID)
);

INSERT INTO TBL_STUDENT
(ID, NAME, MAJOR, GENDER, BIRTH)
VALUES(1, '루이스', '컴퓨터공하과', 'M' , TO_DATE('2000-05-05' , 'YYYY-MM-DD'));

SELECT * FROM TBL_STUDENT;

INSERT INTO TBL_STUDENT
(ID, NAME, MAJOR, BIRTH)
VALUES(2, '쿠로미', '전자공학과', TO_DATE('2000-05-05' , 'YYYY-MM-DD'));

TRUNCATE TABLE TBL_STUDENT;
```

# 9강 모델링 이론 - 회원, 상품, 주문

```
모델링(기획)
 추상적인 주제를 DB에 맞게 설계하는 것

1. 요구사항 분석
    화원, 주문, 상품 : 3가지를 관리하고자 한다.

2. 개념적 설계(개념 모델링)

     회원      주문         상품
------------------------------------
     ID      주문번호     상품번호
------------------------------------
     PW.     주문일       상품명
     이름.    ID         가격
     주소     상품번호      재고량
     이메일
     생일

3. 논리적 설계(논리 모델링)

     회원      주문         상품          결제정보
------------------------------------------------
     ID(PK)  주문번호(PK)  상품번호(PK).   계좌번호(PK)
                                       은행명(PK)
------------------------------------------------
     PW      주문일       상품명           예금주
     이름     ID(FK)      가격            CVC
     주소     상품번호(FK)  재고량
     이메일   계좌번호(FK)
     생일


4.물리적 설계(물리 모델링)

     USER
     USER_ID : VARCHAR2(100)
     ---------------------------
     USER_PW : VARCHAR2(100)
     USER_NAME : VARCHAR2(200)
     USER_ADDRESS : VARCHAR2(300)
     USER_EMAIL : VARCHAR2(300)
     USER_BIRTH : DATE

     PRODUCT
     PRODUCT_NUM : NUMBER
     ---------------------------
     PRODUCT_NAME : VARCHAR2(300)
     PRODUCT_PRICE : NUMBER
     PRODUCT_COUNT : NUMBER

     ORDER
     ORDER_NUM : NUMBER
     ---------------------------
     ORDER_DATE : DATE
     USER_ID : VARCHAR2(100)
     PRODUCT_NUM : NUMBER

5. 구현
----------------------
1. 요구사황
      꽃 테이블과 화분
      꽃을 구매할 때 화분도 같이 구매한다.
      꽃은 이름과 색깔, 가격이 있고
      화분은 제품 번호, 색깔이, 모양, 꽃이름이 있다.
```
