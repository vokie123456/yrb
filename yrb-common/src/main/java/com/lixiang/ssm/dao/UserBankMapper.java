package com.lixiang.ssm.dao;

import com.lixiang.ssm.entity.UserBank;

public interface UserBankMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_bank
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_bank
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    int insert(UserBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_bank
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    int insertSelective(UserBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_bank
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    UserBank selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_bank
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    int updateByPrimaryKeySelective(UserBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_bank
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    int updateByPrimaryKey(UserBank record);
}