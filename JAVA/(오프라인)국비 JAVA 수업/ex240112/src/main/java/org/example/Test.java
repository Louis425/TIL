package org.example;

import java.util.Scanner;

public class Test {

    public void A() {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 입력해주세요 : ");
        int a = scan.nextInt();
        System.out.println("더하기 할 숫자 입력해주세요 : ");
        int b = scan.nextInt();

        System.out.println("합계 : " + (a+b));

    }

    public String B(){
        String b = "안녕하세요";
        System.out.println(b);
        return b;
    }

}
