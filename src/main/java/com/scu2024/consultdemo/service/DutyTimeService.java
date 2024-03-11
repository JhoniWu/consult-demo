package com.scu2024.consultdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.scu2024.consultdemo.dao.po.DutyTime;
import com.scu2024.consultdemo.dao.po.Visit;
import com.scu2024.consultdemo.dto.vo.DutyTimeRespVO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DutyTimeService {
	List<DutyTime> listAll();

	boolean deleteById(DutyTime dutyTime);

	boolean add(DutyTime dutyTime);

	List<DutyTimeRespVO> query(Integer role);
}
