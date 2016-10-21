package com.aether.domain;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class Keep implements Serializable {

	/****/
	private Integer id;

	/****/
	private String createDate;
	
	private String country;

	/**新增用户**/
	private Integer addnum;

	/**次日活跃用户数**/
	private Integer left1;

	/**一周活跃数**/
	private Integer left7;
	
	private Integer left14;

	/**月活跃用户数**/
	private Integer left30;



	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Keep setId(Integer id){
		this.id = id;
		return this;
	}

	public Integer getId(){
		return this.id;
	}

	public Integer getLeft14() {
		return left14;
	}

	public void setLeft14(Integer left14) {
		this.left14 = left14;
	}

	public Keep setCreateDate(String createDate){
		this.createDate = createDate;
		return this;
	}

	public String getCreateDate(){
		return this.createDate;
	}

	public Keep setAddnum(Integer addnum){
		this.addnum = addnum;
		return this;
	}

	public Integer getAddnum(){
		return this.addnum;
	}

	public Keep setLeft1(Integer left1){
		this.left1 = left1;
		return this;
	}

	public Integer getLeft1(){
		return this.left1;
	}

	public Keep setLeft7(Integer left7){
		this.left7 = left7;
		return this;
	}

	public Integer getLeft7(){
		return this.left7;
	}

	public Keep setLeft30(Integer left30){
		this.left30 = left30;
		return this;
	}

	public Integer getLeft30(){
		return this.left30;
	}

}
