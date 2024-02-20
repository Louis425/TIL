package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("하하하","궁금해하세요","집에 갈래요");

        Instant before = Instant.now();
        System.out.println(before.getNano());

        list.stream().forEach(System.out::println);

        Instant after = Instant.now();
        System.out.println(after.getNano());

        Duration between1 = Duration.between(before,after);
        System.out.println(between1);

        before = Instant.now();

        for(String temp : list){
            System.out.println(temp);
        }
        after = Instant.now();

        Duration between2 = Duration.between(before,after);
        System.out.println(between2);
    }
}
