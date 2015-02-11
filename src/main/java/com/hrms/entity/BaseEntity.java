package com.hrms.entity;

import java.io.Serializable;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hrms.listener.SaveAndUpdateListener;

/**
 * Entity base class
 * 
 */
@MappedSuperclass
@EntityListeners(value = SaveAndUpdateListener.class)
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = -67188388306700736L;

    @Id
    @GeneratedValue
    protected long id;
    @JsonIgnore
    private int createUid;
    @JsonIgnore
    private int updateUid;
    @JsonIgnore
    private long createTime;
    @JsonIgnore
    private long updateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public int getCreateUid() {
        return createUid;
    }

    public void setCreateUid(int createUid) {
        this.createUid = createUid;
    }

    public int getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(int updateUid) {
        this.updateUid = updateUid;
    }

}
