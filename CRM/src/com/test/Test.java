package com.test;

import com.domain.User;
import com.service.IUserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by wangfei on 2017/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
    @Autowired
    private IUserService userService;
//    @Autowired
//    private BeanFactory beanFactory;

    @org.junit.Test
    public void test() {

        User user =new User();
        user.setUsername("jack");
        user.setPassword("123123");
        user.setAge(14);
        userService.register(user);
    }
}
