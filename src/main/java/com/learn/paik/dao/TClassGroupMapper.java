package com.learn.paik.dao;

import com.learn.entity.TClassGroup;

public interface TClassGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class_group
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer fClassGoupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class_group
     *
     * @mbg.generated
     */
    int insert(TClassGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class_group
     *
     * @mbg.generated
     */
    int insertSelective(TClassGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class_group
     *
     * @mbg.generated
     */
    TClassGroup selectByPrimaryKey(Integer fClassGoupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TClassGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TClassGroup record);
}