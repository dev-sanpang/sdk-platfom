package com.aether.dto.eventinfo;

import javax.validation.constraints.NotNull;

public class EventUpdateDto {
    private int id;
    // 事件名称
    private String eventName;

    // 事件说明
    private String eventExplain;

    @NotNull(message = "修改的ID不能为空")
    public int getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventExplain() {
        return eventExplain;
    }

}
