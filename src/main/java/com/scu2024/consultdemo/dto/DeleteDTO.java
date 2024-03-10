package com.scu2024.consultdemo.dto;

import java.util.List;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-09 15:56
 **/
public class DeleteDTO {
		List<Long> ids;

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		return "DeleteDTO{" +
			"ids=" + ids +
			'}';
	}
}
