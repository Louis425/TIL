<!-- TOC -->

- [1강\_웹 프로그램 개요](#1강_웹-프로그램-개요)
- [2강\_개발 환경 설정](#2강_개발-환경-설정)
- [3강\_JSP 맛보기](#3강_jsp-맛보기)
- [4강\_Servlet 맛보기](#4강_servlet-맛보기)
- [5강\_Servlet 맵핑](#5강_servlet-맵핑)
- [6강_Servlet reqeust, response](#6강_servlet-reqeust-response)
- [7강_Servlet life-cycle](#7강_servlet-life-cycle)
- [8강_ form 테이터 처리](#8강_-form-테이터-처리)
- [10강_JSP request, response](#10강_jsp-request-response)
- [11강_JSP 내장객체](#11강_jsp-내장객체)
- [12강_Servlet 데이터 공유](#12강_servlet-데이터-공유)
- [13강_Cookie](#13강_cookie)
- [14강_Session](#14강_session)
- [15강_한글처리](#15강_한글처리)
- [16강_오라클 설치](#16강_오라클-설치)
- [17강_SQL](#17강_sql)
- [18강_JDBC](#18강_jdbc)
- [19강_DAO와 DTO]()
- [20강_Connection Pool]()
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

---

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

---

## : java 파일 확인

```

  C:\jsp\download\apache-tomcat-8.5.24\work\Catalina\localhost\lec03Pjt001\org\apache\jsp

  xxx.jsp --> xxx_jsp.java --> xxx_jsp.class

```

---

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

---

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

---


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

---

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

---

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

---

# 6강_Servlet reqeust, response

## 6-1 HttpServlet

```java
       
                웹 컨테이너 (tomcat)
                      ↓
       Request        ↓
user ---------->   servlet
     <---------- 
       Response


  ServletConfig          Servlet         Serializable
   (interface)         (interface)        (interface)
       ↑                     ↑                 ↑
       ㅣ                    ㅣ                 ㅣ
       ㅣ                    ㅣ                 ㅣ
       ㅣ                    ㅣ                 ㅣ
       ------------------------------------------
                            ↑ 
                      GenericServlet
                      (abstract class)
                          ↑
                      HttpServlet
                      (abstract class)
                           ↑
                      ServletEx 
                      (class)

```

```java

package com.servlet;

@WebServlet("/SE")
public class ServleEx extends HttpServlet{

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  doGet(request, response);
  }

}

```

---

## 6-2 : HttpServletRequest

```java

package com.servlet;

@WebServlet("/SE")
public class ServletEx extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                       <---------------->
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { doGet(request, response);
  }                     <---------------->

}

```

```java

                   웹 컨테이너 (tomcat)
         Request         ↓
 user  ---------->    servlet

HttpServletRequest
요청에 대한 정보를 가지고 있는 

request.getCookies();   request.getSession();
request.getAttribute(null); request.setAttribute(null, null);
request.getParameter(null); request.getParameterNames();
request.getParameterValues(null);

```

---


## 6-3 : HttpServletResponse

```java

package com.servlet;

@WebServlet("/SE")
public class ServletEx extends HttpServlet {

 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                                                  <----------------->
 }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { doGet(request, response);
  }                                                 <----------------->

}


```

```java

                    웹 컨테이너 (tomcat)
          Response        ↓
 user   <----------    servlet


HttpServletResponse
응답에 대한 정보를 가지고 있는 객체

response.addCookie(null); response.getWriter();
response.getStatus(); response.getOutputStream();
response.sendRedirect(null);

```

----

# 7강_Servlet life-cycle

## 7-1 : Servlet 생명주기

```java

     @PostConstruct
           ↓ 
         init()   ㅣ 
           ↓      ㅣ
        service   ㅣ ------> Servlet 생성 및 종료
           ↓      ㅣ 
        destroy() ㅣ
           ↓
      @PreDestroy

```

## 7-2 : 생성 및 종료 

```java

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  System.out.println(" -- doGet() -- ");
}

@PostConstruct <----------------------------------------- @PostConstruct
public void postConstruct() {                             ↓
  System.out.println(" -- postConstruct() -- ");          ↓
}                                                         ↓
                                                          ↓
@Override                                                 ↓
public void init() throws ServletException {  <---------- init()
  System.out.println(" -- init() -- ");                   ↓
}                                                         ↓
                                                          service
                                                          ↓
@Override                                                 ↓
public void destroy() {  <------------------------------- destroy()
  System.out.println(" -- destroy() -- ");                ↓
}                                                         ↓
                                                          ↓
@PreDestroy                                               ↓
public void preDestory() {  <---------------------------- preDestory 
  System.out.println(" -- preDestory() -- ");
}


```

# 8강_ form 테이터 처리

## 8-1 : form 태그

```java

                     웹 컨테이너(tomcat)
          Request       ↓
             ↓       -------
Browser ---DATA----> servlet


```

```java

form 관련 태그 ㅣ             ㅣ request 객체
     ↓       ㅣ             ㅣ      ↓
    user     ㅣ ----------> ㅣ    user
    dara     ㅣ             ㅣ    dara
             ㅣ             ㅣ

```
---

## 8-2 : doGet

```java

      데이터가 웹 브라우저 URL에 노출되어 웹 서버로 전송
                    ↓
                    ↓
form 관련 태그 ㅣ ----------> ㅣ request 객체
     ↓       ㅣ  보안에 약하다 ㅣ      ↓
    user     ㅣ             ㅣ    user
    dara     ㅣ             ㅣ    dara

method=“get” -----------------> doGet()

http://localhost:8090/lec08Pjt001/mSignUp?m_name=Hong+gildong&
                                          -------------------
m_pass=1234&m_gender=M&m_hobby=sport&m_hobby=cooking&m_residenc e=jeju
            ---------- -------------
                             ↓
                    사용자 정보가 URL에 노출

```

---

## 8-3 : doPost

```java

      데이터가 HTTP Request에 포함되어 웹 서버로 전송
                    ↓
                    ↓
form 관련 태그 ㅣ ----------> ㅣ request 객체
     ↓       ㅣ  보안에 약하다 ㅣ      ↓
    user     ㅣ             ㅣ    user
    dara     ㅣ             ㅣ    dara

method=“Post” -----------------> doPost()

http://localhost:8090/lec08Pjt001/mSignUp
                                  -------
                                     ↓
                                맵핑 정보만 노출

```

---

# 9강_JSP 스크립트

## 9-1 : Servlet vs JSP

```java

xxx.java -> xxx.class    vs   xxx.jsp -> xxx_jsp.java -> xxx_jsp.class

```

## 9-2:JSP 파일 HTML 포맷 설정

> Window
>
> > Preferences
>
> > > Servlet
>
> > > > Templates -> New
>
> > > > > Class name: HelloServlet
>
> > > > > Name: html5 fomat
>
> > > > > Context New JSP
>
> > > > > Descriptior: html5 fomat
>
> > > > > Pattem: ↓

```java

<%@ page language="java" contentType="text/html; charset=${encoding}"    pageEncoding="${encoding}"%>
<!DOCTYPE html> <html>
 <head>
  <meta charset="${encoding}"> <title>Insert title here</title>
 </head>
 <body>
 </body>
</html>

```

## 9-3 : JSP 주요 스크립트

### [선언 태그] JSP 페이지에서 Java의 멤버변수 또는 메서드를 선언

```java

<%!            
int num = 10;          ㅣ------------------------------->  변수선언및초기화 
String str = "jsp";    ㅣ  
ArrayList<String> list = new ArrayList<String>(); ㅣ---->  객체생성및인스턴스초기화


public void jspMethod() {                    ㅣ
  System.out.println(" -- jspMethod() -- "); ㅣ--------->  메서드선언및정의
}                                            ㅣ
%>

```

### [주석 태그] jsp 주석은 jsp 파일이 서블릿 파일로 변환될 때 제외된다.

```java

<!-- 주석 태그 -->     <--------------  HTML 주석
<%-- Hello JSP World!! --%>    <----  JSP 주석

```

## 9-3 : JSP 주요 스크립트

### [스크립트릿 태그] JSP 페이지에서 Java 코드를 넣기 위한 태그

```java

<%
if(num > 0) {  <----------- Java 코드
%>
  <p> num > 0 </p>   <----- HTML 코드
<%
} else {  <---------------- Java 코드
%>
  <p> num <= 0 </p>  <----- HTML 코드
<%
  }  <--------------------- Java 코드
%>

```

### [표현식 태그] Java의 변수 및 메서드의 반환값을 출력하는 태그

```java
   
  HTML코드   Java코드
     ↓        ↓
  ------     ---                     
  num is <%= num %>   

```

---

## 9-3 : JSP 주요 스크립트

### [지시어] 서버에서 jsp페이지를 처리하는 방법에 대한 정의

```java

1) page : 페이지 기본 설정 -> <% page 속성=“속성 값”>
<%@ page language="java" contentType="text/html; charset=EUC-KR“ pageEncoding="EUC-KR"%>

2) include : include file 설정 -> <% include file=“파일명”>
<%@ include file=“header.jsp"%>

3) taglib : 외부라이브러리 태그 설정 -> <% taglib uri=“uri” prefix=“네임스페이스명”>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix=“c"%>

```

---

# 10강_JSP request, response

## 10-1 : request 객체

```java

<form action="mSignUp.jsp" method="get">

user data

  <input type="submit" value="sign up">
</form>

            ㅣ
            ㅣ <--- Request
            ㅣ
            ↓

<%
  m_name = request.getParameter("m_name");
  m_pass = request.getParameter("m_pass");
  m_gender = request.getParameter("m_gender");
  m_hobby = request.getParameterValues("m_hobby");
  m_residence = request.getParameter("m_residence");
%>

```

```java
              
                웹 서버
      Request     ↓
user --------->  jsp

```

---

## 10-2 : response 객체

```java

<body>

  Second Page

</body>

       ↑
       ㅣ
       ㅣ <--- Response
       ㅣ

<body>

  First Page</br>

  <%
    response.sendRedirect("secondPage.jsp");
%>

    </body>

```

```java
              
                웹 서버
      Response    ↓
user <---------  jsp

```

# 11강_JSP 내장객체

```java

<init-param>
  <param-name>adminId</param-name>
  <param-value>admin</param-value>
</init-param>
<init-param>
  <param-name>adminPw</param-name>
  <param-value>1234</param-value>
</init-param>
↓
↓
↓
```

```java
↓
↓
↓
String adminId =
getServletConfig().getInitParameter("adminId");
String adminPw =
getServletConfig().getInitParameter("adminPw");

```
## 11-1 config 객체

```java

<context-param>
  <param-name>imgDir</param-name>
  <param-value>/upload/img</param-value>
</context-param>
<context-param>
  <param-name>testServerIP</param-name>
  <param-value>127.0.0.1</param-value>
</context-param>
↓
↓
↓
```

```java
↓
↓
↓
String imgDir =
getServletContext().getInitParameter("imgDir");
String testServerIP =
getServletContext().getInitParameter("testServerIP");

```

## 11-2 application 객체

```java

getServletContext().setAttribute("connectedIP", "165.62.58.23");
getServletContext().setAttribute("connectedUser", "hong");
                            ↕
   (String)getServletContext().getAttribute("connectedIP");
   (String)getServletContext().getAttribute("connectedUser");

```

## 11-3 out 객체

```java

<%
  out.print("<h1>Hello JAVA World!!</h1>");
  out.print("<h2>Hello JSP World!!</h2>");
  out.print("<h3>Hello Servlet World!!</h3>");
%>

```

## 11-4 exception 객체

```java

<!-- exception 객체 -->
<%
  out.print(str.toString());
%>
↓
↓
↓
```

```java
↓
↓
↓
<%
  response.setStatus(200);
  String msg = exception.getMessage();
%>

<h1> error message : <%= msg %> </h1>

```

# 12강_Servlet 데이터 공유

## 12-1 : servlet parameter

```java

<init-param>
  <param-name>adminId</param-name>
  <param-value>admin</param-value>
</init-param>
<init-param>
  <param-name>adminPw</param-name>
  <param-value>1234</param-value>
</init-param>
     ↓
     ↓
     ↓
String adminId = 
getServletConfig().getInitParameter("adminId"); 
String adminPw = 
getServletConfig().getInitParameter("adminPw");

```

---

## 12-2 : context parameter

```java

<context-param>
  <param-name>imgDir</param-name>
  <param-value>/upload/img</param-value>
</context-param>

<context-param>
  <param-name>testServerIP</param-name>
  <param-value>127.0.0.1</param-value>
</context-param>
     ↓
     ↓
     ↓
String imgDir =
getServletContext().getInitParameter("imgDir");
String testServerIP =
getServletContext().getInitParameter("testServerIP");

```

## 12-3 : context attribute

```java

getServletContext().setAttribute("connectedIP", "165.62.58.23"); getServletContext().setAttribute("connectedUser", "hong");
                    ↕
                    ↕
                    ↕
(String)getServletContext().getAttribute("connectedIP");
(String)getServletContext().getAttribute("connectedUser");

```

---

# 13강_Cookie

## 13-1 : Cookie란?

```java

             ㅣ  --- request -->   ㅣ
             ㅣ                    ㅣ
    브라우저    ㅣ --- response -->  ㅣ  서버
  (클라이언트)  ㅣ                    ㅣ
             ㅣ  <-- 연결 해제 X --> ㅣ
                       ↓ 
             ㅣ  --- request -->   ㅣ
             ㅣ                    ㅣ
    브라우저    ㅣ --- response -->  ㅣ  서버
  (클라이언트)  ㅣ                    ㅣ
기존 연결정보 저장ㅣ  <-- 연결 해제 X --> ㅣ
      ↓ 
   Cookie

```

## 13-2 : Cookie 구현

```java

Cookie[] cookies = request.getCookies(); 
Cookie cookie = null;

for (Cookie c : cookies) { 
  
  System.out.println("c.getName() : " + c.getName() + ",
c.getValue() : " + c.getValue());

  if(c.getName().equals("memberId")) { 
    cookie = c;
  }
}

if(cookie == null) { 
  System.out.println("cookie is null"); 
  cookie = new Cookie("memberId", mId);
}

response.addCookie(cookie);
cookie.setMaxAge(60*60);

response.sendRedirect("loginOk.jsp");

```

# 14강_Session

## 14-1 : Session이란?

```java

             ㅣ  --- request -->   ㅣ
             ㅣ                    ㅣ
    브라우저    ㅣ --- response -->  ㅣ  서버
  (클라이언트)  ㅣ                    ㅣ
             ㅣ  <-- 연결 해제 X --> ㅣ
                       ↓ 
             ㅣ  --- request -->   ㅣ
             ㅣ                    ㅣ
    브라우저    ㅣ --- response -->  ㅣ  서버
  (클라이언트)  ㅣ                    ㅣ
기존 연결정보 저장ㅣ  <-- 연결 해제 X --> ㅣ 기존 연결정보 저장
                                           ↓ 
                                        Session

```

## 14-2 : Session 구현

```java

session == null - false -> 로그인 정보 출력 
         ↓                    ↓ 
       true                   ↓ 
         ↓                    ↓ 
     로그인 유도                 ↓  
         ↓                    ↓ 
         redirect : loginOk.jsp
                   ↓
                로그아웃

```

# 15강_한글처리

## 15-1 : 한글처리

```java

        post : 서블릿에 request.setCharacterEncoding("UTF-8");
브라우저 ---------------------------------------------------------> 웹서버
        get : server.xml에 <Connector URIEncoding="UTF-8" /> 추가

```

---

## 15-2 : Filter

```java
        request
브라우저 --------- Filter -->   
       <-- Filter --------- 웹서버
                   response

  Filter
(interface)
    ↑
UserFilter 
 (class)
    ↓
public class TempFilter implements Filter {

  @Override
  public void init(FilterConfig arg0) throws ServletException {}

  @Override
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
throws IOException, ServletException {}

  @Override
  public void destroy() {}

}
```

# 16강_오라클 설치

## 16-1 : 오라클 다운로드

### http://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html

## 16-2 : SQL developer

### http://www.oracle.com/technetwork/developer-tools/sql-developer/downloads/index.html

---

# 17강_SQL

## 17-1:테이블생성및삭제

```java
-- table 생성
CREATE TABLE book (
  book_id NUMBER(4), 
  book_name VARCHAR2(20),
  book_loc VARCHAR2(20)
);

-- 테이블 검색
SELECT * FROM tab;

-- 테이블 삭제
DROP TABLE book;

-- table 생성 - 제약조건
CREATE TABLE book (
  book_id NUMBER(4) CONSTRAINT book_id_pk PRIMARY KEY,
  book_name VARCHAR2(20),
  book_loc VARCHAR2(20)
);
```

---

## 17-2 : 데이터 추가, 수정, 삭제

```java
-- 시퀀스 생성
CREATE SEQUENCE book_seq;

-- 데이터 추가
INSERT INTO
  book(book_id, book_name, book_loc)
VALUES
  (BOOK_SEQ.NEXTVAL, 'book5', '001-00005');

INSERT INTO
  book
VALUES
  (BOOK_SEQ.NEXTVAL, 'book6', '001-00006');

-- 수정
  UPDATE book SET book_loc = '001-00006123' 
  WHERE book_name = 'book6';

-- 삭제
  DELETE FROM book 
  WHERE book_id = 6;
```

---

## 17-3 : 데이터 검색

```java
-- 데이터 검색
SELECT * FROM book;

SELECT book_name, book_loc FROM book;

SELECT book_name AS 책이름, book_loc AS 책위치 FROM book;

-- 조건 - WHERE
SELECT * FROM book WHERE book_id > 3;
SELECT * FROM book WHERE book_id > 3 AND book_id <= 5;

-- 조건 - BETWEEN AND
SELECT * FROM book WHERE book_id BETWEEN 2 AND 4;

-- 조건 - LIKE
SELECT * FROM book WHERE book_id LIKE 3;
SELECT * FROM book WHERE book_loc LIKE '%3';
SELECT * FROM book WHERE book_name LIKE 'book%';
SELECT * FROM book WHERE book_name LIKE '%ok%';

-- 정렬
SELECT * FROM book ORDER BY book_id ASC;
SELECT * FROM book ORDER BY book_id DESC;

SELECT * FROM book ORDER BY book_name ASC;
SELECT * FROM book ORDER BY book_name DESC;
```

---

# 18강_JDBC

## 18-1 JDBC 설정

```java
Java가 DB와 통신할수 있게 해주는 API

      Java <- JDBC -> DB

------------------------------
eclipse에서도 Oracle의 API를 이용하기 위해서,
Oracle LIB를 eclipse에 복사한다.

 eclipse <- Library -- ORACLE
```
```java
C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
                      ↓
             copy : ojdbc6_g.jar
                      ↓
 C:\Program Files\Java\jre1.8.0_151\lib\ext
```

## 18-2 JDBC를 이용한 데이터 관리

```java
OracleDriver 로딩 Driver loading Class.forName(driver);
                  ↓
Java와 Oracle 연결 Connection con = DriverManager.getConnection(url, id, pw);
                  ↓
   query 전송 객체 Statement stmt = con.createStatement();
                  ↓
       query 작성 query String sql = "SELECT * FROM book";
                  ↓
       query 전송 run res = stmt.executeQuery(sql);
```

---