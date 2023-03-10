package com.baechu.member.controller;

import com.baechu.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private MemberService memberService;

    @PostMapping("/login")
    public void login() {

    }

    @PostMapping("/signin")
    public void signin() {

    }

}
