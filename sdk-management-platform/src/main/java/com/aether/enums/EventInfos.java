package com.aether.enums;

/**
* @ClassName: EventInfos 
* @Description: SDK事件名称对应编号
* @author 巨壁 
* @date 2016年10月17日 上午10:45:53
 */
public enum EventInfos {

    //0：连接WiFi成功的次数
    EVENT_CONNECT_WIFI(0),
    //1：连接FREE WiFi成功的次数
    EVENT_CONNECT_WIFI_FREE_OK(1),
    //2：连接OPEN WiFi成功的次数
    EVENT_CONNECT_WIFI_OPEN_OK(2),
    //3: 点击通知栏OPEN WiFi的次数
    EVENT_NOTIFICATION_OPEN_CLICK(3),
    //4：点击通知栏FREE WiFi的次数
    EVENT_NOTIFICATION_FREE_CLICK(4),
    //5：用户活跃度
    Active(5),
    //6：广告点击次数
    EVENT_AD_CLICK(6),
    //7.获取FREE WiFi的次数
    EVENT_GET_FREEWIFI(7),
    //8.推送到OPEN WiFi的次数
    EVENT_NOTIFICATION_OPEN_COME(8),
    //9.推送到FREE WiFi的次数
    EVENT_NOTIFICATION_FREE_COME(9),
    //10.进入界面的次数
    EVENT_FRAGMENT(10);
    
    private Integer eventNum;
    
    public Integer getStastus() {
        return eventNum;
    }

    private EventInfos(Integer eventNum){
        this.eventNum=eventNum;
    }
}
