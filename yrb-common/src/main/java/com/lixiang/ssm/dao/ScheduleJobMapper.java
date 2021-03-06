package com.lixiang.ssm.dao;

import java.util.List;

import com.lixiang.ssm.entity.ScheduleJob;

public interface ScheduleJobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    int deleteByPrimaryKey(Integer jobId);
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    int insert(ScheduleJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    int insertSelective(ScheduleJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    ScheduleJob selectByPrimaryKey(Integer jobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    boolean updateByPrimaryKeySelective(ScheduleJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    
    int updateByPrimaryKey(ScheduleJob record);
    
    List<ScheduleJob> list(ScheduleJob job);
}