package com.learn.paik.dao;

import com.learn.entity.TCount;

public interface TCountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_count
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer fCountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_count
     *
     * @mbg.generated
     */
    int insert(TCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_count
     *
     * @mbg.generated
     */
    int insertSelective(TCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_count
     *
     * @mbg.generated
     */
    TCount selectByPrimaryKey(Integer fCountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_count
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_count
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCount record);
}