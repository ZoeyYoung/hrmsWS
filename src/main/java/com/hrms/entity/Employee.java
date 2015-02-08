package com.hrms.entity;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

/**
 * 用户账号管理实体
 * 
 * @author yangdm.fnst
 *
 */
@Entity
public class Employee extends BaseEntity {

    private static final long serialVersionUID = 2255864692860278374L;

    /** 个人邮件地址 **/
    private String email;
    /** 密码 **/
    private String encryptedPassword;
    /** 姓名 **/
    private String name;
    /**
     * 员工信息录入状态 0：未录入，1：已保存，2：已提交
     **/
    private Integer state = 0;
    /** 重置密码 **/
    private String resetPasswordToken;
    /** 重置密码时间 **/
    private String resetPasswordSentAt;
    /** 记住我的时间 **/
    private Date rememberCreatedAt;
    /** 登陆成功次数 **/
    private Long signInCount;
    /** 当前登录时间 **/
    private Date currentSignInAt;
    /** 最近一次登录时间 **/
    private Date lastSignInAt;
    /** 当前登录ip **/
    private String currentSignInIp;
    /** 最近一次登录ip **/
    private String lastSignInIp;
    /** 是否激活 **/
    private String confirmationToken;
    /** 激活时间 **/
    private Date confirmedAt;
    /** 激活发送邮件时间 **/
    private Date confirmationSentAt;
    /** 非激活邮件地址 **/
    private String unconfirmedEmail;
    /** 失败次数 **/
    private Long failedAttempts;
    /** 解锁 **/
    private String unlockToken;
    /** 锁定时间 **/
    private String lockedAt;

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the encryptedPassword
     */
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    /**
     * @param encryptedPassword the encryptedPassword to set
     */
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return the resetPasswordToken
     */
    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    /**
     * @param resetPasswordToken the resetPasswordToken to set
     */
    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    /**
     * @return the resetPasswordSentAt
     */
    public String getResetPasswordSentAt() {
        return resetPasswordSentAt;
    }

    /**
     * @param resetPasswordSentAt the resetPasswordSentAt to set
     */
    public void setResetPasswordSentAt(String resetPasswordSentAt) {
        this.resetPasswordSentAt = resetPasswordSentAt;
    }

    /**
     * @return the rememberCreatedAt
     */
    @JsonSerialize(using = DateSerializer.class)
    public Date getRememberCreatedAt() {
        return rememberCreatedAt;
    }

    /**
     * @param rememberCreatedAt the rememberCreatedAt to set
     */
    public void setRememberCreatedAt(Date rememberCreatedAt) {
        this.rememberCreatedAt = rememberCreatedAt;
    }

    /**
     * @return the signInCount
     */
    public Long getSignInCount() {
        return signInCount;
    }

    /**
     * @param signInCount the signInCount to set
     */
    public void setSignInCount(Long signInCount) {
        this.signInCount = signInCount;
    }

    /**
     * @return the currentSignInAt
     */
    @JsonSerialize(using = DateSerializer.class)
    public Date getCurrentSignInAt() {
        return currentSignInAt;
    }

    /**
     * @param currentSignInAt the currentSignInAt to set
     */
    public void setCurrentSignInAt(Date currentSignInAt) {
        this.currentSignInAt = currentSignInAt;
    }

    /**
     * @return the lastSignInAt
     */
    @JsonSerialize(using = DateSerializer.class)
    public Date getLastSignInAt() {
        return lastSignInAt;
    }

    /**
     * @param lastSignInAt the lastSignInAt to set
     */
    public void setLastSignInAt(Date lastSignInAt) {
        this.lastSignInAt = lastSignInAt;
    }

    /**
     * @return the currentSignInIp
     */
    public String getCurrentSignInIp() {
        return currentSignInIp;
    }

    /**
     * @param currentSignInIp the currentSignInIp to set
     */
    public void setCurrentSignInIp(String currentSignInIp) {
        this.currentSignInIp = currentSignInIp;
    }

    /**
     * @return the lastSignInIp
     */
    public String getLastSignInIp() {
        return lastSignInIp;
    }

    /**
     * @param lastSignInIp the lastSignInIp to set
     */
    public void setLastSignInIp(String lastSignInIp) {
        this.lastSignInIp = lastSignInIp;
    }

    /**
     * @return the confirmationToken
     */
    public String getConfirmationToken() {
        return confirmationToken;
    }

    /**
     * @param confirmationToken the confirmationToken to set
     */
    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    /**
     * @return the confirmedAt
     */
    @JsonSerialize(using = DateSerializer.class)
    public Date getConfirmedAt() {
        return confirmedAt;
    }

    /**
     * @param confirmedAt the confirmedAt to set
     */
    public void setConfirmedAt(Date confirmedAt) {
        this.confirmedAt = confirmedAt;
    }

    /**
     * @return the confirmationSentAt
     */
    @JsonSerialize(using = DateSerializer.class)
    public Date getConfirmationSentAt() {
        return confirmationSentAt;
    }

    /**
     * @param confirmationSentAt the confirmationSentAt to set
     */
    public void setConfirmationSentAt(Date confirmationSentAt) {
        this.confirmationSentAt = confirmationSentAt;
    }

    /**
     * @return the unconfirmedEmail
     */
    public String getUnconfirmedEmail() {
        return unconfirmedEmail;
    }

    /**
     * @param unconfirmedEmail the unconfirmedEmail to set
     */
    public void setUnconfirmedEmail(String unconfirmedEmail) {
        this.unconfirmedEmail = unconfirmedEmail;
    }

    /**
     * @return the failedAttempts
     */
    public Long getFailedAttempts() {
        return failedAttempts;
    }

    /**
     * @param failedAttempts the failedAttempts to set
     */
    public void setFailedAttempts(Long failedAttempts) {
        this.failedAttempts = failedAttempts;
    }

    /**
     * @return the unlockToken
     */
    public String getUnlockToken() {
        return unlockToken;
    }

    /**
     * @param unlockToken the unlockToken to set
     */
    public void setUnlockToken(String unlockToken) {
        this.unlockToken = unlockToken;
    }

    /**
     * @return the lockedAt
     */
    public String getLockedAt() {
        return lockedAt;
    }

    /**
     * @param lockedAt the lockedAt to set
     */
    public void setLockedAt(String lockedAt) {
        this.lockedAt = lockedAt;
    }

}
