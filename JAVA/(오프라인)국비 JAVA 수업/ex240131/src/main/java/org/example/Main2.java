package org.example;

public class Main2 {
    public static void main(String[] args) {
        INum iNum1 = new INum(10);
        INum iNum2 = new INum(10);
        INum iNum3 = new INum(13);

        System.out.println(iNum1);
        System.out.println(iNum2);
        System.out.println(iNum3);

        System.out.println(iNum1 == iNum2);
   //     System.out.println(iNum1.equals(iNum2));

        // equals 를 재정의하면 내가 원하는 데로 사용할 수 있음.
        System.out.println(iNum1.equals(iNum2));

    }
}
