package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BOX","TOY","ROBOT","SAMPLE");
        list = new ArrayList<>(list);
        //System.out.println(list);
        List<String> clist = Arrays.asList("BOX","TOY","ROBOT","SAMPLE");
        clist = new ArrayList<>(clist);

        list.addAll(clist);
        System.out.println(list);

// 길이가 3인상인 것들 다시 리스트로 만들고 싶다.
        List<String> list2 = new ArrayList<>();
        for(String temp : list){
            if(temp.length() > 3)
                list2.add(temp);
        }
        System.out.println(list2);

        List streamlist = list.stream()
                .filter(s -> s.length()>3)
//                .collect(()->new ArrayList<>(),
//                 (objects, s) -> objects.add(s),
//                 (lst1, lst2)->lst1.addAll(list2)
//                                );
                .collect(
                        ArrayList::new,
                        (objects, s) -> objects.add(s),
                        (lst1, lst2)->lst1.addAll(lst2)
                );
        System.out.println(streamlist);

// 자바 8 버전 이상부터 위의 것들의 코드를 줄여주는 문법이 나왔다.
        List streamlist2 = list.stream()
                .filter(s -> s.length()>3)
                .collect(
                        Collectors.toList()
                );
        System.out.println(streamlist2);

    }
}
