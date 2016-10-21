package com.aether.dto.user;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class UserDto {
    private String userName;
    private String password;

    @NotBlank(message = "用户名不能为空")
    public String getUserName() {
        return userName;
    }

    @NotNull(message = "密码不能为null")
    public String getPassword() {
        return password;
    }

}
