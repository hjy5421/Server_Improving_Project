package com.projects.server.controller;

import com.projects.server.domain.Member;
import com.projects.server.domain.MemberForm;
import com.projects.server.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService=memberService;
    }


    @PostMapping(value = "/members/new")
    public String create(MemberForm form){
        Member member=new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "success";
    }

    public String list(){
        List<Member> members=memberService.findMembers();
        return members.stream().toString();
    }

}
