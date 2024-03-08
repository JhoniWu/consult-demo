package com.scu2024.consultdemo.controller;

import com.scu2024.consultdemo.common.CommonResult;
import com.scu2024.consultdemo.common.SessionContext;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-08 15:07
 **/
@RestController
@RequestMapping("/util")
public class SessionController {
	@GetMapping("/allsession")
	public CommonResult getAllSession(){
		HashMap mymap = SessionContext.mymap;
		List<String> list = new ArrayList<>();
		for(Object o : mymap.keySet()){
			String key = (String) o;
			HttpSession session = (HttpSession)mymap.get(key);
			list.add(session.getId());
		}
		return CommonResult.success(list);
	}
}