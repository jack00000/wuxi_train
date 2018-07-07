package whgc.Factory;

import whgc.DAO.RegisterDao;
import whgc.DAO.StudentDao;
import whgc.DAO.StudentDaoProxy;
import whgc.IDAO.IStudentDao;
import whgc.IServiceDao.IRegisterDao;

public class Factory {
	
	public static  IStudentDao getStudentDaoInstance() {
		
		return new StudentDao();
	}
    public static IStudentDao getStudentDaoProxyInstance() {
    	
    	return new StudentDaoProxy(Factory.getStudentDaoInstance());
    }
    public static IRegisterDao getRegisterInstance(){
		return new RegisterDao();
	}
}
