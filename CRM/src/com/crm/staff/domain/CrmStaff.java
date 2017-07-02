package com.crm.staff.domain;

import com.crm.post.domain.CrmPost;

import java.util.Date;

/**
 * Created by wangfei on 2017/7/1.
 */
public class CrmStaff {
    /**
     * CREATE TABLE `crm_staff` (
     `staffId` varchar(255) NOT NULL PRIMARY KEY,
     `loginName` varchar(100) DEFAULT NULL,
     `loginPwd` varchar(100) DEFAULT NULL,
     `staffName` varchar(100) DEFAULT NULL,
     `gender` varchar(20) DEFAULT NULL,
     `onDutyDate` datetime DEFAULT NULL,
     `postId` varchar(255) DEFAULT NULL,
     CONSTRAINT FOREIGN KEY (`postId`) REFERENCES `crm_post` (`postId`)
     );
     */
    private String staffId;
    private String loginName;
    private String loginPwd;
    private String staffName;
    private String gender;
    private Date onDutyDate;

    //staff -------post   多对一
    private CrmPost crmPost;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getOnDutyDate() {
        return onDutyDate;
    }

    public void setOnDutyDate(Date onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public CrmPost getCrmPost() {
        return crmPost;
    }

    public void setCrmPost(CrmPost crmPost) {
        this.crmPost = crmPost;
    }

    @Override
    public String toString() {
        return "CrmStaff{" +
                "staffId='" + staffId + '\'' +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", staffName='" + staffName + '\'' +
                ", gender='" + gender + '\'' +
                ", onDutyDate=" + onDutyDate +
                '}';
    }
}
