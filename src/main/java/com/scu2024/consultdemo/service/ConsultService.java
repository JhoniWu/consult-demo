package com.scu2024.consultdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scu2024.consultdemo.dao.po.Consult;
import com.scu2024.consultdemo.dao.po.Visit;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ConsultService {
	List<Consult> listAll();

	boolean deleteById(Long id);

	boolean add(Consult consult);

	IPage<Consult> queryByPage(int pageSize, int pageNum, Consult consult);
}
