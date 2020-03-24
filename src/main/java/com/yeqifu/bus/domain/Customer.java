package com.yeqifu.bus.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Customer {

    /** id*/
    private int id;
    /** 身份证*/
    private String identity;
    /** 姓名*/
    private String name;
    /** 是否审核 0 未审核 1 审核通过 2 审核不通过*/
    private Integer isexamine;
    /** 地址*/
    private String address;
    /** 电话*/
    private String phone;
    /** 车辆类型*/
    private String career;
    /** vip等级*/
    private Integer vip;
    /** 职位*/
    private Integer breakfaith;
    /** 用户状态*/
    private int status;
    /** 驾驶证*/
    private String drvimage;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsexamine() {
        return isexamine;
    }

    public void setIsexamine(Integer isexamine) {
        this.isexamine = isexamine;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Integer getBreakfaith() {
        return breakfaith;
    }

    public void setBreakfaith(Integer breakfaith) {
        this.breakfaith = breakfaith;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDrvimage() {
        return drvimage;
    }

    public void setDrvimage(String drvimage) {
        this.drvimage = drvimage;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", identity='" + identity + '\'' +
                ", name='" + name + '\'' +
                ", isexamine=" + isexamine +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", career='" + career + '\'' +
                ", vip=" + vip +
                ", breakfaith=" + breakfaith +
                ", staus=" + status +
                ", drvimage='" + drvimage + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}