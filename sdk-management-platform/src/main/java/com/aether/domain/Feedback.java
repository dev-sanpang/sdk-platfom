package com.aether.domain;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class Feedback implements Serializable {

	/****/
	private Integer id;

	/**内容**/
	private String feedback;

	/****/
	private String createtime;

	/**联系方式**/
	private String contactway;



	public Feedback setId(Integer id){
		this.id = id;
		return this;
	}

	public Integer getId(){
		return this.id;
	}

	public Feedback setFeedback(String feedback){
		this.feedback = feedback;
		return this;
	}

	public String getFeedback(){
		return this.feedback;
	}

	public Feedback setCreatetime(String createtime){
		this.createtime = createtime;
		return this;
	}

	public String getCreatetime(){
		return this.createtime;
	}

	public Feedback setContactway(String contactway){
		this.contactway = contactway;
		return this;
	}

	public String getContactway(){
		return this.contactway;
	}

}
