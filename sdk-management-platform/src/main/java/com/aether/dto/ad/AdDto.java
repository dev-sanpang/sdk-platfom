package com.aether.dto.ad;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 广告和广告平台
 * 
 * @author liuyang
 *
 */
public class AdDto {
    // 广告名称
    private String adName;

    // 查看广告的URL
    private String managerURL;

    // 请求广告的URL
    private String requestURL;

    // 平台名称
    private String centerName;

    // 级别
    private int level;

    @NotBlank(message = "广告名称不能为空")
    public String getAdName() {
        return adName;
    }

    @NotBlank(message = "查看广告的URL不能为空")
    public String getManagerURL() {
        return managerURL;
    }

    @NotBlank(message = "请求广告的URL不能为空")
    public String getRequestURL() {
        return requestURL;
    }

    @NotBlank(message = "平台名称不能为空")
    public String getCenterName() {
        return centerName;
    }

    public int getLevel() {
        return level;
    }

}
