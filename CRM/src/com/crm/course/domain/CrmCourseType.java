package com.crm.course.domain;

import com.crm.classes.domain.CrmClasses;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangfei on 2017/7/1.
 */
public class CrmCourseType {
    /**
     * CREATE TABLE `crm_course_type` (
     `courseTypeId` varchar(255) NOT NULL PRIMARY KEY,
     `courseCost` double DEFAULT NULL,
     `total` int(11) DEFAULT NULL,
     `courseName` varchar(500) DEFAULT NULL,
     `remark` varchar(5000) DEFAULT NULL
     );
     */
   private String courseTypeId;
   private Double courseCost;
   private Integer total;
   private String courseName;
   private String remark;

   //courseType -> class 一个课程可以有多个班级  一对多
    private Set<CrmClasses> crmClassesSet=new HashSet<>();
    //用于条件查询
    private String totalStart;
    private String totalEnd;
    private String lessonCostStart;
    private String lessonCostEnd;

    public void setTotalStart(String totalStart) {
        this.totalStart = totalStart;
    }

    public void setTotalEnd(String totalEnd) {
        this.totalEnd = totalEnd;
    }

    public void setLessonCostStart(String lessonCostStart) {
        this.lessonCostStart = lessonCostStart;
    }

    public void setLessonCostEnd(String lessonCostEnd) {
        this.lessonCostEnd = lessonCostEnd;
    }

    public String getTotalStart() {
        return totalStart;
    }

    public String getTotalEnd() {
        return totalEnd;
    }

    public String getLessonCostStart() {
        return lessonCostStart;
    }

    public String getLessonCostEnd() {
        return lessonCostEnd;
    }

    @Override
    public String toString() {
        return "CrmCourseType{" +
                "courseTypeId='" + courseTypeId + '\'' +
                ", courseCost=" + courseCost +
                ", total=" + total +
                ", courseName='" + courseName + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public Double getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(Double courseCost) {
        this.courseCost = courseCost;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Set<CrmClasses> getCrmClassesSet() {
        return crmClassesSet;
    }

    public void setCrmClassesSet(Set<CrmClasses> crmClassesSet) {
        this.crmClassesSet = crmClassesSet;
    }
}
