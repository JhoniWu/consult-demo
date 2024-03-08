package com.scu2024.consultdemo.service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scu2024.consultdemo.dao.po.Visit;
import java.util.List;


public interface VisitService {
	List<Visit> listAll();

	boolean deleteById(Long id);

	boolean add(Visit visit);

	IPage<Visit> queryByPage(int pageSize, int pageNum, Visit visit);
}