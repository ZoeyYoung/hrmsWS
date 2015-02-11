package com.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 语言能力实体
 * 
 * TODO 补全字段
 * 
 * @author yangdm.fnst
 *
 */
@Entity
@Table(name = "user_languages")
public class LanguagesLevel extends BaseEntity {

    private static final long serialVersionUID = -9195919460623134355L;

    private String languageName;

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

}
