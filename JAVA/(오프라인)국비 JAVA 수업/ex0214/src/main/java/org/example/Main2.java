package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class JustSort{
    public void sort(List<?> list){
        Collections.reverse(list);
    }
}
public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7,9);
        list = new ArrayList<>(list);

        JustSort js = new JustSort();

        Consumer<List<Integer>> listConsumer = lst -> js.sort(lst);
        listConsumer.accept(list);
        System.out.println(list);

        // 람다식
        Consumer<List<Integer>> listConsumer3 = lst -> {
            js.sort(lst);
            System.out.println(lst);
        };
        System.out.println(listConsumer3);

// 메서드 참조
        Consumer<List<Integer>> listConsumer1 = js::sort;

        listConsumer1.accept(list);
        System.out.println(list);

      //  js = null;   // 자바 8버전에서는 에러 뜬다. 업데이트 되면서 에러를 잡게 된거 같다.
    }
}
