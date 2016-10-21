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
@Table(name="tbl_ad_center_level")
public class AdCenterLevel implements Serializable {

	/**广告位ID**/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adPositionID;

	/**网盟ID**/
	private int adCenterID;

	/**网盟名称**/
	private String centerName;

	/**等级**/
	private int level;



	public AdCenterLevel setAdPositionID(int adPositionID){
		this.adPositionID = adPositionID;
		return this;
	}

	public int getAdPositionID(){
		return this.adPositionID;
	}

	public AdCenterLevel setAdCenterID(int adCenterID){
		this.adCenterID = adCenterID;
		return this;
	}

	public int getAdCenterID(){
		return this.adCenterID;
	}

	public AdCenterLevel setCenterName(String centerName){
		this.centerName = centerName;
		return this;
	}

	public String getCenterName(){
		return this.centerName;
	}

	public AdCenterLevel setLevel(int level){
		this.level = level;
		return this;
	}

	public int getLevel(){
		return this.level;
	}

}
