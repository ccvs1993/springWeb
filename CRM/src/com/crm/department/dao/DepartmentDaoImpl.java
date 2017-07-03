package com.crm.department.dao;

import com.crm.department.domain.CrmDepartment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by wangfei on 2017/7/3.
 */
public class DepartmentDaoImpl implements DepartmentDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<CrmDepartment> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<CrmDepartment> list = session.createQuery("from CrmDepartment").list();
        return list;
    }
}
