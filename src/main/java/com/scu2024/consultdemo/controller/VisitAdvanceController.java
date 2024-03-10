package com.scu2024.consultdemo.controller;

import com.scu2024.consultdemo.common.CommonResult;
import com.scu2024.consultdemo.dao.po.Consult;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.dao.po.VisitAdvance;
import com.scu2024.consultdemo.dto.DeleteDTO;
import com.scu2024.consultdemo.dto.PageDTO;
import com.scu2024.consultdemo.service.VisitAdvanceService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


	@PostMapping("/add")
	public CommonResult addOne(@RequestBody VisitAdvance visitAdvance){
		return CommonResult.success(visitAdvanceService.add(visitAdvance));
	}

	@GetMapping("/listpage")
	public CommonResult listPage(PageDTO pageDTO, VisitAdvance visitAdvance){
		return CommonResult.success(visitAdvanceService.queryByPage(pageDTO.getPageSize(), pageDTO.getPageNum(), visitAdvance));
	}

	@PostMapping("/delete")
	public CommonResult delete(@RequestBody DeleteDTO ids){
		System.out.println(ids);
		boolean isd = visitAdvanceService.deleteByIds(ids.getIds());
		if(isd) return CommonResult.success("删除成功");
		return CommonResult.bizError("删除错误");
	}
}
