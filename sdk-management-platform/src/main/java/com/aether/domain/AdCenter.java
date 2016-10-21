package com.aether.domain;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
@Entity
@Table(name="tbl_ad_center")
public class AdCenter implements Serializable {

	/****/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**查看广告的URL**/
	private String managerURL;

	/**请求广告的URL**/
	private String requestURL;

	/**网盟名称**/
	private String centerName;

	/**请求方式**/
	private String requestMethod;

	/**请求类型**/
	private String requestType;

	/**请求体**/
	private String requestBody;

	/**回复体**/
	private String responseBody;

	/**创建时间**/
	private java.util.Date createtime;

	/**修改时间**/
	private java.util.Date updatetime;

	/****/
	private String status;



	public AdCenter setId(int id){
		this.id = id;
		return this;
	}

	public int getId(){
		return this.id;
	}

	public AdCenter setManagerURL(String managerURL){
		this.managerURL = managerURL;
		return this;
	}

	public String getManagerURL(){
		return this.managerURL;
	}

	public AdCenter setRequestURL(String requestURL){
		this.requestURL = requestURL;
		return this;
	}

	public String getRequestURL(){
		return this.requestURL;
	}

	public AdCenter setCenterName(String centerName){
		this.centerName = centerName;
		return this;
	}

	public String getCenterName(){
		return this.centerName;
	}

	public AdCenter setRequestMethod(String requestMethod){
		this.requestMethod = requestMethod;
		return this;
	}

	public String getRequestMethod(){
		return this.requestMethod;
	}

	public AdCenter setRequestType(String requestType){
		this.requestType = requestType;
		return this;
	}

	public String getRequestType(){
		return this.requestType;
	}

	public AdCenter setRequestBody(String requestBody){
		this.requestBody = requestBody;
		return this;
	}

	public String getRequestBody(){
		return this.requestBody;
	}

	public AdCenter setResponseBody(String responseBody){
		this.responseBody = responseBody;
		return this;
	}

	public String getResponseBody(){
		return this.responseBody;
	}

	public AdCenter setCreatetime(java.util.Date createtime){
		this.createtime = createtime;
		return this;
	}

	public java.util.Date getCreatetime(){
		return this.createtime;
	}

	public AdCenter setUpdatetime(java.util.Date updatetime){
		this.updatetime = updatetime;
		return this;
	}

	public java.util.Date getUpdatetime(){
		return this.updatetime;
	}

	public AdCenter setStatus(String status){
		this.status = status;
		return this;
	}

	public String getStatus(){
		return this.status;
	}

}
