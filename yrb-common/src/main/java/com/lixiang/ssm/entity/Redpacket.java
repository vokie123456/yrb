package com.lixiang.ssm.entity;

import java.util.Date;

public class Redpacket {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_redpacket.id
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_redpacket.user_id
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_redpacket.redpacket_name
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    private String redpacketName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_redpacket.remarks
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_redpacket.redpack_type
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    private Integer redpackType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_redpacket.balance
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    private Integer balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_redpacket.stop_time
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    private Date stopTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_redpacket.receive_time
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    private Date receiveTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_redpacket.used_status
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    private Integer usedStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_redpacket
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public Redpacket(Integer id, Integer userId, String redpacketName, String remarks, Integer redpackType, Integer balance, Date stopTime, Date receiveTime, Integer usedStatus) {
        this.id = id;
        this.userId = userId;
        this.redpacketName = redpacketName;
        this.remarks = remarks;
        this.redpackType = redpackType;
        this.balance = balance;
        this.stopTime = stopTime;
        this.receiveTime = receiveTime;
        this.usedStatus = usedStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_redpacket
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public Redpacket() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_redpacket.id
     *
     * @return the value of t_redpacket.id
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_redpacket.id
     *
     * @param id the value for t_redpacket.id
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_redpacket.user_id
     *
     * @return the value of t_redpacket.user_id
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_redpacket.user_id
     *
     * @param userId the value for t_redpacket.user_id
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_redpacket.redpacket_name
     *
     * @return the value of t_redpacket.redpacket_name
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public String getRedpacketName() {
        return redpacketName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_redpacket.redpacket_name
     *
     * @param redpacketName the value for t_redpacket.redpacket_name
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public void setRedpacketName(String redpacketName) {
        this.redpacketName = redpacketName == null ? null : redpacketName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_redpacket.remarks
     *
     * @return the value of t_redpacket.remarks
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_redpacket.remarks
     *
     * @param remarks the value for t_redpacket.remarks
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_redpacket.redpack_type
     *
     * @return the value of t_redpacket.redpack_type
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public Integer getRedpackType() {
        return redpackType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_redpacket.redpack_type
     *
     * @param redpackType the value for t_redpacket.redpack_type
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public void setRedpackType(Integer redpackType) {
        this.redpackType = redpackType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_redpacket.balance
     *
     * @return the value of t_redpacket.balance
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_redpacket.balance
     *
     * @param balance the value for t_redpacket.balance
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_redpacket.stop_time
     *
     * @return the value of t_redpacket.stop_time
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public Date getStopTime() {
        return stopTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_redpacket.stop_time
     *
     * @param stopTime the value for t_redpacket.stop_time
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_redpacket.receive_time
     *
     * @return the value of t_redpacket.receive_time
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_redpacket.receive_time
     *
     * @param receiveTime the value for t_redpacket.receive_time
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_redpacket.used_status
     *
     * @return the value of t_redpacket.used_status
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public Integer getUsedStatus() {
        return usedStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_redpacket.used_status
     *
     * @param usedStatus the value for t_redpacket.used_status
     *
     * @mbg.generated Wed May 16 11:21:31 CST 2018
     */
    public void setUsedStatus(Integer usedStatus) {
        this.usedStatus = usedStatus;
    }
}