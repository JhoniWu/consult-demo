package com.scu2024.consultdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scu2024.consultdemo.common.ConvertBeanUtils;
import com.scu2024.consultdemo.dao.mapper.UserMapper;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.service.UserService;
import com.scu2024.consultdemo.dto.vo.UserVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:36
 **/
@Service
public class UserServiceImpl implements UserService {
	@Resource
	UserMapper userMapper;
	@Override
	public List<User> listAll() {
		return userMapper.selectList(null);
	}
	@Override
	public boolean deleteById(Long id) {
		return userMapper.deleteById(id) > 0;
	}
	@Override
	public boolean add(User user) {
		return userMapper.insert(user) > 0;
	}
	@Override
	public IPage<UserVO> queryByPage(int pageSize, int pageNum, User user) {

		Page<User> userPage = userMapper.queryByPage(new Page<>(pageNum, pageSize), user);
		IPage<UserVO> convert = userPage.convert(User -> ConvertBeanUtils.convert(User, UserVO.class));
		return convert;
	}

	@Override
	public User login(String account, String password) {
		System.out.println(account);
		List<User> userList = userMapper.selectList(new QueryWrapper<User>().eq("account", account).eq("password", password));
		if (userList.isEmpty()){
			return null;
		} else {
			return userList.get(0);
		}
	}

	@Override
	public boolean register(String account, String password) {
		List<User> userList = userMapper.selectList(new QueryWrapper<User>().eq("account", account));
		if(!userList.isEmpty()){
			return false;
		}
		User user = new User();
		user.setAccount(account);
		user.setPassword(password);
		user.setRole(1);
		userMapper.insert(user);
		return true;
	}

	@Override
	public String selectName(Long id) {
		User user = userMapper.selectById(id);
		return user.getName();
	}

	@Override
	public Integer queryRole(Long id) {
		User user = userMapper.selectById(id);
		return user.getRole();
	}


}
