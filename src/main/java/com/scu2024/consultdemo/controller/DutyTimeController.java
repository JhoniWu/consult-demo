
package com.scu2024.consultdemo.controller;

import com.scu2024.consultdemo.common.CommonResult;
import com.scu2024.consultdemo.dao.po.Consult;
import com.scu2024.consultdemo.dao.po.DutyTime;
import com.scu2024.consultdemo.service.DutyTimeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 12:46
 **/
@RestController
@RequestMapping("/duty_time")
public class DutyTimeController {
	@Resource
	private DutyTimeService dutyTimeService;
	@GetMapping("/listall")
	public CommonResult listAll(){
		return CommonResult.success(dutyTimeService.listAll());
	}

	@PostMapping("delete")
	public CommonResult deleteById(@RequestBody DutyTime dutyTime){
		boolean b = dutyTimeService.deleteById(dutyTime);
		if(b){
			return CommonResult.success("删除成功");
		}else {
			return CommonResult.bizError("删除失败");
		}
	}

	@PostMapping("/add")
	public CommonResult addOne(@RequestBody DutyTime dutyTime){
		boolean add = dutyTimeService.add(dutyTime);
		if(add){
			return CommonResult.success("添加成功");
		} else {
			return CommonResult.bizError("添加失败");
		}
	}

	@GetMapping("/query")
	public CommonResult query(@RequestParam(value = "role", defaultValue = "3") Integer role){
		return CommonResult.success(dutyTimeService.query(role));
	}
}