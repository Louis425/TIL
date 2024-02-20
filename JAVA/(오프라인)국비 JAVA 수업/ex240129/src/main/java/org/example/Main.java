package org.example;

import java.security.AllPermission;

// 다형성으로 모든 객체는 부모 객체에 담을 수 있다.
class Apple{
    private String name;
    public Apple(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Orange{
    private String name;
    public Orange(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                '}';
    }
}

// 제네릭 이전에는 object 사용해서 클래스 담았다.
// 다형성 규칙으로 인해 obj 에  apple , orange 담을 수 있다.
//class Box{
//    private Object obj;
//    public Object getObj() {
//        return obj;
//    }
//    public void setObj(Object obj) {
//        this.obj = obj;
//    }
//}

// 제네릭 이후에 이렇게 클래스 담을 수 있게 object 로 만들어서 코드 를 단순화했다.
// <T> 에서 T 는 보편적인거지 다른것을 써도 된다. Object 를 t 제네릭에 넣은 것이 제네릭 문법이다.
class Box<T>{
    private T obj;

    public Box(T obj) {
        this.obj = obj;
    }
    public Box(){}

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "obj=" + obj +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box();
        box1.setObj(new Apple("사과"));

        Box<Orange> box2 = new Box();
        box2.setObj(new Orange("오렌지"));

        Apple apple = box1.getObj();
        Orange orange = box2.getObj();

        System.out.println(apple);
        System.out.println(orange);

        // 이렇게 형변환해서 쓰면 됨. 이렇게 된다면 apple 에 사과가 들어가있다는 것을 알기 때문에 가능하고, 뭐가 들어있는지 모르는 상황에서는 힘들다. 이것이 문제였다. 이걸 해결하기 위해 나온것이 제네릭 문법이다.
        //Apple apple = (Apple) box1.getObj();

//        Orange orange = (Orange) box1.getObj();
//        Apple apple = (Apple) box2.getObj();

        //box2.getObj();
//        System.out.println(orange);
//        System.out.println(apple);

    }
}