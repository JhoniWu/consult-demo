package com.scu2024.consultdemo.controller;

import com.scu2024.consultdemo.common.CommonResult;
import com.scu2024.consultdemo.dao.po.Consult;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.dao.po.VisitAdvance;
import com.scu2024.consultdemo.service.VisitAdvanceService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 12:47
 **/
@RestController
@RequestMapping("/visit_ad")
public class VisitAdvanceController {
	@Resource
	private VisitAdvanceService visitAdvanceService;
	@GetMapping("/listall")
	public CommonResult listAll(){
		return CommonResult.success(visitAdvanceService.listAll());
	}

	@PostMapping("/delete/{id}")
	public CommonResult deleteById(@PathVariable("id") Long id){
		return CommonResult.success(visitAdvanceService.deleteById(id));
	}

	@PostMapping("/add")
	public CommonResult addOne(@RequestBody VisitAdvance visitAdvance){
		return CommonResult.success(visitAdvanceService.add(visitAdvance));
	}

	@PostMapping("/listpage")
	public CommonResult listPage(@RequestParam("pageSize") Integer pageSize, @RequestParam("pageNum") Integer pageNum, @RequestBody VisitAdvance visitAdvance){
		return CommonResult.success(visitAdvanceService.queryByPage(pageSize, pageNum, visitAdvance));
	}
}
