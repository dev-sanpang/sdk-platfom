package com.aether.response.adCenter;

public class AskAdCenterResp {
    /**查看广告的URL**/
    private String managerURL;

    /**请求广告的URL**/
    private String requestURL;

    /**网盟名称**/
    private String centerName;

    /**请求方式**/
    private String requestMethod;

    /**请求类型**/
    private String requestType;

    /**请求体**/
    private String requestBody;

    /**回复体**/
    private String responseBody;
    
    /**返回等级**/
    private int level;

    public String getManagerURL() {
        return managerURL;
    }

    public void setManagerURL(String managerURL) {
        this.managerURL = managerURL;
    }

    public String getRequestURL() {
        return requestURL;
    }

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
}
