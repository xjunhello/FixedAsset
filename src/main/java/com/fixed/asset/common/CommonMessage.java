package com.fixed.asset.common;

public class CommonMessage {
	private String type;
	private String content;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public static final String SUCCESS_TYPE="success";
	public static final String INFO_TYPE="info";
	public static final String WARING_TYPE="waring";
	public static final String DANGER_TYPE="danger";
	
	public static CommonMessage getSuccessMessage(String content){
		CommonMessage cm = new CommonMessage();
		cm.setType(CommonMessage.SUCCESS_TYPE);
		cm.setContent(content);
		return cm;
	}
	
	public static CommonMessage getInfoMessage(String content){
		CommonMessage cm = new CommonMessage();
		cm.setType(CommonMessage.INFO_TYPE);
		cm.setContent(content);
		return cm;
	}
	
	public static CommonMessage getWarningMessage(String content){
		CommonMessage cm = new CommonMessage();
		cm.setType(CommonMessage.WARING_TYPE);
		cm.setContent(content);
		return cm;
	}
	
	public static CommonMessage getDangerMessage(String content){
		CommonMessage cm = new CommonMessage();
		cm.setType(CommonMessage.DANGER_TYPE);
		cm.setContent(content);
		return cm;
	}
}
