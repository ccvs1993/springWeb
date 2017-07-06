package com.crm.post.dao;

import com.crm.department.domain.CrmDepartment;
import com.crm.post.domain.CrmPost;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by wangfei on 2017/7/4.
 */
public class CrmPostDaoImpl implements CrmPostDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<CrmPost> findAll(CrmDepartment crmDepartment) {
        Session session = sessionFactory.getCurrentSession();
        List<CrmPost> list = session.createQuery("select p from CrmPost p where crmDepartment=?").setParameter(0,crmDepartment).list();
        return list;
    }
}
