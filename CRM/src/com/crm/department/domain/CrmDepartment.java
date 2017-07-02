package com.crm.department.domain;

import com.crm.post.domain.CrmPost;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangfei on 2017/7/1.
 */
public class CrmDepartment {
    /**
     * CREATE TABLE `crm_department` (
     `depId` varchar(255) NOT NULL PRIMARY KEY,
     `depName` varchar(50) DEFAULT NULL
     );
     */
    private String depId;
    private String depName;

    //dept-----post   一对多
    private Set<CrmPost> crmPostSet=new HashSet<>();

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Set<CrmPost> getPostSet() {
        return crmPostSet;
    }

    public void setPostSet(Set<CrmPost> crmPostSet) {
        this.crmPostSet = crmPostSet;
    }

    @Override
    public String toString() {
        return "CrmDepartment{" +
                "depId='" + depId + '\'' +
                ", depName='" + depName + '\'' +
                '}';
    }
}
