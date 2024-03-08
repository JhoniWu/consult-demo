package com.scu2024.consultdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scu2024.consultdemo.dao.mapper.ConsultMapper;
import com.scu2024.consultdemo.dao.po.Consult;
import com.scu2024.consultdemo.service.ConsultService;
import jakarta.annotation.Resource;
import org.apache.catalina.util.ErrorPageSupport;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.constructor.SafeConstructor;

import java.util.List;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:34
 **/
@Service
public class ConsultServiceImpl implements ConsultService {
	@Resource
	private ConsultMapper consultMapper;
	@Override
	public List<Consult> listAll() {
		return consultMapper.selectList(null);
	}

	@Override
	public boolean deleteById(Long id) {
		return consultMapper.deleteById(id) > 0;
	}

	@Override
	public boolean add(Consult consult) {
		return consultMapper.insert(consult) > 0;
	}

	@Override
	public IPage<Consult> queryByPage(int pageSize, int pageNum, Consult consult) {
		QueryWrapper<Consult> qw = new QueryWrapper<>();

		return consultMapper.selectPage(new Page<>(pageSize, pageNum), qw);
	}
}
