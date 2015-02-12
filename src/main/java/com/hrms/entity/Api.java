package com.hrms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Api extends BaseEntity {

    private static final long serialVersionUID = 4731615949220449378L;
    /** API名称 **/
    private String name;
    /** HTTP方法 **/
    private String method;
    /** 相对请求URI **/
    private String uri;
    /** API描述 **/
    @Column(columnDefinition = "TEXT")
    private String desc;
    /** 请求 **/
    @Column(columnDefinition = "TEXT")
    private String request;
    /** 响应 **/
    @Column(columnDefinition = "TEXT")
    private String response;
    /** API等级 **/
    // @Enumerated(EnumType.ORDINAL)
    // private APILevel level;
    private String level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
