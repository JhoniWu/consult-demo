package com.scu2024.consultdemo.dao.po;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:18
 **/
@TableName("user")
public class User {
	@TableId(type = IdType.AUTO)
	private Long id;
	private String name;
	private String account;
	private String password;
	private Integer role;
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", name='" + name + '\'' +
			", account='" + account + '\'' +
			", password='" + password + '\'' +
			", role=" + role +
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
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
