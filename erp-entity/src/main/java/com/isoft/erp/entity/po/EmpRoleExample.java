package com.isoft.erp.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmpRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpRoleExample() {
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

        public Criteria andEmpuuidIsNull() {
            addCriterion("EMPUUID is null");
            return (Criteria) this;
        }

        public Criteria andEmpuuidIsNotNull() {
            addCriterion("EMPUUID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpuuidEqualTo(BigDecimal value) {
            addCriterion("EMPUUID =", value, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidNotEqualTo(BigDecimal value) {
            addCriterion("EMPUUID <>", value, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidGreaterThan(BigDecimal value) {
            addCriterion("EMPUUID >", value, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EMPUUID >=", value, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidLessThan(BigDecimal value) {
            addCriterion("EMPUUID <", value, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EMPUUID <=", value, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidIn(List<BigDecimal> values) {
            addCriterion("EMPUUID in", values, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidNotIn(List<BigDecimal> values) {
            addCriterion("EMPUUID not in", values, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMPUUID between", value1, value2, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMPUUID not between", value1, value2, "empuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidIsNull() {
            addCriterion("ROLEUUID is null");
            return (Criteria) this;
        }

        public Criteria andRoleuuidIsNotNull() {
            addCriterion("ROLEUUID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleuuidEqualTo(BigDecimal value) {
            addCriterion("ROLEUUID =", value, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidNotEqualTo(BigDecimal value) {
            addCriterion("ROLEUUID <>", value, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidGreaterThan(BigDecimal value) {
            addCriterion("ROLEUUID >", value, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROLEUUID >=", value, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidLessThan(BigDecimal value) {
            addCriterion("ROLEUUID <", value, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROLEUUID <=", value, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidIn(List<BigDecimal> values) {
            addCriterion("ROLEUUID in", values, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidNotIn(List<BigDecimal> values) {
            addCriterion("ROLEUUID not in", values, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROLEUUID between", value1, value2, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROLEUUID not between", value1, value2, "roleuuid");
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