package com.qingyu.springBoot.domain;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class LocaTemp {
    private Long id;
    private String phone;
    private Double money;
    private Date createTime;
    private String myOwn;
    private String procSn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMyOwn() {
        return myOwn;
    }

    public void setMyOwn(String myOwn) {
        this.myOwn = myOwn;
    }

    public String getProcSn() {
        return procSn;
    }

    public void setProcSn(String procSn) {
        this.procSn = procSn;
    }
}
