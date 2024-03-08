package com.scu2024.consultdemo.dao.po;

import com.baomidou.mybatisplus.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:19
 **/
@TableName("duty_time")
public class DutyTime {
	@TableId(type = IdType.AUTO)
	private Long id;
	private Integer role;
	private Integer week;
	private Integer workTime;
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;

	@Override
	public String toString() {
		return "DutyTime{" +
			"id=" + id +
			", role=" + role +
			", week=" + week +
			", workTime=" + workTime +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			'}';
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Integer getWeek() {
		return week;
	}

	public void setWeek(Integer week) {
		this.week = week;
	}

	public Integer getWorkTime() {
		return workTime;
	}

	public void setWorkTime(Integer workTime) {
		this.workTime = workTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
