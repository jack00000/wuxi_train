package org.whgc.test;

import org.whgc.factory.Factory;
import org.whgc.iservicedao.IRegisterServiceDao;
import org.whgc.model.User;
import org.whgc.util.Application;

public class Test3 {
    public static void main(String[] args) {
        User u=new User("admin");
        Application.setU(u);
        IRegisterServiceDao ird=(IRegisterServiceDao)Factory.getProxyInstance("RegisterServiceDao");
        ird.Register();

    }
    }

