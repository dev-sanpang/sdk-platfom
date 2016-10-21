package com.aether.domain;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class Ad implements Serializable {

	/****/
	private Integer id;

	/**广告唯一码**/
	private String adID;

	/**广告平台ID**/
	private Integer adCenterID;

	/**广告名称**/
	private String adName;

	/**广告类型**/
	private String adType;

	/****/
	private java.util.Date createtime;

	/****/
	private java.util.Date updatetime;

	/****/
	private String status;



	public Ad setId(Integer id){
		this.id = id;
		return this;
	}

	public Integer getId(){
		return this.id;
	}

	public Ad setAdID(String adID){
		this.adID = adID;
		return this;
	}

	public String getAdID(){
		return this.adID;
	}

	public Ad setAdCenterID(Integer adCenterID){
		this.adCenterID = adCenterID;
		return this;
	}

	public Integer getAdCenterID(){
		return this.adCenterID;
	}

	public Ad setAdName(String adName){
		this.adName = adName;
		return this;
	}

	public String getAdName(){
		return this.adName;
	}

	public Ad setAdType(String adType){
		this.adType = adType;
		return this;
	}

	public String getAdType(){
		return this.adType;
	}

	public Ad setCreatetime(java.util.Date createtime){
		this.createtime = createtime;
		return this;
	}

	public java.util.Date getCreatetime(){
		return this.createtime;
	}

	public Ad setUpdatetime(java.util.Date updatetime){
		this.updatetime = updatetime;
		return this;
	}

	public java.util.Date getUpdatetime(){
		return this.updatetime;
	}

	public Ad setStatus(String status){
		this.status = status;
		return this;
	}

	public String getStatus(){
		return this.status;
	}

}
