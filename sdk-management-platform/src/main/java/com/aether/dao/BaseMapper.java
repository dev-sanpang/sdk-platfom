package com.aether.dao;

import java.util.List;

public interface BaseMapper<T> {

	Integer deleteByPrimaryKey(Object key);

	Integer insertSelective (T record);

	Integer insert(T record);

	Integer updateByPrimaryKeySelective(T record);

	Integer updateByPrimaryKey(T record);
	
	T selectByPrimaryKey(Object key);
	
	List<T> selectByWhere(T record);
}
