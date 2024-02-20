package org.example;

import org.example.myclass.Member;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<Member> list = new ArrayList<>();

        Member member1 = new Member("홍길동", 20);
        System.out.println(member1);

        Member member2 = new Member("박길동", 23);
        System.out.println(member2);

        list.add(member1);
        list.add(member2);

        System.out.println(list);

        Member md1 = list.get(0);
        System.out.println("list 의 0번째 = " + md1);
    }
}