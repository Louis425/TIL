package org.example;

class MobilePhone{
    protected String number;

    public MobilePhone(String number){
        this.number = number;
    }

    public void answer(){
        System.out.println("대답해따 번호는 = " + number);
    }

}

class SmartPhone extends MobilePhone{

    private String android;
    public SmartPhone(String number, String ver){
        super(number);
        this.android = ver;
    }
    public void playApp(){
        System.out.println("앱 실행함 안드로이드 버전은 = " + android);
    }
}
public class Main2 {
    public static void main(String[] args) {
        // 스마트폰은 모바일폰이다. is a 관계
        SmartPhone sp = new SmartPhone("010-9946-2662","1.0");
        sp.playApp();
        sp.answer();

        // 부모객체           // 자식객체
        // 부모객체는 자식객체를 참조할 수 있다.
        // 자식객체는 부모객체에 담을 수 있다.
        // 그것이 다형성이다.
        MobilePhone mp = new SmartPhone("010-1234-1234","2.0");
        mp.answer();

    }
}
