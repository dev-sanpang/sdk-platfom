package com.aether.dto.eventinfo;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 事件
 * 
 * @author liuyang
 *
 */
public class EventDto {
    // 事件名称
    private String eventName;

    // 事件说明
    private String eventExplain;

    @NotBlank(message = "事件名称不能为空")
    public String getEventName() {
        return eventName;
    }

    @NotBlank(message = "事件说明不能为空")
    public String getEventExplain() {
        return eventExplain;
    }

}
