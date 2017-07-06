package com.crm.post.dao;

import com.crm.department.domain.CrmDepartment;
import com.crm.post.domain.CrmPost;

import java.util.List;

/**
 * Created by wangfei on 2017/7/4.
 */
public interface CrmPostDao {
    public List<CrmPost> findAll(CrmDepartment crmDepartment);
}
