package com.scu2024.consultdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scu2024.consultdemo.dao.po.ConsultAdvance;
import com.scu2024.consultdemo.dao.po.Visit;
import com.scu2024.consultdemo.dto.ConsultResultDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ConsultAdvanceService {
	List<ConsultAdvance> listAll();

	boolean deleteById(Long id);

	boolean add(ConsultAdvance consultAdvance);

	IPage<ConsultAdvance> queryByPage(int pageSize, int pageNum, ConsultAdvance consultAdvance);

	IPage<ConsultResultDTO> queryCaRecords(int pageSize, int pageNum, Long studentId);

	boolean deleteByIds(List<Long> ids);

}
