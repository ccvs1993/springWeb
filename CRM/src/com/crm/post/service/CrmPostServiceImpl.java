package com.crm.post.service;

import com.crm.department.domain.CrmDepartment;
import com.crm.post.dao.CrmPostDao;
import com.crm.post.domain.CrmPost;

import java.util.List;

/**
 * Created by wangfei on 2017/7/4.
 */
public class CrmPostServiceImpl implements CrmPostService{
    private CrmPostDao postDao;

    public void setPostDao(CrmPostDao postDao) {
        this.postDao = postDao;
    }

    @Override
    public List<CrmPost> findAll(CrmDepartment crmDepartment) {
        return postDao.findAll(crmDepartment);
    }
}
