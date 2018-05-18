package com.lixiang.ssm.dao;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import com.lixiang.ssm.entity.InvProject;
import com.lixiang.ssm.entity.InvProjectSingle;
import com.lixiang.ssm.entity.InvRecord;
import com.lixiang.ssm.entity.PaybackPlan;

public interface InvProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_project
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_project
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    int insert(InvProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_project
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    int insertSelective(InvProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_project
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    InvProject selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_project
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    int updateByPrimaryKeySelective(InvProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_project
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    int updateByPrimaryKey(InvProject record);
    

    /**
     * 按照条件来查询投资项目
     */
    List<InvProject> ListByInvProject(@Param("invProject") InvProject invProject);

    boolean updateProjectStatus(@Param("status") Integer status,@Param("id") Integer id);
    
    List<InvProject> ListByInvProject(@Param("invProject") InvProject invProject,@Param("orderBy")String orderBy,@Param("orderMethod")Integer orderMethod);

    /**
     * 查询投资项目的详细信息
     * @param id 根据投资项目id
     * @return
     */
    InvProject getInvProjectById(Integer id);
    
    /**
     * 查询投资项目的投标记录
     * @param id 根据投资项目id
     * @return
     */
    List<InvRecord> getInvRecordById(Integer id);
    /**
     * 查询投资项目的还款计划
     * @param id 根据投资项目id
     * @return
     */
    List<PaybackPlan> getPaybackPlan(Integer id);
    
    /**
     * 查询投资项目已还金额
     * @param id 根据投资项目id
     * @return
     */
    Double getRepaymentBalance(Integer id);
    
    
    boolean updateProjectStatus(Integer id);
    /**
     * 查询全部
     * @param record
     * @return
     */
    List<InvProject> queryAllInvProject(InvProject record);
    
    List<InvProject> queryInvProjectByFinancingTime(InvProject record);
    
    List<InvProject> queryAllInvProjectByProStatus(InvProject record);
    
    List<InvProject> queryAllInvProjectService(InvProject record);
    
	List<InvProject> listIndexCommendProjects();
	
	List<InvProject> listIndexCarProjects();
	List<InvProject> listIndexHouseProjects();
	List<InvProject> listIndexObligationProjects();
	
}