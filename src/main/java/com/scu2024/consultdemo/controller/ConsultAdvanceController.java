
package com.scu2024.consultdemo.controller;

import com.scu2024.consultdemo.common.CommonResult;
import com.scu2024.consultdemo.dao.po.ConsultAdvance;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.service.ConsultAdvanceService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 12:46
 **/
@RestController
@RequestMapping("/consult_ad")
public class ConsultAdvanceController {

	@Resource
	private ConsultAdvanceService consultAdvanceService;

	@GetMapping("/listall")
	public CommonResult listAll(){
		return CommonResult.success(consultAdvanceService.listAll());
	}

	@PostMapping ("/delete/{id}")
	public CommonResult deleteById(@PathVariable("id") Long id){
		return CommonResult.success(consultAdvanceService.deleteById(id));
	}

	@PostMapping("/add")
	public CommonResult addOne(@RequestBody ConsultAdvance consultAdvance){
		return CommonResult.success(consultAdvanceService.add(consultAdvance));
	}

	@PostMapping("/listpage")
	public CommonResult listPage(@RequestParam("pageSize") Integer pageSize, @RequestParam("pageNum") Integer pageNum, @RequestBody ConsultAdvance consultAdvance){
		return CommonResult.success(consultAdvanceService.queryByPage(pageSize, pageNum, consultAdvance));
	}
}
