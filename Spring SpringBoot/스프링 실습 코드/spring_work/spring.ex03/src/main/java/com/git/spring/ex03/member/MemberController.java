package com.git.spring.ex03.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller // 주소맵핑
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("aa")
    public String aa(Model model) {
        String a = "안녕하세요!";
        model.addAttribute("hi", a);

        System.out.println(memberService);

        return "aa";
    }

    @GetMapping("regist")
    public String regist() {

        com.git.spring.ex03.member.Member member = Member.builder()
                .email("aaa@naver.com")
                .password("1234")
                .localDate(LocalDate.now())
                .build();

        memberService.regist(member);
        return "regist";
    }

    @GetMapping("list")
    public String list() {

        memberService.list();

        return "list";
    }

}