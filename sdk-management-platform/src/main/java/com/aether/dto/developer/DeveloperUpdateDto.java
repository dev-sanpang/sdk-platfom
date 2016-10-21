package com.aether.dto.developer;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

/**
 * 修改用户信息
 * 
 * @author liuyang 　* @date 创建时间：2016年9月30日 上午11:41:58
 *
 */
public class DeveloperUpdateDto {

    private int id;
    // 开发者名称
    private String developerName;

    // 邮箱
    private String mail;
    // 地址
    private String address;

    // 联系电话
    private String tel;

    @NotNull(message = "修改的ID不能为空")
    public int getId() {
        return id;
    }

    public String getDeveloperName() {
        return developerName;
    }

    @Email(message="电子邮箱地址格式不正确")
    public String getMail() {
        return mail;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

}
