package com.fixed.asset.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutstockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutstockExample() {
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

        public Criteria andOutstockIdIsNull() {
            addCriterion("outstock_id is null");
            return (Criteria) this;
        }

        public Criteria andOutstockIdIsNotNull() {
            addCriterion("outstock_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockIdEqualTo(Integer value) {
            addCriterion("outstock_id =", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdNotEqualTo(Integer value) {
            addCriterion("outstock_id <>", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdGreaterThan(Integer value) {
            addCriterion("outstock_id >", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("outstock_id >=", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdLessThan(Integer value) {
            addCriterion("outstock_id <", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdLessThanOrEqualTo(Integer value) {
            addCriterion("outstock_id <=", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdIn(List<Integer> values) {
            addCriterion("outstock_id in", values, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdNotIn(List<Integer> values) {
            addCriterion("outstock_id not in", values, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdBetween(Integer value1, Integer value2) {
            addCriterion("outstock_id between", value1, value2, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("outstock_id not between", value1, value2, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockNameIsNull() {
            addCriterion("outstock_name is null");
            return (Criteria) this;
        }

        public Criteria andOutstockNameIsNotNull() {
            addCriterion("outstock_name is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockNameEqualTo(String value) {
            addCriterion("outstock_name =", value, "outstockName");
            return (Criteria) this;
        }

        public Criteria andOutstockNameNotEqualTo(String value) {
            addCriterion("outstock_name <>", value, "outstockName");
            return (Criteria) this;
        }

        public Criteria andOutstockNameGreaterThan(String value) {
            addCriterion("outstock_name >", value, "outstockName");
            return (Criteria) this;
        }

        public Criteria andOutstockNameGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_name >=", value, "outstockName");
            return (Criteria) this;
        }

        public Criteria andOutstockNameLessThan(String value) {
            addCriterion("outstock_name <", value, "outstockName");
            return (Criteria) this;
        }

        public Criteria andOutstockNameLessThanOrEqualTo(String value) {
            addCriterion("outstock_name <=", value, "outstockName");
            return (Criteria) this;
        }

        public Criteria andOutstockNameLike(String value) {
            addCriterion("outstock_name like", value, "outstockName");
            return (Criteria) this;
        }

        public Criteria andOutstockNameNotLike(String value) {
            addCriterion("outstock_name not like", value, "outstockName");
            return (Criteria) this;
        }

        public Criteria andOutstockNameIn(List<String> values) {
            addCriterion("outstock_name in", values, "outstockName");
            return (Criteria) this;
        }

        public Criteria andOutstockNameNotIn(List<String> values) {
            addCriterion("outstock_name not in", values, "outstockName");
            return (Criteria) this;
        }

        public Criteria andOutstockNameBetween(String value1, String value2) {
            addCriterion("outstock_name between", value1, value2, "outstockName");
            return (Criteria) this;
        }

        public Criteria andOutstockNameNotBetween(String value1, String value2) {
            addCriterion("outstock_name not between", value1, value2, "outstockName");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeIsNull() {
            addCriterion("outstock_code is null");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeIsNotNull() {
            addCriterion("outstock_code is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeEqualTo(String value) {
            addCriterion("outstock_code =", value, "outstockCode");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeNotEqualTo(String value) {
            addCriterion("outstock_code <>", value, "outstockCode");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeGreaterThan(String value) {
            addCriterion("outstock_code >", value, "outstockCode");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_code >=", value, "outstockCode");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeLessThan(String value) {
            addCriterion("outstock_code <", value, "outstockCode");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeLessThanOrEqualTo(String value) {
            addCriterion("outstock_code <=", value, "outstockCode");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeLike(String value) {
            addCriterion("outstock_code like", value, "outstockCode");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeNotLike(String value) {
            addCriterion("outstock_code not like", value, "outstockCode");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeIn(List<String> values) {
            addCriterion("outstock_code in", values, "outstockCode");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeNotIn(List<String> values) {
            addCriterion("outstock_code not in", values, "outstockCode");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeBetween(String value1, String value2) {
            addCriterion("outstock_code between", value1, value2, "outstockCode");
            return (Criteria) this;
        }

        public Criteria andOutstockCodeNotBetween(String value1, String value2) {
            addCriterion("outstock_code not between", value1, value2, "outstockCode");
            return (Criteria) this;
        }

        public Criteria andOutstockStatusIsNull() {
            addCriterion("outstock_status is null");
            return (Criteria) this;
        }

        public Criteria andOutstockStatusIsNotNull() {
            addCriterion("outstock_status is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockStatusEqualTo(Integer value) {
            addCriterion("outstock_status =", value, "outstockStatus");
            return (Criteria) this;
        }

        public Criteria andOutstockStatusNotEqualTo(Integer value) {
            addCriterion("outstock_status <>", value, "outstockStatus");
            return (Criteria) this;
        }

        public Criteria andOutstockStatusGreaterThan(Integer value) {
            addCriterion("outstock_status >", value, "outstockStatus");
            return (Criteria) this;
        }

        public Criteria andOutstockStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("outstock_status >=", value, "outstockStatus");
            return (Criteria) this;
        }

        public Criteria andOutstockStatusLessThan(Integer value) {
            addCriterion("outstock_status <", value, "outstockStatus");
            return (Criteria) this;
        }

        public Criteria andOutstockStatusLessThanOrEqualTo(Integer value) {
            addCriterion("outstock_status <=", value, "outstockStatus");
            return (Criteria) this;
        }

        public Criteria andOutstockStatusIn(List<Integer> values) {
            addCriterion("outstock_status in", values, "outstockStatus");
            return (Criteria) this;
        }

        public Criteria andOutstockStatusNotIn(List<Integer> values) {
            addCriterion("outstock_status not in", values, "outstockStatus");
            return (Criteria) this;
        }

        public Criteria andOutstockStatusBetween(Integer value1, Integer value2) {
            addCriterion("outstock_status between", value1, value2, "outstockStatus");
            return (Criteria) this;
        }

        public Criteria andOutstockStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("outstock_status not between", value1, value2, "outstockStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNull() {
            addCriterion("apply_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNotNull() {
            addCriterion("apply_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdEqualTo(Integer value) {
            addCriterion("apply_user_id =", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotEqualTo(Integer value) {
            addCriterion("apply_user_id <>", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThan(Integer value) {
            addCriterion("apply_user_id >", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_user_id >=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThan(Integer value) {
            addCriterion("apply_user_id <", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_user_id <=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIn(List<Integer> values) {
            addCriterion("apply_user_id in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotIn(List<Integer> values) {
            addCriterion("apply_user_id not in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_user_id between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_user_id not between", value1, value2, "applyUserId");
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

        public Criteria andOutstockRemarkIsNull() {
            addCriterion("outstock_remark is null");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkIsNotNull() {
            addCriterion("outstock_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkEqualTo(String value) {
            addCriterion("outstock_remark =", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkNotEqualTo(String value) {
            addCriterion("outstock_remark <>", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkGreaterThan(String value) {
            addCriterion("outstock_remark >", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_remark >=", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkLessThan(String value) {
            addCriterion("outstock_remark <", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkLessThanOrEqualTo(String value) {
            addCriterion("outstock_remark <=", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkLike(String value) {
            addCriterion("outstock_remark like", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkNotLike(String value) {
            addCriterion("outstock_remark not like", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkIn(List<String> values) {
            addCriterion("outstock_remark in", values, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkNotIn(List<String> values) {
            addCriterion("outstock_remark not in", values, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkBetween(String value1, String value2) {
            addCriterion("outstock_remark between", value1, value2, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkNotBetween(String value1, String value2) {
            addCriterion("outstock_remark not between", value1, value2, "outstockRemark");
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