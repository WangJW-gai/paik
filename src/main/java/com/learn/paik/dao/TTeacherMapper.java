package com.learn.paik.dao;

import com.learn.entity.TTeacher;

public interface TTeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer fTeacherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int insert(TTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int insertSelective(TTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    TTeacher selectByPrimaryKey(Integer fTeacherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TTeacher record);
}