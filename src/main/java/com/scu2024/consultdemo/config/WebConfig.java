package com.scu2024.consultdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-07 09:29
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Autowired
	private UserInfoInterceptor userInfoInterceptor;
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") // 所有接口
			.allowCredentials(true) // 是否发送 Cookie
			.allowedOriginPatterns("*") // 支持域
			.allowedMethods("GET", "POST", "PUT", "DELETE") // 支持方法
			.allowedHeaders("*")
			.exposedHeaders("*");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(this.userInfoInterceptor).addPathPatterns("/**")
			.excludePathPatterns("/user/login")
			.excludePathPatterns("/user/register");
	}
}
