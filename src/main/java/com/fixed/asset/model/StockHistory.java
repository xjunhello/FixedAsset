package com.fixed.asset.model;

import java.util.Date;

public class StockHistory {
    private Integer id;

    private Integer opType;

    private Integer opUserId;

    private Date opTime;

    private Byte opStatus;

    private String opAssetCode;

    private String opProjectCode;

    private String opOutstockCode;

    private String opRemark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOpType() {
        return opType;
    }

    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    public Integer getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(Integer opUserId) {
        this.opUserId = opUserId;
    }

    public Date getOpTime() {
        return opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    public Byte getOpStatus() {
        return opStatus;
    }

    public void setOpStatus(Byte opStatus) {
        this.opStatus = opStatus;
    }

    public String getOpAssetCode() {
        return opAssetCode;
    }

    public void setOpAssetCode(String opAssetCode) {
        this.opAssetCode = opAssetCode == null ? null : opAssetCode.trim();
    }

    public String getOpProjectCode() {
        return opProjectCode;
    }

    public void setOpProjectCode(String opProjectCode) {
        this.opProjectCode = opProjectCode == null ? null : opProjectCode.trim();
    }

    public String getOpOutstockCode() {
        return opOutstockCode;
    }

    public void setOpOutstockCode(String opOutstockCode) {
        this.opOutstockCode = opOutstockCode == null ? null : opOutstockCode.trim();
    }

    public String getOpRemark() {
        return opRemark;
    }

    public void setOpRemark(String opRemark) {
        this.opRemark = opRemark == null ? null : opRemark.trim();
    }
}