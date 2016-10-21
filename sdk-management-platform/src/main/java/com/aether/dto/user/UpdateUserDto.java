package com.aether.dto.user;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class UpdateUserDto {
    private int id;
    private String password;

    @NotBlank(message = "用户Id不能为空")
    public int getId() {
        return id;
    }

    @NotNull(message = "密码不能为null")
    public String getPassword() {
        return password;
    }

}
