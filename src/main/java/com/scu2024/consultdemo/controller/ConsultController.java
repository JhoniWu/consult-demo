package com.scu2024.consultdemo.controller;

import com.scu2024.consultdemo.common.CommonResult;
import com.scu2024.consultdemo.dao.po.Consult;
import com.scu2024.consultdemo.dao.po.ConsultAdvance;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.dto.DeleteDTO;
import com.scu2024.consultdemo.dto.vo.ConsultAdReqVO;
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

	@GetMapping("/listpage")
	public CommonResult listPage(Integer pageSize, Integer pageNum, Consult consult){
		return CommonResult.success(consultService.queryByPage(pageSize, pageNum, consult));
	}

	@GetMapping("/arrange")
	public CommonResult arrange(@RequestParam("id") Long id, @RequestParam("consultorId") Long consultId){
		return CommonResult.success(consultService.arrangeStudent(id, consultId));
	}

	@PostMapping("/setconsult")
	public CommonResult setconsult(@RequestBody ConsultAdReqVO consultAdReqVO){
			return CommonResult.success(consultService.setconsult(consultAdReqVO));
	}

	@PostMapping("/add")
	public CommonResult add(@RequestBody Consult consult){
		return CommonResult.success(consultService.add(consult));
	}

	@PostMapping("/update")
	public CommonResult update(@RequestBody Consult consult){
		return CommonResult.success(consultService.updateV1(consult));
	}

}
