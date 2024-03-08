package com.scu2024.consultdemo.dao.po;

import com.baomidou.mybatisplus.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.PipedReader;
import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:20
 **/
@TableName("consult_advance")
public class ConsultAdvance {
	@TableId(type = IdType.AUTO)
	private Long id;
	private Long studentId;
	private Long consultorId;
	private Integer consultTime;
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;

	@Override
	public String toString() {
		return "ConsultAdvance{" +
			"id=" + id +
			", studentId=" + studentId +
			", consultorId=" + consultorId +
			", consultTime=" + consultTime +
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

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getConsultorId() {
		return consultorId;
	}

	public void setConsultorId(Long consultorId) {
		this.consultorId = consultorId;
	}

	public Integer getConsultTime() {
		return consultTime;
	}

	public void setConsultTime(Integer consultTime) {
		this.consultTime = consultTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
