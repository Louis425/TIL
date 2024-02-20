package org.example;

interface Calcu {
    void cal(int a, int b);
}

interface RetCalcu {
    int cal(int a, int b);
}

public class Main2 {
    public static void doA(Calcu cc, int... a) {
        cc.cal(a[0], a[1]);
    }

    public static void main(String[] args) {
        RetCalcu rcc = (a, b) -> {
            return a + b;
        };
        // 위의 코드를 아래 처럼 return 생략할 수도 있다.
        RetCalcu rcc1 = (a, b) -> a + b;
        int result = rcc.cal(5,13);
        System.out.println(result);
        System.out.println(rcc.cal(5,13));

        doA((a, b) -> System.out.println(a + b), 10, 20, 30);
        doA((a, b) -> System.out.println(a + b), 10, 20);

        Calcu cc1 = (a, b) -> System.out.println(a+b);
        cc1.cal(10,20);

        Calcu cc2 = (a, b) -> System.out.println(a-b);
        cc2.cal(10,20);


    }
}
