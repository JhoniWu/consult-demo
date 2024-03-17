package com.scu2024.consultdemo.dto.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-15 10:16
 **/
@Data
public class ConsultAdReqVO {
	Long studentId;
	Long consultorId;
	Integer consultTime;
	Integer consultDay;
	String consultPlace;
}