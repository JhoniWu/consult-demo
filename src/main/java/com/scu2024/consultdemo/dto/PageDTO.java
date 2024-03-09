package com.scu2024.consultdemo.dto;

/**
 * @program: consult-demo
 * @description:
 * @author: Max Wu
 * @create: 2024-03-08 17:09
 **/
public class PageDTO {
	Integer pageNum = 1;
	Integer pageSize = 10;

	@Override
	public String toString() {
		return "PageDTO{" +
			"pageNum=" + pageNum +
			", pageSize=" + pageSize +
			'}';
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
