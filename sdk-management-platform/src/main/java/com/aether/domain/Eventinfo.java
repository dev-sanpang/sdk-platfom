package com.aether.domain;
import java.io.Serializable;


/**
 * 
 * 事件对象. .包含手机信息
 * 
 **/
@SuppressWarnings("serial")
public class Eventinfo implements Serializable {

	private String tablename;
	/****/
	private Integer id;

	/**事件计数**/
	private Integer eventCount;

	/**事件名称**/
	private String eventToken;

	/****/
	private String macSha1;

	/****/
	private String macMd5;

	/****/
	private String androidId;

	/****/
	private String fbAttributionId;

	/**客户端统计SDK版本**/
	private String clientSdk;

	/**APP包名**/
	private String packageName;

	/**APP当前版本**/
	private String appVersion;

	/****/
	private String deviceType;

	/**机型**/
	private String deviceName;

	/****/
	private String deviceManufacturer;

	/**系统版本**/
	private String osName;

	/****/
	private String osVersion;

	/**android SDK 版本**/
	private String apiLevel;

	/**当前语言**/
	private String language;

	/**当前国家**/
	private String country;

	/****/
	private String screenSize;

	/****/
	private String screenFormat;

	/****/
	private String screenDensity;

	/****/
	private Integer displayWidth;

	/****/
	private Integer displayHeight;

	/****/
	private String pluginKeys;

	/**手机端记录时间**/
	private String createdAt;

	/**计数**/
	private Integer sessionCount;

	/**手机本地UUID**/
	private String androidUuid;

	/****/
	private String clientIp;

	/****/
	private String environment;

	/****/
	private Integer needsAttributionData;

	/****/
	private Integer timeSpent;

	/****/
	private Integer subsessionCount;

	/****/
	private Integer sessionLength;

	/****/
	private String location;

	/****/
	private String appToken;

	/**app名称**/
	private String appName;

	/**服务端新建时间**/
	private String createTime;

	/**服务端修改时间**/
	private String updateTime;

	/**服务端新建日期**/
	private String createDate;




	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public Eventinfo setId(Integer id){
		this.id = id;
		return this;
	}

	public Integer getId(){
		return this.id;
	}

	public Eventinfo setEventCount(Integer eventCount){
		this.eventCount = eventCount;
		return this;
	}

	public Integer getEventCount(){
		return this.eventCount;
	}

	public Eventinfo setEventToken(String eventToken){
		this.eventToken = eventToken;
		return this;
	}

	public String getEventToken(){
		return this.eventToken;
	}

	public Eventinfo setMacSha1(String macSha1){
		this.macSha1 = macSha1;
		return this;
	}

	public String getMacSha1(){
		return this.macSha1;
	}

	public Eventinfo setMacMd5(String macMd5){
		this.macMd5 = macMd5;
		return this;
	}

	public String getMacMd5(){
		return this.macMd5;
	}

	public Eventinfo setAndroidId(String androidId){
		this.androidId = androidId;
		return this;
	}

	public String getAndroidId(){
		return this.androidId;
	}

	public Eventinfo setFbAttributionId(String fbAttributionId){
		this.fbAttributionId = fbAttributionId;
		return this;
	}

	public String getFbAttributionId(){
		return this.fbAttributionId;
	}

	public Eventinfo setClientSdk(String clientSdk){
		this.clientSdk = clientSdk;
		return this;
	}

	public String getClientSdk(){
		return this.clientSdk;
	}

	public Eventinfo setPackageName(String packageName){
		this.packageName = packageName;
		return this;
	}

	public String getPackageName(){
		return this.packageName;
	}

	public Eventinfo setAppVersion(String appVersion){
		this.appVersion = appVersion;
		return this;
	}

	public String getAppVersion(){
		return this.appVersion;
	}

	public Eventinfo setDeviceType(String deviceType){
		this.deviceType = deviceType;
		return this;
	}

	public String getDeviceType(){
		return this.deviceType;
	}

	public Eventinfo setDeviceName(String deviceName){
		this.deviceName = deviceName;
		return this;
	}

	public String getDeviceName(){
		return this.deviceName;
	}

	public Eventinfo setDeviceManufacturer(String deviceManufacturer){
		this.deviceManufacturer = deviceManufacturer;
		return this;
	}

	public String getDeviceManufacturer(){
		return this.deviceManufacturer;
	}

	public Eventinfo setOsName(String osName){
		this.osName = osName;
		return this;
	}

	public String getOsName(){
		return this.osName;
	}

