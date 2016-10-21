package com.aether.dto.devices;

import java.io.Serializable;

public class DevicesDto implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**日期**/
    private String createdate;

    /**国家**/
    private String country;

    /**语言**/
    private String language;

    /**状态**/
    private Integer status;

    /****/
    private String macSha1;

    /****/
    private String macMd5;

    /****/
    private String androidId;

    /****/
    private String fbAttributionId;

    /****/
    private String clientSdk;

    /**设备通过哪个包进入的**/
    private String packagename;

    /**版本号**/
    private String version;

    /****/
    private String deviceType;

    /****/
    private String deviceName;

    /****/
    private String deviceManufacturer;

    /****/
    private String osName;

    /****/
    private String osVersion;

    /****/
    private String apiLevel;

    /****/
    private String screenSize;

    /****/
    private String screenFormat;

    /****/
    private String screenDensity;

    /****/
    private Integer displayWidth;

    /****/
    private Integer displayHeight;

    /****/
    private String pluginKeys;

    /****/
    private String createdAt;

    /**计数**/
    private Integer sessionCount;

    /****/
    private String clientIp;

    /****/
    private String environment;

    /****/
    private Integer needsAttributionData;

    /****/
    private String appToken;

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMacSha1() {
        return macSha1;
    }

    public void setMacSha1(String macSha1) {
        this.macSha1 = macSha1;
    }

    public String getMacMd5() {
        return macMd5;
    }

    public void setMacMd5(String macMd5) {
        this.macMd5 = macMd5;
    }

    public String getAndroidId() {
        return androidId;
    }

    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }

    public String getFbAttributionId() {
        return fbAttributionId;
    }

    public void setFbAttributionId(String fbAttributionId) {
        this.fbAttributionId = fbAttributionId;
    }

    public String getClientSdk() {
        return clientSdk;
    }

    public void setClientSdk(String clientSdk) {
        this.clientSdk = clientSdk;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public void setDeviceManufacturer(String deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getApiLevel() {
        return apiLevel;
    }

    public void setApiLevel(String apiLevel) {
        this.apiLevel = apiLevel;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenFormat() {
        return screenFormat;
    }

    public void setScreenFormat(String screenFormat) {
        this.screenFormat = screenFormat;
    }

    public String getScreenDensity() {
        return screenDensity;
    }

    public void setScreenDensity(String screenDensity) {
        this.screenDensity = screenDensity;
    }

    public Integer getDisplayWidth() {
        return displayWidth;
    }

    public void setDisplayWidth(Integer displayWidth) {
        this.displayWidth = displayWidth;
    }

    public Integer getDisplayHeight() {
        return displayHeight;
    }

    public void setDisplayHeight(Integer displayHeight) {
        this.displayHeight = displayHeight;
    }

    public String getPluginKeys() {
        return pluginKeys;
    }

    public void setPluginKeys(String pluginKeys) {
        this.pluginKeys = pluginKeys;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(Integer sessionCount) {
        this.sessionCount = sessionCount;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Integer getNeedsAttributionData() {
        return needsAttributionData;
    }

    public void setNeedsAttributionData(Integer needsAttributionData) {
        this.needsAttributionData = needsAttributionData;
    }

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    
}
