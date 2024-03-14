package com.scu2024.consultdemo.dao.po;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.awt.*;
import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:19
 **/
@TableName("visit")
@Data
public class Visit {
	@TableId(type = IdType.AUTO)
	private Long id;
	private Long studentId;
	private Long visitorId;
	private Integer severity;
	private String problemType;
	private Integer state;
	private Integer visitTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
	private Date visitDay;
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	@JsonIgnore
	private Date createTime;
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	@JsonIgnore
	private Date updateTime;
}
