package org.whgc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Session {
	
	private Connection conn;
	private PreparedStatement state;

	public Session(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public PreparedStatement getPreparedStatement(String sql){
		
		
		try {
			state=conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		
		
		return state;
		
		
		
	}
	public void rollbackTransaction() {
		
		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	
	public void commitTransaction() {
		
		try {
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new MySqlException("commit报错");

		}
		
	}
	
	public void closeSession() {
		
		if(state!=null)
			try {
				state.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			
		}
		
		
	}
	public void beginTransaction() {
		
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			
		}
	}

	public void setState(PreparedStatement state) {
		this.state = state;
	}
}
