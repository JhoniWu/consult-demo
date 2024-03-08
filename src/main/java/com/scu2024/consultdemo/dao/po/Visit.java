package com.scu2024.consultdemo.dao.po;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:19
 **/
@TableName("visit")
public class Visit {
	@TableId(type = IdType.AUTO)
	private Long id;
	private Long studentId;
	private Long visitorId;
	private Integer serverity;
	private String problemType;
	private Integer state;
	private Integer visitTime;
	private Date visitDay;
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;

	@Override
	public String toString() {
		return "Visit{" +
			"id=" + id +
			", studentId=" + studentId +
			", visitorId=" + visitorId +
			", serverity=" + serverity +
			", problemType='" + problemType + '\'' +
			", state=" + state +
			", visitTime=" + visitTime +
			", visitDay=" + visitDay +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(Long visitorId) {
		this.visitorId = visitorId;
	}

	public Integer getServerity() {
		return serverity;
	}

	public void setServerity(Integer serverity) {
		this.serverity = serverity;
	}

	public String getProblemType() {
		return problemType;
	}

	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getVisitTime() {
		return visitTime;
	}

	public void setVisitTime(Integer visitTime) {
		this.visitTime = visitTime;
	}

	public Date getVisitDay() {
		return visitDay;
	}

	public void setVisitDay(Date visitDay) {
		this.visitDay = visitDay;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
