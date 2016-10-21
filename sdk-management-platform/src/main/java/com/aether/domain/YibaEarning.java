package com.aether.domain;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class YibaEarning implements Serializable {

	/****/
	private Integer id;

	/**广告平台ID**/
	private Integer adCenterID;

	/**实收金额**/
	private double amount;

	/**账款开始时间**/
	private java.util.Date amountDateStart;

	/**账款结束时间**/
	private java.util.Date amountDateEnd;

	/**开始时间**/
	private java.util.Date createtime;

	/**结束时间**/
	private java.util.Date updatetime;



	public YibaEarning setId(Integer id){
		this.id = id;
		return this;
	}

	public Integer getId(){
		return this.id;
	}

	public YibaEarning setAdCenterID(Integer adCenterID){
		this.adCenterID = adCenterID;
		return this;
	}

	public Integer getAdCenterID(){
		return this.adCenterID;
	}

	public YibaEarning setAmount(double amount){
		this.amount = amount;
		return this;
	}

	public double getAmount(){
		return this.amount;
	}

	public YibaEarning setAmountDateStart(java.util.Date amountDateStart){
		this.amountDateStart = amountDateStart;
		return this;
	}

	public java.util.Date getAmountDateStart(){
		return this.amountDateStart;
	}

	public YibaEarning setAmountDateEnd(java.util.Date amountDateEnd){
		this.amountDateEnd = amountDateEnd;
		return this;
	}

	public java.util.Date getAmountDateEnd(){
		return this.amountDateEnd;
	}

	public YibaEarning setCreatetime(java.util.Date createtime){
		this.createtime = createtime;
		return this;
	}

	public java.util.Date getCreatetime(){
		return this.createtime;
	}

	public YibaEarning setUpdatetime(java.util.Date updatetime){
		this.updatetime = updatetime;
		return this;
	}

	public java.util.Date getUpdatetime(){
		return this.updatetime;
	}

}
