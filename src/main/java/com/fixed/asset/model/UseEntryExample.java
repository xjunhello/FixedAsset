package com.fixed.asset.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UseEntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UseEntryExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUCodeIsNull() {
            addCriterion("u_code is null");
            return (Criteria) this;
        }

        public Criteria andUCodeIsNotNull() {
            addCriterion("u_code is not null");
            return (Criteria) this;
        }

        public Criteria andUCodeEqualTo(String value) {
            addCriterion("u_code =", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeNotEqualTo(String value) {
            addCriterion("u_code <>", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeGreaterThan(String value) {
            addCriterion("u_code >", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeGreaterThanOrEqualTo(String value) {
            addCriterion("u_code >=", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeLessThan(String value) {
            addCriterion("u_code <", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeLessThanOrEqualTo(String value) {
            addCriterion("u_code <=", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeLike(String value) {
            addCriterion("u_code like", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeNotLike(String value) {
            addCriterion("u_code not like", value, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeIn(List<String> values) {
            addCriterion("u_code in", values, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeNotIn(List<String> values) {
            addCriterion("u_code not in", values, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeBetween(String value1, String value2) {
            addCriterion("u_code between", value1, value2, "uCode");
            return (Criteria) this;
        }

        public Criteria andUCodeNotBetween(String value1, String value2) {
            addCriterion("u_code not between", value1, value2, "uCode");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andUStatusIsNull() {
            addCriterion("u_status is null");
            return (Criteria) this;
        }

        public Criteria andUStatusIsNotNull() {
            addCriterion("u_status is not null");
            return (Criteria) this;
        }

        public Criteria andUStatusEqualTo(Integer value) {
            addCriterion("u_status =", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotEqualTo(Integer value) {
            addCriterion("u_status <>", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusGreaterThan(Integer value) {
            addCriterion("u_status >", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_status >=", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusLessThan(Integer value) {
            addCriterion("u_status <", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusLessThanOrEqualTo(Integer value) {
            addCriterion("u_status <=", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusIn(List<Integer> values) {
            addCriterion("u_status in", values, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotIn(List<Integer> values) {
            addCriterion("u_status not in", values, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusBetween(Integer value1, Integer value2) {
            addCriterion("u_status between", value1, value2, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("u_status not between", value1, value2, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIsNull() {
            addCriterion("u_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIsNotNull() {
            addCriterion("u_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("u_birthday =", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_birthday <>", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("u_birthday >", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_birthday >=", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("u_birthday <", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_birthday <=", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("u_birthday in", values, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_birthday not in", values, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_birthday between", value1, value2, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_birthday not between", value1, value2, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("u_sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("u_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(Integer value) {
            addCriterion("u_sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(Integer value) {
            addCriterion("u_sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(Integer value) {
            addCriterion("u_sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(Integer value) {
            addCriterion("u_sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(Integer value) {
            addCriterion("u_sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<Integer> values) {
            addCriterion("u_sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<Integer> values) {
            addCriterion("u_sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(Integer value1, Integer value2) {
            addCriterion("u_sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(Integer value1, Integer value2) {
            addCriterion("u_sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andUTypeIsNull() {
            addCriterion("u_type is null");
            return (Criteria) this;
        }

        public Criteria andUTypeIsNotNull() {
            addCriterion("u_type is not null");
            return (Criteria) this;
        }

        public Criteria andUTypeEqualTo(Boolean value) {
            addCriterion("u_type =", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeNotEqualTo(Boolean value) {
            addCriterion("u_type <>", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeGreaterThan(Boolean value) {
            addCriterion("u_type >", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("u_type >=", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeLessThan(Boolean value) {
            addCriterion("u_type <", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("u_type <=", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeIn(List<Boolean> values) {
            addCriterion("u_type in", values, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeNotIn(List<Boolean> values) {
            addCriterion("u_type not in", values, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("u_type between", value1, value2, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("u_type not between", value1, value2, "uType");
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