package com.fixed.asset.model;

import java.util.Date;

public class Allot {
    private Integer allotId;

    private String allotCode;

    private Integer outstockId;

    private Integer useUserId;

    private String useUserName;

    private String usePlace;

    private Byte allotStatus;

    private Date allotTime;

    private Integer allotUserId;

    public Integer getAllotId() {
        return allotId;
    }

    public void setAllotId(Integer allotId) {
        this.allotId = allotId;
    }

    public String getAllotCode() {
        return allotCode;
    }

    public void setAllotCode(String allotCode) {
        this.allotCode = allotCode == null ? null : allotCode.trim();
    }

    public Integer getOutstockId() {
        return outstockId;
    }

    public void setOutstockId(Integer outstockId) {
        this.outstockId = outstockId;
    }

    public Integer getUseUserId() {
        return useUserId;
    }

    public void setUseUserId(Integer useUserId) {
        this.useUserId = useUserId;
    }

    public String getUseUserName() {
        return useUserName;
    }

    public void setUseUserName(String useUserName) {
        this.useUserName = useUserName == null ? null : useUserName.trim();
    }

    public String getUsePlace() {
        return usePlace;
    }

    public void setUsePlace(String usePlace) {
        this.usePlace = usePlace == null ? null : usePlace.trim();
    }

    public Byte getAllotStatus() {
        return allotStatus;
    }

    public void setAllotStatus(Byte allotStatus) {
        this.allotStatus = allotStatus;
    }

    public Date getAllotTime() {
        return allotTime;
    }

    public void setAllotTime(Date allotTime) {
        this.allotTime = allotTime;
    }

    public Integer getAllotUserId() {
        return allotUserId;
    }

    public void setAllotUserId(Integer allotUserId) {
        this.allotUserId = allotUserId;
    }
}