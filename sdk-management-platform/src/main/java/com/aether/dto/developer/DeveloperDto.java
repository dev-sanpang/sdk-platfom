package com.aether.dto.developer;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
/**
 * 开发者DTO
 * @author liuyang
 *
 */
public class DeveloperDto {

    // 开发者名称
    private String developerName;
    // 密码
    private String password;
    // 邮箱
    private String mail;
    // 地址
    private String address;

    // 联系电话
    private String tel;

    @NotBlank(message = "开发者名称不能为空")
    public String getDeveloperName() {
        return developerName;
    }

    @NotBlank(message = "密码不能为空")
    /*@Pattern(regexp="/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,10}$/", message="密码必须是6~10位数字和字母的组合")*/
    public String getPassword() {
        return password;
    }

    @NotBlank(message = "邮箱不能为空")
    @Email(message="电子邮箱地址格式不正确")
    public String getMail() {
        return mail;
    }

    @NotBlank(message = "地址不能为空")
    public String getAddress() {
        return address;
    }

    @NotBlank(message = "联系电话不能为空")
    @Pattern(regexp="^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$", message="手机号格式不正确")
    public String getTel() {
        return tel;
    }

}
