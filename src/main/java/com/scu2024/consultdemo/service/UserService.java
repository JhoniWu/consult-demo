package com.scu2024.consultdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.dto.vo.UserVO;

import java.util.List;


public interface UserService {
	List<User> listAll();

	boolean deleteById(Long id);

	boolean add(User user);

	IPage<UserVO> queryByPage(int pageSize, int pageNum, User user);

	User login(String account, String password);

	boolean register(String account, String password);
}
