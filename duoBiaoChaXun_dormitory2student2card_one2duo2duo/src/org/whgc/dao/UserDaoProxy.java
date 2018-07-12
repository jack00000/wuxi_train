package org.whgc.dao;

import org.whgc.idao.IUserDao;
import org.whgc.model.Users;
import org.whgc.util.Session;
import org.whgc.util.SessionFactory;

public class UserDaoProxy implements IUserDao {
	private IUserDao id;

	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		Session session=SessionFactory.getSession();
		session.beginTransaction();
		id.addUser(user);
		session.commitTransaction();
		
		

	}

}
