package com.fixed.asset.model;

import com.google.gson.Gson;

public class Msg {
	private MsgStat status;
    private String title;
    private String content;
    private String etraInfo;

    public MsgStat getStatus() {
		return status;
	}

	public void setStatus(MsgStat status) {
		this.status = status;
	}

	public Msg(MsgStat status,String title) {
        super();
        this.status = status;
        this.title = title;
    }
    
    public Msg(MsgStat status,String title, String content) {
        super();
        this.status = status;
        this.title = title;
        this.content = content;
    }
    
    public Msg(MsgStat status,String title, String content, String etraInfo) {
        super();
        this.status = status;
        this.title = title;
        this.content = content;
        this.etraInfo = etraInfo;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getEtraInfo() {
        return etraInfo;
    }
    public void setEtraInfo(String etraInfo) {
        this.etraInfo = etraInfo;
    }
    
    public String toJson() {
    	return new Gson().toJson(this);
    }
}