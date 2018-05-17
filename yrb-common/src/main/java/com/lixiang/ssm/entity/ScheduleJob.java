package com.lixiang.ssm.entity;

public class ScheduleJob extends BaseEntity{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schedule_job.job_id
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    private Integer jobId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schedule_job.job_name
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    private String jobName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schedule_job.job_group
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    private String jobGroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schedule_job.job_status
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    private Integer jobStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schedule_job.cron-expression
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    private String cronExpression;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schedule_job.job_desc
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    private String jobDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schedule_job.job_class
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    private String jobClass;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public ScheduleJob(Integer jobId, String jobName, String jobGroup, Integer jobStatus, String cronExpression, String jobDesc, String jobClass) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobGroup = jobGroup;
        this.jobStatus = jobStatus;
        this.cronExpression = cronExpression;
        this.jobDesc = jobDesc;
        this.jobClass = jobClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public ScheduleJob() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schedule_job.job_id
     *
     * @return the value of schedule_job.job_id
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schedule_job.job_id
     *
     * @param jobId the value for schedule_job.job_id
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schedule_job.job_name
     *
     * @return the value of schedule_job.job_name
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schedule_job.job_name
     *
     * @param jobName the value for schedule_job.job_name
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schedule_job.job_group
     *
     * @return the value of schedule_job.job_group
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schedule_job.job_group
     *
     * @param jobGroup the value for schedule_job.job_group
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup == null ? null : jobGroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schedule_job.job_status
     *
     * @return the value of schedule_job.job_status
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public Integer getJobStatus() {
        return jobStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schedule_job.job_status
     *
     * @param jobStatus the value for schedule_job.job_status
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schedule_job.cron-expression
     *
     * @return the value of schedule_job.cron-expression
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schedule_job.cron-expression
     *
     * @param cronExpression the value for schedule_job.cron-expression
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schedule_job.job_desc
     *
     * @return the value of schedule_job.job_desc
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schedule_job.job_desc
     *
     * @param jobDesc the value for schedule_job.job_desc
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc == null ? null : jobDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schedule_job.job_class
     *
     * @return the value of schedule_job.job_class
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public String getJobClass() {
        return jobClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schedule_job.job_class
     *
     * @param jobClass the value for schedule_job.job_class
     *
     * @mbg.generated Wed May 16 16:23:31 CST 2018
     */
    public void setJobClass(String jobClass) {
        this.jobClass = jobClass == null ? null : jobClass.trim();
    }
}