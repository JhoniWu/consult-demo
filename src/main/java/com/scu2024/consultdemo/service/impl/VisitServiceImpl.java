package com.scu2024.consultdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.scu2024.consultdemo.dao.mapper.VisitMapper;
import com.scu2024.consultdemo.dao.po.Visit;
import com.scu2024.consultdemo.service.VisitService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VisitServiceImpl implements VisitService {
	@Resource
	private VisitMapper visitMapper;
	@Override
	public List<Visit> listAll() {
		QueryWrapper<Visit> qw = new QueryWrapper<>();
		return visitMapper.selectList(qw);
	}

	@Override
	public boolean deleteById(Long id) {
		return visitMapper.deleteById(id) > 0;
	}

	@Override
	public boolean add(Visit visit) {
		return visitMapper.insert(visit) > 0;
	}

	@Override
	public IPage<Visit> queryByPage(int pageSize, int pageNum, Visit visit) {
		QueryWrapper<Visit> qw = new QueryWrapper<>();
		qw.eq(visit.getId()!=null, "id", visit.getId());
		return visitMapper.selectPage(new Page<>(pageSize, pageNum), qw);
	}


}