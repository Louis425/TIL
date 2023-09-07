<!-- TOC -->

- [1강\_웹 프로그램 개요](#1강_웹-프로그램-개요)
- [2강\_개발 환경 설정](#2강_개발-환경-설정)
- [3강\_JSP 맛보기](#3강_jsp-맛보기)
- [4강\_Servlet 맛보기](#4강_servlet-맛보기)
- [5강\_Servlet 맵핑](#5강_servlet-맵핑)
- []()
- []()
- []()
- []()
- []()
- []()
- []()
- []()
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

# 2강\_개발 환경 설정

## 2-1 : JDK

### JDK(Java Development Kit) 설치

- https://www.oracle.com/kr/java/technologies/downloads/

## 2-2 Path 설정

### javac.exe, java.exe를 다른 디렉토리에서도 실행할 수 있도록 하기 위해 환경 변수(Path)에 bin 경로를 등록 한다.

## 2-3 : 이클립스 다운로드

### IDE(Integrated Development Environment : 통합개발환경) 설치 - eclipse

- https://www.eclipse.org/downloads/

## 2-4 : 웹 컨테이너(ApacheTomcat 8.5) 설치

- http://tomcat.apache.org/

# 3강\_JSP 맛보기

## 3-1 : 웹 컨테이너 구조

```java

                                      웹 컨테이너(tomcat)
                        <------------------------------------------->
xxx.jsp --> request --> xxx_jspjava --> xxx_jsp.class --> xxx_jsp.obj --> response --> HTML

```

## 3-2 : JSP 파일 작성

### 파일 생성

> Project Explorer 박스 안 우클릭
>
> > New
>
> > > Dynamic Web Project
>
> > > > Project name :
>
> > > > lec03pjt001
>
> > > > > Finish

---

### JSP 만들기

> lec03Pjt001 우클릭
>
> > New
>
> > > JSP File
>
> > > > WebContent 파일선택
>
> > > > hello.jsp.jsp
>
> > > > > Finish

---

### JSP 작성

```java
<%@ page language="java" contentType="text/html; charset=EUC-KR"
pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>Hello JSP</title>
  </head>

  <body>
   Hello JSP~ </br>
   안녕 Java Server Page~
  </body>
</html>

```

---

### JSP 실행

> hello.Jsp.jsp
>
> > Rnu As
>
> > Run on Server
>
> > > Tomcat v8.5 Sever at localhost
>
> > > Finish

## : java 파일 확인

```

  C:\jsp\download\apache-tomcat-8.5.24\work\Catalina\localhost\lec03Pjt001\org\apache\jsp

  xxx.jsp --> xxx_jsp.java --> xxx_jsp.class


```

# 4강\_Servlet 맛보기

## 4-1 : 웹 컨테이너 구조

```java

                                      웹 컨테이너(tomcat)
                        <------------------------------------------->
Browser --> request --> xxx.java --> xxx.class --> xxx.obj --> response --> Browser

```

## 4-2 : Servlet 파일 작성

### 파일 생성

> Project Explorer 박스 안 우클릭
>
> > New
>
> > > Dynamic Web Project
>
> > > > Project name :
>
> > > > lec04pjt001
>
> > > > > Next > 2X
>
> > > > > > Context: lec04Pjt001
>
> > > > > > Content directory: WebContent
>
> > > > > > ✅ Generate web.xml deployment descriptor
>
> > > > > > Finish

---

### Servlet 만들기

> src 우클릭
>
> > New
>
> > > Servlet
>
> > > > java package: com.servlet
>
> > > > Class name: HelloServlet
>
> > > > Superclass: javax.servlet.HttpServlet
>
> > > > > Next >
>
> > > > > > /HelloServlet 수정 --> /Hello
>
> > > > > > Next
>
> > > > > > > Finish

---

### Servlet 작성

```java

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out = response.getWriter();
out.print("<html>");
out.print("<head>");
out.print("</head>");
out.print("<body>");
out.print("Hello Servlet~");
out.print("</body>");
out.print("</html>");

}

```

## 4-3: class 파일 확인

```java

       C:\jsp\pjt\lec04Pjt001\build\classes\com\servlet

              browser --> xxx.java --> xxx.class

```

# 10_JSP request, response

## 10-1 : request 객체

```java

                                                             <%
<form action="mSignUp.jsp" method="get">                       m_name = request.getParameter("m_name");
                                                               m_pass = request.getParameter("m_pass");
user data                                      Request         m_gender = request.getParameter("m_gender");
                                              --------->       m_hobby = request.getParameterValues("m_hobby");
  <input type="submit" value="sign up">                        m_residence = request.getParameter("m_residence");
</form>                                                      %>

                Request       웹 서버
      user     --------->      jsp

```

## 5강\_Servlet 맵핑

### 5-1 : Servlet 맵핑이란?

```java

                        Request                웹 컨테이너(tomcat)
                      서블릿 구분 필요     <----------------------------->
          Browse -->    ----↓---->      servlet servlet servlet servlet
                            ↓
                      서블릿 구분 방법
                            ↓
                            ↓
   full path : http://localhost:8090/lec05Pjt001/servlet/com.servlet.ServletEx <-- 보안 취약, 복잡한 URL
                                     <---------> <--------------------------->
                                          ↓       ↓
                                     <---------> <>
mapping path : http://localhost:8090/lec05Pjt001/SE <-- 간결한 URL

```

## 5-2 : web.xml 파일을 이용한 맵핑

```java

web.xml  --> 배치 지시자(deployment descriptior)

<servlet>
  <servlet-name>servletEx</servlet-name> ----------------->ㅣ
  <servlet-class>com.servlet.ServletEx</servlet-class>     ㅣ
</servlet>                                                 ㅣ
<servlet-mapping>                                          ㅣ
  <servlet-name>servletEx</servlet-name> ----------------->ㅣ
  <url-pattern>/SE</url-pattern> ------------------------->ㅣ
</servlet-mapping>                                         ㅣ
                                                           ↓
                                              http://localhost:8090/lec05Pjt001/SE

```

## 5-3 : Java Annotation을 이용한 맵핑

```java

ㅣ----> @WebServlet("/Hello")
ㅣ      public class ServletEx extends HttpServlet {
ㅣ
ㅣ      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
ㅣ
ㅣ      PrintWriter out = response.getWriter();
ㅣ        out.print("<html>");
ㅣ        out.print("<head><title>ServletEX</title></head>");
ㅣ        out.print("<body>");
ㅣ        out.print("Hello Servlet~");
ㅣ        out.print("</body>");
ㅣ        out.print("</html>");
ㅣ      }
ㅣ
ㅣ      }
↓
http://localhost:8090/lec05Pjt001/Hello
↓
Hello Servlet~~



@WebServlet("/Hello")
      ↓
WebServlet(name="servletEx", urlPatterns= {"/Hello", "/SE"})


```
