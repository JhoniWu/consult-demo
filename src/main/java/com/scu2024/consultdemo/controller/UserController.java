package com.scu2024.consultdemo.controller;

import com.scu2024.consultdemo.common.CommonResult;
import com.scu2024.consultdemo.common.UserUtils;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.dto.PageDTO;
import com.scu2024.consultdemo.service.UserService;
import com.scu2024.consultdemo.dto.vo.UserReqVO;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 12:47
 **/
@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	@GetMapping("/listall")
	public CommonResult listAll(){
		return CommonResult.success(userService.listAll());
	}

	@PostMapping("/delete/{id}")
	public CommonResult deleteById(@PathVariable("id") Long id){
		return CommonResult.success(userService.deleteById(id));
	}

	@PostMapping("/add")
	public CommonResult addOne(@RequestBody User user){
		return CommonResult.success(userService.add(user));
	}

	@GetMapping("/listpage")
	public CommonResult listPage(PageDTO pageDTO, User user){
		return CommonResult.success(userService.queryByPage(pageDTO.getPageSize(), pageDTO.getPageNum(), user));
	}

	@PostMapping("/login")
	public CommonResult login(HttpServletRequest request, @RequestBody UserReqVO userReqVO){
		User user = UserUtils.getCurrentUser();
		if(user != null){
			return CommonResult.success("用户已登录");
		}
		String account = userReqVO.getAccount();
		String password = userReqVO.getPassword();
		User loginUser = userService.login(account, password);
		if(loginUser!=null){
			HttpSession session = request.getSession();
			session.setAttribute("account", loginUser.getAccount());
			session.setAttribute("password", loginUser.getPassword());
			session.setAttribute("userid",loginUser.getId());
			session.setAttribute("role", loginUser.getRole());
			return CommonResult.success("登录成功");
		} else {
			return CommonResult.bizError("账户或密码错误");
		}
	}

	@PostMapping("/register")
	public CommonResult register(@RequestBody UserReqVO userReqVO){
		boolean isR = userService.register(userReqVO.getAccount(), userReqVO.getPassword());
		if(isR){
			return CommonResult.success("account is "+ userReqVO.getAccount());
		} else {
			return CommonResult.bizError("账户已被注册");
		}
	}

	@GetMapping("/current")
	public CommonResult getCurrentUser(){
		User currentUser = UserUtils.getCurrentUser();
		if(currentUser == null) return CommonResult.bizError("未登录");
		return CommonResult.success(currentUser);
	}
}
