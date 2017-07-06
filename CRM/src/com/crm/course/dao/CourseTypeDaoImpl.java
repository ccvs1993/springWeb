package com.crm.course.dao;

import com.crm.course.domain.CrmCourseType;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by wangfei on 2017/7/6.
 */
public class CourseTypeDaoImpl implements CourseTypeDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<CrmCourseType> findAll(String contidtions,Object[] params) {
        String hql="from CrmCourseType where 1=1 "+contidtions;
        System.out.println(hql);
        for (int i = 0; i < params.length; i++) {
            System.out.println(params[i]);
        }
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery(hql);
        for (int i = 0; i < params.length; i++) {
            query.setParameter(i,params[i]);
        }
        List list = query.list();
        return list;
    }

    @Override
    public CrmCourseType findById(CrmCourseType courseType) {
        Session session = sessionFactory.getCurrentSession();
        CrmCourseType crmCourseType = (CrmCourseType) session.get(CrmCourseType.class, courseType.getCourseTypeId());
        return crmCourseType;
    }

    @Override
    public void saveOrUpdate(CrmCourseType courseType) {
        Session session = sessionFactory.getCurrentSession();
        if(courseType.getCourseTypeId()!=null){
            session.update(courseType);
        }else {
            session.save(courseType);
        }
    }
}
