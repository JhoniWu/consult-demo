package com.scu2024.consultdemo.dao.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

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
	private Date visitDay;
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;
}
