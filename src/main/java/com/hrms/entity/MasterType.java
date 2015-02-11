package com.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Master数据类型实体
 * 
 * @author yangdm.fnst
 *
 */
@Entity
@Table(name = "MasterType")
public class MasterType extends BaseEntity {

    private static final long serialVersionUID = 8055326630408493954L;
    /** 编码 **/
    private String code;
    /** 类型名称 **/
    private String name;
    /** 父类型 **/
    private MasterType parentType;

    public String getCode() {
	return code;
    }

    public void setCode(String code) {
	this.code = code;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public MasterType getParentType() {
	return parentType;
    }

    public void setParentType(MasterType parentType) {
	this.parentType = parentType;
    }

}
