package com.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 员工工作履历实体
 * 
 * TODO 补全字段
 * 
 * @author yangdm.fnst
 *
 */
@Entity
@Table(name = "emp_work_historys")
public class WorkHistory extends BaseEntity {

    private static final long serialVersionUID = 3762341970217737477L;

    private String officeName;

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
}
