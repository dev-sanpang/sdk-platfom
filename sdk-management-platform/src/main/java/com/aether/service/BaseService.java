package com.aether.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.aether.dao.BaseMapper;


/**
 * 通用Service，实现CRUD
 * 
 *
 * @param <T>
 */
public abstract class BaseService<T> {

    public abstract BaseMapper<T> getMapper();

    /**
     * 保存数据
     * 
     * @param t
     */
    public Integer save(T t) {
        return getMapper().insertSelective(t);
    }

    /**
     * 根据条件删除数据
     * 
     * @param t 条件
     * @return 删除数据的条数
     */
    public Integer delete(Long id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    /**
     * 根据条件修改数据
     * 
     * @param t
     * @return
     */
    public Integer update(T t) {
        return getMapper().updateByPrimaryKeySelective(t);
    }

    /**
     * 根据ID查询数据
     * 
     * @param id
     * @return
     */
    public T queryById(Integer id) {
        return getMapper().selectByPrimaryKey(id);
    }

    /**
     * 根据条件查询数据
     * 
     * @return
     */
    public T queryByWhere(T t) {
        List<T> list = getMapper().selectByWhere(t);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

   /* *//**
     * 查询所有数据
     * 
     * @return
     *//*
    public List<T> queryAll() {
        return getMapper().select(null);
    }*/

    /**
     * 根据条件查询+任意条件
     * 
     * @return
     */
     public List<T> queryList(T t) {
        return getMapper().selectByWhere(t);
    }

    /**
     * 分页查询数据
     * 
     * @return
     */
   /* public PageInfo<T> queryPageList(Integer page, Integer pageSize) {
        // 分页条件
        PageHelper.startPage(page, pageSize, true);
        List<T> list = this.queryAll();
        return new PageInfo<T>(list);
    }*/

    /**
     * 根据条件分页查询
     * 
     * @param page 当前页数
     * @param pageSize 每页显示的数据条数
     * @param t
     * @return
     */
   /* public PageInfo<T> queryPageList(Integer page, Integer pageSize, T t) {
        // 分页条件
        PageHelper.startPage(page, pageSize, true);
        List<T> list = this.queryList(t);
        return new PageInfo<T>(list);
    }*/

}
