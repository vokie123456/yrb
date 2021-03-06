package com.lixiang.ssm.entity;

import java.util.Date;

import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

public class SystemMessage extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_message.id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_message.user_id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_message.type
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_message.content
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_message.sending_time
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Past
    private Date sendingTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_message.status
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    private Boolean status;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_message
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public SystemMessage(Integer id, Integer userId, String type, String content, Date sendingTime, Boolean status) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.content = content;
        this.sendingTime = sendingTime;
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_message
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public SystemMessage() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_message.id
     *
     * @return the value of t_system_message.id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_message.id
     *
     * @param id the value for t_system_message.id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_message.user_id
     *
     * @return the value of t_system_message.user_id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_message.user_id
     *
     * @param userId the value for t_system_message.user_id
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_message.type
     *
     * @return the value of t_system_message.type
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_message.type
     *
     * @param type the value for t_system_message.type
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_message.content
     *
     * @return the value of t_system_message.content
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_message.content
     *
     * @param content the value for t_system_message.content
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_message.sending_time
     *
     * @return the value of t_system_message.sending_time
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Date getSendingTime() {
        return sendingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_message.sending_time
     *
     * @param sendingTime the value for t_system_message.sending_time
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setSendingTime(Date sendingTime) {
        this.sendingTime = sendingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_message.status
     *
     * @return the value of t_system_message.status
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_message.status
     *
     * @param status the value for t_system_message.status
     *
     * @mbg.generated Wed May 16 11:21:21 CST 2018
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}