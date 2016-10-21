package com.aether.dto.developer;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 修改密码Dto
 * @author liuyang
　* @date 创建时间：2016年9月30日 上午11:32:39
 *
 */
public class DeveloperPasswordDto {
    private int id;
    private String password;

    @NotNull(message="修改的ID不能为空")
    public int getId() {
        return id;
    }
    @NotBlank(message = "修改密码不能为空")
    public String getPassword() {
        return password;
    }
    
    

}
