package com.fixed.asset.model;

public enum MsgStat {
	success("success","成功"),error("error","失败"),aborted("aborted","取消");	
	private String status;
	private String desc;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	MsgStat(String status,String desc) {
		this.status = status ; 
		this.desc = desc;
	}
	public String toString() {
		return this.status;
	}
}
