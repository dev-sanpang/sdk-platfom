package com.aether.domain;
import java.io.Serializable;


/**
 * 
 * 记录新增设备(手机信息)
 * 
 **/
@SuppressWarnings("serial")
public class Deviceinfo implements Serializable {

	/****/
	private Integer id;

	/****/
	private String appName;

	/****/
	private Integer status;
	
	private Integer upgrade;

	/****/
	private String macSha1;

	/****/
	private String macMd5;

	/****/
	private String androidId;

	/****/
	private String fbAttributionId;

	/****/
	private String clientSdk;

	/****/
	private String packageName;

	/****/
	private String appVersion;

	/****/
	private String deviceType;

	/****/
	private String deviceName;

	/****/
	private String deviceManufacturer;

	/****/
	private String osName;

	/****/
	private String osVersion;

	/****/
	private String apiLevel;

	/****/
	private String language;

	/****/
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

	/****/
	private String createdAt;

	/**计数**/
	private Integer sessionCount;

	/****/
	private String androidUuid;

	/****/
	private String clientIp;

	/****/
	private String environment;

	/****/
	private Integer needsAttributionData;

	/****/
	private String appToken;

	/****/
	private String createTime;

	/****/
	private String updateTime;

	/****/
	private String createDate;
	
	private String eventDate;

	/****/
	private String updateDate;



	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public Deviceinfo setId(Integer id){
		this.id = id;
		return this;
	}

	public Integer getId(){
		return this.id;
	}

	public Deviceinfo setAppName(String appName){
		this.appName = appName;
		return this;
	}

	public String getAppName(){
		return this.appName;
	}

	public Deviceinfo setStatus(Integer status){
		this.status = status;
		return this;
	}

	public Integer getStatus(){
		return this.status;
	}

	
	public Integer getUpgrade() {
		return upgrade;
	}

	public void setUpgrade(Integer upgrade) {
		this.upgrade = upgrade;
	}

	public Deviceinfo setMacSha1(String macSha1){
		this.macSha1 = macSha1;
		return this;
	}

	public String getMacSha1(){
		return this.macSha1;
	}

	public Deviceinfo setMacMd5(String macMd5){
		this.macMd5 = macMd5;
		return this;
	}

	public String getMacMd5(){
		return this.macMd5;
	}

	public Deviceinfo setAndroidId(String androidId){
		this.androidId = androidId;
		return this;
	}

	public String getAndroidId(){
		return this.androidId;
	}

	public Deviceinfo setFbAttributionId(String fbAttributionId){
		this.fbAttributionId = fbAttributionId;
		return this;
	}

	public String getFbAttributionId(){
		return this.fbAttributionId;
	}

	public Deviceinfo setClientSdk(String clientSdk){
		this.clientSdk = clientSdk;
		return this;
	}

	public String getClientSdk(){
		return this.clientSdk;
	}

	public Deviceinfo setPackageName(String packageName){
		this.packageName = packageName;
		return this;
	}

	public String getPackageName(){
		return this.packageName;
	}

	public Deviceinfo setAppVersion(String appVersion){
		this.appVersion = appVersion;
		return this;
	}

	public String getAppVersion(){
		return this.appVersion;
	}

	public Deviceinfo setDeviceType(String deviceType){
		this.deviceType = deviceType;
		return this;
	}

	public String getDeviceType(){
		return this.deviceType;
	}

	public Deviceinfo setDeviceName(String deviceName){
		this.deviceName = deviceName;
		return this;
	}

	public String getDeviceName(){
		return this.deviceName;
	}

	public Deviceinfo setDeviceManufacturer(String deviceManufacturer){
		this.deviceManufacturer = deviceManufacturer;
		return this;
	}

	public String getDeviceManufacturer(){
		return this.deviceManufacturer;
	}

	public Deviceinfo setOsName(String osName){
		this.osName = osName;
		return this;
	}

