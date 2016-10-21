package com.aether.domain;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class Apps implements Serializable {

	/****/
	private Integer id;

	/**开发者ID**/
	private Integer developerID;

	/**接入SDK的app**/
	private String appName;

	/**接入app的包名**/
	private String packageName;

	/**app类型**/
	private String appType;

	/**等级**/
	private Integer level;

	/**状态**/
	private String status;

	/**创建时间**/
	private java.util.Date createtime;

	/**修改时间**/
	private java.util.Date updatetime;



	public Apps setId(Integer id){
		this.id = id;
		return this;
	}

	public Integer getId(){
		return this.id;
	}

	public Apps setDeveloperID(Integer developerID){
		this.developerID = developerID;
		return this;
	}

	public Integer getDeveloperID(){
		return this.developerID;
	}

	public Apps setAppName(String appName){
		this.appName = appName;
		return this;
	}

	public String getAppName(){
		return this.appName;
	}

	public Apps setPackageName(String packageName){
		this.packageName = packageName;
		return this;
	}

	public String getPackageName(){
		return this.packageName;
	}

	public Apps setAppType(String appType){
		this.appType = appType;
		return this;
	}

	public String getAppType(){
		return this.appType;
	}

	public Apps setLevel(Integer level){
		this.level = level;
		return this;
	}

	public Integer getLevel(){
		return this.level;
	}

	public Apps setStatus(String status){
		this.status = status;
		return this;
	}

	public String getStatus(){
		return this.status;
	}

	public Apps setCreatetime(java.util.Date createtime){
		this.createtime = createtime;
		return this;
	}

	public java.util.Date getCreatetime(){
		return this.createtime;
	}

	public Apps setUpdatetime(java.util.Date updatetime){
		this.updatetime = updatetime;
		return this;
	}

	public java.util.Date getUpdatetime(){
		return this.updatetime;
	}

}
