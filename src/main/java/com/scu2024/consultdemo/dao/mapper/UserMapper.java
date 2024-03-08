package com.scu2024.consultdemo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scu2024.consultdemo.dao.po.User;
import org.apache.catalina.realm.UserDatabaseRealm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:33
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {
	Page<User> queryByPage(@Param("page") Page<User> page,@Param("user") User user);
}
