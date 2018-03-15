package com.fixed.asset.model;

import com.fixed.asset.common.Constants;

public class BaseExample {
	protected Integer pageNo = Constants.PAGENO;
	protected Integer pageSize = Constants.PAGESIZE;
	protected Integer pageStart=0;
	
	public Integer getPageStart() {
		return pageStart;
	}

	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
	}

	protected boolean paged = false;
	
    public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		this.pageStart = (pageNo-1)*pageSize;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		this.pageStart = (pageNo-1)*pageSize;
	}

	public boolean isPaged() {
		return paged;
	}

	public void setPaged(boolean paged) {
		this.paged = paged;
	}


}
