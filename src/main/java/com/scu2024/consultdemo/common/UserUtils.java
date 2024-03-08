package com.scu2024.consultdemo.common;

import com.scu2024.consultdemo.dao.po.User;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-08 10:13
 **/
public class UserUtils {
	private static final ThreadLocal<User> userThreadLocal = new ThreadLocal<User>();

	public static void addUser(User user){
		userThreadLocal.set(user);
	}

	public static User getCurrentUser(){
		return userThreadLocal.get();
	}

	public static void remove(){
		userThreadLocal.remove();
	}
}
