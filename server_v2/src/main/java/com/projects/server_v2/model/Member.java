package com.projects.server_v2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Member {
    private String memId; //회원 아이디

    @NonNull
    private String memPw; //회원 패스워드

    @NonNull
    private String memName; //회원 이름
}
