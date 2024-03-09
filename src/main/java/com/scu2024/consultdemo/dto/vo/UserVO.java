package com.scu2024.consultdemo.dto.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-07 15:38
 **/
public class UserVO {
	private Long id;
	private String name;
	private String account;
	private Integer role;

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

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserVO{" +
			"id=" + id +
			", name='" + name + '\'' +
			", account='" + account + '\'' +
			", role=" + role +
			'}';
	}
}
