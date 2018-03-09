package com.fixed.asset.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockHistoryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNull() {
            addCriterion("op_type is null");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNotNull() {
            addCriterion("op_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpTypeEqualTo(Integer value) {
            addCriterion("op_type =", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotEqualTo(Integer value) {
            addCriterion("op_type <>", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThan(Integer value) {
            addCriterion("op_type >", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_type >=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThan(Integer value) {
            addCriterion("op_type <", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThanOrEqualTo(Integer value) {
            addCriterion("op_type <=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeIn(List<Integer> values) {
            addCriterion("op_type in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotIn(List<Integer> values) {
            addCriterion("op_type not in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeBetween(Integer value1, Integer value2) {
            addCriterion("op_type between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("op_type not between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpUserIdIsNull() {
            addCriterion("op_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOpUserIdIsNotNull() {
            addCriterion("op_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpUserIdEqualTo(Integer value) {
            addCriterion("op_user_id =", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdNotEqualTo(Integer value) {
            addCriterion("op_user_id <>", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdGreaterThan(Integer value) {
            addCriterion("op_user_id >", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_user_id >=", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdLessThan(Integer value) {
            addCriterion("op_user_id <", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("op_user_id <=", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdIn(List<Integer> values) {
            addCriterion("op_user_id in", values, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdNotIn(List<Integer> values) {
            addCriterion("op_user_id not in", values, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdBetween(Integer value1, Integer value2) {
            addCriterion("op_user_id between", value1, value2, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("op_user_id not between", value1, value2, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNull() {
            addCriterion("op_time is null");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNotNull() {
            addCriterion("op_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpTimeEqualTo(Date value) {
            addCriterion("op_time =", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotEqualTo(Date value) {
            addCriterion("op_time <>", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThan(Date value) {
            addCriterion("op_time >", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("op_time >=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThan(Date value) {
            addCriterion("op_time <", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThanOrEqualTo(Date value) {
            addCriterion("op_time <=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeIn(List<Date> values) {
            addCriterion("op_time in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotIn(List<Date> values) {
            addCriterion("op_time not in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeBetween(Date value1, Date value2) {
            addCriterion("op_time between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotBetween(Date value1, Date value2) {
            addCriterion("op_time not between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpStatusIsNull() {
            addCriterion("op_status is null");
            return (Criteria) this;
        }

        public Criteria andOpStatusIsNotNull() {
            addCriterion("op_status is not null");
            return (Criteria) this;
        }

        public Criteria andOpStatusEqualTo(Byte value) {
            addCriterion("op_status =", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotEqualTo(Byte value) {
            addCriterion("op_status <>", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusGreaterThan(Byte value) {
            addCriterion("op_status >", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("op_status >=", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusLessThan(Byte value) {
            addCriterion("op_status <", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusLessThanOrEqualTo(Byte value) {
            addCriterion("op_status <=", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusIn(List<Byte> values) {
            addCriterion("op_status in", values, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotIn(List<Byte> values) {
            addCriterion("op_status not in", values, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusBetween(Byte value1, Byte value2) {
            addCriterion("op_status between", value1, value2, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("op_status not between", value1, value2, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeIsNull() {
            addCriterion("op_asset_code is null");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeIsNotNull() {
            addCriterion("op_asset_code is not null");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeEqualTo(String value) {
            addCriterion("op_asset_code =", value, "opAssetCode");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeNotEqualTo(String value) {
            addCriterion("op_asset_code <>", value, "opAssetCode");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeGreaterThan(String value) {
            addCriterion("op_asset_code >", value, "opAssetCode");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("op_asset_code >=", value, "opAssetCode");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeLessThan(String value) {
            addCriterion("op_asset_code <", value, "opAssetCode");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeLessThanOrEqualTo(String value) {
            addCriterion("op_asset_code <=", value, "opAssetCode");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeLike(String value) {
            addCriterion("op_asset_code like", value, "opAssetCode");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeNotLike(String value) {
            addCriterion("op_asset_code not like", value, "opAssetCode");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeIn(List<String> values) {
            addCriterion("op_asset_code in", values, "opAssetCode");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeNotIn(List<String> values) {
            addCriterion("op_asset_code not in", values, "opAssetCode");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeBetween(String value1, String value2) {
            addCriterion("op_asset_code between", value1, value2, "opAssetCode");
            return (Criteria) this;
        }

        public Criteria andOpAssetCodeNotBetween(String value1, String value2) {
            addCriterion("op_asset_code not between", value1, value2, "opAssetCode");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeIsNull() {
            addCriterion("op_project_code is null");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeIsNotNull() {
            addCriterion("op_project_code is not null");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeEqualTo(String value) {
            addCriterion("op_project_code =", value, "opProjectCode");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeNotEqualTo(String value) {
            addCriterion("op_project_code <>", value, "opProjectCode");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeGreaterThan(String value) {
            addCriterion("op_project_code >", value, "opProjectCode");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("op_project_code >=", value, "opProjectCode");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeLessThan(String value) {
            addCriterion("op_project_code <", value, "opProjectCode");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("op_project_code <=", value, "opProjectCode");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeLike(String value) {
            addCriterion("op_project_code like", value, "opProjectCode");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeNotLike(String value) {
            addCriterion("op_project_code not like", value, "opProjectCode");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeIn(List<String> values) {
            addCriterion("op_project_code in", values, "opProjectCode");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeNotIn(List<String> values) {
            addCriterion("op_project_code not in", values, "opProjectCode");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeBetween(String value1, String value2) {
            addCriterion("op_project_code between", value1, value2, "opProjectCode");
            return (Criteria) this;
        }

        public Criteria andOpProjectCodeNotBetween(String value1, String value2) {
            addCriterion("op_project_code not between", value1, value2, "opProjectCode");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeIsNull() {
            addCriterion("op_outstock_code is null");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeIsNotNull() {
            addCriterion("op_outstock_code is not null");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeEqualTo(String value) {
            addCriterion("op_outstock_code =", value, "opOutstockCode");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeNotEqualTo(String value) {
            addCriterion("op_outstock_code <>", value, "opOutstockCode");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeGreaterThan(String value) {
            addCriterion("op_outstock_code >", value, "opOutstockCode");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("op_outstock_code >=", value, "opOutstockCode");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeLessThan(String value) {
            addCriterion("op_outstock_code <", value, "opOutstockCode");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeLessThanOrEqualTo(String value) {
            addCriterion("op_outstock_code <=", value, "opOutstockCode");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeLike(String value) {
            addCriterion("op_outstock_code like", value, "opOutstockCode");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeNotLike(String value) {
            addCriterion("op_outstock_code not like", value, "opOutstockCode");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeIn(List<String> values) {
            addCriterion("op_outstock_code in", values, "opOutstockCode");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeNotIn(List<String> values) {
            addCriterion("op_outstock_code not in", values, "opOutstockCode");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeBetween(String value1, String value2) {
            addCriterion("op_outstock_code between", value1, value2, "opOutstockCode");
            return (Criteria) this;
        }

        public Criteria andOpOutstockCodeNotBetween(String value1, String value2) {
            addCriterion("op_outstock_code not between", value1, value2, "opOutstockCode");
            return (Criteria) this;
        }

        public Criteria andOpRemarkIsNull() {
            addCriterion("op_remark is null");
            return (Criteria) this;
        }

        public Criteria andOpRemarkIsNotNull() {
            addCriterion("op_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOpRemarkEqualTo(String value) {
            addCriterion("op_remark =", value, "opRemark");
            return (Criteria) this;
        }

        public Criteria andOpRemarkNotEqualTo(String value) {
            addCriterion("op_remark <>", value, "opRemark");
            return (Criteria) this;
        }

        public Criteria andOpRemarkGreaterThan(String value) {
            addCriterion("op_remark >", value, "opRemark");
            return (Criteria) this;
        }

        public Criteria andOpRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("op_remark >=", value, "opRemark");
            return (Criteria) this;
        }

        public Criteria andOpRemarkLessThan(String value) {
            addCriterion("op_remark <", value, "opRemark");
            return (Criteria) this;
        }

        public Criteria andOpRemarkLessThanOrEqualTo(String value) {
            addCriterion("op_remark <=", value, "opRemark");
            return (Criteria) this;
        }

        public Criteria andOpRemarkLike(String value) {
            addCriterion("op_remark like", value, "opRemark");
            return (Criteria) this;
        }

        public Criteria andOpRemarkNotLike(String value) {
            addCriterion("op_remark not like", value, "opRemark");
            return (Criteria) this;
        }

        public Criteria andOpRemarkIn(List<String> values) {
            addCriterion("op_remark in", values, "opRemark");
            return (Criteria) this;
        }

        public Criteria andOpRemarkNotIn(List<String> values) {
            addCriterion("op_remark not in", values, "opRemark");
            return (Criteria) this;
        }

        public Criteria andOpRemarkBetween(String value1, String value2) {
            addCriterion("op_remark between", value1, value2, "opRemark");
            return (Criteria) this;
        }

        public Criteria andOpRemarkNotBetween(String value1, String value2) {
            addCriterion("op_remark not between", value1, value2, "opRemark");
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