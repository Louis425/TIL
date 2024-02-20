package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BOX","ROBOT","APPLE");
        list = new ArrayList<>(list);

        List<String> copyList = new ArrayList<>();
       // Collections.copy(copyList,list);

        Collections.copy(list, copyList);
  //      copyList = Arrays.asList("ddd","robot","dd");
        copyList.add("ddd");
        copyList.add("robod");
        copyList.add("sdf");
        copyList.add("wwwww");

        System.out.println("copy = " + copyList);
        System.out.println("list = " + list);

        // 문자열의 길이가 맞는 것만 가져오기
        List<String> tlist = list.stream().filter(
                s -> s.length()==3
        ).toList();

        List<Integer> olist = list.stream().map(
                 s-> s.length()
        ).toList();

        copyList.set(0,"aaa");
        System.out.println("copy = " + copyList);
        System.out.println("list = " + list);
        System.out.println("tlist = " + tlist);
        System.out.println("olist = " + olist);

//        for(int i=0; i<list.size(); i++){
//            if(list.get(i).equals("ROBOT")){
//                System.out.println(list);
//                System.out.println(i);
//                System.out.println(list.get(i));
//            }
//        }
//        Collections.sort(list);
//        System.out.println(list);
//
//        int idx = Collections.binarySearch(list,"ROBOT");
//        System.out.println(idx);
//
//        System.out.println(list.get(idx));
    }
}
