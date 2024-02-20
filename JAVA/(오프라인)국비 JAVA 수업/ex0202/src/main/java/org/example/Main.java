package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        List<String> list = new LinkedList<>();
        list.add("list");
        String item = list.get(0);

        System.out.println(new String("BOX").hashCode());
        System.out.println(new String("BOX").hashCode());

        set.add("BOX");
        set.add(new String("ROBOT"));
        set.add(new String("BOX"));
        set.add("TOY");

        System.out.println(set);

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            String temp = itr.next();
            System.out.println(temp);
        }
        System.out.println();
        for(String temp : set){
            System.out.println(temp);
        }
    }
}