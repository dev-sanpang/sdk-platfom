package com.aether.dto.sdk;

public class EventNumBean {
	private String tablename;
	
	private String eventToken;
	
	private int eventNum;
	
	private int eventUserNum;

	private String showDate;
	
	private String packageName;
	
	


	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getEventToken() {
		return eventToken;
	}

	public void setEventToken(String eventToken) {
		this.eventToken = eventToken;
	}

	public int getEventNum() {
		return eventNum;
	}

	public void setEventNum(int eventNum) {
		this.eventNum = eventNum;
	}

	public int getEventUserNum() {
		return eventUserNum;
	}

	public void setEventUserNum(int eventUserNum) {
		this.eventUserNum = eventUserNum;
	}
	
	
}
