package com.crm.classes.domain;

import com.crm.course.domain.CrmCourseType;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangfei on 2017/7/1.
 */
public class CrmClasses {
    /**
     * CREATE TABLE `crm_classes` (
     `classesId` varchar(50) NOT NULL PRIMARY KEY,
     `courseTypeId` varchar(255) DEFAULT NULL,
     `name` varchar(50) DEFAULT NULL,
     `beginTime` datetime DEFAULT NULL,
     `endTime` datetime DEFAULT NULL,
     `status` varchar(20) DEFAULT NULL,
     `totalCount` int(11) DEFAULT NULL,
     `upgradeCount` int(11) DEFAULT NULL,
     `changeCount` int(11) DEFAULT NULL,
     `runoffCount` int(11) DEFAULT NULL,
     `remark` varchar(500) DEFAULT NULL,
     `uploadTime` datetime DEFAULT NULL,
     `uploadPath` varchar(200) DEFAULT NULL,
     `uploadFilename` varchar(100) DEFAULT NULL,
     CONSTRAINT FOREIGN KEY (`courseTypeId`) REFERENCES `crm_course_type` (`courseTypeId`)
     ) ;
     */
   private String classesId;
   private String name;//课程名称
   private Date beginTime;//开班时间
   private Date endTime;//结班时间
   private String status;//状态
   private Integer totalCount;//总人数
   private Integer upgradeCount;//升级数
   private Integer changeCount;//转班数
   private Integer runoffCount;//流失数
   private String remark;//描述
   private Date uploadTime;//上传时间
   private String uploadPath;//上传课表路径
   private String uploadFilename;//上传课表名称

    //class   courseType 多对一 多个班级可以对应一个课程类别
    private CrmCourseType crmCourseType;

    public CrmCourseType getCrmCourseType() {
        return crmCourseType;
    }

    public void setCrmCourseType(CrmCourseType crmCourseType) {
        this.crmCourseType = crmCourseType;
    }

    @Override
    public String toString() {
        return "CrmClasses{" +
                "classesId='" + classesId + '\'' +
                ", name='" + name + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", status='" + status + '\'' +
                ", totalCount=" + totalCount +
                ", upgradeCount=" + upgradeCount +
                ", changeCount=" + changeCount +
                ", runoffCount=" + runoffCount +
                ", remark='" + remark + '\'' +
                ", uploadTime=" + uploadTime +
                ", uploadPath='" + uploadPath + '\'' +
                ", uploadFilename='" + uploadFilename + '\'' +
                '}';
    }

    public String getClassesId() {
        return classesId;
    }

    public void setClassesId(String classesId) {
        this.classesId = classesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getUpgradeCount() {
        return upgradeCount;
    }

    public void setUpgradeCount(Integer upgradeCount) {
        this.upgradeCount = upgradeCount;
    }

    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    public Integer getRunoffCount() {
        return runoffCount;
    }

    public void setRunoffCount(Integer runoffCount) {
        this.runoffCount = runoffCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public String getUploadFilename() {
        return uploadFilename;
    }

    public void setUploadFilename(String uploadFilename) {
        this.uploadFilename = uploadFilename;
    }


}
