package com.fixed.asset.model;

public class UseGroup {
    private Integer groupId;

    private Integer groupName;

    private Integer groupRemark;

    private String groupCode;

    private Integer parentGroupId;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getGroupName() {
        return groupName;
    }

    public void setGroupName(Integer groupName) {
        this.groupName = groupName;
    }

    public Integer getGroupRemark() {
        return groupRemark;
    }

    public void setGroupRemark(Integer groupRemark) {
        this.groupRemark = groupRemark;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode == null ? null : groupCode.trim();
    }

    public Integer getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(Integer parentGroupId) {
        this.parentGroupId = parentGroupId;
    }
}