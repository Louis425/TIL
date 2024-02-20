package org.example;

interface AA{
    public void aa(String s);     // 추상메서드
    default void bb(){
        System.out.println("몸체가 있는 메서드");
    }

    static void cc(){
        System.out.println("스태틱 메서드");
    }     // static 메서드
}
public class Main5 {
    public static void main(String[] args) {
        // static 메서드 호출
        AA.cc();

//        AA aa = new AA() { // 추상메서드를 익명 메스드로 변경하기
//            @Override
//            public void aa() {
//
//            }
//        };
//        aa.bb();
//
//        AAA aaa = new AAA();
//        aaa.bb();

        AA laa = (String s)->{
            System.out.println("test");
        };
        laa.aa("아무거나");


        AA laa1 = (s)->{
            System.out.println("test" + s);
        };
        // 람다식 먼저 쓰고 람다에 넣은 값이
        laa1.aa("아무거나");
    }
}
