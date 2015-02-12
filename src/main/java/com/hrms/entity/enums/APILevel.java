package com.hrms.entity.enums;

/**
 * API等级划分
 */
public enum APILevel {
    NORMAL("普通"), DANGER("高危");

    private final String level;

    APILevel(final String name) {
        this.level = name;
    }

    public String level() {
        return level;
    }
}
