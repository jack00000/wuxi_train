package org.whgc.test;

import org.whgc.factory.Factory;
import org.whgc.idao.IUserDao;
import org.whgc.model.User;
import org.whgc.util.Application;

public class Test {


    public static void main(String[] args) {
        IUserDao id=(IUserDao)Factory.getProxyInstance("userdao");

        User u=new User("admin");
        Application.setU(u);
        try{
            id.print();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
