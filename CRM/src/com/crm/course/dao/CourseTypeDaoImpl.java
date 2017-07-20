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
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery(hql);
        setParameter(query,params);
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
        session.saveOrUpdate(courseType);
    }

    @Override
    public int getTotalRecord(String contidtions, Object[] params) {
        String hql="select count(c) from CrmCourseType c where 1=1 "+contidtions;
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        setParameter(query,params);
        Long result = (Long) query.uniqueResult();
        return result.intValue();

    }

    @Override
    public List<CrmCourseType> findAll(String contidtions, Object[] params, int startIndex, int pageSize) {
        String hql="from CrmCourseType where 1=1 "+contidtions;
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        setParameter(query,params);
        query.setFirstResult(startIndex);
        query.setMaxResults(pageSize);
        return query.list();
    }

    private void setParameter(Query query,Object[] params){
        for (int i = 0; i < params.length; i++) {
            query.setParameter(i,params[i]);
        }
    }
}
