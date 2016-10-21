package com.aether.dto.apps;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class AppsDto {
    // 开发者ID
    private int developerID;

    // 接入SDK的app
    private String appName;

    // 接入app的包名
    private String packageName;

    // app类型
    private String appType;

    // 等级
    private int level;

    @NotNull(message = "开发者ID不能为空")
    public int getDeveloperID() {
        return developerID;
    }

    @NotBlank(message = "接入SDK的app不能为空")
    public String getAppName() {
        return appName;
    }

    @NotBlank(message = "接入app的包名不能为空")
    public String getPackageName() {
        return packageName;
    }

    @NotBlank(message = "app类型不能为空")
    public String getAppType() {
        return appType;
    }

    @NotNull(message = "等级不能为空")
    public int getLevel() {
        return level;
    }

}
