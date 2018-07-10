package org.whgc.dao;

import org.whgc.idao.IUserDao;
import org.whgc.model.User;
import org.whgc.util.Session;
import org.whgc.factory.SessionFactory;

public class UserDaoProxy implements IUserDao {
	private IUserDao id;

	@Override
	public Session addUser(User user) {
		// TODO Auto-generated method stub
		Session session=SessionFactory.getSession();
		session.beginTransaction();
		id.addUser(user);
		session.commitTransaction();
		return session;
		

	}

}
