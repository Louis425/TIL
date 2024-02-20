package org.example;

import java.util.Spliterator;
// 추상메서드
interface Printable{
    public void print(String doc);

    // 인터페이스에서 몸체를 가지는 메서드를 만들 수 있도록 자바 버전 업그레이드 함.
    default public void doA(){
        System.out.println("doA 메서드 입니다.");
    }
}

interface CMUKPrintable extends Printable{
    public void printCMYK(String doc);
}
class SPrint implements Printable{

    @Override
    public void print(String doc) {
        System.out.println("S Print 출력합니다.");
        System.out.println(doc);
    }
}
class LPrint implements  Printable{

    @Override
    public void print(String doc) {
        System.out.println("L Print 출력합니다.");
        System.out.println(doc);
    }
}

class PRN909 implements CMUKPrintable{

    @Override
    public void print(String doc) {
        System.out.println("S Print 흑백 출력합니다.");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("S Print 컬러 출력합니다.");
        System.out.println(doc);
    }
}
public class Main {
    public static void main(String[] args) {
        String doc = "REPORT";

        SPrint sp = new SPrint();
        sp.print(doc);
        sp.doA();

        LPrint lp = new LPrint();
        lp.print(doc);
        lp.doA();

        Printable p1 = (d)->{
            System.out.println("람다");
        };
        p1.print(doc);
        p1.doA();

        PRN909 prn909 = new PRN909();
        prn909.print("흑백출력");
        prn909.printCMYK("컬러출력");
        prn909.doA();
    }
}