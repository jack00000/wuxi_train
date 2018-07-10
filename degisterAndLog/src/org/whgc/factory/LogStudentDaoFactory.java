package org.whgc.factory;

import org.whgc.dao.LogStudentDao;

public class LogStudentDaoFactory {
    public static LogStudentDao getLogStudentDao(){
        return new LogStudentDao();
    }
}
