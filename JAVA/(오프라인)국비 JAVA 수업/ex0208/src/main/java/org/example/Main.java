package org.example;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ROBOT","APPLE","BANANA","BOX","AA");
        list = new ArrayList<>(list);

        // Arrays.sort 배열 정렬
 //       Collections.sort(list); // 컬렉션 정렬
//
//        System.out.println(list);

        // 스트림 -
//        list.stream().forEach(s-> System.out.println("스트림 자동 엔터 출력 : " + s));
//        list.stream().forEach(s-> System.out.print(s));

//        Consumer<String> con = (s) -> System.out.println(s);
//        list.stream().forEach(con);


//        Comparator<String> comp = (o1, o2) -> o2.length()-o1.length();
//        Collections.sort(list,comp);
//        System.out.println(list);

//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }


        // Comparator 안에는 compare 이라는 메서드 있다.
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        }); // 컬렉션 정렬
//        System.out.println(list);

        // 람다로 변경 -
        Collections.sort(list, ((o1, o2) -> o1.length()-o2.length()));
        System.out.println(list);



    }
}