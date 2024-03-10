package com.scu2024.consultdemo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.scu2024.consultdemo.dao.po.ConsultAdvance;
import com.scu2024.consultdemo.dao.po.User;
import com.scu2024.consultdemo.dto.ConsultResultDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-05 11:32
 **/
@Mapper
public interface ConsultAdvanceMapper extends BaseMapper<ConsultAdvance> {
	public IPage<ConsultResultDTO> selectResult(@Param("page") Page<User> page, @Param("student_id") Long studentId);
}
