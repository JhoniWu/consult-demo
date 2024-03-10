package com.scu2024.consultdemo.dao.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

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
	@TableId("consult")
	private Long id;
	private Long studentId;
	private Long consultorId;
	private Integer consultDay;
	private String consultorName;
	private Integer consultTime;
	private String studentName;
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;
	private Integer consultStatus;
	private Integer consultNumber;
	private Boolean isOver;
	private String consultPlace;
}
