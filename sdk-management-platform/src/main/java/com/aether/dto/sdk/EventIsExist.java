package com.aether.dto.sdk;

public class EventIsExist {
	private String androidUuid;
	private String eventToken;
	private String tablename;
	private String appVersion;
	
	
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getEventToken() {
		return eventToken;
	}
	public void setEventToken(String eventToken) {
		this.eventToken = eventToken;
	}
	
	public String getAndroidUuid() {
		return androidUuid;
	}
	public void setAndroidUuid(String androidUuid) {
		this.androidUuid = androidUuid;
	}
	public String getTablename() {
		return tablename;
	}
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	
}
