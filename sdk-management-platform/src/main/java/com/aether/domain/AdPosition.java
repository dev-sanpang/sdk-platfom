package com.aether.domain;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class AdPosition implements Serializable {

	/****/
	private Integer id;

	/**广告位名称**/
	private String positionName;

	/**广告类型**/
	private String adType;

	/**可缓存广告的条数**/
	private Integer cacheNum;



	public AdPosition setId(Integer id){
		this.id = id;
		return this;
	}

	public Integer getId(){
		return this.id;
	}

	public AdPosition setPositionName(String positionName){
		this.positionName = positionName;
		return this;
	}

	public String getPositionName(){
		return this.positionName;
	}

	public AdPosition setAdType(String adType){
		this.adType = adType;
		return this;
	}

	public String getAdType(){
		return this.adType;
	}

	public AdPosition setCacheNum(Integer cacheNum){
		this.cacheNum = cacheNum;
		return this;
	}

	public Integer getCacheNum(){
		return this.cacheNum;
	}

}
