package com.scu2024.consultdemo.dao.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:19
 **/
@TableName("duty_time")
@Data
public class DutyTime {
	@TableId(type = IdType.AUTO)
	private Long id;
	private Integer week;
	private Long userId;
	private Integer role;
	private Integer timeStart;
	private Integer timeOver;
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;
}
