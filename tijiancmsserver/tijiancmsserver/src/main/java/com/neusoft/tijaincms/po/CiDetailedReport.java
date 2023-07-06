package com.neusoft.tijaincms.po;

public class CiDetailedReport {
    private Integer cidrId;
    private String name;
    private String unit;
    private double minrange;
    private double maxrange;
    private String normalValue;
    private String normalValueString;
    private Integer type;
    private String value;
    private Integer isError;
    private Integer ciId;
    private Integer orderId;

    public Integer getCidrId() {
        return cidrId;
    }

    public void setCidrId(Integer cidrId) {
        this.cidrId = cidrId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getMinrange() {
        return minrange;
    }

    public void setMinrange(double minrange) {
        this.minrange = minrange;
    }

    public double getMaxrange() {
        return maxrange;
    }

    public void setMaxrange(double maxrange) {
        this.maxrange = maxrange;
    }

    public String getNormalValue() {
        return normalValue;
    }

    public void setNormalValue(String normalValue) {
        this.normalValue = normalValue;
    }

    public String getNormalValueString() {
        return normalValueString;
    }

    public void setNormalValueString(String normalValueString) {
        this.normalValueString = normalValueString;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getIsError() {
        return isError;
    }

    public void setIsError(Integer isError) {
        this.isError = isError;
    }

    public Integer getCiId() {
        return ciId;
    }

    public void setCiId(Integer ciId) {
        this.ciId = ciId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
