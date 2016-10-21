package com.aether.dto.sdk;

public class GetInstallActiveNum {
	private String tableName;
	
	private String packageName;
	
	private String showDate;
	
	private int activeNum;
	
	private int installNum;
	
	private int activeUserNum;
	
	

	public int getActiveUserNum() {
		return activeUserNum;
	}

	public void setActiveUserNum(int activeUserNum) {
		this.activeUserNum = activeUserNum;
	}

	
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

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

	public int getActiveNum() {
		return activeNum;
	}

	public void setActiveNum(int activeNum) {
		this.activeNum = activeNum;
	}

	public int getInstallNum() {
		return installNum;
	}

	public void setInstallNum(int installNum) {
		this.installNum = installNum;
	}
	
	
}
