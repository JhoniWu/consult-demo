package com.scu2024.consultdemo.dto;

import lombok.Data;

import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-10 10:17
 **/
@Data
public class ConsultResultDTO {
	Long id;
	String name;
	String consultorName;
	String grade;
	Integer consultTime;
	String studentId;
	String consultorId;
}
