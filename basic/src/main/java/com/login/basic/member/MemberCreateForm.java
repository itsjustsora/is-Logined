package com.login.basic.member;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class MemberCreateForm {

    @Size(min = 3, max = 25)
    @NotEmpty(message = "사용자ID는 필수 항목입니다.")
    private String name;

    private String password1;

    private String password2;

    @NotEmpty(message = "이메일은 필수항목입니다.")
    @Email
    private String email;

}