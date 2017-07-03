package com.crm.staff.web;

import com.crm.department.domain.CrmDepartment;
import com.crm.department.service.DepartmentService;
import com.crm.staff.domain.CrmStaff;
import com.crm.staff.service.StaffService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wangfei on 2017/7/2.
 */
public class StaffAction extends ActionSupport implements ModelDriven<CrmStaff>{

    private  CrmStaff crmStaff=new CrmStaff();
    @Override
    public CrmStaff getModel() {
        return crmStaff;
    }
    private StaffService staffService;
    public void setStaffService(StaffService staffService) {
        this.staffService = staffService;
    }
    private DepartmentService departmentService;

    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    ////////////////////////////////////////////////////////////


   public String login(){
       CrmStaff staff = staffService.login(crmStaff);
       if(staff!=null){
           ActionContext.getContext().getSession().put("loginStaffInSession",staff);
           return SUCCESS;
       }
       this.addFieldError("","用户名与密码不匹配");
       return LOGIN;
   }

   public String home(){
       return "home";
   }
   //查询所有员工信息
   public String findAll(){
       List<CrmStaff> allStaff = staffService.findAllStaff();
       ActionContext.getContext().put("allStaff",allStaff);
       return "findAll";
   }
   //编辑员工之前查找员工
    public String editUI(){
        CrmStaff findStaff=staffService.findById(crmStaff.getStaffId());
        ActionContext.getContext().getValueStack().push(findStaff);
        //查找部门
        List<CrmDepartment> allDepartment = departmentService.findAll();
        ActionContext.getContext().getValueStack().set("allDepartment",allDepartment);

        return "editUI";
    }
}
