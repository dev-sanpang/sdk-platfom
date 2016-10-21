package com.aether.domain;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class Developer implements Serializable {

	/****/
	private Integer id;

	/**开发者名称**/
	private String developerName;

	/**密码**/
	private String password;

	/**邮箱**/
	private String mail;

	/**地址**/
	private String address;

	/**联系方式**/
	private String tel;

	/****/
	private java.util.Date createtime;

	/****/
	private java.util.Date updatetime;



	public Developer setId(Integer id){
		this.id = id;
		return this;
	}

	public Integer getId(){
		return this.id;
	}

	public Developer setDeveloperName(String developerName){
		this.developerName = developerName;
		return this;
	}

	public String getDeveloperName(){
		return this.developerName;
	}

	public Developer setPassword(String password){
		this.password = password;
		return this;
	}

	public String getPassword(){
		return this.password;
	}

	public Developer setMail(String mail){
		this.mail = mail;
		return this;
	}

	public String getMail(){
		return this.mail;
	}

	public Developer setAddress(String address){
		this.address = address;
		return this;
	}

	public String getAddress(){
		return this.address;
	}

	public Developer setTel(String tel){
		this.tel = tel;
		return this;
	}

	public String getTel(){
		return this.tel;
	}

	public Developer setCreatetime(java.util.Date createtime){
		this.createtime = createtime;
		return this;
	}

	public java.util.Date getCreatetime(){
		return this.createtime;
	}

	public Developer setUpdatetime(java.util.Date updatetime){
		this.updatetime = updatetime;
		return this;
	}

	public java.util.Date getUpdatetime(){
		return this.updatetime;
	}

}
