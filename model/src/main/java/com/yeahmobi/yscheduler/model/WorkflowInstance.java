package com.yeahmobi.yscheduler.model;

import com.yeahmobi.yscheduler.model.type.WorkflowInstanceStatus;
import java.util.Date;

public class WorkflowInstance {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow_instance.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow_instance.workflow_id
     *
     * @mbggenerated
     */
    private Long workflowId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow_instance.status
     *
     * @mbggenerated
     */
    private WorkflowInstanceStatus status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow_instance.schedule_time
     *
     * @mbggenerated
     */
    private Date scheduleTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow_instance.start_time
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow_instance.end_time
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow_instance.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column workflow_instance.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow_instance.id
     *
     * @return the value of workflow_instance.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow_instance.id
     *
     * @param id the value for workflow_instance.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow_instance.workflow_id
     *
     * @return the value of workflow_instance.workflow_id
     *
     * @mbggenerated
     */
    public Long getWorkflowId() {
        return workflowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow_instance.workflow_id
     *
     * @param workflowId the value for workflow_instance.workflow_id
     *
     * @mbggenerated
     */
    public void setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow_instance.status
     *
     * @return the value of workflow_instance.status
     *
     * @mbggenerated
     */
    public WorkflowInstanceStatus getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow_instance.status
     *
     * @param status the value for workflow_instance.status
     *
     * @mbggenerated
     */
    public void setStatus(WorkflowInstanceStatus status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow_instance.schedule_time
     *
     * @return the value of workflow_instance.schedule_time
     *
     * @mbggenerated
     */
    public Date getScheduleTime() {
        return scheduleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow_instance.schedule_time
     *
     * @param scheduleTime the value for workflow_instance.schedule_time
     *
     * @mbggenerated
     */
    public void setScheduleTime(Date scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow_instance.start_time
     *
     * @return the value of workflow_instance.start_time
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow_instance.start_time
     *
     * @param startTime the value for workflow_instance.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow_instance.end_time
     *
     * @return the value of workflow_instance.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow_instance.end_time
     *
     * @param endTime the value for workflow_instance.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow_instance.create_time
     *
     * @return the value of workflow_instance.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow_instance.create_time
     *
     * @param createTime the value for workflow_instance.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column workflow_instance.update_time
     *
     * @return the value of workflow_instance.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column workflow_instance.update_time
     *
     * @param updateTime the value for workflow_instance.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_instance
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", workflowId=").append(workflowId);
        sb.append(", status=").append(status);
        sb.append(", scheduleTime=").append(scheduleTime);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_instance
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WorkflowInstance other = (WorkflowInstance) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkflowId() == null ? other.getWorkflowId() == null : this.getWorkflowId().equals(other.getWorkflowId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getScheduleTime() == null ? other.getScheduleTime() == null : this.getScheduleTime().equals(other.getScheduleTime()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_instance
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getScheduleTime() == null) ? 0 : getScheduleTime().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}