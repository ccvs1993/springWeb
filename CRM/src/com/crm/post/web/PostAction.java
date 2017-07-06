package com.crm.post.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.crm.post.domain.CrmPost;
import com.crm.post.service.CrmPostService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import java.io.IOException;
import java.util.List;

/**
 * Created by wangfei on 2017/7/4.
 */
public class PostAction extends ActionSupport implements ModelDriven<CrmPost>{
    private CrmPost post=new CrmPost();
    private CrmPostService postService;

    public void setPostService(CrmPostService postService) {
        this.postService = postService;
    }

    @Override
    public CrmPost getModel() {
        return post;
    }
    //////////////////////////////////////////////////////////

    public String findAllWithDepartment() throws IOException {
        List<CrmPost> posts = postService.findAll(post.getCrmDepartment());
        //转换成JSON对象

        //只保留需要的字段
        SimplePropertyPreFilter filter = new SimplePropertyPreFilter(CrmPost.class, "postName","postId");
        String jsonData= JSON.toJSONString(posts,filter);
        //响应中文乱码
        ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
        ServletActionContext.getResponse().getWriter().print(jsonData);
        return NONE;
    }
}
