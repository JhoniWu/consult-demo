
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

	@PostMapping("delete/{id}")
	public CommonResult deleteById(@PathVariable("id") Long id){
		return CommonResult.success(dutyTimeService.deleteById(id));
	}

	@PostMapping("/add")
	public CommonResult addOne(@RequestBody DutyTime dutyTime){
		return CommonResult.success(dutyTimeService.add(dutyTime));
	}
}
