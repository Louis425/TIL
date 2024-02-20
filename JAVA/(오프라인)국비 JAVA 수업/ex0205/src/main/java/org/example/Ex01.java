package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 문자열을 정렬할 수 있는 List 를 만들어보자.
public class Ex01 {
    public static void main(String[] args) {
        /*
        for 구문으로 오름차순 이나 내림차순으로 정렬 가능하다.
        unicode A = 97 이용해서 정렬 가능하다.

        Collections.sort(); 이용하면 더 간편하게 정렬 가능하다.
         */

        List<String> list = Arrays.asList("Box","Toy","ROBOT","WEAPON");
        list = new ArrayList<>(list);
        Collections.sort(list);

        System.out.println(list);
    }
}
