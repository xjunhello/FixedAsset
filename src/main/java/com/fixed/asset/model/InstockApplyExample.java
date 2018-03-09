package com.fixed.asset.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstockApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstockApplyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andInstockIdIsNull() {
            addCriterion("instock_id is null");
            return (Criteria) this;
        }

        public Criteria andInstockIdIsNotNull() {
            addCriterion("instock_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstockIdEqualTo(Integer value) {
            addCriterion("instock_id =", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdNotEqualTo(Integer value) {
            addCriterion("instock_id <>", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdGreaterThan(Integer value) {
            addCriterion("instock_id >", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_id >=", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdLessThan(Integer value) {
            addCriterion("instock_id <", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdLessThanOrEqualTo(Integer value) {
            addCriterion("instock_id <=", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdIn(List<Integer> values) {
            addCriterion("instock_id in", values, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdNotIn(List<Integer> values) {
            addCriterion("instock_id not in", values, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdBetween(Integer value1, Integer value2) {
            addCriterion("instock_id between", value1, value2, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_id not between", value1, value2, "instockId");
            return (Criteria) this;
        }

        public Criteria andAssetIdIsNull() {
            addCriterion("asset_id is null");
            return (Criteria) this;
        }

        public Criteria andAssetIdIsNotNull() {
            addCriterion("asset_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssetIdEqualTo(Integer value) {
            addCriterion("asset_id =", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotEqualTo(Integer value) {
            addCriterion("asset_id <>", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdGreaterThan(Integer value) {
            addCriterion("asset_id >", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("asset_id >=", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLessThan(Integer value) {
            addCriterion("asset_id <", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLessThanOrEqualTo(Integer value) {
            addCriterion("asset_id <=", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdIn(List<Integer> values) {
            addCriterion("asset_id in", values, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotIn(List<Integer> values) {
            addCriterion("asset_id not in", values, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdBetween(Integer value1, Integer value2) {
            addCriterion("asset_id between", value1, value2, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("asset_id not between", value1, value2, "assetId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIsNull() {
            addCriterion("apply_user is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIsNotNull() {
            addCriterion("apply_user is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserEqualTo(Integer value) {
            addCriterion("apply_user =", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotEqualTo(Integer value) {
            addCriterion("apply_user <>", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserGreaterThan(Integer value) {
            addCriterion("apply_user >", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_user >=", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLessThan(Integer value) {
            addCriterion("apply_user <", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLessThanOrEqualTo(Integer value) {
            addCriterion("apply_user <=", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserIn(List<Integer> values) {
            addCriterion("apply_user in", values, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotIn(List<Integer> values) {
            addCriterion("apply_user not in", values, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserBetween(Integer value1, Integer value2) {
            addCriterion("apply_user between", value1, value2, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_user not between", value1, value2, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andInstockTypeIsNull() {
            addCriterion("instock_type is null");
            return (Criteria) this;
        }

        public Criteria andInstockTypeIsNotNull() {
            addCriterion("instock_type is not null");
            return (Criteria) this;
        }

        public Criteria andInstockTypeEqualTo(Integer value) {
            addCriterion("instock_type =", value, "instockType");
            return (Criteria) this;
        }

        public Criteria andInstockTypeNotEqualTo(Integer value) {
            addCriterion("instock_type <>", value, "instockType");
            return (Criteria) this;
        }

        public Criteria andInstockTypeGreaterThan(Integer value) {
            addCriterion("instock_type >", value, "instockType");
            return (Criteria) this;
        }

        public Criteria andInstockTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_type >=", value, "instockType");
            return (Criteria) this;
        }

        public Criteria andInstockTypeLessThan(Integer value) {
            addCriterion("instock_type <", value, "instockType");
            return (Criteria) this;
        }

        public Criteria andInstockTypeLessThanOrEqualTo(Integer value) {
            addCriterion("instock_type <=", value, "instockType");
            return (Criteria) this;
        }

        public Criteria andInstockTypeIn(List<Integer> values) {
            addCriterion("instock_type in", values, "instockType");
            return (Criteria) this;
        }

        public Criteria andInstockTypeNotIn(List<Integer> values) {
            addCriterion("instock_type not in", values, "instockType");
            return (Criteria) this;
        }

        public Criteria andInstockTypeBetween(Integer value1, Integer value2) {
            addCriterion("instock_type between", value1, value2, "instockType");
            return (Criteria) this;
        }

        public Criteria andInstockTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_type not between", value1, value2, "instockType");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdIsNull() {
            addCriterion("approval_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdIsNotNull() {
            addCriterion("approval_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdEqualTo(Integer value) {
            addCriterion("approval_user_id =", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdNotEqualTo(Integer value) {
            addCriterion("approval_user_id <>", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdGreaterThan(Integer value) {
            addCriterion("approval_user_id >", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_user_id >=", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdLessThan(Integer value) {
            addCriterion("approval_user_id <", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("approval_user_id <=", value, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdIn(List<Integer> values) {
            addCriterion("approval_user_id in", values, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdNotIn(List<Integer> values) {
            addCriterion("approval_user_id not in", values, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdBetween(Integer value1, Integer value2) {
            addCriterion("approval_user_id between", value1, value2, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_user_id not between", value1, value2, "approvalUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNull() {
            addCriterion("approval_time is null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNotNull() {
            addCriterion("approval_time is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeEqualTo(Date value) {
            addCriterion("approval_time =", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotEqualTo(Date value) {
            addCriterion("approval_time <>", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThan(Date value) {
            addCriterion("approval_time >", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("approval_time >=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThan(Date value) {
            addCriterion("approval_time <", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThanOrEqualTo(Date value) {
            addCriterion("approval_time <=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIn(List<Date> values) {
            addCriterion("approval_time in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotIn(List<Date> values) {
            addCriterion("approval_time not in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeBetween(Date value1, Date value2) {
            addCriterion("approval_time between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotBetween(Date value1, Date value2) {
            addCriterion("approval_time not between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkIsNull() {
            addCriterion("instock_remark is null");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkIsNotNull() {
            addCriterion("instock_remark is not null");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkEqualTo(String value) {
            addCriterion("instock_remark =", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkNotEqualTo(String value) {
            addCriterion("instock_remark <>", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkGreaterThan(String value) {
            addCriterion("instock_remark >", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("instock_remark >=", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkLessThan(String value) {
            addCriterion("instock_remark <", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkLessThanOrEqualTo(String value) {
            addCriterion("instock_remark <=", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkLike(String value) {
            addCriterion("instock_remark like", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkNotLike(String value) {
            addCriterion("instock_remark not like", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkIn(List<String> values) {
            addCriterion("instock_remark in", values, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkNotIn(List<String> values) {
            addCriterion("instock_remark not in", values, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkBetween(String value1, String value2) {
            addCriterion("instock_remark between", value1, value2, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkNotBetween(String value1, String value2) {
            addCriterion("instock_remark not between", value1, value2, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("last_modify_time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("last_modify_time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("last_modify_time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("last_modify_time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("last_modify_time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("last_modify_time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_modify_time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_time not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}