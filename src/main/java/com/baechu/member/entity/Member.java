package com.baechu.member.entity;

import com.baechu.member.dto.SigninDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Integer sex;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String county;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String detailAddress;

    public Member(SigninDto signinDto) {
        this.email = signinDto.getEmail();
        this.password = signinDto.getPassword();
        this.sex = signinDto.getSex();
        this.age = signinDto.getAge();
        this.city = signinDto.getCity();
        this.county = signinDto.getCounty();
        this.district = signinDto.getDistrict();
        this.detailAddress = signinDto.getDetailAddress();
    }
}
