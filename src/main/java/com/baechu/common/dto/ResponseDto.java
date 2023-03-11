package com.baechu.common.dto;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseDto {

	private String msg;
	private int state;

	public static ResponseDto of(HttpStatus httpStatus, String msg) {
		return new ResponseDto(msg, httpStatus.value());
	}

	public ResponseDto(String msg, int state) {
		this.msg = msg;
		this.state = state;
	}
}
