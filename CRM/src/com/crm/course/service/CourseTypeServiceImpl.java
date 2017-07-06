package com.crm.course.service;

import com.crm.course.dao.CourseTypeDao;
import com.crm.course.domain.CrmCourseType;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangfei on 2017/7/6.
 */
public class CourseTypeServiceImpl implements CourseTypeService{
    private CourseTypeDao courseTypeDao;

    public void setCourseTypeDao(CourseTypeDao courseTypeDao) {
        this.courseTypeDao = courseTypeDao;
    }

    @Override
    public List<CrmCourseType> findAll(CrmCourseType crmCourseType) {

        StringBuilder conditions=new StringBuilder(200);
        List<Object> params=new ArrayList<>();

        if(StringUtils.isNotBlank(crmCourseType.getCourseName())){
            conditions.append(" and courseName like ? ");
            params.add("%"+crmCourseType.getCourseName()+"%");
        }

        if (StringUtils.isNotBlank(crmCourseType.getRemark())){
            conditions.append(" and remark like ? ");
            params.add("%"+crmCourseType.getRemark()+"%");
        }

        if (StringUtils.isNotBlank(crmCourseType.getTotalStart())){
            conditions.append(" and total >= ? ");
            params.add(Integer.parseInt(crmCourseType.getTotalStart()));
        }

        if (StringUtils.isNotBlank(crmCourseType.getTotalEnd())){
            conditions.append(" and total <= ? ");
            params.add(Integer.parseInt(crmCourseType.getTotalEnd()));
        }

        if (StringUtils.isNotBlank(crmCourseType.getLessonCostStart())){
            conditions.append(" and courseCost >= ? ");
            params.add(Double.parseDouble(crmCourseType.getLessonCostStart()));
        }

        if (StringUtils.isNotBlank(crmCourseType.getLessonCostEnd())){
            conditions.append(" and courseCost <= ? ");
            params.add(Double.parseDouble(crmCourseType.getLessonCostEnd()));
        }


        List<CrmCourseType> allCourse = courseTypeDao.findAll(conditions.toString(),params.toArray());
        return allCourse;
    }

    @Override
    public CrmCourseType findById(CrmCourseType courseType) {
        CrmCourseType crmCourseType = courseTypeDao.findById(courseType);
        return crmCourseType;
    }

    @Override
    public void saveOrUpdate(CrmCourseType courseType) {
        courseTypeDao.saveOrUpdate(courseType);
    }
}
