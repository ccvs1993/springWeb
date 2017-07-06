package com.crm.post.service;

import com.crm.department.domain.CrmDepartment;
import com.crm.post.domain.CrmPost;

import java.util.List;

/**
 * Created by wangfei on 2017/7/4.
 */
public interface CrmPostService {
    public List<CrmPost> findAll(CrmDepartment crmDepartment);
}
