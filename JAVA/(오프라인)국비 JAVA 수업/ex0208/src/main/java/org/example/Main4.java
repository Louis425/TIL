package org.example;

// 제네릭 생성
interface Calculate<T>{
    void cal(T a, T b);
}
public class Main4 {
    public static void main(String[] args) {
        Calculate<Integer> cal = (a, b) -> System.out.println(a+b);
        cal.cal(5,18);

        Calculate<Double> cal2 = (a, b) -> System.out.println(a+b);
        cal2.cal(10d,20.5);
    //  cal2.cal(10.5,20d); <- double 타입은 실수도 같이 적거나 d 를 적어줘야 한다.

        Calculate<String> cal3 = (a, b) -> System.out.println(a+b);
        cal3.cal("10", "덜덜");
    }
}
