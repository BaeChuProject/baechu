package com.baechu.global.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

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
