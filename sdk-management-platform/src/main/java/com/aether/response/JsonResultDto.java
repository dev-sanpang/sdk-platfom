package com.aether.response;

import java.io.Serializable;
import java.util.List;

public class  JsonResultDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<?> data;

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	
}
