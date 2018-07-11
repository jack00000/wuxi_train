package org.whgc.factory;

import org.whgc.dao.UserDao;

public class UserDaoFactory {
    public static UserDao getUseDao(){
        return new UserDao();
    }
}
