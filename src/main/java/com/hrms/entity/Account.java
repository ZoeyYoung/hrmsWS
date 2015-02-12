package com.hrms.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * API用户
 * 
 * @author yangdm.fnst
 *
 */
@Entity
@Table(name = "account")
public class Account extends BaseEntity {

    private static final long serialVersionUID = -2918272456768598552L;
    @Column(unique = true)
    private String username;
    @JsonIgnore
    private String password;
    /** 一个API用户可管理多个系统 **/
    @OneToMany
    private Set<AccessSystem> accessSystems = new HashSet<AccessSystem>();

    public Account() {
        super();
    }

    public Account(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<AccessSystem> getAccessSystems() {
        return accessSystems;
    }

    public void setAccessSystems(Set<AccessSystem> accessSystems) {
        this.accessSystems = accessSystems;
    }

}
