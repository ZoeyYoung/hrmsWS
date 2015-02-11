package com.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 验证码实体
 * 
 * @author yangdm.fnst
 *
 */
@Entity
@Table(name = "simple_captcha_data")
public class CaptchaData extends BaseEntity {

    private static final long serialVersionUID = 2564212514636776897L;
    /** 验证码 **/
    private String key;
    /** 验证码code **/
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
