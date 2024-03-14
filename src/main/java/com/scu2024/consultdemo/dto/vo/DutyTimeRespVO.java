package com.scu2024.consultdemo.dto.vo;

import lombok.Data;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-11 11:23
 **/
@Data
public class DutyTimeRespVO {
	private Integer week;
	private Integer timeStart;
	private Integer timeOver;
	private String name;
	private Long userId;
}