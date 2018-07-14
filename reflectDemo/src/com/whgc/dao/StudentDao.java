package com.whgc.dao;

import com.whgc.idao.IStudentDao;
import com.whgc.model.Student;
import com.whgc.util.PrivilegeAnnotation;
//没有注释 权限不控制
public class StudentDao implements IStudentDao {
    @Override

    //类当方法用，方法当属性引用
    @PrivilegeAnnotation(isValidate=true,roles = {"admin","teacher"})
    public void addStudent() {
      System.out.println("addStudent");
    }

    @Override
    public Student getStudentById() {
        return null;
    }
}
