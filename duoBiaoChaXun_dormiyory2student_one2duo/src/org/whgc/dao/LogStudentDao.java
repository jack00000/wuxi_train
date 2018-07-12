package org.whgc.dao;

import org.whgc.idao.ILogStudentDao;
import org.whgc.model.LogStudent;
import org.whgc.util.Session;
import org.whgc.util.SessionFactory;

public class LogStudentDao implements ILogStudentDao {

	@Override
	public void addLogStudent(LogStudent log) {
		// TODO Auto-generated method stub
		Session session=SessionFactory.getSession();

	}

}
