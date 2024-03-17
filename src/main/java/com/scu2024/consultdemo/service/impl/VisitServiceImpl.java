package com.scu2024.consultdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.scu2024.consultdemo.dao.mapper.VisitMapper;
import com.scu2024.consultdemo.dao.po.Visit;
import com.scu2024.consultdemo.service.VisitService;
import jakarta.annotation.Resource;
import org.apache.catalina.webresources.war.WarURLConnection;
import org.springframework.stereotype.Service;

import java.awt.desktop.QuitEvent;
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
		QueryWrapper<Visit> qw = new QueryWrapper<>();
		qw.eq("student_id", visit.getStudentId());
		int size = visitMapper.selectList(qw).size();
		if(size > 0) return false;
		return visitMapper.insert(visit) > 0;
	}

	@Override
	public IPage<Visit> queryByPage(int pageSize, int pageNum, Visit visit) {
		QueryWrapper<Visit> qw = new QueryWrapper<>();
		qw.eq(visit.getStudentId()!=null, "student_id", visit.getStudentId());
		qw.eq(visit.getVisitorId() != null, "visit_id", visit.getVisitorId());
		qw.eq(visit.getVisitTime()!=null, "visit_time", visit.getVisitTime());
		qw.eq(visit.getVisitDay()!=null, "visit_day", visit.getVisitDay());
		qw.eq(visit.getState()!=null, "state", visit.getState());
		return visitMapper.selectPage(new Page<>(pageNum, pageSize), qw);
	}

	@Override
	public boolean deleteByIds(List<Long> ids) {
		if(ids.isEmpty()){
			return false;
		} else{
			QueryWrapper<Visit> qw = new QueryWrapper<>();
			qw.in("id", ids);
			visitMapper.delete(qw);
			return true;
		}
	}

	@Override
	public boolean isExist(Long studentId) {
		QueryWrapper<Visit> qw = new QueryWrapper<>();
		qw.eq("student_id", studentId);
		int size = visitMapper.selectList(qw).size();
		if(size == 0) return false;
		return true;
	}

	@Override
	public boolean updateV1(Visit visit) {
		UpdateWrapper<Visit> uw = new UpdateWrapper<>();
		uw.eq("id", visit.getId());
		return visitMapper.update(visit, uw) > 0;
	}
}
