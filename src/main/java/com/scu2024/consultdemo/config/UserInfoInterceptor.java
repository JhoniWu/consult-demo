package com.scu2024.consultdemo.config;

import com.fasterxml.jackson.datatype.jsr310.ser.YearSerializer;
import com.scu2024.consultdemo.common.UserUtils;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-08 10:15
 **/
@Component
public class UserInfoInterceptor implements HandlerInterceptor {
	@Autowired
	private UserService userService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
		Long userId = (Long)session.getAttribute("userid");
		System.out.println("session userid is "+userId);
		if(userId == null){
			return false;
		}
		User user = new User();
		user.setRole((Integer) session.getAttribute("role"));
		user.setPassword((String) session.getAttribute("password"));
		user.setId(userId);
		user.setAccount((String) session.getAttribute("account"));
		UserUtils.addUser(user);
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		UserUtils.remove();
	}
}
