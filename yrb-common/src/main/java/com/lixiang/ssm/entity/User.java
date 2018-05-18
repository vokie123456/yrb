package com.lixiang.ssm.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.real_name
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private Integer sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.creator_id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private Integer creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_date
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.modifior_id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private Integer modifiorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.modify_date
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private Date modifyDate;
    
    
    private Integer errorCount;
    
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date loginDate;
    
    //是否是用户组的用户
    private boolean isgroupuser;
    
    
    private String userRoles;
    
    private Integer user_role_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public User(Integer id, String username, String realName, String password, Integer sex, Date birthday, Integer creatorId, Date createDate, Integer modifiorId, Date modifyDate) {
        this.id = id;
        this.username = username;
        this.realName = realName;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.creatorId = creatorId;
        this.createDate = createDate;
        this.modifiorId = modifiorId;
        this.modifyDate = modifyDate;
    }
    
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public User() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.real_name
     *
     * @return the value of user.real_name
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.real_name
     *
     * @param realName the value for user.real_name
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     * @param i 
     *
     * @return the value of user.password
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.creator_id
     *
     * @return the value of user.creator_id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.creator_id
     *
     * @param creatorId the value for user.creator_id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_date
     *
     * @return the value of user.create_date
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_date
     *
     * @param createDate the value for user.create_date
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.modifior_id
     *
     * @return the value of user.modifior_id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Integer getModifiorId() {
        return modifiorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.modifior_id
     *
     * @param modifiorId the value for user.modifior_id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setModifiorId(Integer modifiorId) {
        this.modifiorId = modifiorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.modify_date
     *
     * @return the value of user.modify_date
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.modify_date
     *
     * @param modifyDate the value for user.modify_date
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

	public Integer getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(Integer errorCount) {
		this.errorCount = errorCount;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public boolean isIsgroupuser()
	{
		return isgroupuser;
	}

	public void setIsgroupuser(boolean isgroupuser)
	{
		this.isgroupuser = isgroupuser;
	}
	
    

	public String getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(String userRoles) {
		this.userRoles = userRoles;
	}

	public Integer getUser_role_id() {
		return user_role_id;
	}

	public void setUser_role_id(Integer user_role_id) {
		this.user_role_id = user_role_id;
	}
}