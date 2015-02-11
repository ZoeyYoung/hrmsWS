package com.hrms.entity;

import javax.persistence.Entity;

@Entity
public class Greeting extends BaseEntity {

    private static final long serialVersionUID = -3506948248093648358L;

    private String content;

    public Greeting() {

    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
