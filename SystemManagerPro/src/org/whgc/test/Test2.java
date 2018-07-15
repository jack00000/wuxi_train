package org.whgc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.whgc.idao.IUserDao;
import org.whgc.iservicedao.IRegisterServiceDao;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        IUserDao iud=(IUserDao) context.getBean("userdao");
        iud.print();
        //
        IRegisterServiceDao isd=(IRegisterServiceDao)context.getBean("RegisterServiceDao");

        isd.Register();

    }
}
/*
userdao 's print Method is invoked.......
        登录

        Process finished with exit code 0
*/
