package com.scu2024.consultdemo.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.reflection.MetaObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:50
 **/
@Configuration
@MapperScan("com.scu2024.consultdemo.dao.mapper")
public class MyBatisPlusConfig {
	@Bean
	public MybatisPlusInterceptor mybatisPlusInterceptor() {
		MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
		interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
		return interceptor;
	}
	@Bean
	public MetaObjectHandler metaObjectHandler(){
		return new MetaObjectHandler() {
			@Override
			public void insertFill(MetaObject metaObject) {
				this.setFieldValByName("createTime", new Date(), metaObject);
				this.setFieldValByName("updateTime", new Date(), metaObject);
			}

			@Override
			public void updateFill(MetaObject metaObject) {
				this.setFieldValByName("updateTime", new Date(), metaObject);
			}
		};
	}
}
