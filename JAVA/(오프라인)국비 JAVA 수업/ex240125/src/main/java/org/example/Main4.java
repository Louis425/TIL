package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {

    public void doA(){
//        try {
            int[] ar = new int[10];
            ar[11] = 10;
            Scanner scan = new Scanner(System.in);

            System.out.println("숫자 입력하세요");
            int a = scan.nextInt();

            System.out.println("숫자 입력하세요");
            int b = scan.nextInt();

            System.out.println("a/b = " + a/b);
            System.out.println("try 구문 끝..");

            // return 은 함수종료인데 finally 가 있으면 return 있어도 finally 갔다가 return 된다.
//            return;
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌 수 없습니다." + e.getMessage());
//        } catch (InputMismatchException e){
//            System.out.println("문자 입력하시면 안되요..");
//        } catch (Exception e){
//            e.printStackTrace();
//            System.out.println("나머지 예외");
//        }
//        finally {
//            System.out.println("Good Bye");
//        }
    }
    public static void main(String[] args) {
        Main4 main4 = new Main4();

        try {
            main4.doA();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // try catch 문 없으면 강제종되어서 아래 구문 실행 안됨
        System.out.println("강제종료되어서 여기 실행안됨..");

    }
}
