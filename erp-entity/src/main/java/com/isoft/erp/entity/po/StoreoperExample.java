package com.isoft.erp.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreoperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreoperExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(BigDecimal value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(BigDecimal value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(BigDecimal value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(BigDecimal value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<BigDecimal> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<BigDecimal> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
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

        public Criteria andOpertimeIsNull() {
            addCriterion("OPERTIME is null");
            return (Criteria) this;
        }

        public Criteria andOpertimeIsNotNull() {
            addCriterion("OPERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpertimeEqualTo(Date value) {
            addCriterion("OPERTIME =", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotEqualTo(Date value) {
            addCriterion("OPERTIME <>", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeGreaterThan(Date value) {
            addCriterion("OPERTIME >", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERTIME >=", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeLessThan(Date value) {
            addCriterion("OPERTIME <", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERTIME <=", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeIn(List<Date> values) {
            addCriterion("OPERTIME in", values, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotIn(List<Date> values) {
            addCriterion("OPERTIME not in", values, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeBetween(Date value1, Date value2) {
            addCriterion("OPERTIME between", value1, value2, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERTIME not between", value1, value2, "opertime");
            return (Criteria) this;
        }

        public Criteria andStoreuuidIsNull() {
            addCriterion("STOREUUID is null");
            return (Criteria) this;
        }

        public Criteria andStoreuuidIsNotNull() {
            addCriterion("STOREUUID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreuuidEqualTo(BigDecimal value) {
            addCriterion("STOREUUID =", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidNotEqualTo(BigDecimal value) {
            addCriterion("STOREUUID <>", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidGreaterThan(BigDecimal value) {
            addCriterion("STOREUUID >", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STOREUUID >=", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidLessThan(BigDecimal value) {
            addCriterion("STOREUUID <", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STOREUUID <=", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidIn(List<BigDecimal> values) {
            addCriterion("STOREUUID in", values, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidNotIn(List<BigDecimal> values) {
            addCriterion("STOREUUID not in", values, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOREUUID between", value1, value2, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOREUUID not between", value1, value2, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidIsNull() {
            addCriterion("GOODSUUID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidIsNotNull() {
            addCriterion("GOODSUUID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidEqualTo(BigDecimal value) {
            addCriterion("GOODSUUID =", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidNotEqualTo(BigDecimal value) {
            addCriterion("GOODSUUID <>", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidGreaterThan(BigDecimal value) {
            addCriterion("GOODSUUID >", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODSUUID >=", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidLessThan(BigDecimal value) {
            addCriterion("GOODSUUID <", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODSUUID <=", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidIn(List<BigDecimal> values) {
            addCriterion("GOODSUUID in", values, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidNotIn(List<BigDecimal> values) {
            addCriterion("GOODSUUID not in", values, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODSUUID between", value1, value2, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODSUUID not between", value1, value2, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("NUM is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(BigDecimal value) {
            addCriterion("NUM =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(BigDecimal value) {
            addCriterion("NUM <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(BigDecimal value) {
            addCriterion("NUM >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(BigDecimal value) {
            addCriterion("NUM <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<BigDecimal> values) {
            addCriterion("NUM in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<BigDecimal> values) {
            addCriterion("NUM not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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