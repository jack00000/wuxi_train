package org.whgc.factory;

import org.whgc.servicedao.RegisterServiceDao;

public class RegiterDaoFactory {
    public static RegisterServiceDao getRegisterServiceInstance(){
        return  new RegisterServiceDao();
    }
}
