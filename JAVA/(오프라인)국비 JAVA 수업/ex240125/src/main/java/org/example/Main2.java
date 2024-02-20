package org.example;

interface A{
    public void doA();
    default public void doB(){
        System.out.println("A default");
    }
    static public void doC(){
        System.out.println("Static");
    }
}

public class Main2 {
    public static void main(String[] args) {
        // interface 안에 있는 static 바로 쓸 수 있다.
        A.doC();

        // doB는 바로 쓸 수 없음.
        //A.doB();

        // doB 와 doC 는 객체생성해서 써야 한다. doA는 추상메서드라서 재정의해서 써야 한다.
        A a = new A() {
            @Override
            public void doA() {
                System.out.println("A doA()");
            }
        };

        a.doA();
        a.doB();

        // 정의해야하는 interface 추상메서드가 2개 이상이면 람다는 사용할 수 없음.
        A a1 = ()->{
            System.out.println("람다");
        };
        a1.doA();
        a1.doB();
    }
}
