package com.aether.dto.sdk;

public class YiBaResult {

    private Integer status;

    private Object msg;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public YiBaResult() {
    }

    public YiBaResult(Integer status, Object msg) {
        this.status = status;
        this.msg = msg;
    }

    public YiBaResult(Integer status) {
        this.status = status;
    }

    public static YiBaResult ok() {
        return new YiBaResult(200, "ok");
    }
    
    public static YiBaResult ok(Object msg) {
        return new YiBaResult(200, msg);
    }

}
