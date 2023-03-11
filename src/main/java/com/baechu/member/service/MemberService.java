package com.baechu.member.service;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baechu.common.dto.ResponseDto;
import com.baechu.member.dto.SigninDto;
import com.baechu.member.entity.Member;
import com.baechu.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

	private final MemberRepository memberRepository;

	@Transactional
	public ResponseEntity<ResponseDto> signin(SigninDto signinDto) {
		// 아이디 중복 검사
		Optional<Member> findEmail = memberRepository.findByEmail(signinDto.getEmail());
		if (findEmail.isPresent()) {
			throw new IllegalArgumentException("아이디 중복 (임시)");
		} else {
			memberRepository.save(new Member(signinDto));
			return ResponseEntity.ok(ResponseDto.of(HttpStatus.OK, "회원가입 성공"));
		}
	}
}
