package com.hrms.entity;

import javax.persistence.Entity;

/**
 * API访问记录
 *
 * @author yangdm.fnst
 *
 */
@Entity
public class AccessLog extends BaseEntity {

    private static final long serialVersionUID = -8767767765141452825L;

    private Api api;

    private Account accout;

    public Api getApi() {
        return api;
    }

    public void setApi(Api api) {
        this.api = api;
    }

    public Account getAccout() {
        return accout;
    }

    public void setAccout(Account accout) {
        this.accout = accout;
    }

}
