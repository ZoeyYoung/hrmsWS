package com.hrms.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 员工学历学位实体
 * 
 * TODO 补全字段
 * 
 * @author yangdm.fnst
 *
 */
@Entity
@Table(name = "user_academic_degrees")
public class AcademicDegree extends BaseEntity {

    private static final long serialVersionUID = 1568773491345782877L;

    private Date enrollmentTime;

    private String schoolName;

    public Date getEnrollmentTime() {
        return enrollmentTime;
    }

    public void setEnrollmentTime(Date enrollmentTime) {
        this.enrollmentTime = enrollmentTime;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}
