package com.baechu.member.entity;

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
}
