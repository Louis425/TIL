package org.example;

import lombok.AllArgsConstructor;
import lombok.ToString;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Friend[] f = new Friend[5];

        f[0] = new UniFriend("홍길동","컴공","01012341234");
        f[1] = new CompFriend("회사친구","개발실","01011112222");

        System.out.println(f[0]);
        System.out.println(f[1]);

        List<Friend> list = new ArrayList<>();
        list.add(new UniFriend("bong","computer","01011111111"));
        list.add(new CompFriend("정","부서","010911112222"));

        System.out.println(list);
    }
}