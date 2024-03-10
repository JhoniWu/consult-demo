package com.scu2024.consultdemo.controller;

import com.scu2024.consultdemo.common.CommonResult;
import com.scu2024.consultdemo.dao.po.Consult;
import com.scu2024.consultdemo.dao.po.ConsultAdvance;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.dto.DeleteDTO;
import com.scu2024.consultdemo.service.ConsultService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

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

	@PostMapping("/delete")
	public CommonResult deleteById(@RequestBody DeleteDTO deleteDTO){
		return CommonResult.success(consultService.deleteByIds(deleteDTO.getIds()));
	}

	@PostMapping("/listpage")
	public CommonResult listPage(@RequestParam("pageSize") Integer pageSize, @RequestParam("pageNum") Integer pageNum, @RequestBody Consult consult){
		return CommonResult.success(consultService.queryByPage(pageSize, pageNum, consult));
	}

	@PostMapping("/arrange")
	public CommonResult arrange(@RequestBody Consult consult){
		return CommonResult.success(consultService.arrangeStudent(consult));
	}

}
