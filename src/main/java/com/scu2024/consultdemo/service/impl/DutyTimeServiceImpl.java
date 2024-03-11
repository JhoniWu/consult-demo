package com.scu2024.consultdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.scu2024.consultdemo.common.ConvertBeanUtils;
import com.scu2024.consultdemo.dao.mapper.DutyTimeMapper;
import com.scu2024.consultdemo.dao.po.DutyTime;
import com.scu2024.consultdemo.dto.vo.DutyTimeRespVO;
import com.scu2024.consultdemo.service.DutyTimeService;
import com.scu2024.consultdemo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DutyTimeServiceImpl implements DutyTimeService {
	@Resource
	private DutyTimeMapper dutyTimeMapper;
	@Resource
	private UserService userService;
	@Override
	public List<DutyTime> listAll() {
		return dutyTimeMapper.selectList(null);
	}

	@Override
	public boolean deleteById(DutyTime dutyTime) {
		QueryWrapper<DutyTime> qw = new QueryWrapper<>();
		qw.eq("week", dutyTime.getWeek()).eq("time_start", dutyTime.getTimeStart()).eq("time_over", dutyTime.getTimeOver()).eq("user_id", dutyTime.getUserId());
		return dutyTimeMapper.delete(qw) > 0;
	}

	@Override
	public boolean add(DutyTime dutyTime) {
		System.out.println(dutyTime.toString());
		dutyTime.setRole(userService.queryRole(dutyTime.getUserId()));
		return dutyTimeMapper.insert(dutyTime) > 0;
	}

	@Override
	public List<DutyTimeRespVO> query(Integer role) {
		QueryWrapper<DutyTime> qw = new QueryWrapper<>();
		qw.eq("role", role);
		List<DutyTime> dutyTimes = dutyTimeMapper.selectList(qw);
		List<DutyTimeRespVO> respVOS = new ArrayList<>();
		dutyTimes.stream().forEach(dy -> {
			DutyTimeRespVO dtr = ConvertBeanUtils.convert(dy, DutyTimeRespVO.class);
			dtr.setName(userService.selectName(dy.getUserId()));
			respVOS.add(dtr);
		});
		return respVOS;
	}
}
