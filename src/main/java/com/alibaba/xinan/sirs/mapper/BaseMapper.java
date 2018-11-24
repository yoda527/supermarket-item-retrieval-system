package com.alibaba.xinan.sirs.mapper;

import java.util.List;

/**
 * @author XinAnzzZ
 * @date 2018/11/22 15:51
 */
public interface BaseMapper<T> {

    /**
     * save one
     *
     * @param t the entity
     */
    void save(T t);

    /**
     * delete by id
     *
     * @param id the id
     */
    void deleteById(int id);

    /**
     * find by id
     *
     * @param id the id
     * @return the entity
     */
    T findById(int id);

    /**
     * find all
     *
     * @return the list
     */
    List<T> findAll();
}
