package org.whgc.servicedao;

import org.whgc.dao.LogStudentDao;
import org.whgc.dao.UserDao;
import org.whgc.factory.LogStudentDaoFactory;
import org.whgc.factory.UserDaoFactory;
import org.whgc.iservce.IRegisterSerivceDao;
import org.whgc.model.LogStudent;
import org.whgc.model.User;
import org.whgc.util.Session;
import org.whgc.factory.SessionFactory;

public class RegisterServiceDao implements IRegisterSerivceDao {
    @Override
    public void RegisterUser(User u, LogStudent logstu) {


        Thread t=new Thread(){
            @Override
            public void run() {
                int i=1;
                while (i<2){
                    Session sessionForUesr=SessionFactory.getSession();
                    Session sessionForLog=SessionFactory.getSession();
                    if(sessionForLog==sessionForUesr){
                        System.out.println("两者的session一样");
                    }else {
                        System.out.println("两者的session不一样");
                    }
                    try{
                        UserDao ud=UserDaoFactory.getUseDao();
                        sessionForUesr=ud.addUser(u);
                        System.out.println("提交user的信息");
                        sessionForUesr.commitTransaction();
                        System.out.println("users表插入成功");
                        System.out.println();

                        LogStudentDao lgstu1=LogStudentDaoFactory.getLogStudentDao();
                        sessionForLog=lgstu1.addLogStudent(logstu);
                        System.out.println("提交log的信息");
                        sessionForLog.commitTransaction();
                        System.out.println("log表插入成功");

                    }catch (Exception e){

                        sessionForLog.rollbackTransaction();
                        sessionForUesr.rollbackTransaction();
                        System.out.println("插入失败，已 回滚");

                    }

                    i+=1;
                }
            }
        };
        t.start();


    }
}
