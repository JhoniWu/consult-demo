package com.scu2024.consultdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scu2024.consultdemo.common.ConvertBeanUtils;
import com.scu2024.consultdemo.dao.mapper.ConsultAdvanceMapper;
import com.scu2024.consultdemo.dao.mapper.ConsultMapper;
import com.scu2024.consultdemo.dao.po.Consult;
import com.scu2024.consultdemo.dao.po.ConsultAdvance;
import com.scu2024.consultdemo.dto.vo.ConsultAdReqVO;
import com.scu2024.consultdemo.service.ConsultService;
import com.scu2024.consultdemo.service.UserService;
import jakarta.annotation.Resource;
import org.apache.catalina.ContainerListener;
import org.apache.catalina.util.ErrorPageSupport;
import org.springframework.boot.web.embedded.undertow.ConfigurableUndertowWebServerFactory;
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
	@Resource
	private UserService userService;
	@Resource
	private ConsultAdvanceMapper consultAdvanceMapper;
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
		if(consult.getStudentId()!=null) {
			qw.eq("student_id", consult.getStudentId());
		}
		if(consult.getConsultorId()!=null){
			qw.eq("consultor_id", consult.getConsultorId());
		}
		if(consult.getConsultPlace()!=null){
			qw.eq("consult_place", consult.getConsultPlace());
		}
		if(consult.getConsultTime()!=null){
			qw.eq("consult_time", consult.getConsultTime());
		}
		if(consult.getConsultDay()!=null){
			qw.eq("consult_day", consult.getConsultDay());
		}
		if(consult.getConsultorName()!=null){
			qw.like("consultor_name", consult.getConsultorName());
		}
		if(consult.getStudentName()!=null){
			qw.like("student_name", consult.getStudentName());
		}

		return consultMapper.selectPage(new Page<>(pageNum, pageSize), qw);
	}

	@Override
	public boolean deleteByIds(List<Long> ids) {
		if(ids.isEmpty()) return false;
		QueryWrapper<Consult> qw = new QueryWrapper<>();
		qw.in("id", ids);
		consultMapper.delete(qw);
		return true;
	}

	@Override
	public boolean arrangeStudent(Long id, Long consultorId) {
		UpdateWrapper<ConsultAdvance> uw = new UpdateWrapper<>();
		uw.eq("id", id).set("consultor_id", consultorId);
		return consultAdvanceMapper.update(null, uw) > 0;
	}

	@Override
	public boolean updateV1(Consult consult) {
		UpdateWrapper<Consult> uw = new UpdateWrapper<>();
		uw.eq("id", consult.getId());
		return consultMapper.update(consult, uw) > 0;
	}

	@Override
	public boolean setconsult(ConsultAdReqVO consultAdReqVO) {
		Consult convert = ConvertBeanUtils.convert(consultAdReqVO, Consult.class);
		convert.setStudentName(userService.selectName(convert.getStudentId()));
		convert.setConsultorName(userService.selectName(convert.getConsultorId()));
		convert.setConsultStatus(0);
		return consultMapper.insert(convert) > 0;
	}
}
