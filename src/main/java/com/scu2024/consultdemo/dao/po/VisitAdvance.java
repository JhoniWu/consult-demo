package com.scu2024.consultdemo.dao.po;

import com.baomidou.mybatisplus.annotation.*;

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
	private Date WillingDay1;
	private Date WillingDay2;
	private Date WillingDay3;
	private Integer WillingTime1;
	private Integer WillingTime2;
	private Integer WillingTime3;
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
			", WillingDay1=" + WillingDay1 +
			", WillingDay2=" + WillingDay2 +
			", WillingDay3=" + WillingDay3 +
			", WillingTime1=" + WillingTime1 +
			", WillingTime2=" + WillingTime2 +
			", WillingTime3=" + WillingTime3 +
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
		return WillingDay1;
	}

	public void setWillingDay1(Date willingDay1) {
		WillingDay1 = willingDay1;
	}

	public Date getWillingDay2() {
		return WillingDay2;
	}

	public void setWillingDay2(Date willingDay2) {
		WillingDay2 = willingDay2;
	}

	public Date getWillingDay3() {
		return WillingDay3;
	}

	public void setWillingDay3(Date willingDay3) {
		WillingDay3 = willingDay3;
	}

	public Integer getWillingTime1() {
		return WillingTime1;
	}

	public void setWillingTime1(Integer willingTime1) {
		WillingTime1 = willingTime1;
	}

	public Integer getWillingTime2() {
		return WillingTime2;
	}

	public void setWillingTime2(Integer willingTime2) {
		WillingTime2 = willingTime2;
	}

	public Integer getWillingTime3() {
		return WillingTime3;
	}

	public void setWillingTime3(Integer willingTime3) {
		WillingTime3 = willingTime3;
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
