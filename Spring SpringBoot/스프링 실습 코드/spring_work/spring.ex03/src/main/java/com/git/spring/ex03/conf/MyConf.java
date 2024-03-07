package com.git.spring.ex03.conf;

import com.git.spring.ex03.member.MemberRepository;
import com.git.spring.ex03.member.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    memberConfiguration
    memberService
    memberRepository
    member

    regist ->
    list ->
 */

@Configuration
public class MyConf {


    @Bean //객체주입
    public MemberService memberService() {
        return new MemberService();
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

}
