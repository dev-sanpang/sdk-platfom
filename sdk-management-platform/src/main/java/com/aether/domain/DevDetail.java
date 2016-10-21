package com.aether.domain;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class DevDetail implements Serializable {

	/****/
	private Integer id;

	/**分配金额日期**/
	private java.util.Date assignDate;

	/**总金额**/
	private double totalEarnings;

	/**开发者ID**/
	private Integer developerID;

	/**开发者金额**/
	private double devEarnings;



	public DevDetail setId(Integer id){
		this.id = id;
		return this;
	}

	public Integer getId(){
		return this.id;
	}

	public DevDetail setAssignDate(java.util.Date assignDate){
		this.assignDate = assignDate;
		return this;
	}

	public java.util.Date getAssignDate(){
		return this.assignDate;
	}

	public DevDetail setTotalEarnings(double totalEarnings){
		this.totalEarnings = totalEarnings;
		return this;
	}

	public double getTotalEarnings(){
		return this.totalEarnings;
	}

	public DevDetail setDeveloperID(Integer developerID){
		this.developerID = developerID;
		return this;
	}

	public Integer getDeveloperID(){
		return this.developerID;
	}

	public DevDetail setDevEarnings(double devEarnings){
		this.devEarnings = devEarnings;
		return this;
	}

	public double getDevEarnings(){
		return this.devEarnings;
	}

}
