package com.lixiang.ssm.dao;

import java.util.List;

import com.lixiang.ssm.entity.UserInfo;

public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    UserInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    
    /**
     * 修改平台用户
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(UserInfo record);
    
    
    /**
     * 查询多个用户
     *
     */
    List<UserInfo> selectByPrimaryKey(UserInfo UserInfo);


    int updateByPrimaryKey(UserInfo record);
    
    UserInfo selectByKey(Integer id);
    
    List<UserInfo> list(UserInfo userInfo);
    
    List<UserInfo> getUserInfoList();
   
    
    /**
     * 修改用户,充值 
     * @param record
     * @return
     */
    int updateTopUp(UserInfo record);
}