package com.service;

import com.dao.IUserDao;
import com.domain.User;

/**
 * Created by wangfei on 2017/6/28.
 */
public class UserServiceImpl implements IUserService{

    private IUserDao dao;

    public void setDao(IUserDao dao) {
        this.dao = dao;
    }

    @Override
    public void register(User user) {
        dao.Save(user);
    }
}
