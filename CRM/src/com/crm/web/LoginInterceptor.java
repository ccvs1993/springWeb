package com.crm.web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * Created by wangfei on 2017/7/2.
 */
public class LoginInterceptor extends MethodFilterInterceptor{
    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        Object staff = ActionContext.getContext().getSession().get("loginStaffInSession");
        if(staff==null){
            Object action = invocation.getAction();
            if(action instanceof ActionSupport){
                ActionSupport actionSupport= (ActionSupport) action;
                actionSupport.addFieldError("","请先登录");
            }
            return "login";
        }
        return invocation.invoke();
    }
}
