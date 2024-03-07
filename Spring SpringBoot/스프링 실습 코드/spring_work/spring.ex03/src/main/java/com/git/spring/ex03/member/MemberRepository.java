package com.git.spring.ex03.member;

import java.lang.reflect.Member;
import java.util.*;

public class MemberRepository {

    Map<String,Member> map = new HashMap<>();

    public void insert(Member member) {
        map.put(member.getEmail(),member);
        System.out.println("확인1");
    }

    public Collection<com.git.spring.ex03.member.Member> select() {
//        Set<String> keys = map.keySet();
        return map.values();
    }
}
