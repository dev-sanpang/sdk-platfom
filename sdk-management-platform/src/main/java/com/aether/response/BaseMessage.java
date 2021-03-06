package com.aether.response;

public class BaseMessage extends Message{
    private Object data;

    public BaseMessage() {
        super();
    }

    public BaseMessage(MessageCode messageCode) {
        this.code = messageCode.getCode();
        this.msg = messageCode.getMsg();
    }

    public BaseMessage(int code, String msg) {
        super(code, msg);
    }

    public BaseMessage(int code, String msg, Object data) {
        this(code, msg);
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
