package com.lixiang.ssm.entity;

import java.util.Date;

public class UserBank {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_bank.id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_bank.user_id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_bank.real_name
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_bank.id_card
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private String idCard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_bank.bank_card
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Integer bankCard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_bank.bank_type
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Integer bankType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_bank.phone_num
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Integer phoneNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_bank.bidding_date
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Date biddingDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_bank
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public UserBank(Integer id, Integer userId, String realName, String idCard, Integer bankCard, Integer bankType, Integer phoneNum, Date biddingDate) {
        this.id = id;
        this.userId = userId;
        this.realName = realName;
        this.idCard = idCard;
        this.bankCard = bankCard;
        this.bankType = bankType;
        this.phoneNum = phoneNum;
        this.biddingDate = biddingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_bank
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public UserBank() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_bank.id
     *
     * @return the value of t_user_bank.id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_bank.id
     *
     * @param id the value for t_user_bank.id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_bank.user_id
     *
     * @return the value of t_user_bank.user_id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_bank.user_id
     *
     * @param userId the value for t_user_bank.user_id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_bank.real_name
     *
     * @return the value of t_user_bank.real_name
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_bank.real_name
     *
     * @param realName the value for t_user_bank.real_name
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_bank.id_card
     *
     * @return the value of t_user_bank.id_card
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_bank.id_card
     *
     * @param idCard the value for t_user_bank.id_card
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_bank.bank_card
     *
     * @return the value of t_user_bank.bank_card
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Integer getBankCard() {
        return bankCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_bank.bank_card
     *
     * @param bankCard the value for t_user_bank.bank_card
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setBankCard(Integer bankCard) {
        this.bankCard = bankCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_bank.bank_type
     *
     * @return the value of t_user_bank.bank_type
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Integer getBankType() {
        return bankType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_bank.bank_type
     *
     * @param bankType the value for t_user_bank.bank_type
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setBankType(Integer bankType) {
        this.bankType = bankType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_bank.phone_num
     *
     * @return the value of t_user_bank.phone_num
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Integer getPhoneNum() {
        return phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_bank.phone_num
     *
     * @param phoneNum the value for t_user_bank.phone_num
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_bank.bidding_date
     *
     * @return the value of t_user_bank.bidding_date
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Date getBiddingDate() {
        return biddingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_bank.bidding_date
     *
     * @param biddingDate the value for t_user_bank.bidding_date
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setBiddingDate(Date biddingDate) {
        this.biddingDate = biddingDate;
    }
}