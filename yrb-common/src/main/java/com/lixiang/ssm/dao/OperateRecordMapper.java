package com.lixiang.ssm.dao;

import com.lixiang.ssm.entity.OperateRecord;

public interface OperateRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_record
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_record
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    int insert(OperateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_record
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    int insertSelective(OperateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_record
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    OperateRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_record
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    int updateByPrimaryKeySelective(OperateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_record
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    int updateByPrimaryKey(OperateRecord record);
}