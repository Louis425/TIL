package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30);
        List<Integer> list2 = List.of(10,20,30);

        System.out.println(list);
        System.out.println(list2);

        Iterator<Integer> itr = list2.iterator();

        while(itr.hasNext()){
            int temp = itr.next();
            System.out.println(temp);
        }

       //list.add(50);
        List<Integer> list3 = new ArrayList<>(list2);
        System.out.println(list3);

        list3.add(50);
        System.out.println(list3);
    }
}
