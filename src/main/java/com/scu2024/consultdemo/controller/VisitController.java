package com.scu2024.consultdemo.controller;

import com.scu2024.consultdemo.common.CommonResult;
import com.scu2024.consultdemo.dao.po.Consult;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.dao.po.Visit;
import com.scu2024.consultdemo.dto.DeleteDTO;
import com.scu2024.consultdemo.service.VisitService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 12:47
 **/
@RestController
@RequestMapping("/visit")
public class VisitController {
	@Resource
	private VisitService visitService;
	@GetMapping("/listall")
	public CommonResult listAll(){
		return CommonResult.success(visitService.listAll());
	}

	@PostMapping("/delete")
	public CommonResult deleteById(@RequestBody DeleteDTO ids){
		return CommonResult.success(visitService.deleteByIds(ids.getIds()));
	}

	@PostMapping("/add")
	public CommonResult addOne(@RequestBody Visit visit){
		return CommonResult.success(visitService.add(visit));
	}

	@PostMapping("/listpage")
	public CommonResult listPage(@RequestParam("pageSize") Integer pageSize, @RequestParam("pageNum") Integer pageNum, @RequestBody Visit visit){
		return CommonResult.success(visitService.queryByPage(pageSize, pageNum, visit));
	}
}
