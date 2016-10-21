package com.aether.controller.bootstrap;


public class PageResult {
	
	
	private Object rows;
	private Integer total;
	
	
	public PageResult() {
		super();
	}
	
	
	public PageResult(Object rows, Integer total) {
		super();
		this.rows = rows;
		this.total = total;
	}


	public Object getRows() {
		return rows;
	}


	public void setRows(Object rows) {
		this.rows = rows;
	}


	public Integer getTotal() {
		return total;
	}


	public void setTotal(Integer total) {
		this.total = total;
	}
	
	
	
	

}
