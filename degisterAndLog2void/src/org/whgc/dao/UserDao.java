package org.whgc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.whgc.idao.IUserDao;
import org.whgc.model.User;
import org.whgc.util.MySqlException;
import org.whgc.util.Session;
import org.whgc.factory.SessionFactory;

public class UserDao implements IUserDao {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		Session session = SessionFactory.getSession();

		session.beginTransaction();

		String sql = "insert into users(id,userid,username,age,gj) values(?,?,?,?,?)";
		PreparedStatement state = session.getPreparedStatement(sql);

		try {
			state.setInt(1, user.getId());
			state.setString(2, user.getUserid());
			state.setString(3, user.getUsername());
			state.setInt(4, user.getAge());
			state.setString(5, user.getGj());
			state.executeUpdate();
			session.setState(state);

			//session.commitTransaction();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MySqlException("提交出现异常");
			//session.rollbackTransaction();
		} finally {


			//session.closeSession();

		}


	}

		//Session session1=SessionFactory.getSession();
		//System.out.println(session==session1);;


}
