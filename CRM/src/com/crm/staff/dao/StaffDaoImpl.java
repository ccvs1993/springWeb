package com.crm.staff.dao;

import com.crm.staff.domain.CrmStaff;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by wangfei on 2017/7/2.
 */
public class StaffDaoImpl implements StaffDao{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public CrmStaff find(String loginName,String loginPwd) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select s from CrmStaff s where s.loginName=? and s.loginPwd=?")
                .setParameter(0, loginName).setParameter(1, loginPwd);
        CrmStaff staff = (CrmStaff)query.uniqueResult();
        return staff;
    }

    @Override
    public List<CrmStaff> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<CrmStaff> list = session.createQuery("select  s from CrmStaff s").list();
        return list;
    }

    @Override
    public CrmStaff findByID(String staffId) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select s from CrmStaff s where s.staffId=?").setParameter(0, staffId);
        CrmStaff staff = (CrmStaff)query.uniqueResult();
        return staff;
    }

    @Override
    public void saveOrUpdate(CrmStaff crmStaff) {
        Session session = sessionFactory.getCurrentSession();
        if(crmStaff.getStaffId()!=null){
            session.update(crmStaff);
        }else {
            session.save(crmStaff);
        }
    }

}
