package com.lixiang.ssm.entity;

import java.math.BigDecimal;
import java.util.Date;

public class InvRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_record.id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_record.inv_rec_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer invRecId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_record.invrec_no
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer invrecNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_record.invrec_money
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private BigDecimal invrecMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_record.user_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_record.inv_date
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Date invDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_record.inv_user_name
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private String invUserName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_inv_record.inv_way
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    private Boolean invWay;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_record
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public InvRecord(Integer id, Integer invRecId, Integer invrecNo, BigDecimal invrecMoney, Integer userId, Date invDate, String invUserName, Boolean invWay) {
        this.id = id;
        this.invRecId = invRecId;
        this.invrecNo = invrecNo;
        this.invrecMoney = invrecMoney;
        this.userId = userId;
        this.invDate = invDate;
        this.invUserName = invUserName;
        this.invWay = invWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_inv_record
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public InvRecord() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_record.id
     *
     * @return the value of t_inv_record.id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_record.id
     *
     * @param id the value for t_inv_record.id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_record.inv_rec_id
     *
     * @return the value of t_inv_record.inv_rec_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getInvRecId() {
        return invRecId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_record.inv_rec_id
     *
     * @param invRecId the value for t_inv_record.inv_rec_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setInvRecId(Integer invRecId) {
        this.invRecId = invRecId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_record.invrec_no
     *
     * @return the value of t_inv_record.invrec_no
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getInvrecNo() {
        return invrecNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_record.invrec_no
     *
     * @param invrecNo the value for t_inv_record.invrec_no
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setInvrecNo(Integer invrecNo) {
        this.invrecNo = invrecNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_record.invrec_money
     *
     * @return the value of t_inv_record.invrec_money
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public BigDecimal getInvrecMoney() {
        return invrecMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_record.invrec_money
     *
     * @param invrecMoney the value for t_inv_record.invrec_money
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setInvrecMoney(BigDecimal invrecMoney) {
        this.invrecMoney = invrecMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_record.user_id
     *
     * @return the value of t_inv_record.user_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_record.user_id
     *
     * @param userId the value for t_inv_record.user_id
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_record.inv_date
     *
     * @return the value of t_inv_record.inv_date
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Date getInvDate() {
        return invDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_record.inv_date
     *
     * @param invDate the value for t_inv_record.inv_date
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_record.inv_user_name
     *
     * @return the value of t_inv_record.inv_user_name
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public String getInvUserName() {
        return invUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_record.inv_user_name
     *
     * @param invUserName the value for t_inv_record.inv_user_name
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setInvUserName(String invUserName) {
        this.invUserName = invUserName == null ? null : invUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_inv_record.inv_way
     *
     * @return the value of t_inv_record.inv_way
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public Boolean getInvWay() {
        return invWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_inv_record.inv_way
     *
     * @param invWay the value for t_inv_record.inv_way
     *
     * @mbg.generated Wed May 16 12:04:37 CST 2018
     */
    public void setInvWay(Boolean invWay) {
        this.invWay = invWay;
    }
}