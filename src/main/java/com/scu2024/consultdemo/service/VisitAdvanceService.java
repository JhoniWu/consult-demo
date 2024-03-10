package com.scu2024.consultdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scu2024.consultdemo.dao.po.Visit;
import com.scu2024.consultdemo.dao.po.VisitAdvance;
import org.springframework.stereotype.Service;

import java.util.List;


public interface VisitAdvanceService {
	List<VisitAdvance> listAll();

	boolean deleteById(Long id);

	boolean add(VisitAdvance visitAdvance);

	IPage<VisitAdvance> queryByPage(int pageSize, int pageNum, VisitAdvance visitAdvance);

	boolean deleteByIds(List<Long> ids);
}
