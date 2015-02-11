package com.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 家庭成员实体
 * 
 * TODO 补全字段
 * 
 * @author yangdm.fnst
 *
 */
@Entity
@Table(name = "user_languages")
public class FamilyInfo extends BaseEntity {

    private static final long serialVersionUID = 1370543811003669426L;
    
    @JsonIgnore
    @ManyToOne
    private Employee employee;
    
    private String familyName;

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
