package com.lixiang.ssm.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserInfo extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.id
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.account
     * 6-24个字符，字母开头，字母、数字下划线组成
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    @NotEmpty
    @Pattern(regexp="^[a-zA-Z][a-zA-Z0-9_]{5,23}$")
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.phone_num
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    private Long phoneNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.password
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    @NotEmpty
    @Length(max=24,min=6)
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.real_name
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.idcard
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    private String idcard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.auth_status
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    private Integer authStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.email
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.pay_password
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    private String payPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.total_balance
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    private BigDecimal totalBalance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.referee
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    private String referee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.create_date
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.modify_date
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    private Date modifyDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public UserInfo(Integer id, String account, Long phoneNum, String password, String realName, String idcard, Integer authStatus, String email, String payPassword, BigDecimal totalBalance, String referee, Date createDate, Date modifyDate) {
        this.id = id;
        this.account = account;
        this.phoneNum = phoneNum;
        this.password = password;
        this.realName = realName;
        this.idcard = idcard;
        this.authStatus = authStatus;
        this.email = email;
        this.payPassword = payPassword;
        this.totalBalance = totalBalance;
        this.referee = referee;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_info
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public UserInfo() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.id
     *
     * @return the value of t_user_info.id
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.id
     *
     * @param id the value for t_user_info.id
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.account
     *
     * @return the value of t_user_info.account
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.account
     *
     * @param account the value for t_user_info.account
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.phone_num
     *
     * @return the value of t_user_info.phone_num
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public Long getPhoneNum() {
        return phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.phone_num
     *
     * @param phoneNum the value for t_user_info.phone_num
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.password
     *
     * @return the value of t_user_info.password
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.password
     *
     * @param password the value for t_user_info.password
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.real_name
     *
     * @return the value of t_user_info.real_name
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.real_name
     *
     * @param realName the value for t_user_info.real_name
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.idcard
     *
     * @return the value of t_user_info.idcard
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.idcard
     *
     * @param idcard the value for t_user_info.idcard
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.auth_status
     *
     * @return the value of t_user_info.auth_status
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public Integer getAuthStatus() {
        return authStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.auth_status
     *
     * @param authStatus the value for t_user_info.auth_status
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setAuthStatus(Integer authStatus) {
        this.authStatus = authStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.email
     *
     * @return the value of t_user_info.email
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.email
     *
     * @param email the value for t_user_info.email
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.pay_password
     *
     * @return the value of t_user_info.pay_password
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public String getPayPassword() {
        return payPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.pay_password
     *
     * @param payPassword the value for t_user_info.pay_password
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.total_balance
     *
     * @return the value of t_user_info.total_balance
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public BigDecimal getTotalBalance() {
        return totalBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.total_balance
     *
     * @param totalBalance the value for t_user_info.total_balance
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setTotalBalance(BigDecimal totalBalance) {
        this.totalBalance = totalBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.referee
     *
     * @return the value of t_user_info.referee
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public String getReferee() {
        return referee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.referee
     *
     * @param referee the value for t_user_info.referee
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setReferee(String referee) {
        this.referee = referee == null ? null : referee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.create_date
     *
     * @return the value of t_user_info.create_date
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.create_date
     *
     * @param createDate the value for t_user_info.create_date
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.modify_date
     *
     * @return the value of t_user_info.modify_date
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.modify_date
     *
     * @param modifyDate the value for t_user_info.modify_date
     *
     * @mbg.generated Wed May 16 11:18:32 CST 2018
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", account=" + account + ", phoneNum=" + phoneNum + ", password=" + password
				+ ", realName=" + realName + ", idcard=" + idcard + ", authStatus=" + authStatus + ", email=" + email
				+ ", payPassword=" + payPassword + ", totalBalance=" + totalBalance + ", referee=" + referee
				+ ", createDate=" + createDate + ", modifyDate=" + modifyDate + "]";
	}
    
}