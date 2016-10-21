package com.aether.domain;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class CenterEarning implements Serializable {

	/****/
	private Integer id;

	/**网盟的ID**/
	private Integer adCenterID;

	/**金额**/
	private double earnings;

	/**运营变现时间**/
	private java.util.Date optDate;

	/**创建时间**/
	private java.util.Date createtime;



	public CenterEarning setId(Integer id){
		this.id = id;
		return this;
	}

	public Integer getId(){
		return this.id;
	}

	public CenterEarning setAdCenterID(Integer adCenterID){
		this.adCenterID = adCenterID;
		return this;
	}

	public Integer getAdCenterID(){
		return this.adCenterID;
	}

	public CenterEarning setEarnings(double earnings){
		this.earnings = earnings;
		return this;
	}

	public double getEarnings(){
		return this.earnings;
	}

	public CenterEarning setOptDate(java.util.Date optDate){
		this.optDate = optDate;
		return this;
	}

	public java.util.Date getOptDate(){
		return this.optDate;
	}

	public CenterEarning setCreatetime(java.util.Date createtime){
		this.createtime = createtime;
		return this;
	}

	public java.util.Date getCreatetime(){
		return this.createtime;
	}

}
