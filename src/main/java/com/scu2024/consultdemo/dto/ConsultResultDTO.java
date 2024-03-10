package com.scu2024.consultdemo.dto;

import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-10 10:17
 **/
public class ConsultResultDTO {
	String name;
	String consultorName;
	String grade;
	Integer consultTime;
	String studentId;
	String consultorId;



	public Integer getConsultTime() {
		return consultTime;
	}

	public void setConsultTime(Integer consultTime) {
		this.consultTime = consultTime;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getConsultorId() {
		return consultorId;
	}

	public void setConsultorId(String consultorId) {
		this.consultorId = consultorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConsultorName() {
		return consultorName;
	}

	public void setConsultorName(String consultorName) {
		this.consultorName = consultorName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "ConsultResultDTO{" +
			"name='" + name + '\'' +
			", consultorName='" + consultorName + '\'' +
			", grade='" + grade + '\'' +
			", consultTime=" + consultTime +
			", studentId='" + studentId + '\'' +
			", consultorId='" + consultorId + '\'' +
			'}';
	}
}
