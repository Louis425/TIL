package org.example;

public class Main3 {
    public static void main(String[] args) {
        Print prn = new Print();
        prn.print();

        // 객체 생성 가능 -> interface 의 메서드를 활용해서 객체 생성 가능하다.
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("인터페이스");
            }
        };
        printable.print();
        
        Printable lamda2 = ()->{
            System.out.println("람다");
        };
        lamda2.print();
    }
}
