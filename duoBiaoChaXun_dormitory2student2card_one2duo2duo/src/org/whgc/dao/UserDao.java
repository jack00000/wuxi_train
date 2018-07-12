package org.whgc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.whgc.idao.IUserDao;
import org.whgc.model.Users;
import org.whgc.util.Session;
import org.whgc.util.SessionFactory;

public class UserDao implements IUserDao {

	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		Session session=SessionFactory.getSession();
		
		session.beginTransaction();
		
		String sql="insert into users(userid,username,age) values(?,?,?)";
		PreparedStatement state=session.getPreparedStatement(sql);
		
		try {
			state.setString(1, user.getUserid());
			state.setString(2, user.getUsername());
			state.setInt(3, user.getAge());
			state.executeUpdate();
			//session.commitTransaction();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//session.rollbackTransaction();
		}
		finally {
			
			//session.closeSession();
			
		}
		
		
		
		
		
		//Session session1=SessionFactory.getSession();
		//System.out.println(session==session1);;
		
		

	}

}
