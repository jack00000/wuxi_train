package org.whgc.dao;

import org.whgc.factory.UserDaoFactory;
import org.whgc.idao.ILogStudentDao;
import org.whgc.model.LogStudent;
import org.whgc.util.MySqlException;
import org.whgc.util.Session;
import org.whgc.factory.SessionFactory;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LogStudentDao implements ILogStudentDao {

	@Override
	public Session addLogStudent(LogStudent log) {
		// TODO Auto-generated method stub
		Session session=SessionFactory.getSession();
		session.beginTransaction();
		String sql="insert into log_student(id,logname,logaction) values(?,?,?)";
		session.getPreparedStatement(sql);
		PreparedStatement state=session.getPreparedStatement(sql);
		try {
			state.setInt(1,log.getId());
			state.setString(2,log.getLogname());
			state.setString(3,log.getLogaction());

			state.executeUpdate();
			session.setState(state);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new MySqlException("log提交失败");
		}
		System.out.println("返回session赋给sessForLog");
        return session;


	}

}
