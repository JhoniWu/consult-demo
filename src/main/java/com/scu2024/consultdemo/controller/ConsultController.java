package com.scu2024.consultdemo.controller;

import com.scu2024.consultdemo.common.CommonResult;
import com.scu2024.consultdemo.dao.po.Consult;
import com.scu2024.consultdemo.dao.po.ConsultAdvance;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.service.ConsultService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 12:46
 **/
@RestController
@RequestMapping("/consult")
public class ConsultController {
	@Resource
	private ConsultService consultService;
	@GetMapping("/listall")
	public CommonResult listAll(){
		return CommonResult.success(consultService.listAll());
	}

	@PostMapping("/delete/{id}")
	public CommonResult deleteById(@PathVariable("id") Long id){
		return CommonResult.success(consultService.deleteById(id));
	}

	@PostMapping("/add")
	public CommonResult addOne(@RequestBody Consult consult){
		return CommonResult.success(consultService.add(consult));
	}

	@PostMapping("/listpage")
	public CommonResult listPage(@RequestParam("pageSize") Integer pageSize, @RequestParam("pageNum") Integer pageNum, @RequestBody Consult consult){
		return CommonResult.success(consultService.queryByPage(pageSize, pageNum, consult));
	}
}
