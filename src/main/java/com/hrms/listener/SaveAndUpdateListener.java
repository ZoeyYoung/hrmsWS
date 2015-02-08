package com.hrms.listener;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.hrms.entity.BaseEntity;


public class SaveAndUpdateListener {
    @PrePersist
    public void setCreate(BaseEntity o) {
        o.setCreateTime(new Date().getTime());
        o.setUpdateTime(new Date().getTime());
    }

    @PreUpdate
    public void setLastUpdate(BaseEntity o) {
        o.setUpdateTime(new Date().getTime());
    }
}
