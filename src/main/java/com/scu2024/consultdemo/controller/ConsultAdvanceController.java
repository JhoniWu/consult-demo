
package com.scu2024.consultdemo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scu2024.consultdemo.common.CommonResult;
import com.scu2024.consultdemo.dao.po.ConsultAdvance;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.dto.ConsultResultDTO;
import com.scu2024.consultdemo.dto.DeleteDTO;
import com.scu2024.consultdemo.dto.PageDTO;
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

	@PostMapping("/delete")
	public CommonResult deleteByIds(@RequestBody DeleteDTO deleteDTO){
		return CommonResult.success(consultAdvanceService.deleteByIds(deleteDTO.getIds()));
	}

	@PostMapping("/add")
	public CommonResult addOne(@RequestBody ConsultAdvance consultAdvance){
		return CommonResult.success(consultAdvanceService.add(consultAdvance));
	}

	@GetMapping("/listpage")
	public CommonResult listPage(PageDTO pageDTO, ConsultAdvance consultAdvance){
		return CommonResult.success(consultAdvanceService.queryByPage(pageDTO.getPageSize(), pageDTO.getPageNum(), consultAdvance));
	}

	@GetMapping("/query/records")
	public CommonResult queryRecords(PageDTO pageDTO, Long studentId){
		IPage<ConsultResultDTO> consultResultDTOIPage = consultAdvanceService.queryCaRecords(pageDTO.getPageSize(), pageDTO.getPageNum(), studentId);
		if(consultResultDTOIPage.getTotal() == 0){
			return CommonResult.bizError("没有记录");
		} else {
			return CommonResult.success(consultResultDTOIPage);
		}
	}
}