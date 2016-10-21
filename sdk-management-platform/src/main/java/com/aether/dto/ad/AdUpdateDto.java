package com.aether.dto.ad;

import javax.validation.constraints.NotNull;

public class AdUpdateDto {
    private Integer id;

    // 广告平台ID
    private Integer adCenterId;

    // 查看广告的URL
    private String managerURL;

    // 请求广告的URL
    private String requestURL;

    // 平台名称
    private String centerName;

    // 级别
    private int level;

    // 广告名称
    private String adName;

    @NotNull(message = "修改的ID不能为空")
    public Integer getId() {
        return id;
    }

    public String getAdName() {
        return adName;
    }
    @NotNull(message = "修改的CenterId不能为空")
    public Integer getAdCenterId() {
        return adCenterId;
    }

    public String getManagerURL() {
        return managerURL;
    }

    public String getRequestURL() {
        return requestURL;
    }

    public String getCenterName() {
        return centerName;
    }

    public int getLevel() {
        return level;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

}
