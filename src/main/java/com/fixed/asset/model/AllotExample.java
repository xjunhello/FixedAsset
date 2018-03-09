package com.fixed.asset.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AllotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllotExample() {
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

        public Criteria andAllotIdIsNull() {
            addCriterion("allot_id is null");
            return (Criteria) this;
        }

        public Criteria andAllotIdIsNotNull() {
            addCriterion("allot_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllotIdEqualTo(Integer value) {
            addCriterion("allot_id =", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdNotEqualTo(Integer value) {
            addCriterion("allot_id <>", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdGreaterThan(Integer value) {
            addCriterion("allot_id >", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("allot_id >=", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdLessThan(Integer value) {
            addCriterion("allot_id <", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdLessThanOrEqualTo(Integer value) {
            addCriterion("allot_id <=", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdIn(List<Integer> values) {
            addCriterion("allot_id in", values, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdNotIn(List<Integer> values) {
            addCriterion("allot_id not in", values, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdBetween(Integer value1, Integer value2) {
            addCriterion("allot_id between", value1, value2, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("allot_id not between", value1, value2, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotCodeIsNull() {
            addCriterion("allot_code is null");
            return (Criteria) this;
        }

        public Criteria andAllotCodeIsNotNull() {
            addCriterion("allot_code is not null");
            return (Criteria) this;
        }

        public Criteria andAllotCodeEqualTo(String value) {
            addCriterion("allot_code =", value, "allotCode");
            return (Criteria) this;
        }

        public Criteria andAllotCodeNotEqualTo(String value) {
            addCriterion("allot_code <>", value, "allotCode");
            return (Criteria) this;
        }

        public Criteria andAllotCodeGreaterThan(String value) {
            addCriterion("allot_code >", value, "allotCode");
            return (Criteria) this;
        }

        public Criteria andAllotCodeGreaterThanOrEqualTo(String value) {
            addCriterion("allot_code >=", value, "allotCode");
            return (Criteria) this;
        }

        public Criteria andAllotCodeLessThan(String value) {
            addCriterion("allot_code <", value, "allotCode");
            return (Criteria) this;
        }

        public Criteria andAllotCodeLessThanOrEqualTo(String value) {
            addCriterion("allot_code <=", value, "allotCode");
            return (Criteria) this;
        }

        public Criteria andAllotCodeLike(String value) {
            addCriterion("allot_code like", value, "allotCode");
            return (Criteria) this;
        }

        public Criteria andAllotCodeNotLike(String value) {
            addCriterion("allot_code not like", value, "allotCode");
            return (Criteria) this;
        }

        public Criteria andAllotCodeIn(List<String> values) {
            addCriterion("allot_code in", values, "allotCode");
            return (Criteria) this;
        }

        public Criteria andAllotCodeNotIn(List<String> values) {
            addCriterion("allot_code not in", values, "allotCode");
            return (Criteria) this;
        }

        public Criteria andAllotCodeBetween(String value1, String value2) {
            addCriterion("allot_code between", value1, value2, "allotCode");
            return (Criteria) this;
        }

        public Criteria andAllotCodeNotBetween(String value1, String value2) {
            addCriterion("allot_code not between", value1, value2, "allotCode");
            return (Criteria) this;
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

        public Criteria andUseUserIdIsNull() {
            addCriterion("use_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUseUserIdIsNotNull() {
            addCriterion("use_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUseUserIdEqualTo(Integer value) {
            addCriterion("use_user_id =", value, "useUserId");
            return (Criteria) this;
        }

        public Criteria andUseUserIdNotEqualTo(Integer value) {
            addCriterion("use_user_id <>", value, "useUserId");
            return (Criteria) this;
        }

        public Criteria andUseUserIdGreaterThan(Integer value) {
            addCriterion("use_user_id >", value, "useUserId");
            return (Criteria) this;
        }

        public Criteria andUseUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_user_id >=", value, "useUserId");
            return (Criteria) this;
        }

        public Criteria andUseUserIdLessThan(Integer value) {
            addCriterion("use_user_id <", value, "useUserId");
            return (Criteria) this;
        }

        public Criteria andUseUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("use_user_id <=", value, "useUserId");
            return (Criteria) this;
        }

        public Criteria andUseUserIdIn(List<Integer> values) {
            addCriterion("use_user_id in", values, "useUserId");
            return (Criteria) this;
        }

        public Criteria andUseUserIdNotIn(List<Integer> values) {
            addCriterion("use_user_id not in", values, "useUserId");
            return (Criteria) this;
        }

        public Criteria andUseUserIdBetween(Integer value1, Integer value2) {
            addCriterion("use_user_id between", value1, value2, "useUserId");
            return (Criteria) this;
        }

        public Criteria andUseUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("use_user_id not between", value1, value2, "useUserId");
            return (Criteria) this;
        }

        public Criteria andUseUserNameIsNull() {
            addCriterion("use_user_name is null");
            return (Criteria) this;
        }

        public Criteria andUseUserNameIsNotNull() {
            addCriterion("use_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUseUserNameEqualTo(String value) {
            addCriterion("use_user_name =", value, "useUserName");
            return (Criteria) this;
        }

        public Criteria andUseUserNameNotEqualTo(String value) {
            addCriterion("use_user_name <>", value, "useUserName");
            return (Criteria) this;
        }

        public Criteria andUseUserNameGreaterThan(String value) {
            addCriterion("use_user_name >", value, "useUserName");
            return (Criteria) this;
        }

        public Criteria andUseUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("use_user_name >=", value, "useUserName");
            return (Criteria) this;
        }

        public Criteria andUseUserNameLessThan(String value) {
            addCriterion("use_user_name <", value, "useUserName");
            return (Criteria) this;
        }

        public Criteria andUseUserNameLessThanOrEqualTo(String value) {
            addCriterion("use_user_name <=", value, "useUserName");
            return (Criteria) this;
        }

        public Criteria andUseUserNameLike(String value) {
            addCriterion("use_user_name like", value, "useUserName");
            return (Criteria) this;
        }

        public Criteria andUseUserNameNotLike(String value) {
            addCriterion("use_user_name not like", value, "useUserName");
            return (Criteria) this;
        }

        public Criteria andUseUserNameIn(List<String> values) {
            addCriterion("use_user_name in", values, "useUserName");
            return (Criteria) this;
        }

        public Criteria andUseUserNameNotIn(List<String> values) {
            addCriterion("use_user_name not in", values, "useUserName");
            return (Criteria) this;
        }

        public Criteria andUseUserNameBetween(String value1, String value2) {
            addCriterion("use_user_name between", value1, value2, "useUserName");
            return (Criteria) this;
        }

        public Criteria andUseUserNameNotBetween(String value1, String value2) {
            addCriterion("use_user_name not between", value1, value2, "useUserName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIsNull() {
            addCriterion("use_place is null");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIsNotNull() {
            addCriterion("use_place is not null");
            return (Criteria) this;
        }

        public Criteria andUsePlaceEqualTo(String value) {
            addCriterion("use_place =", value, "usePlace");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNotEqualTo(String value) {
            addCriterion("use_place <>", value, "usePlace");
            return (Criteria) this;
        }

        public Criteria andUsePlaceGreaterThan(String value) {
            addCriterion("use_place >", value, "usePlace");
            return (Criteria) this;
        }

        public Criteria andUsePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("use_place >=", value, "usePlace");
            return (Criteria) this;
        }

        public Criteria andUsePlaceLessThan(String value) {
            addCriterion("use_place <", value, "usePlace");
            return (Criteria) this;
        }

        public Criteria andUsePlaceLessThanOrEqualTo(String value) {
            addCriterion("use_place <=", value, "usePlace");
            return (Criteria) this;
        }

        public Criteria andUsePlaceLike(String value) {
            addCriterion("use_place like", value, "usePlace");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNotLike(String value) {
            addCriterion("use_place not like", value, "usePlace");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIn(List<String> values) {
            addCriterion("use_place in", values, "usePlace");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNotIn(List<String> values) {
            addCriterion("use_place not in", values, "usePlace");
            return (Criteria) this;
        }

        public Criteria andUsePlaceBetween(String value1, String value2) {
            addCriterion("use_place between", value1, value2, "usePlace");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNotBetween(String value1, String value2) {
            addCriterion("use_place not between", value1, value2, "usePlace");
            return (Criteria) this;
        }

        public Criteria andAllotStatusIsNull() {
            addCriterion("allot_status is null");
            return (Criteria) this;
        }

        public Criteria andAllotStatusIsNotNull() {
            addCriterion("allot_status is not null");
            return (Criteria) this;
        }

        public Criteria andAllotStatusEqualTo(Byte value) {
            addCriterion("allot_status =", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotEqualTo(Byte value) {
            addCriterion("allot_status <>", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusGreaterThan(Byte value) {
            addCriterion("allot_status >", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("allot_status >=", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusLessThan(Byte value) {
            addCriterion("allot_status <", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusLessThanOrEqualTo(Byte value) {
            addCriterion("allot_status <=", value, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusIn(List<Byte> values) {
            addCriterion("allot_status in", values, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotIn(List<Byte> values) {
            addCriterion("allot_status not in", values, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusBetween(Byte value1, Byte value2) {
            addCriterion("allot_status between", value1, value2, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("allot_status not between", value1, value2, "allotStatus");
            return (Criteria) this;
        }

        public Criteria andAllotTimeIsNull() {
            addCriterion("allot_time is null");
            return (Criteria) this;
        }

        public Criteria andAllotTimeIsNotNull() {
            addCriterion("allot_time is not null");
            return (Criteria) this;
        }

        public Criteria andAllotTimeEqualTo(Date value) {
            addCriterion("allot_time =", value, "allotTime");
            return (Criteria) this;
        }

        public Criteria andAllotTimeNotEqualTo(Date value) {
            addCriterion("allot_time <>", value, "allotTime");
            return (Criteria) this;
        }

        public Criteria andAllotTimeGreaterThan(Date value) {
            addCriterion("allot_time >", value, "allotTime");
            return (Criteria) this;
        }

        public Criteria andAllotTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("allot_time >=", value, "allotTime");
            return (Criteria) this;
        }

        public Criteria andAllotTimeLessThan(Date value) {
            addCriterion("allot_time <", value, "allotTime");
            return (Criteria) this;
        }

        public Criteria andAllotTimeLessThanOrEqualTo(Date value) {
            addCriterion("allot_time <=", value, "allotTime");
            return (Criteria) this;
        }

        public Criteria andAllotTimeIn(List<Date> values) {
            addCriterion("allot_time in", values, "allotTime");
            return (Criteria) this;
        }

        public Criteria andAllotTimeNotIn(List<Date> values) {
            addCriterion("allot_time not in", values, "allotTime");
            return (Criteria) this;
        }

        public Criteria andAllotTimeBetween(Date value1, Date value2) {
            addCriterion("allot_time between", value1, value2, "allotTime");
            return (Criteria) this;
        }

        public Criteria andAllotTimeNotBetween(Date value1, Date value2) {
            addCriterion("allot_time not between", value1, value2, "allotTime");
            return (Criteria) this;
        }

        public Criteria andAllotUserIdIsNull() {
            addCriterion("allot_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAllotUserIdIsNotNull() {
            addCriterion("allot_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllotUserIdEqualTo(Integer value) {
            addCriterion("allot_user_id =", value, "allotUserId");
            return (Criteria) this;
        }

        public Criteria andAllotUserIdNotEqualTo(Integer value) {
            addCriterion("allot_user_id <>", value, "allotUserId");
            return (Criteria) this;
        }

        public Criteria andAllotUserIdGreaterThan(Integer value) {
            addCriterion("allot_user_id >", value, "allotUserId");
            return (Criteria) this;
        }

        public Criteria andAllotUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("allot_user_id >=", value, "allotUserId");
            return (Criteria) this;
        }

        public Criteria andAllotUserIdLessThan(Integer value) {
            addCriterion("allot_user_id <", value, "allotUserId");
            return (Criteria) this;
        }

        public Criteria andAllotUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("allot_user_id <=", value, "allotUserId");
            return (Criteria) this;
        }

        public Criteria andAllotUserIdIn(List<Integer> values) {
            addCriterion("allot_user_id in", values, "allotUserId");
            return (Criteria) this;
        }

        public Criteria andAllotUserIdNotIn(List<Integer> values) {
            addCriterion("allot_user_id not in", values, "allotUserId");
            return (Criteria) this;
        }

        public Criteria andAllotUserIdBetween(Integer value1, Integer value2) {
            addCriterion("allot_user_id between", value1, value2, "allotUserId");
            return (Criteria) this;
        }

        public Criteria andAllotUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("allot_user_id not between", value1, value2, "allotUserId");
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