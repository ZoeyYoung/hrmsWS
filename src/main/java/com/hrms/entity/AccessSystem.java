package com.hrms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class AccessSystem extends BaseEntity {

    private static final long serialVersionUID = 113594641282452249L;
    /** 要访问API的系统 **/
    private String accessSystem;
    /** 一个系统可使用多个API **/
    @ManyToMany
    private Set<Api> apis = new HashSet<Api>();
    /** API授权开始使用时间 **/
    private Date startDate;
    /** API授权结束使用时间 **/
    private Date endDate;

    public String getAccessSystem() {
        return accessSystem;
    }

    public void setAccessSystem(String accessSystem) {
        this.accessSystem = accessSystem;
    }

    public Set<Api> getApis() {
        return apis;
    }

    public void setApis(Set<Api> apis) {
        this.apis = apis;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}
