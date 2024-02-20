package org.example;

class BB{ }
interface Inter{
    public void interFuntion();
}
public class Main6 {

    public Main6(){
        doA(100, new BB(), ()->{
            System.out.println("aaa");  // 함수 보내기
        } );
    }
    public void doA(int a, BB b, Inter inter){
        inter.interFuntion();
        System.out.println("냐하하하하");
    }
    public static void main(String[] args) {
        new Main6();

    }
}
