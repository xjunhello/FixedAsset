package com.fixed.asset.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectDetailExample() {
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

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Integer value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Integer value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Integer value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Integer value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Integer> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Integer> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
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

        public Criteria andDetailCodeIsNull() {
            addCriterion("detail_code is null");
            return (Criteria) this;
        }

        public Criteria andDetailCodeIsNotNull() {
            addCriterion("detail_code is not null");
            return (Criteria) this;
        }

        public Criteria andDetailCodeEqualTo(String value) {
            addCriterion("detail_code =", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeNotEqualTo(String value) {
            addCriterion("detail_code <>", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeGreaterThan(String value) {
            addCriterion("detail_code >", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("detail_code >=", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeLessThan(String value) {
            addCriterion("detail_code <", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeLessThanOrEqualTo(String value) {
            addCriterion("detail_code <=", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeLike(String value) {
            addCriterion("detail_code like", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeNotLike(String value) {
            addCriterion("detail_code not like", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeIn(List<String> values) {
            addCriterion("detail_code in", values, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeNotIn(List<String> values) {
            addCriterion("detail_code not in", values, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeBetween(String value1, String value2) {
            addCriterion("detail_code between", value1, value2, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeNotBetween(String value1, String value2) {
            addCriterion("detail_code not between", value1, value2, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailNameIsNull() {
            addCriterion("detail_name is null");
            return (Criteria) this;
        }

        public Criteria andDetailNameIsNotNull() {
            addCriterion("detail_name is not null");
            return (Criteria) this;
        }

        public Criteria andDetailNameEqualTo(String value) {
            addCriterion("detail_name =", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotEqualTo(String value) {
            addCriterion("detail_name <>", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameGreaterThan(String value) {
            addCriterion("detail_name >", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameGreaterThanOrEqualTo(String value) {
            addCriterion("detail_name >=", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameLessThan(String value) {
            addCriterion("detail_name <", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameLessThanOrEqualTo(String value) {
            addCriterion("detail_name <=", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameLike(String value) {
            addCriterion("detail_name like", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotLike(String value) {
            addCriterion("detail_name not like", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameIn(List<String> values) {
            addCriterion("detail_name in", values, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotIn(List<String> values) {
            addCriterion("detail_name not in", values, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameBetween(String value1, String value2) {
            addCriterion("detail_name between", value1, value2, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotBetween(String value1, String value2) {
            addCriterion("detail_name not between", value1, value2, "detailName");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andDetailNumberIsNull() {
            addCriterion("detail_number is null");
            return (Criteria) this;
        }

        public Criteria andDetailNumberIsNotNull() {
            addCriterion("detail_number is not null");
            return (Criteria) this;
        }

        public Criteria andDetailNumberEqualTo(Integer value) {
            addCriterion("detail_number =", value, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberNotEqualTo(Integer value) {
            addCriterion("detail_number <>", value, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberGreaterThan(Integer value) {
            addCriterion("detail_number >", value, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_number >=", value, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberLessThan(Integer value) {
            addCriterion("detail_number <", value, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberLessThanOrEqualTo(Integer value) {
            addCriterion("detail_number <=", value, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberIn(List<Integer> values) {
            addCriterion("detail_number in", values, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberNotIn(List<Integer> values) {
            addCriterion("detail_number not in", values, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberBetween(Integer value1, Integer value2) {
            addCriterion("detail_number between", value1, value2, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_number not between", value1, value2, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailSizeIsNull() {
            addCriterion("detail_size is null");
            return (Criteria) this;
        }

        public Criteria andDetailSizeIsNotNull() {
            addCriterion("detail_size is not null");
            return (Criteria) this;
        }

        public Criteria andDetailSizeEqualTo(Integer value) {
            addCriterion("detail_size =", value, "detailSize");
            return (Criteria) this;
        }

        public Criteria andDetailSizeNotEqualTo(Integer value) {
            addCriterion("detail_size <>", value, "detailSize");
            return (Criteria) this;
        }

        public Criteria andDetailSizeGreaterThan(Integer value) {
            addCriterion("detail_size >", value, "detailSize");
            return (Criteria) this;
        }

        public Criteria andDetailSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_size >=", value, "detailSize");
            return (Criteria) this;
        }

        public Criteria andDetailSizeLessThan(Integer value) {
            addCriterion("detail_size <", value, "detailSize");
            return (Criteria) this;
        }

        public Criteria andDetailSizeLessThanOrEqualTo(Integer value) {
            addCriterion("detail_size <=", value, "detailSize");
            return (Criteria) this;
        }

        public Criteria andDetailSizeIn(List<Integer> values) {
            addCriterion("detail_size in", values, "detailSize");
            return (Criteria) this;
        }

        public Criteria andDetailSizeNotIn(List<Integer> values) {
            addCriterion("detail_size not in", values, "detailSize");
            return (Criteria) this;
        }

        public Criteria andDetailSizeBetween(Integer value1, Integer value2) {
            addCriterion("detail_size between", value1, value2, "detailSize");
            return (Criteria) this;
        }

        public Criteria andDetailSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_size not between", value1, value2, "detailSize");
            return (Criteria) this;
        }

        public Criteria andDetailPriceIsNull() {
            addCriterion("detail_price is null");
            return (Criteria) this;
        }

        public Criteria andDetailPriceIsNotNull() {
            addCriterion("detail_price is not null");
            return (Criteria) this;
        }

        public Criteria andDetailPriceEqualTo(BigDecimal value) {
            addCriterion("detail_price =", value, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceNotEqualTo(BigDecimal value) {
            addCriterion("detail_price <>", value, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceGreaterThan(BigDecimal value) {
            addCriterion("detail_price >", value, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("detail_price >=", value, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceLessThan(BigDecimal value) {
            addCriterion("detail_price <", value, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("detail_price <=", value, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceIn(List<BigDecimal> values) {
            addCriterion("detail_price in", values, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceNotIn(List<BigDecimal> values) {
            addCriterion("detail_price not in", values, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("detail_price between", value1, value2, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("detail_price not between", value1, value2, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceTypeIsNull() {
            addCriterion("detail_price_type is null");
            return (Criteria) this;
        }

        public Criteria andDetailPriceTypeIsNotNull() {
            addCriterion("detail_price_type is not null");
            return (Criteria) this;
        }

        public Criteria andDetailPriceTypeEqualTo(Byte value) {
            addCriterion("detail_price_type =", value, "detailPriceType");
            return (Criteria) this;
        }

        public Criteria andDetailPriceTypeNotEqualTo(Byte value) {
            addCriterion("detail_price_type <>", value, "detailPriceType");
            return (Criteria) this;
        }

        public Criteria andDetailPriceTypeGreaterThan(Byte value) {
            addCriterion("detail_price_type >", value, "detailPriceType");
            return (Criteria) this;
        }

        public Criteria andDetailPriceTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("detail_price_type >=", value, "detailPriceType");
            return (Criteria) this;
        }

        public Criteria andDetailPriceTypeLessThan(Byte value) {
            addCriterion("detail_price_type <", value, "detailPriceType");
            return (Criteria) this;
        }

        public Criteria andDetailPriceTypeLessThanOrEqualTo(Byte value) {
            addCriterion("detail_price_type <=", value, "detailPriceType");
            return (Criteria) this;
        }

        public Criteria andDetailPriceTypeIn(List<Byte> values) {
            addCriterion("detail_price_type in", values, "detailPriceType");
            return (Criteria) this;
        }

        public Criteria andDetailPriceTypeNotIn(List<Byte> values) {
            addCriterion("detail_price_type not in", values, "detailPriceType");
            return (Criteria) this;
        }

        public Criteria andDetailPriceTypeBetween(Byte value1, Byte value2) {
            addCriterion("detail_price_type between", value1, value2, "detailPriceType");
            return (Criteria) this;
        }

        public Criteria andDetailPriceTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("detail_price_type not between", value1, value2, "detailPriceType");
            return (Criteria) this;
        }

        public Criteria andIsAssetIsNull() {
            addCriterion("is_asset is null");
            return (Criteria) this;
        }

        public Criteria andIsAssetIsNotNull() {
            addCriterion("is_asset is not null");
            return (Criteria) this;
        }

        public Criteria andIsAssetEqualTo(Byte value) {
            addCriterion("is_asset =", value, "isAsset");
            return (Criteria) this;
        }

        public Criteria andIsAssetNotEqualTo(Byte value) {
            addCriterion("is_asset <>", value, "isAsset");
            return (Criteria) this;
        }

        public Criteria andIsAssetGreaterThan(Byte value) {
            addCriterion("is_asset >", value, "isAsset");
            return (Criteria) this;
        }

        public Criteria andIsAssetGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_asset >=", value, "isAsset");
            return (Criteria) this;
        }

        public Criteria andIsAssetLessThan(Byte value) {
            addCriterion("is_asset <", value, "isAsset");
            return (Criteria) this;
        }

        public Criteria andIsAssetLessThanOrEqualTo(Byte value) {
            addCriterion("is_asset <=", value, "isAsset");
            return (Criteria) this;
        }

        public Criteria andIsAssetIn(List<Byte> values) {
            addCriterion("is_asset in", values, "isAsset");
            return (Criteria) this;
        }

        public Criteria andIsAssetNotIn(List<Byte> values) {
            addCriterion("is_asset not in", values, "isAsset");
            return (Criteria) this;
        }

        public Criteria andIsAssetBetween(Byte value1, Byte value2) {
            addCriterion("is_asset between", value1, value2, "isAsset");
            return (Criteria) this;
        }

        public Criteria andIsAssetNotBetween(Byte value1, Byte value2) {
            addCriterion("is_asset not between", value1, value2, "isAsset");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkIsNull() {
            addCriterion("detail_remark is null");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkIsNotNull() {
            addCriterion("detail_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkEqualTo(String value) {
            addCriterion("detail_remark =", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkNotEqualTo(String value) {
            addCriterion("detail_remark <>", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkGreaterThan(String value) {
            addCriterion("detail_remark >", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("detail_remark >=", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkLessThan(String value) {
            addCriterion("detail_remark <", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkLessThanOrEqualTo(String value) {
            addCriterion("detail_remark <=", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkLike(String value) {
            addCriterion("detail_remark like", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkNotLike(String value) {
            addCriterion("detail_remark not like", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkIn(List<String> values) {
            addCriterion("detail_remark in", values, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkNotIn(List<String> values) {
            addCriterion("detail_remark not in", values, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkBetween(String value1, String value2) {
            addCriterion("detail_remark between", value1, value2, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkNotBetween(String value1, String value2) {
            addCriterion("detail_remark not between", value1, value2, "detailRemark");
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