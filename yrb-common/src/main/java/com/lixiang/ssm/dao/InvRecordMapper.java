package com.lixiang.ssm.dao;

import java.util.List;

import com.lixiang.ssm.entity.InvRecord;

public interface InvRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_record
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_record
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    int insert(InvRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_record
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    int insertSelective(InvRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_record
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    InvRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_record
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    int updateByPrimaryKeySelective(InvRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_record
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    int updateByPrimaryKey(InvRecord record);

}