package com.aether.dto.developer;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 开发者登陆校验
 * 
 * @author liuyang 　* @date 创建时间：2016年9月30日 上午11:04:03
 *
 */
public class DeveloperLoginDto {
    // 邮箱
    private String mail;

    // 密码
    private String password;

    @NotBlank(message = "邮箱不能为空")
    @Email(message = "登陆邮箱格式不正确")
    public String getMail() {
        return mail;
    }

    @NotBlank(message = "密码不能为空")
    public String getPassword() {
        return password;
    }

}
