package com.baechu.member.controller;

import com.baechu.dto.ResponseDto;
import com.baechu.member.dto.SigninDto;
import com.baechu.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/login")
    public void login() {

    }

    @PostMapping("/signin")
    @ResponseBody
    public ResponseEntity<ResponseDto> signin(@RequestBody SigninDto signinDto) {
        return memberService.signin(signinDto);
    }

}
