package com.neusoft.tijaincms.dto;

public class OrdersPageRequestDto {
    //业务查询条件的请求参数
    private String userId;
    private String realName;
    private Integer sex;
    private Integer smId;
    private String orderDate;
    private Integer state;

    //分页查询条件的请求参数
    private Integer pageNum; //当前页码
    private Integer maxPageNum;//每页最大行数
    private Integer beginNum;//每页开始行号

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getMaxPageNum() {
        return maxPageNum;
    }

    public void setMaxPageNum(Integer maxPageNum) {
        this.maxPageNum = maxPageNum;
    }

    public Integer getBeginNum() {
        return beginNum;
    }

    public void setBeginNum(Integer beginNum) {
        this.beginNum = beginNum;
    }
}
