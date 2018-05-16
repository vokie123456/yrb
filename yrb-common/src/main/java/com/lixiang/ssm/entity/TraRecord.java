package com.lixiang.ssm.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TraRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tra_record.id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tra_record.money_tra_type
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Integer moneyTraType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tra_record.money_tra_money
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private BigDecimal moneyTraMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tra_record.tra_method
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Boolean traMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tra_record.money_tra_date
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Date moneyTraDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tra_record.user_id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tra_record
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public TraRecord(Integer id, Integer moneyTraType, BigDecimal moneyTraMoney, Boolean traMethod, Date moneyTraDate, Integer userId) {
        this.id = id;
        this.moneyTraType = moneyTraType;
        this.moneyTraMoney = moneyTraMoney;
        this.traMethod = traMethod;
        this.moneyTraDate = moneyTraDate;
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tra_record
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public TraRecord() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tra_record.id
     *
     * @return the value of t_tra_record.id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tra_record.id
     *
     * @param id the value for t_tra_record.id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tra_record.money_tra_type
     *
     * @return the value of t_tra_record.money_tra_type
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Integer getMoneyTraType() {
        return moneyTraType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tra_record.money_tra_type
     *
     * @param moneyTraType the value for t_tra_record.money_tra_type
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setMoneyTraType(Integer moneyTraType) {
        this.moneyTraType = moneyTraType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tra_record.money_tra_money
     *
     * @return the value of t_tra_record.money_tra_money
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public BigDecimal getMoneyTraMoney() {
        return moneyTraMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tra_record.money_tra_money
     *
     * @param moneyTraMoney the value for t_tra_record.money_tra_money
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setMoneyTraMoney(BigDecimal moneyTraMoney) {
        this.moneyTraMoney = moneyTraMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tra_record.tra_method
     *
     * @return the value of t_tra_record.tra_method
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Boolean getTraMethod() {
        return traMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tra_record.tra_method
     *
     * @param traMethod the value for t_tra_record.tra_method
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setTraMethod(Boolean traMethod) {
        this.traMethod = traMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tra_record.money_tra_date
     *
     * @return the value of t_tra_record.money_tra_date
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Date getMoneyTraDate() {
        return moneyTraDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tra_record.money_tra_date
     *
     * @param moneyTraDate the value for t_tra_record.money_tra_date
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setMoneyTraDate(Date moneyTraDate) {
        this.moneyTraDate = moneyTraDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tra_record.user_id
     *
     * @return the value of t_tra_record.user_id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tra_record.user_id
     *
     * @param userId the value for t_tra_record.user_id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}