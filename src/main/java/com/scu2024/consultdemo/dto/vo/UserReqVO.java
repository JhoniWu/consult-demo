package com.scu2024.consultdemo.dto.vo;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-07 17:29
 **/
public class UserReqVO {
	String account;
	String password;

	@Override
	public String toString() {
		return "UserReqVO{" +
			"account='" + account + '\'' +
			", password='" + password + '\'' +
			'}';
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
}
