package com.scu2024.consultdemo.dto.vo;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-14 10:00
 **/
@Data
public class VisitAdReqVO {
	private Long studentId;
	private Integer paperGrade;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date willingDay1;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date willingDay2;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date willingDay3;
	private Integer willingTime1;
	private Integer willingTime2;
	private Integer willingTime3;

}
