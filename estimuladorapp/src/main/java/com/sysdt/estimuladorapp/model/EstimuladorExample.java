package com.sysdt.estimuladorapp.model;

import java.util.ArrayList;
import java.util.List;

public class EstimuladorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    public EstimuladorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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

        public Criteria andSerieIsNull() {
            addCriterion("serie is null");
            return (Criteria) this;
        }

        public Criteria andSerieIsNotNull() {
            addCriterion("serie is not null");
            return (Criteria) this;
        }

        public Criteria andSerieEqualTo(String value) {
            addCriterion("serie =", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieNotEqualTo(String value) {
            addCriterion("serie <>", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieGreaterThan(String value) {
            addCriterion("serie >", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieGreaterThanOrEqualTo(String value) {
            addCriterion("serie >=", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieLessThan(String value) {
            addCriterion("serie <", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieLessThanOrEqualTo(String value) {
            addCriterion("serie <=", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieLike(String value) {
            addCriterion("serie like", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieNotLike(String value) {
            addCriterion("serie not like", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieIn(List<String> values) {
            addCriterion("serie in", values, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieNotIn(List<String> values) {
            addCriterion("serie not in", values, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieBetween(String value1, String value2) {
            addCriterion("serie between", value1, value2, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieNotBetween(String value1, String value2) {
            addCriterion("serie not between", value1, value2, "serie");
            return (Criteria) this;
        }

        public Criteria andIdPacienteIsNull() {
            addCriterion("idPaciente is null");
            return (Criteria) this;
        }

        public Criteria andIdPacienteIsNotNull() {
            addCriterion("idPaciente is not null");
            return (Criteria) this;
        }

        public Criteria andIdPacienteEqualTo(Integer value) {
            addCriterion("idPaciente =", value, "idPaciente");
            return (Criteria) this;
        }

        public Criteria andIdPacienteNotEqualTo(Integer value) {
            addCriterion("idPaciente <>", value, "idPaciente");
            return (Criteria) this;
        }

        public Criteria andIdPacienteGreaterThan(Integer value) {
            addCriterion("idPaciente >", value, "idPaciente");
            return (Criteria) this;
        }

        public Criteria andIdPacienteGreaterThanOrEqualTo(Integer value) {
            addCriterion("idPaciente >=", value, "idPaciente");
            return (Criteria) this;
        }

        public Criteria andIdPacienteLessThan(Integer value) {
            addCriterion("idPaciente <", value, "idPaciente");
            return (Criteria) this;
        }

        public Criteria andIdPacienteLessThanOrEqualTo(Integer value) {
            addCriterion("idPaciente <=", value, "idPaciente");
            return (Criteria) this;
        }

        public Criteria andIdPacienteIn(List<Integer> values) {
            addCriterion("idPaciente in", values, "idPaciente");
            return (Criteria) this;
        }

        public Criteria andIdPacienteNotIn(List<Integer> values) {
            addCriterion("idPaciente not in", values, "idPaciente");
            return (Criteria) this;
        }

        public Criteria andIdPacienteBetween(Integer value1, Integer value2) {
            addCriterion("idPaciente between", value1, value2, "idPaciente");
            return (Criteria) this;
        }

        public Criteria andIdPacienteNotBetween(Integer value1, Integer value2) {
            addCriterion("idPaciente not between", value1, value2, "idPaciente");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table estimulador
     *
     * @mbggenerated do_not_delete_during_merge Sat Aug 27 13:56:24 CDT 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table estimulador
     *
     * @mbggenerated Sat Aug 27 13:56:24 CDT 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}