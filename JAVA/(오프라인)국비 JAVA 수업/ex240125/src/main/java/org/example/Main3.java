package org.example;

interface Upper{
    default String doUpper(String con){     // default public String doUpper(String con)과 같다. pubilc 써도 되고 안 써도 된다.
      return con.toUpperCase();
    }
}

interface  Lower{
    default String doLower(String con){
        return con.toLowerCase();
    }
}

interface Printa{
    void doA(String con);
}

class MyPrinter implements Printa, Upper{
    @Override
    public void doA(String con) {
        // 뭘 써서 출력할 건지 정의.
        System.out.println(doUpper(con));
    }

//    public void doB(String con) {
//        // 뭘 써서 출력할 건지 정의.
//        System.out.println(doLower(con));
//    }
}
public class Main3 {
    public static void main(String[] args) {
        MyPrinter mp = new MyPrinter();
        mp.doA("adccdd");

       // mp.doB("SEDWQREF");

        System.out.println(mp instanceof Upper);

        // 다형성.
        // 자식을 부모 객체에 담을 수 있다.
        // 부모객체는 자식객체를 참조 할 수 있다.
        if(mp instanceof Upper){
            Upper up = mp;
        }
        //Lower lower = mp;
        try{
            Lower lower = (Lower) mp;
            System.out.println("여기는 실행안됨.");
        } catch(ClassCastException cce){
            System.out.println("형변환예외");
        }


        System.out.println(mp instanceof Lower);
    }
}
