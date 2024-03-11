package com.scu2024.consultdemo.dao.po;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:20
 **/
@TableName("consult")
@Data
public class Consult {
	@TableId(type = IdType.AUTO)
	private Long id;
	private Long studentId;
	private Long consultorId;
	private Integer consultDay;
	private String consultorName;
	private Integer consultTime;
	private String studentName;
	@JsonIgnore
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;
	@JsonIgnore
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;
	private Integer consultStatus;
	private Integer consultNumber;
	private Boolean isOver;
	private String consultPlace;
}
