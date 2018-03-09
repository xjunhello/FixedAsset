package com.fixed.asset.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetExample() {
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

        public Criteria andAssetCodeIsNull() {
            addCriterion("asset_code is null");
            return (Criteria) this;
        }

        public Criteria andAssetCodeIsNotNull() {
            addCriterion("asset_code is not null");
            return (Criteria) this;
        }

        public Criteria andAssetCodeEqualTo(String value) {
            addCriterion("asset_code =", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeNotEqualTo(String value) {
            addCriterion("asset_code <>", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeGreaterThan(String value) {
            addCriterion("asset_code >", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("asset_code >=", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeLessThan(String value) {
            addCriterion("asset_code <", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeLessThanOrEqualTo(String value) {
            addCriterion("asset_code <=", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeLike(String value) {
            addCriterion("asset_code like", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeNotLike(String value) {
            addCriterion("asset_code not like", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeIn(List<String> values) {
            addCriterion("asset_code in", values, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeNotIn(List<String> values) {
            addCriterion("asset_code not in", values, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeBetween(String value1, String value2) {
            addCriterion("asset_code between", value1, value2, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeNotBetween(String value1, String value2) {
            addCriterion("asset_code not between", value1, value2, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetNameIsNull() {
            addCriterion("asset_name is null");
            return (Criteria) this;
        }

        public Criteria andAssetNameIsNotNull() {
            addCriterion("asset_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssetNameEqualTo(String value) {
            addCriterion("asset_name =", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotEqualTo(String value) {
            addCriterion("asset_name <>", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameGreaterThan(String value) {
            addCriterion("asset_name >", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameGreaterThanOrEqualTo(String value) {
            addCriterion("asset_name >=", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLessThan(String value) {
            addCriterion("asset_name <", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLessThanOrEqualTo(String value) {
            addCriterion("asset_name <=", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLike(String value) {
            addCriterion("asset_name like", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotLike(String value) {
            addCriterion("asset_name not like", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameIn(List<String> values) {
            addCriterion("asset_name in", values, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotIn(List<String> values) {
            addCriterion("asset_name not in", values, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameBetween(String value1, String value2) {
            addCriterion("asset_name between", value1, value2, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotBetween(String value1, String value2) {
            addCriterion("asset_name not between", value1, value2, "assetName");
            return (Criteria) this;
        }

        public Criteria andType1IsNull() {
            addCriterion("type1 is null");
            return (Criteria) this;
        }

        public Criteria andType1IsNotNull() {
            addCriterion("type1 is not null");
            return (Criteria) this;
        }

        public Criteria andType1EqualTo(Integer value) {
            addCriterion("type1 =", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotEqualTo(Integer value) {
            addCriterion("type1 <>", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThan(Integer value) {
            addCriterion("type1 >", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThanOrEqualTo(Integer value) {
            addCriterion("type1 >=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThan(Integer value) {
            addCriterion("type1 <", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThanOrEqualTo(Integer value) {
            addCriterion("type1 <=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1In(List<Integer> values) {
            addCriterion("type1 in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotIn(List<Integer> values) {
            addCriterion("type1 not in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Between(Integer value1, Integer value2) {
            addCriterion("type1 between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotBetween(Integer value1, Integer value2) {
            addCriterion("type1 not between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType2IsNull() {
            addCriterion("type2 is null");
            return (Criteria) this;
        }

        public Criteria andType2IsNotNull() {
            addCriterion("type2 is not null");
            return (Criteria) this;
        }

        public Criteria andType2EqualTo(Integer value) {
            addCriterion("type2 =", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotEqualTo(Integer value) {
            addCriterion("type2 <>", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThan(Integer value) {
            addCriterion("type2 >", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThanOrEqualTo(Integer value) {
            addCriterion("type2 >=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThan(Integer value) {
            addCriterion("type2 <", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThanOrEqualTo(Integer value) {
            addCriterion("type2 <=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2In(List<Integer> values) {
            addCriterion("type2 in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotIn(List<Integer> values) {
            addCriterion("type2 not in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Between(Integer value1, Integer value2) {
            addCriterion("type2 between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotBetween(Integer value1, Integer value2) {
            addCriterion("type2 not between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType3IsNull() {
            addCriterion("type3 is null");
            return (Criteria) this;
        }

        public Criteria andType3IsNotNull() {
            addCriterion("type3 is not null");
            return (Criteria) this;
        }

        public Criteria andType3EqualTo(Integer value) {
            addCriterion("type3 =", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3NotEqualTo(Integer value) {
            addCriterion("type3 <>", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3GreaterThan(Integer value) {
            addCriterion("type3 >", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3GreaterThanOrEqualTo(Integer value) {
            addCriterion("type3 >=", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3LessThan(Integer value) {
            addCriterion("type3 <", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3LessThanOrEqualTo(Integer value) {
            addCriterion("type3 <=", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3In(List<Integer> values) {
            addCriterion("type3 in", values, "type3");
            return (Criteria) this;
        }

        public Criteria andType3NotIn(List<Integer> values) {
            addCriterion("type3 not in", values, "type3");
            return (Criteria) this;
        }

        public Criteria andType3Between(Integer value1, Integer value2) {
            addCriterion("type3 between", value1, value2, "type3");
            return (Criteria) this;
        }

        public Criteria andType3NotBetween(Integer value1, Integer value2) {
            addCriterion("type3 not between", value1, value2, "type3");
            return (Criteria) this;
        }

        public Criteria andType4IsNull() {
            addCriterion("type4 is null");
            return (Criteria) this;
        }

        public Criteria andType4IsNotNull() {
            addCriterion("type4 is not null");
            return (Criteria) this;
        }

        public Criteria andType4EqualTo(Integer value) {
            addCriterion("type4 =", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4NotEqualTo(Integer value) {
            addCriterion("type4 <>", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4GreaterThan(Integer value) {
            addCriterion("type4 >", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4GreaterThanOrEqualTo(Integer value) {
            addCriterion("type4 >=", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4LessThan(Integer value) {
            addCriterion("type4 <", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4LessThanOrEqualTo(Integer value) {
            addCriterion("type4 <=", value, "type4");
            return (Criteria) this;
        }

        public Criteria andType4In(List<Integer> values) {
            addCriterion("type4 in", values, "type4");
            return (Criteria) this;
        }

        public Criteria andType4NotIn(List<Integer> values) {
            addCriterion("type4 not in", values, "type4");
            return (Criteria) this;
        }

        public Criteria andType4Between(Integer value1, Integer value2) {
            addCriterion("type4 between", value1, value2, "type4");
            return (Criteria) this;
        }

        public Criteria andType4NotBetween(Integer value1, Integer value2) {
            addCriterion("type4 not between", value1, value2, "type4");
            return (Criteria) this;
        }

        public Criteria andAssetStatusIsNull() {
            addCriterion("asset_status is null");
            return (Criteria) this;
        }

        public Criteria andAssetStatusIsNotNull() {
            addCriterion("asset_status is not null");
            return (Criteria) this;
        }

        public Criteria andAssetStatusEqualTo(Integer value) {
            addCriterion("asset_status =", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusNotEqualTo(Integer value) {
            addCriterion("asset_status <>", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusGreaterThan(Integer value) {
            addCriterion("asset_status >", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("asset_status >=", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusLessThan(Integer value) {
            addCriterion("asset_status <", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusLessThanOrEqualTo(Integer value) {
            addCriterion("asset_status <=", value, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusIn(List<Integer> values) {
            addCriterion("asset_status in", values, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusNotIn(List<Integer> values) {
            addCriterion("asset_status not in", values, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusBetween(Integer value1, Integer value2) {
            addCriterion("asset_status between", value1, value2, "assetStatus");
            return (Criteria) this;
        }

        public Criteria andAssetStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("asset_status not between", value1, value2, "assetStatus");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectDetailIdIsNull() {
            addCriterion("project_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectDetailIdIsNotNull() {
            addCriterion("project_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDetailIdEqualTo(Integer value) {
            addCriterion("project_detail_id =", value, "projectDetailId");
            return (Criteria) this;
        }

        public Criteria andProjectDetailIdNotEqualTo(Integer value) {
            addCriterion("project_detail_id <>", value, "projectDetailId");
            return (Criteria) this;
        }

        public Criteria andProjectDetailIdGreaterThan(Integer value) {
            addCriterion("project_detail_id >", value, "projectDetailId");
            return (Criteria) this;
        }

        public Criteria andProjectDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_detail_id >=", value, "projectDetailId");
            return (Criteria) this;
        }

        public Criteria andProjectDetailIdLessThan(Integer value) {
            addCriterion("project_detail_id <", value, "projectDetailId");
            return (Criteria) this;
        }

        public Criteria andProjectDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_detail_id <=", value, "projectDetailId");
            return (Criteria) this;
        }

        public Criteria andProjectDetailIdIn(List<Integer> values) {
            addCriterion("project_detail_id in", values, "projectDetailId");
            return (Criteria) this;
        }

        public Criteria andProjectDetailIdNotIn(List<Integer> values) {
            addCriterion("project_detail_id not in", values, "projectDetailId");
            return (Criteria) this;
        }

        public Criteria andProjectDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("project_detail_id between", value1, value2, "projectDetailId");
            return (Criteria) this;
        }

        public Criteria andProjectDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_detail_id not between", value1, value2, "projectDetailId");
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

        public Criteria andOutstockDetailIdIsNull() {
            addCriterion("outstock_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andOutstockDetailIdIsNotNull() {
            addCriterion("outstock_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockDetailIdEqualTo(Integer value) {
            addCriterion("outstock_detail_id =", value, "outstockDetailId");
            return (Criteria) this;
        }

        public Criteria andOutstockDetailIdNotEqualTo(Integer value) {
            addCriterion("outstock_detail_id <>", value, "outstockDetailId");
            return (Criteria) this;
        }

        public Criteria andOutstockDetailIdGreaterThan(Integer value) {
            addCriterion("outstock_detail_id >", value, "outstockDetailId");
            return (Criteria) this;
        }

        public Criteria andOutstockDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("outstock_detail_id >=", value, "outstockDetailId");
            return (Criteria) this;
        }

        public Criteria andOutstockDetailIdLessThan(Integer value) {
            addCriterion("outstock_detail_id <", value, "outstockDetailId");
            return (Criteria) this;
        }

        public Criteria andOutstockDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("outstock_detail_id <=", value, "outstockDetailId");
            return (Criteria) this;
        }

        public Criteria andOutstockDetailIdIn(List<Integer> values) {
            addCriterion("outstock_detail_id in", values, "outstockDetailId");
            return (Criteria) this;
        }

        public Criteria andOutstockDetailIdNotIn(List<Integer> values) {
            addCriterion("outstock_detail_id not in", values, "outstockDetailId");
            return (Criteria) this;
        }

        public Criteria andOutstockDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("outstock_detail_id between", value1, value2, "outstockDetailId");
            return (Criteria) this;
        }

        public Criteria andOutstockDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("outstock_detail_id not between", value1, value2, "outstockDetailId");
            return (Criteria) this;
        }

        public Criteria andFirmIsNull() {
            addCriterion("firm is null");
            return (Criteria) this;
        }

        public Criteria andFirmIsNotNull() {
            addCriterion("firm is not null");
            return (Criteria) this;
        }

        public Criteria andFirmEqualTo(String value) {
            addCriterion("firm =", value, "firm");
            return (Criteria) this;
        }

        public Criteria andFirmNotEqualTo(String value) {
            addCriterion("firm <>", value, "firm");
            return (Criteria) this;
        }

        public Criteria andFirmGreaterThan(String value) {
            addCriterion("firm >", value, "firm");
            return (Criteria) this;
        }

        public Criteria andFirmGreaterThanOrEqualTo(String value) {
            addCriterion("firm >=", value, "firm");
            return (Criteria) this;
        }

        public Criteria andFirmLessThan(String value) {
            addCriterion("firm <", value, "firm");
            return (Criteria) this;
        }

        public Criteria andFirmLessThanOrEqualTo(String value) {
            addCriterion("firm <=", value, "firm");
            return (Criteria) this;
        }

        public Criteria andFirmLike(String value) {
            addCriterion("firm like", value, "firm");
            return (Criteria) this;
        }

        public Criteria andFirmNotLike(String value) {
            addCriterion("firm not like", value, "firm");
            return (Criteria) this;
        }

        public Criteria andFirmIn(List<String> values) {
            addCriterion("firm in", values, "firm");
            return (Criteria) this;
        }

        public Criteria andFirmNotIn(List<String> values) {
            addCriterion("firm not in", values, "firm");
            return (Criteria) this;
        }

        public Criteria andFirmBetween(String value1, String value2) {
            addCriterion("firm between", value1, value2, "firm");
            return (Criteria) this;
        }

        public Criteria andFirmNotBetween(String value1, String value2) {
            addCriterion("firm not between", value1, value2, "firm");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andSerialNumIsNull() {
            addCriterion("serial_num is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumIsNotNull() {
            addCriterion("serial_num is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumEqualTo(String value) {
            addCriterion("serial_num =", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumNotEqualTo(String value) {
            addCriterion("serial_num <>", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumGreaterThan(String value) {
            addCriterion("serial_num >", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumGreaterThanOrEqualTo(String value) {
            addCriterion("serial_num >=", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumLessThan(String value) {
            addCriterion("serial_num <", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumLessThanOrEqualTo(String value) {
            addCriterion("serial_num <=", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumLike(String value) {
            addCriterion("serial_num like", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumNotLike(String value) {
            addCriterion("serial_num not like", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumIn(List<String> values) {
            addCriterion("serial_num in", values, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumNotIn(List<String> values) {
            addCriterion("serial_num not in", values, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumBetween(String value1, String value2) {
            addCriterion("serial_num between", value1, value2, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumNotBetween(String value1, String value2) {
            addCriterion("serial_num not between", value1, value2, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkIsNull() {
            addCriterion("asset_remark is null");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkIsNotNull() {
            addCriterion("asset_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkEqualTo(String value) {
            addCriterion("asset_remark =", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkNotEqualTo(String value) {
            addCriterion("asset_remark <>", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkGreaterThan(String value) {
            addCriterion("asset_remark >", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("asset_remark >=", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkLessThan(String value) {
            addCriterion("asset_remark <", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkLessThanOrEqualTo(String value) {
            addCriterion("asset_remark <=", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkLike(String value) {
            addCriterion("asset_remark like", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkNotLike(String value) {
            addCriterion("asset_remark not like", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkIn(List<String> values) {
            addCriterion("asset_remark in", values, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkNotIn(List<String> values) {
            addCriterion("asset_remark not in", values, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkBetween(String value1, String value2) {
            addCriterion("asset_remark between", value1, value2, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkNotBetween(String value1, String value2) {
            addCriterion("asset_remark not between", value1, value2, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andUseEntryIdIsNull() {
            addCriterion("use_entry_id is null");
            return (Criteria) this;
        }

        public Criteria andUseEntryIdIsNotNull() {
            addCriterion("use_entry_id is not null");
            return (Criteria) this;
        }

        public Criteria andUseEntryIdEqualTo(Integer value) {
            addCriterion("use_entry_id =", value, "useEntryId");
            return (Criteria) this;
        }

        public Criteria andUseEntryIdNotEqualTo(Integer value) {
            addCriterion("use_entry_id <>", value, "useEntryId");
            return (Criteria) this;
        }

        public Criteria andUseEntryIdGreaterThan(Integer value) {
            addCriterion("use_entry_id >", value, "useEntryId");
            return (Criteria) this;
        }

        public Criteria andUseEntryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_entry_id >=", value, "useEntryId");
            return (Criteria) this;
        }

        public Criteria andUseEntryIdLessThan(Integer value) {
            addCriterion("use_entry_id <", value, "useEntryId");
            return (Criteria) this;
        }

        public Criteria andUseEntryIdLessThanOrEqualTo(Integer value) {
            addCriterion("use_entry_id <=", value, "useEntryId");
            return (Criteria) this;
        }

        public Criteria andUseEntryIdIn(List<Integer> values) {
            addCriterion("use_entry_id in", values, "useEntryId");
            return (Criteria) this;
        }

        public Criteria andUseEntryIdNotIn(List<Integer> values) {
            addCriterion("use_entry_id not in", values, "useEntryId");
            return (Criteria) this;
        }

        public Criteria andUseEntryIdBetween(Integer value1, Integer value2) {
            addCriterion("use_entry_id between", value1, value2, "useEntryId");
            return (Criteria) this;
        }

        public Criteria andUseEntryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("use_entry_id not between", value1, value2, "useEntryId");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameIsNull() {
            addCriterion("use_entry_name is null");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameIsNotNull() {
            addCriterion("use_entry_name is not null");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameEqualTo(String value) {
            addCriterion("use_entry_name =", value, "useEntryName");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameNotEqualTo(String value) {
            addCriterion("use_entry_name <>", value, "useEntryName");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameGreaterThan(String value) {
            addCriterion("use_entry_name >", value, "useEntryName");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameGreaterThanOrEqualTo(String value) {
            addCriterion("use_entry_name >=", value, "useEntryName");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameLessThan(String value) {
            addCriterion("use_entry_name <", value, "useEntryName");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameLessThanOrEqualTo(String value) {
            addCriterion("use_entry_name <=", value, "useEntryName");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameLike(String value) {
            addCriterion("use_entry_name like", value, "useEntryName");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameNotLike(String value) {
            addCriterion("use_entry_name not like", value, "useEntryName");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameIn(List<String> values) {
            addCriterion("use_entry_name in", values, "useEntryName");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameNotIn(List<String> values) {
            addCriterion("use_entry_name not in", values, "useEntryName");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameBetween(String value1, String value2) {
            addCriterion("use_entry_name between", value1, value2, "useEntryName");
            return (Criteria) this;
        }

        public Criteria andUseEntryNameNotBetween(String value1, String value2) {
            addCriterion("use_entry_name not between", value1, value2, "useEntryName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdIsNull() {
            addCriterion("use_place_id is null");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdIsNotNull() {
            addCriterion("use_place_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdEqualTo(String value) {
            addCriterion("use_place_id =", value, "usePlaceId");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdNotEqualTo(String value) {
            addCriterion("use_place_id <>", value, "usePlaceId");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdGreaterThan(String value) {
            addCriterion("use_place_id >", value, "usePlaceId");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("use_place_id >=", value, "usePlaceId");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdLessThan(String value) {
            addCriterion("use_place_id <", value, "usePlaceId");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdLessThanOrEqualTo(String value) {
            addCriterion("use_place_id <=", value, "usePlaceId");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdLike(String value) {
            addCriterion("use_place_id like", value, "usePlaceId");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdNotLike(String value) {
            addCriterion("use_place_id not like", value, "usePlaceId");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdIn(List<String> values) {
            addCriterion("use_place_id in", values, "usePlaceId");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdNotIn(List<String> values) {
            addCriterion("use_place_id not in", values, "usePlaceId");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdBetween(String value1, String value2) {
            addCriterion("use_place_id between", value1, value2, "usePlaceId");
            return (Criteria) this;
        }

        public Criteria andUsePlaceIdNotBetween(String value1, String value2) {
            addCriterion("use_place_id not between", value1, value2, "usePlaceId");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameIsNull() {
            addCriterion("use_place_name is null");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameIsNotNull() {
            addCriterion("use_place_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameEqualTo(String value) {
            addCriterion("use_place_name =", value, "usePlaceName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameNotEqualTo(String value) {
            addCriterion("use_place_name <>", value, "usePlaceName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameGreaterThan(String value) {
            addCriterion("use_place_name >", value, "usePlaceName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("use_place_name >=", value, "usePlaceName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameLessThan(String value) {
            addCriterion("use_place_name <", value, "usePlaceName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameLessThanOrEqualTo(String value) {
            addCriterion("use_place_name <=", value, "usePlaceName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameLike(String value) {
            addCriterion("use_place_name like", value, "usePlaceName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameNotLike(String value) {
            addCriterion("use_place_name not like", value, "usePlaceName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameIn(List<String> values) {
            addCriterion("use_place_name in", values, "usePlaceName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameNotIn(List<String> values) {
            addCriterion("use_place_name not in", values, "usePlaceName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameBetween(String value1, String value2) {
            addCriterion("use_place_name between", value1, value2, "usePlaceName");
            return (Criteria) this;
        }

        public Criteria andUsePlaceNameNotBetween(String value1, String value2) {
            addCriterion("use_place_name not between", value1, value2, "usePlaceName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNull() {
            addCriterion("price_type is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNotNull() {
            addCriterion("price_type is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeEqualTo(Integer value) {
            addCriterion("price_type =", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotEqualTo(Integer value) {
            addCriterion("price_type <>", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThan(Integer value) {
            addCriterion("price_type >", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_type >=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThan(Integer value) {
            addCriterion("price_type <", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("price_type <=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIn(List<Integer> values) {
            addCriterion("price_type in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotIn(List<Integer> values) {
            addCriterion("price_type not in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeBetween(Integer value1, Integer value2) {
            addCriterion("price_type between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("price_type not between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIsNull() {
            addCriterion("invoice_code is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIsNotNull() {
            addCriterion("invoice_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeEqualTo(String value) {
            addCriterion("invoice_code =", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotEqualTo(String value) {
            addCriterion("invoice_code <>", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeGreaterThan(String value) {
            addCriterion("invoice_code >", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_code >=", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLessThan(String value) {
            addCriterion("invoice_code <", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLessThanOrEqualTo(String value) {
            addCriterion("invoice_code <=", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLike(String value) {
            addCriterion("invoice_code like", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotLike(String value) {
            addCriterion("invoice_code not like", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIn(List<String> values) {
            addCriterion("invoice_code in", values, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotIn(List<String> values) {
            addCriterion("invoice_code not in", values, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeBetween(String value1, String value2) {
            addCriterion("invoice_code between", value1, value2, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotBetween(String value1, String value2) {
            addCriterion("invoice_code not between", value1, value2, "invoiceCode");
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