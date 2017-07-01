package com.dao;

import com.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;


/**
 * Created by wangfei on 2017/6/28.
 */
public class UserDaoImpl implements IUserDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void Save(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(user);
    }
}
