package com.isoft.erp.entity.po;

import java.math.BigDecimal;

public class Goods {
    private BigDecimal uuid;

    private String name;

    private String origin;

    private String producer;

    private String unit;

    private BigDecimal inprice;

    private BigDecimal outprice;

    private BigDecimal goodstypeuuid;

    public BigDecimal getUuid() {
        return uuid;
    }

    public void setUuid(BigDecimal uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getInprice() {
        return inprice;
    }

    public void setInprice(BigDecimal inprice) {
        this.inprice = inprice;
    }

    public BigDecimal getOutprice() {
        return outprice;
    }

    public void setOutprice(BigDecimal outprice) {
        this.outprice = outprice;
    }

    public BigDecimal getGoodstypeuuid() {
        return goodstypeuuid;
    }

    public void setGoodstypeuuid(BigDecimal goodstypeuuid) {
        this.goodstypeuuid = goodstypeuuid;
    }
}