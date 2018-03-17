package com.fixed.asset.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
* @ClassName: PageList 
* @Description: 分页结构
* @author xinjun.zhang
* @date 2016年10月17日 上午9:19:27 
* 
* @param <T>
 */
public class DataTablePage<T> {
	
	public DataTablePage(List<T> objList,Integer start,Integer length,Long recordsFiltered,Long recordsTotal) {
		this.data = objList;
		this.start = start;
		this.length = length;
		this.recordsFiltered = recordsFiltered;
		this.recordsTotal = recordsTotal;
		this.params = new HashMap<String,Object>();
	}
	
	public DataTablePage(List<T> objList,Integer start,Integer length,Long recordsFiltered) {
		this.data = objList;
		this.start = start;
		this.length = length;
		this.recordsFiltered = recordsFiltered;
		this.recordsTotal = recordsFiltered;
		this.params = new HashMap<String,Object>();
	}
	/**
	 * 默认初始化方法
	 */
	public DataTablePage() {
		this.params = new HashMap<String,Object>();
		this.data = new ArrayList<T>();
		this.start = Constants.PAGESTART;
		this.length = Constants.PAGESIZE;
		this.recordsFiltered = Constants.TOTALSIZE;
		this.recordsTotal = Constants.TOTALSIZE;
		this.params = new HashMap<String,Object>();
	}

	public void addParam(String key,Object value) {
		this.params.put(key, value);
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Long getRecordsFiltered() {
		return recordsFiltered;
	}
	public void setRecordsFiltered(Long recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
	public Long getRecordsTotal() {
		return recordsTotal;
	}
	public void setRecordsTotal(Long recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public Integer getDraw() {
		return draw;
	}
	public void setDraw(Integer draw) {
		this.draw = draw;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}

	private Integer start;
	private Integer length;
	private Long recordsFiltered;
	private Long recordsTotal;
	private Map<String,Object> params;
	private List<T> data;
	private Integer draw;
	private String error;
}
