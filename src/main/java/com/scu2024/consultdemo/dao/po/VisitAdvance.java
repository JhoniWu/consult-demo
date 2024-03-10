package com.scu2024.consultdemo.dao.po;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.awt.*;
import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:20
 **/
@TableName("visit_advance")
public class VisitAdvance {
	@TableId(type = IdType.AUTO)
	private Long id;
	private Long studentId;
	private Integer paperGrade;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date willingDay1;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date willingDay2;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date willingDay3;

	private Integer willingTime1;
	private Integer willingTime2;
	private Integer willingTime3;
	private Integer arrangeState;

	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;

	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;

	@Override
	public String toString() {
		return "VisitAdvance{" +
			"id=" + id +
			", studentId=" + studentId +
			", paperGrade=" + paperGrade +
			", WillingTime1=" + willingTime1 +
			", WillingTime2=" + willingTime2 +
			", WillingTime3=" + willingTime3 +
			", arrangeState=" + arrangeState +
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

	public Integer getPaperGrade() {
		return paperGrade;
	}

	public void setPaperGrade(Integer paperGrade) {
		this.paperGrade = paperGrade;
	}

	public Date getWillingDay1() {
		return willingDay1;
	}

	public void setWillingDay1(Date willingDay1) {
		this.willingDay1 = willingDay1;
	}

	public Date getWillingDay2() {
		return willingDay2;
	}

	public void setWillingDay2(Date willingDay2) {
		this.willingDay2 = willingDay2;
	}

	public Date getWillingDay3() {
		return willingDay3;
	}

	public void setWillingDay3(Date willingDay3) {
		this.willingDay3 = willingDay3;
	}

	public Integer getWillingTime1() {
		return willingTime1;
	}

	public void setWillingTime1(Integer willingTime1) {
		this.willingTime1 = willingTime1;
	}

	public Integer getWillingTime2() {
		return willingTime2;
	}

	public void setWillingTime2(Integer willingTime2) {
		this.willingTime2 = willingTime2;
	}

	public Integer getWillingTime3() {
		return willingTime3;
	}

	public void setWillingTime3(Integer willingTime3) {
		this.willingTime3 = willingTime3;
	}

	public Integer getArrangeState() {
		return arrangeState;
	}

	public void setArrangeState(Integer arrangeState) {
		this.arrangeState = arrangeState;
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