	public String getOsName(){
		return this.osName;
	}

	public Deviceinfo setOsVersion(String osVersion){
		this.osVersion = osVersion;
		return this;
	}

	public String getOsVersion(){
		return this.osVersion;
	}

	public Deviceinfo setApiLevel(String apiLevel){
		this.apiLevel = apiLevel;
		return this;
	}

	public String getApiLevel(){
		return this.apiLevel;
	}

	public Deviceinfo setLanguage(String language){
		this.language = language;
		return this;
	}

	public String getLanguage(){
		return this.language;
	}

	public Deviceinfo setCountry(String country){
		this.country = country;
		return this;
	}

	public String getCountry(){
		return this.country;
	}

	public Deviceinfo setScreenSize(String screenSize){
		this.screenSize = screenSize;
		return this;
	}

	public String getScreenSize(){
		return this.screenSize;
	}

	public Deviceinfo setScreenFormat(String screenFormat){
		this.screenFormat = screenFormat;
		return this;
	}

	public String getScreenFormat(){
		return this.screenFormat;
	}

	public Deviceinfo setScreenDensity(String screenDensity){
		this.screenDensity = screenDensity;
		return this;
	}

	public String getScreenDensity(){
		return this.screenDensity;
	}

	public Deviceinfo setDisplayWidth(Integer displayWidth){
		this.displayWidth = displayWidth;
		return this;
	}

	public Integer getDisplayWidth(){
		return this.displayWidth;
	}

	public Deviceinfo setDisplayHeight(Integer displayHeight){
		this.displayHeight = displayHeight;
		return this;
	}

	public Integer getDisplayHeight(){
		return this.displayHeight;
	}

	public Deviceinfo setPluginKeys(String pluginKeys){
		this.pluginKeys = pluginKeys;
		return this;
	}

	public String getPluginKeys(){
		return this.pluginKeys;
	}

	public Deviceinfo setCreatedAt(String createdAt){
		this.createdAt = createdAt;
		return this;
	}

	public String getCreatedAt(){
		return this.createdAt;
	}

	public Deviceinfo setSessionCount(Integer sessionCount){
		this.sessionCount = sessionCount;
		return this;
	}

	public Integer getSessionCount(){
		return this.sessionCount;
	}

	public Deviceinfo setAndroidUuid(String androidUuid){
		this.androidUuid = androidUuid;
		return this;
	}

	public String getAndroidUuid(){
		return this.androidUuid;
	}

	public Deviceinfo setClientIp(String clientIp){
		this.clientIp = clientIp;
		return this;
	}

	public String getClientIp(){
		return this.clientIp;
	}

	public Deviceinfo setEnvironment(String environment){
		this.environment = environment;
		return this;
	}

	public String getEnvironment(){
		return this.environment;
	}

	public Deviceinfo setNeedsAttributionData(Integer needsAttributionData){
		this.needsAttributionData = needsAttributionData;
		return this;
	}

	public Integer getNeedsAttributionData(){
		return this.needsAttributionData;
	}

	public Deviceinfo setAppToken(String appToken){
		this.appToken = appToken;
		return this;
	}

	public String getAppToken(){
		return this.appToken;
	}

	public Deviceinfo setCreateTime(String createTime){
		this.createTime = createTime;
		return this;
	}

	public String getCreateTime(){
		return this.createTime;
	}

	public Deviceinfo setUpdateTime(String updateTime){
		this.updateTime = updateTime;
		return this;
	}

	public String getUpdateTime(){
		return this.updateTime;
	}

	public Deviceinfo setCreateDate(String createDate){
		this.createDate = createDate;
		return this;
	}

	public String getCreateDate(){
		return this.createDate;
	}

	public Deviceinfo setUpdateDate(String updateDate){
		this.updateDate = updateDate;
		return this;
	}

	public String getUpdateDate(){
		return this.updateDate;
	}

}
