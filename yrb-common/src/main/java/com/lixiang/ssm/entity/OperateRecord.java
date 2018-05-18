package com.lixiang.ssm.entity;

import java.util.Date;

public class OperateRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operate_record.id
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operate_record.oper_type
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    private Integer operType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operate_record.operator_date
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    private Date operatorDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operate_record.project_type
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    private Integer projectType;
    
    private String projectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operate_record.project_id
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    private Integer projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operate_record.operator_id
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    private Integer operatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operate_record.operator_name
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    private String operatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operate_record.remark
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_record
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public OperateRecord(Integer id, Integer operType, Date operatorDate, Integer projectType, Integer projectId, Integer operatorId, String operatorName, String remark) {
        this.id = id;
        this.operType = operType;
        this.operatorDate = operatorDate;
        this.projectType = projectType;
        this.projectId = projectId;
        this.operatorId = operatorId;
        this.operatorName = operatorName;
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_record
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public OperateRecord() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operate_record.id
     *
     * @return the value of t_operate_record.id
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operate_record.id
     *
     * @param id the value for t_operate_record.id
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operate_record.oper_type
     *
     * @return the value of t_operate_record.oper_type
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public Integer getOperType() {
        return operType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operate_record.oper_type
     *
     * @param operType the value for t_operate_record.oper_type
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public void setOperType(Integer operType) {
        this.operType = operType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operate_record.operator_date
     *
     * @return the value of t_operate_record.operator_date
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public Date getOperatorDate() {
        return operatorDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operate_record.operator_date
     *
     * @param operatorDate the value for t_operate_record.operator_date
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public void setOperatorDate(Date operatorDate) {
        this.operatorDate = operatorDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operate_record.project_type
     *
     * @return the value of t_operate_record.project_type
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public Integer getProjectType() {
        return projectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operate_record.project_type
     *
     * @param projectType the value for t_operate_record.project_type
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operate_record.project_id
     *
     * @return the value of t_operate_record.project_id
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operate_record.project_id
     *
     * @param projectId the value for t_operate_record.project_id
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operate_record.operator_id
     *
     * @return the value of t_operate_record.operator_id
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operate_record.operator_id
     *
     * @param operatorId the value for t_operate_record.operator_id
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operate_record.operator_name
     *
     * @return the value of t_operate_record.operator_name
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operate_record.operator_name
     *
     * @param operatorName the value for t_operate_record.operator_name
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operate_record.remark
     *
     * @return the value of t_operate_record.remark
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operate_record.remark
     *
     * @param remark the value for t_operate_record.remark
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return "OperateRecord [id=" + id + ", operType=" + operType + ", operatorDate=" + operatorDate
				+ ", projectType=" + projectType + ", projectId=" + projectId + ", operatorId=" + operatorId
				+ ", operatorName=" + operatorName + ", remark=" + remark + "]";
	}
    
}