	public Eventinfo setOsVersion(String osVersion){
		this.osVersion = osVersion;
		return this;
	}

	public String getOsVersion(){
		return this.osVersion;
	}

	public Eventinfo setApiLevel(String apiLevel){
		this.apiLevel = apiLevel;
		return this;
	}

	public String getApiLevel(){
		return this.apiLevel;
	}

	public Eventinfo setLanguage(String language){
		this.language = language;
		return this;
	}

	public String getLanguage(){
		return this.language;
	}

	public Eventinfo setCountry(String country){
		this.country = country;
		return this;
	}

	public String getCountry(){
		return this.country;
	}

	public Eventinfo setScreenSize(String screenSize){
		this.screenSize = screenSize;
		return this;
	}

	public String getScreenSize(){
		return this.screenSize;
	}

	public Eventinfo setScreenFormat(String screenFormat){
		this.screenFormat = screenFormat;
		return this;
	}

	public String getScreenFormat(){
		return this.screenFormat;
	}

	public Eventinfo setScreenDensity(String screenDensity){
		this.screenDensity = screenDensity;
		return this;
	}

	public String getScreenDensity(){
		return this.screenDensity;
	}

	public Eventinfo setDisplayWidth(Integer displayWidth){
		this.displayWidth = displayWidth;
		return this;
	}

	public Integer getDisplayWidth(){
		return this.displayWidth;
	}

	public Eventinfo setDisplayHeight(Integer displayHeight){
		this.displayHeight = displayHeight;
		return this;
	}

	public Integer getDisplayHeight(){
		return this.displayHeight;
	}

	public Eventinfo setPluginKeys(String pluginKeys){
		this.pluginKeys = pluginKeys;
		return this;
	}

	public String getPluginKeys(){
		return this.pluginKeys;
	}

	public Eventinfo setCreatedAt(String createdAt){
		this.createdAt = createdAt;
		return this;
	}

	public String getCreatedAt(){
		return this.createdAt;
	}

	public Eventinfo setSessionCount(Integer sessionCount){
		this.sessionCount = sessionCount;
		return this;
	}

	public Integer getSessionCount(){
		return this.sessionCount;
	}

	public Eventinfo setAndroidUuid(String androidUuid){
		this.androidUuid = androidUuid;
		return this;
	}

	public String getAndroidUuid(){
		return this.androidUuid;
	}

	public Eventinfo setClientIp(String clientIp){
		this.clientIp = clientIp;
		return this;
	}

	public String getClientIp(){
		return this.clientIp;
	}

	public Eventinfo setEnvironment(String environment){
		this.environment = environment;
		return this;
	}

	public String getEnvironment(){
		return this.environment;
	}

	public Eventinfo setNeedsAttributionData(Integer needsAttributionData){
		this.needsAttributionData = needsAttributionData;
		return this;
	}

	public Integer getNeedsAttributionData(){
		return this.needsAttributionData;
	}

	public Eventinfo setTimeSpent(Integer timeSpent){
		this.timeSpent = timeSpent;
		return this;
	}

	public Integer getTimeSpent(){
		return this.timeSpent;
	}

	public Eventinfo setSubsessionCount(Integer subsessionCount){
		this.subsessionCount = subsessionCount;
		return this;
	}

	public Integer getSubsessionCount(){
		return this.subsessionCount;
	}

	public Eventinfo setSessionLength(Integer sessionLength){
		this.sessionLength = sessionLength;
		return this;
	}

	public Integer getSessionLength(){
		return this.sessionLength;
	}

	public Eventinfo setLocation(String location){
		this.location = location;
		return this;
	}

	public String getLocation(){
		return this.location;
	}

	public Eventinfo setAppToken(String appToken){
		this.appToken = appToken;
		return this;
	}

	public String getAppToken(){
		return this.appToken;
	}

	public Eventinfo setAppName(String appName){
		this.appName = appName;
		return this;
	}

	public String getAppName(){
		return this.appName;
	}

	public Eventinfo setCreateTime(String createTime){
		this.createTime = createTime;
		return this;
	}

	public String getCreateTime(){
		return this.createTime;
	}

	public Eventinfo setUpdateTime(String updateTime){
		this.updateTime = updateTime;
		return this;
	}

	public String getUpdateTime(){
		return this.updateTime;
	}

	public Eventinfo setCreateDate(String createDate){
		this.createDate = createDate;
		return this;
	}

	public String getCreateDate(){
		return this.createDate;
	}

}
