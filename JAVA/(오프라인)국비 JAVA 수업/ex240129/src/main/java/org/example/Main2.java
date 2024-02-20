package org.example;

import java.util.ArrayList;
public class Main2 {
    public static void main(String[] args) {

        ArrayList<Apple> list = new ArrayList<>();

        // Apple 을 담기로 했기 때문에 다른것을 담으면 에러다.
//        list.add("String");
//        list.add(10);

        list.add(new Apple("사과2"));
        System.out.println(list);
    }
}
