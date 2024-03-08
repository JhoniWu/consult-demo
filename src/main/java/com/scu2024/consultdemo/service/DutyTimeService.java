package com.scu2024.consultdemo.service;

import com.scu2024.consultdemo.dao.po.DutyTime;
import com.scu2024.consultdemo.dao.po.Visit;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DutyTimeService {
	List<DutyTime> listAll();

	boolean deleteById(Long id);

	boolean add(DutyTime dutyTime);
}
