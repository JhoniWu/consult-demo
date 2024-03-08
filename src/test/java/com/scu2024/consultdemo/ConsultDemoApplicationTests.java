package com.scu2024.consultdemo;

import com.scu2024.consultdemo.dao.mapper.StudentMapper;
import com.scu2024.consultdemo.dao.po.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ConsultDemoApplicationTests {

	@Autowired
	StudentMapper studentMapper;

	@Test
	void testDao() {
		List<Student> students = studentMapper.selectT();
		students.stream().forEach(System.out::println);
	}

}
