package com.scu2024.consultdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scu2024.consultdemo.dao.mapper.VisitAdvanceMapper;
import com.scu2024.consultdemo.dao.po.VisitAdvance;
import com.scu2024.consultdemo.service.VisitAdvanceService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VisitAdvanceServiceImpl implements VisitAdvanceService {
	@Resource
	private VisitAdvanceMapper visitAdvanceMapper;
	@Override
	public List<VisitAdvance> listAll() {
		List<VisitAdvance> visitAdvances = visitAdvanceMapper.selectList(null);
		System.out.println(visitAdvances.get(0).toString());
		return visitAdvances;
	}

	@Override
	public boolean deleteById(Long id) {
		return visitAdvanceMapper.deleteById(id) > 0;
	}

	@Override
	public boolean add(VisitAdvance visitAdvance) {
		return visitAdvanceMapper.insert(visitAdvance) > 0;
	}

	@Override
	public IPage<VisitAdvance> queryByPage(int pageSize, int pageNum, VisitAdvance visitAdvance) {
		QueryWrapper<VisitAdvance> qw = new QueryWrapper<>();
		if(visitAdvance.getStudentId()!=null){
			qw.eq("student_id", visitAdvance.getStudentId());
		}
		if(visitAdvance.getArrangeState()!=null){
			qw.eq("arrange_state", visitAdvance.getArrangeState());
		}
		return visitAdvanceMapper.selectPage(new Page<>(pageNum, pageSize), qw);
	}

	@Override
	public boolean deleteByIds(List<Long> ids) {
		System.out.println(ids.toString());
		if(ids.isEmpty()) {
			return false;
		}
		QueryWrapper<VisitAdvance> qw = new QueryWrapper<>();
		qw.in("student_id" , ids);
		visitAdvanceMapper.delete(qw);
		return true;
	}

}
