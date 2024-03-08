package com.scu2024.consultdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scu2024.consultdemo.dao.mapper.ConsultAdvanceMapper;
import com.scu2024.consultdemo.dao.mapper.ConsultMapper;
import com.scu2024.consultdemo.dao.po.ConsultAdvance;
import com.scu2024.consultdemo.service.ConsultAdvanceService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ConsultAdvanceServiceImpl implements ConsultAdvanceService {
	@Resource
	private ConsultAdvanceMapper consultAdvanceMapper;
	@Override
	public List<ConsultAdvance> listAll() {
		return consultAdvanceMapper.selectList(null);
	}

	@Override
	public boolean deleteById(Long id) {
		return consultAdvanceMapper.deleteById(id) > 0;
	}

	@Override
	public boolean add(ConsultAdvance consultAdvance) {
		return consultAdvanceMapper.insert(consultAdvance) > 0;
	}

	@Override
	public IPage<ConsultAdvance> queryByPage(int pageSize, int pageNum, ConsultAdvance consultAdvance) {
		QueryWrapper<ConsultAdvance> qw = new QueryWrapper<>();
		return consultAdvanceMapper.selectPage(new Page<>(pageSize, pageNum), qw);
	}
}
