package com.scu2024.consultdemo.service.impl;

import com.scu2024.consultdemo.dao.mapper.DutyTimeMapper;
import com.scu2024.consultdemo.dao.po.DutyTime;
import com.scu2024.consultdemo.service.DutyTimeService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DutyTimeServiceImpl implements DutyTimeService {
	@Resource
	private DutyTimeMapper dutyTimeMapper;
	@Override
	public List<DutyTime> listAll() {
		return dutyTimeMapper.selectList(null);
	}

	@Override
	public boolean deleteById(Long id) {
		return dutyTimeMapper.deleteById(id) > 0;
	}

	@Override
	public boolean add(DutyTime dutyTime) {
		return dutyTimeMapper.insert(dutyTime) > 0;
	}

}
