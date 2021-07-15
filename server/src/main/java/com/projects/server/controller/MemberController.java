package com.projects.server.controller;

import com.projects.server.domain.Member;
import com.projects.server.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;
    
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService=memberService;
    }



}
