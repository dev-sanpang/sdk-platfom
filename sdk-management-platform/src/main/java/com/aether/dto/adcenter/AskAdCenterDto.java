package com.aether.dto.adcenter;


public class AskAdCenterDto {
    //app包名
    private String packageName;
    
    private String androidUuid;
    
    private String language;
    
    private String country;
    
    private int adPositionID;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getAndroidUuid() {
        return androidUuid;
    }

    public void setAndroidUuid(String androidUuid) {
        this.androidUuid = androidUuid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAdPositionID() {
        return adPositionID;
    }

    public void setAdPositionID(int adPositionID) {
        this.adPositionID = adPositionID;
    }

    
}
