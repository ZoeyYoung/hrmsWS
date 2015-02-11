package com.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Master数据类型实体
 * 
 * @author yangdm.fnst
 *
 */
@Entity
@Table(name = "MasterData")
public class MasterData extends BaseEntity {

    private static final long serialVersionUID = 8055326630408493954L;
    /** 编码 **/
    private String code;
    /** 数据名 **/
    private String name;
    /** Master数据类型实体 **/
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "master_type_id")
    private MasterType masterType;
    /** 父数据 **/
    private MasterData fatherData;

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

    public MasterType getMasterType() {
        return masterType;
    }

    public void setMasterType(MasterType masterType) {
        this.masterType = masterType;
    }

    public MasterData getFatherData() {
        return fatherData;
    }

    public void setFatherData(MasterData fatherData) {
        this.fatherData = fatherData;
    }

}
