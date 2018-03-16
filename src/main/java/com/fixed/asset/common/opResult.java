package com.fixed.asset.common;

public enum opResult {
	success("操作成功。"),fail("操作失败。"),error("操作失败，系统异常。");
	private String desc;
	opResult(String desc){
		this.desc = desc;
	}
	public String toString() {
		return this.desc;
	}
}
