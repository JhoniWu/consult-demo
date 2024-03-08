package com.scu2024.consultdemo.dao.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:20
 **/
@TableName("consult")
public class Consult {
	@TableId("consult")
	private Long id;
	private Long stu_id;
	private Long consultorId;
	private Date consultDay;
	private String consultorName;
	private Integer consultTime;
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;
	private Integer consultStatus;
	private Integer consultNumber;
	private Boolean isOver;

	@Override
	public String toString() {
		return "Consult{" +
			"id=" + id +
			", stu_id=" + stu_id +
			", consultorId=" + consultorId +
			", consultDay=" + consultDay +
			", consultorName='" + consultorName + '\'' +
			", consultTime=" + consultTime +
			", updateTime=" + updateTime +
			", createTime=" + createTime +
			", consultStatus=" + consultStatus +
			", consultNumber=" + consultNumber +
			", isOver=" + isOver +
			'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStu_id() {
		return stu_id;
	}

	public void setStu_id(Long stu_id) {
		this.stu_id = stu_id;
	}

	public Long getConsultorId() {
		return consultorId;
	}

	public void setConsultorId(Long consultorId) {
		this.consultorId = consultorId;
	}

	public Date getConsultDay() {
		return consultDay;
	}

	public void setConsultDay(Date consultDay) {
		this.consultDay = consultDay;
	}

	public String getConsultorName() {
		return consultorName;
	}

	public void setConsultorName(String consultorName) {
		this.consultorName = consultorName;
	}

	public Integer getConsultTime() {
		return consultTime;
	}

	public void setConsultTime(Integer consultTime) {
		this.consultTime = consultTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getConsultStatus() {
		return consultStatus;
	}

	public void setConsultStatus(Integer consultStatus) {
		this.consultStatus = consultStatus;
	}

	public Integer getConsultNumber() {
		return consultNumber;
	}

	public void setConsultNumber(Integer consultNumber) {
		this.consultNumber = consultNumber;
	}

	public Boolean getOver() {
		return isOver;
	}

	public void setOver(Boolean over) {
		isOver = over;
	}
}
