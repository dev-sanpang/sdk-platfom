package com.aether.dto.apps;

import javax.validation.constraints.NotNull;

public class AppsUpdateDto {

    private Integer id;

    private int developerID;

    private String appName;

    private String packageName;

    private String appType;

    private int level;

    @NotNull(message = "修改的ID不能为空")
    public Integer getId() {
        return id;
    }

    public int getDeveloperID() {
        return developerID;
    }

    public String getAppName() {
        return appName;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getAppType() {
        return appType;
    }

    public int getLevel() {
        return level;
    }

}
