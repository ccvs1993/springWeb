package com.web;

import com.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.IUserService;

/**
 * Created by wangfei on 2017/6/29.
 */
public class RegisterAction extends ActionSupport implements ModelDriven<User>{
    private IUserService userService;

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    private User user =new User();
    @Override
    public User getModel() {
        return user;
    }

    public String register(){
        userService.register(user);
        return SUCCESS;
    }
}
