package com.fixed.asset.model;

import java.util.Date;

public class Outstock {
    private Integer outstockId;

    private String outstockName;

    private String outstockCode;

    private Integer outstockStatus;

    private Date createTime;

    private Integer applyUserId;

    private Integer approvalUserId;

    private Date approvalTime;

    private String outstockRemark;

    private Date lastModifyTime;

    private byte[] picture;

    public Integer getOutstockId() {
        return outstockId;
    }

    public void setOutstockId(Integer outstockId) {
        this.outstockId = outstockId;
    }

    public String getOutstockName() {
        return outstockName;
    }

    public void setOutstockName(String outstockName) {
        this.outstockName = outstockName == null ? null : outstockName.trim();
    }

    public String getOutstockCode() {
        return outstockCode;
    }

    public void setOutstockCode(String outstockCode) {
        this.outstockCode = outstockCode == null ? null : outstockCode.trim();
    }

    public Integer getOutstockStatus() {
        return outstockStatus;
    }

    public void setOutstockStatus(Integer outstockStatus) {
        this.outstockStatus = outstockStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
    }

    public Integer getApprovalUserId() {
        return approvalUserId;
    }

    public void setApprovalUserId(Integer approvalUserId) {
        this.approvalUserId = approvalUserId;
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getOutstockRemark() {
        return outstockRemark;
    }

    public void setOutstockRemark(String outstockRemark) {
        this.outstockRemark = outstockRemark == null ? null : outstockRemark.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}