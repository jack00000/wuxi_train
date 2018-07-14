package com.whgc.test;

import com.whgc.factory.Factory;
import com.whgc.idao.IStudentDao;

public class Tset1 {
    public static void main(String args[]){
        IStudentDao id=(IStudentDao)Factory.getInstance("studentdao");
        id.addStudent();
    }
}
