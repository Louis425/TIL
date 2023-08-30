<!-- TOC -->

- [1강\_웹 프로그램 개요](#1강_웹-프로그램-개요)

<!-- /TOC -->

# 1강\_웹 프로그램 개요

## 1-1 : 웹 프로그램 이란?

```java

 ↔ ↕ = 네트워크

           인터넷 서비스

     컴퓨터  ↔  컴퓨터  ↔  컴퓨터
       ↕        ↕        ↕
     컴퓨터  ↔  컴퓨터  ↔  컴퓨터
       ↕        ↕        ↕
     컴퓨터  ↔  컴퓨터  ↔  컴퓨터
       ↕        ↕        ↕
     컴퓨터  ↔  컴퓨터  ↔  컴퓨터
       ↕        ↕        ↕
     컴퓨터  ↔  컴퓨터  ↔  컴퓨터

```

```java

     사용자
    (브라우저)
       ↓
       ↓  ← Request
       ↓
   Web Server
       ↓
       ↓  ← Response
       ↓
     사용자
    (브라우저)

  웹 프로그램이란, 인터넷 서비스를 이용해서 서로 다른
  구성요소를(PC 등) 이 통신할 수 있는 프로그램이다.

```

## 1-2 : 프로토콜(Protocol)과 IP

```java

                  Request
                    ↓
 인터넷 객체  →→→→ㅣ→→→→→→→→→→→→→→→→→→→→ㅣ
               ㅣ                    ㅣ
               ㅣ                    ㅣ
               ㅣ                    ㅣ→→→→→→ Web Server
               ㅣ  Response          ㅣ
               ㅣ   ↓                ㅣ
 인터넷 객체  →→→→ㅣ→→→→→→→→→→→→→→→→→→→→ㅣ
               ↓
              통신
               ↓
       프로토콜(Protocol)
       동신을 하기위한 규약으로 HTTP, FTP, SMTP, POP 등이 있다.

```

```java

             DNS
              ↓
   컴퓨터 →→→→→→ㅣ
              ㅣ               Web Server
   컴퓨터 →→→→→→ㅣ →→→→→ IP   →→→ㅣ 프로그램1
              ㅣ               ㅣ 프로그램2
   컴퓨터 →→→→→→ㅣ               ㅣ 프로그램3

        인터넷 서비스 구분    port
            ↓              ↓
     http://www.google.com:80/index.html
       ↑            ↑   ↑         ↑  ↑
    Protocol        도메인          경로

```

## 1-3 : 웹 프로그램의 동장 원리

```java

                    HTML(파일)
                    Request                query
                    →→→→→→        일        →→→→→→
User(browser)                 Web Server            DataBase
                    ←←←←←←        ↓        ←←←←←←
                    Response      ↓        result
                    HTML(파일)     ↓
                                  ↓
                         HTML     ↓  Container
                        정적 데이터  |  동적 데이터

```
