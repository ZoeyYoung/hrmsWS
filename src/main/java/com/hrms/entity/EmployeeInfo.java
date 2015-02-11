package com.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 员工基本信息实体
 * 
 * TODO 补全字段
 *
 * @author yangdm.fnst
 *
 */
@Entity
@Table(name = "user_basic_infos")
public class EmployeeInfo extends BaseEntity {

    private static final long serialVersionUID = 2255864692860278374L;

    /** 姓名拼音 **/
    private String chineseName;
    /** 性别 **/
    private String sexCode;

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

}
