package com.yeqifu.bus.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Car {
    /** 车牌号*/
    private String carnumber;
    /** 汽车类型*/
    private String cartype;
    /** 颜色*/
    private String color;
    /** 价格*/
    private Double price;
    /** 租金*/
    private Double rentprice;
    /** 押金*/
    private Double deposit;
    /** 是否出租：0 未出租，1 已出租*/
    private Integer isrenting;
    /** 描述*/
    private String description;
    /** 车牌号*/
    private String carimg;
    /** 已出租数量*/
    private String rentnum;
    /** 未出租数量*/
    private String notrentnum;
    /** 创建时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss",timezone = "GTM+8")
    private Date createtime;

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRentprice() {
        return rentprice;
    }

    public void setRentprice(Double rentprice) {
        this.rentprice = rentprice;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Integer getIsrenting() {
        return isrenting;
    }

    public void setIsrenting(Integer isrenting) {
        this.isrenting = isrenting;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCarimg() {
        return carimg;
    }

    public void setCarimg(String carimg) {
        this.carimg = carimg == null ? null : carimg.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getRentnum() {
        return rentnum;
    }

    public void setRentnum(String rentnum) {
        this.rentnum = rentnum;
    }

    public String getNotrentnum() {
        return notrentnum;
    }

    public void setNotrentnum(String nottnum) {
        this.notrentnum = nottnum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carnumber='" + carnumber + '\'' +
                ", cartype='" + cartype + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", rentprice=" + rentprice +
                ", deposit=" + deposit +
                ", isrenting=" + isrenting +
                ", description='" + description + '\'' +
                ", carimg='" + carimg + '\'' +
                ", rentnum='" + rentnum + '\'' +
                ", notrentnum='" + notrentnum + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}