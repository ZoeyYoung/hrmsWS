package com.hrms.entity;

import java.io.Serializable;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

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
    private Integer id;

    private int createUid;

    private int updateUid;

    private long createTime;

    private long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
