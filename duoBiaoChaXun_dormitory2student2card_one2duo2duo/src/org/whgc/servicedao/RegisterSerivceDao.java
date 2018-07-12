package org.whgc.servicedao;

import org.whgc.dao.LogStudentDao;
import org.whgc.dao.UserDao;
import org.whgc.idao.ILogStudentDao;
import org.whgc.idao.IUserDao;
import org.whgc.iservce.IRegisterSerivceDao;
import org.whgc.model.LogStudent;
import org.whgc.model.Users;
import org.whgc.util.Session;
import org.whgc.util.SessionFactory;

public class RegisterSerivceDao implements IRegisterSerivceDao {
	
	
 private IUserDao id=new UserDao();
 
 
 private ILogStudentDao ilsd=new LogStudentDao();
 
	@Override
	public void RegisterUser(Users u) {
		// TODO Auto-generated method stub
		//µÚÒ»¸ö£ºuserdao  adduser
		//       logstudentdao  addLog
		Session session=SessionFactory.getSession();
		
		try{
			session.beginTransaction();
		
		id.addUser(u);
		//int aq=2/0;
		
		ilsd.addLogStudent(new LogStudent("zhangsan","×¢²á"));
		//dao1
		//dao2
		
		session.commitTransaction();}
		catch(Exception e) {
			session.rollbackTransaction();
			
		}
		finally {
			session.closeSession();
			
		}
		

	}

}
