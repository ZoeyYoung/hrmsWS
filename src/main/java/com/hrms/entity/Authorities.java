package com.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
public class Authorities extends BaseEntity {

    private static final long serialVersionUID = 4780177622593155202L;

    @JoinColumn(name = "username")
    private Account account;
    private String authority;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

}
