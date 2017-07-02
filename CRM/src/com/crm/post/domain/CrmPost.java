package com.crm.post.domain;

import com.crm.department.domain.CrmDepartment;
import com.crm.staff.domain.CrmStaff;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangfei on 2017/7/1.
 */
public class CrmPost {
    /**
     * CREATE TABLE `crm_post` (
     `postId` varchar(255) NOT NULL PRIMARY KEY,
     `postName` varchar(100) DEFAULT NULL,
     `depId` varchar(255) DEFAULT NULL,
     CONSTRAINT FOREIGN KEY (`depId`) REFERENCES `crm_department` (`depId`)
     );
     */
    private String postId;
    private String postName;
    //post-----dept 多对一
    private CrmDepartment crmDepartment;

    //post------staff 一对多
    private Set<CrmStaff> crmStaffSet=new HashSet<>();

    public Set<CrmStaff> getCrmStaffSet() {
        return crmStaffSet;
    }

    public void setCrmStaffSet(Set<CrmStaff> crmStaffSet) {
        this.crmStaffSet = crmStaffSet;
    }

    @Override
    public String toString() {
        return "CrmPost{" +
                "postId='" + postId + '\'' +
                ", postName='" + postName + '\'' +
                '}';
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public CrmDepartment getCrmDepartment() {
        return crmDepartment;
    }

    public void setCrmDepartment(CrmDepartment crmDepartment) {
        this.crmDepartment = crmDepartment;
    }
}
