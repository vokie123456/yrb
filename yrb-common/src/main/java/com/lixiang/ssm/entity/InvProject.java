package com.lixiang.ssm.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InvProject extends BaseEntity implements Serializable{

	private static final long serialVersionUID = -8119631353495271738L;


	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.project_name
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private String projectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.project_type
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer projectType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.inv_no
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer invNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.inv_totbalance
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private BigDecimal invTotbalance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.rate
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private BigDecimal rate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.payback_time
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer paybackTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.Safe_way
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private String safeWay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.payback_way
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer paybackWay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.inv_balance
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private BigDecimal invBalance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.min_inv_balance
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer minInvBalance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.max_inv_balance
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer maxInvBalance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.interest
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private BigDecimal interest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.loan_reason
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private String loanReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.bidding_date
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Date biddingDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.borrower_info
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private String borrowerInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.risk_control
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private String riskControl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.project_status
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer projectStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.Financing_end_time
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Date financingEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.delay_flag
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer delayFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.end_time
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.creator_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.creator_name
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private String creatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.modifior_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer modifiorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.modifior_name
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private String modifiorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.modify_date
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Date modifyDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.resource
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer resource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.loan_project_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer loanProjectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_project.commend_flag
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer commendFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_project
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public InvProject(Integer id, String projectName, Integer projectType, Integer invNo, BigDecimal invTotbalance, BigDecimal rate, Integer paybackTime, String safeWay, Integer paybackWay, BigDecimal invBalance, Integer minInvBalance, Integer maxInvBalance, BigDecimal interest, String loanReason, Date biddingDate, String borrowerInfo, String riskControl, Integer projectStatus, Date financingEndTime, Integer delayFlag, Date endTime, Integer creatorId, String creatorName, Integer modifiorId, String modifiorName, Date modifyDate, Integer resource, Integer loanProjectId, Integer commendFlag) {
        this.id = id;
        this.projectName = projectName;
        this.projectType = projectType;
        this.invNo = invNo;
        this.invTotbalance = invTotbalance;
        this.rate = rate;
        this.paybackTime = paybackTime;
        this.safeWay = safeWay;
        this.paybackWay = paybackWay;
        this.invBalance = invBalance;
        this.minInvBalance = minInvBalance;
        this.maxInvBalance = maxInvBalance;
        this.interest = interest;
        this.loanReason = loanReason;
        this.biddingDate = biddingDate;
        this.borrowerInfo = borrowerInfo;
        this.riskControl = riskControl;
        this.projectStatus = projectStatus;
        this.financingEndTime = financingEndTime;
        this.delayFlag = delayFlag;
        this.endTime = endTime;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.modifiorId = modifiorId;
        this.modifiorName = modifiorName;
        this.modifyDate = modifyDate;
        this.resource = resource;
        this.loanProjectId = loanProjectId;
        this.commendFlag = commendFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_project
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public InvProject() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.id
     *
     * @return the value of t_inv_project.id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.id
     *
     * @param id the value for t_inv_project.id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.project_name
     *
     * @return the value of t_inv_project.project_name
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.project_name
     *
     * @param projectName the value for t_inv_project.project_name
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.project_type
     *
     * @return the value of t_inv_project.project_type
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getProjectType() {
        return projectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.project_type
     *
     * @param projectType the value for t_inv_project.project_type
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.inv_no
     *
     * @return the value of t_inv_project.inv_no
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getInvNo() {
        return invNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.inv_no
     *
     * @param invNo the value for t_inv_project.inv_no
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setInvNo(Integer invNo) {
        this.invNo = invNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.inv_totbalance
     *
     * @return the value of t_inv_project.inv_totbalance
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public BigDecimal getInvTotbalance() {
        return invTotbalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.inv_totbalance
     *
     * @param invTotbalance the value for t_inv_project.inv_totbalance
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setInvTotbalance(BigDecimal invTotbalance) {
        this.invTotbalance = invTotbalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.rate
     *
     * @return the value of t_inv_project.rate
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.rate
     *
     * @param rate the value for t_inv_project.rate
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.payback_time
     *
     * @return the value of t_inv_project.payback_time
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getPaybackTime() {
        return paybackTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.payback_time
     *
     * @param paybackTime the value for t_inv_project.payback_time
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setPaybackTime(Integer paybackTime) {
        this.paybackTime = paybackTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.Safe_way
     *
     * @return the value of t_inv_project.Safe_way
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public String getSafeWay() {
        return safeWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.Safe_way
     *
     * @param safeWay the value for t_inv_project.Safe_way
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setSafeWay(String safeWay) {
        this.safeWay = safeWay == null ? null : safeWay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.payback_way
     *
     * @return the value of t_inv_project.payback_way
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getPaybackWay() {
        return paybackWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.payback_way
     *
     * @param paybackWay the value for t_inv_project.payback_way
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setPaybackWay(Integer paybackWay) {
        this.paybackWay = paybackWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.inv_balance
     *
     * @return the value of t_inv_project.inv_balance
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public BigDecimal getInvBalance() {
        return invBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.inv_balance
     *
     * @param invBalance the value for t_inv_project.inv_balance
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setInvBalance(BigDecimal invBalance) {
        this.invBalance = invBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.min_inv_balance
     *
     * @return the value of t_inv_project.min_inv_balance
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getMinInvBalance() {
        return minInvBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.min_inv_balance
     *
     * @param minInvBalance the value for t_inv_project.min_inv_balance
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setMinInvBalance(Integer minInvBalance) {
        this.minInvBalance = minInvBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.max_inv_balance
     *
     * @return the value of t_inv_project.max_inv_balance
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getMaxInvBalance() {
        return maxInvBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.max_inv_balance
     *
     * @param maxInvBalance the value for t_inv_project.max_inv_balance
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setMaxInvBalance(Integer maxInvBalance) {
        this.maxInvBalance = maxInvBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.interest
     *
     * @return the value of t_inv_project.interest
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.interest
     *
     * @param interest the value for t_inv_project.interest
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.loan_reason
     *
     * @return the value of t_inv_project.loan_reason
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public String getLoanReason() {
        return loanReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.loan_reason
     *
     * @param loanReason the value for t_inv_project.loan_reason
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setLoanReason(String loanReason) {
        this.loanReason = loanReason == null ? null : loanReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.bidding_date
     *
     * @return the value of t_inv_project.bidding_date
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Date getBiddingDate() {
        return biddingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.bidding_date
     *
     * @param biddingDate the value for t_inv_project.bidding_date
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setBiddingDate(Date biddingDate) {
        this.biddingDate = biddingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.borrower_info
     *
     * @return the value of t_inv_project.borrower_info
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public String getBorrowerInfo() {
        return borrowerInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.borrower_info
     *
     * @param borrowerInfo the value for t_inv_project.borrower_info
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setBorrowerInfo(String borrowerInfo) {
        this.borrowerInfo = borrowerInfo == null ? null : borrowerInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.risk_control
     *
     * @return the value of t_inv_project.risk_control
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public String getRiskControl() {
        return riskControl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.risk_control
     *
     * @param riskControl the value for t_inv_project.risk_control
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setRiskControl(String riskControl) {
        this.riskControl = riskControl == null ? null : riskControl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.project_status
     *
     * @return the value of t_inv_project.project_status
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getProjectStatus() {
        return projectStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.project_status
     *
     * @param projectStatus the value for t_inv_project.project_status
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.Financing_end_time
     *
     * @return the value of t_inv_project.Financing_end_time
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Date getFinancingEndTime() {
        return financingEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.Financing_end_time
     *
     * @param financingEndTime the value for t_inv_project.Financing_end_time
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setFinancingEndTime(Date financingEndTime) {
        this.financingEndTime = financingEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.delay_flag
     *
     * @return the value of t_inv_project.delay_flag
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getDelayFlag() {
        return delayFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.delay_flag
     *
     * @param delayFlag the value for t_inv_project.delay_flag
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setDelayFlag(Integer delayFlag) {
        this.delayFlag = delayFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.end_time
     *
     * @return the value of t_inv_project.end_time
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.end_time
     *
     * @param endTime the value for t_inv_project.end_time
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.creator_id
     *
     * @return the value of t_inv_project.creator_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.creator_id
     *
     * @param creatorId the value for t_inv_project.creator_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.creator_name
     *
     * @return the value of t_inv_project.creator_name
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.creator_name
     *
     * @param creatorName the value for t_inv_project.creator_name
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.modifior_id
     *
     * @return the value of t_inv_project.modifior_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getModifiorId() {
        return modifiorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.modifior_id
     *
     * @param modifiorId the value for t_inv_project.modifior_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setModifiorId(Integer modifiorId) {
        this.modifiorId = modifiorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.modifior_name
     *
     * @return the value of t_inv_project.modifior_name
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public String getModifiorName() {
        return modifiorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.modifior_name
     *
     * @param modifiorName the value for t_inv_project.modifior_name
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setModifiorName(String modifiorName) {
        this.modifiorName = modifiorName == null ? null : modifiorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.modify_date
     *
     * @return the value of t_inv_project.modify_date
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.modify_date
     *
     * @param modifyDate the value for t_inv_project.modify_date
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.resource
     *
     * @return the value of t_inv_project.resource
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getResource() {
        return resource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.resource
     *
     * @param resource the value for t_inv_project.resource
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setResource(Integer resource) {
        this.resource = resource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.loan_project_id
     *
     * @return the value of t_inv_project.loan_project_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getLoanProjectId() {
        return loanProjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.loan_project_id
     *
     * @param loanProjectId the value for t_inv_project.loan_project_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setLoanProjectId(Integer loanProjectId) {
        this.loanProjectId = loanProjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_project.commend_flag
     *
     * @return the value of t_inv_project.commend_flag
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getCommendFlag() {
        return commendFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_project.commend_flag
     *
     * @param commendFlag the value for t_inv_project.commend_flag
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setCommendFlag(Integer commendFlag) {
        this.commendFlag = commendFlag;
    }
    
    /**
     * 最大年利率
     */
    private Double maxRate;
    
    /**
     * 最小年利率
     */
    private Double minRate;

	public Double getMaxRate() {
		return maxRate;
	}

	public void setMaxRate(Double maxRate) {
		this.maxRate = maxRate;
	}

	public Double getMinRate() {
		return minRate;
	}

	public void setMinRate(Double mixRate) {
		this.minRate = mixRate;
	}
    
	/**
	 * 最低月数
	 */
    private Integer minMonth;
    /**
     * 最大月数
     */
    private Integer maxMonth;

	public Integer getMinMonth() {
		return minMonth;
	}

	public void setMinMonth(Integer minMonth) {
		this.minMonth = minMonth;
	}

	public Integer getMaxMonth() {
		return maxMonth;
	}

	public void setMaxMonth(Integer maxMonth) {
		this.maxMonth = maxMonth;
	}

	@Override
	public String toString() {
		return "InvProject [id=" + id + ", projectName=" + projectName + ", projectType=" + projectType + ", invNo="
				+ invNo + ", invTotbalance=" + invTotbalance + ", rate=" + rate + ", paybackTime=" + paybackTime
				+ ", safeWay=" + safeWay + ", paybackWay=" + paybackWay + ", invBalance=" + invBalance
				+ ", minInvBalance=" + minInvBalance + ", maxInvBalance=" + maxInvBalance + ", interest=" + interest
				+ ", loanReason=" + loanReason + ", biddingDate=" + biddingDate + ", borrowerInfo=" + borrowerInfo
				+ ", riskControl=" + riskControl + ", projectStatus=" + projectStatus + ", financingEndTime="
				+ financingEndTime + ", delayFlag=" + delayFlag + ", endTime=" + endTime + ", creatorId=" + creatorId
				+ ", creatorName=" + creatorName + ", modifiorId=" + modifiorId + ", modifiorName=" + modifiorName
				+ ", modifyDate=" + modifyDate + ", resource=" + resource + ", loanProjectId=" + loanProjectId
				+ ", commendFlag=" + commendFlag + ", maxRate=" + maxRate + ", minRate=" + minRate + ", minMonth="
				+ minMonth + ", maxMonth=" + maxMonth + "]";
	}
}