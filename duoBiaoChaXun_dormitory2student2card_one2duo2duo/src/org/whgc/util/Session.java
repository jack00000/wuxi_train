package org.whgc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			throw new MySqlException("SQL�쳣����͹���Ա��ϵ"+e.getMessage());
		}
		
		
		return state;
		
		
		
	}
	public void rollbackTransaction() {
		
		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MySqlException("SQL�쳣����͹���Ա��ϵ"+e.getMessage());
		}
	}
	
	public void commitTransaction() {
		
		try {
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MySqlException("SQL�쳣����͹���Ա��ϵ"+e.getMessage());
		}
		
	}
	
	public void closeSession() {
		
		if(state!=null)
			try {
				state.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new MySqlException("SQL�쳣����͹���Ա��ϵ"+e.getMessage());
			}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new MySqlException("SQL�쳣����͹���Ա��ϵ"+e.getMessage());
			}
			
		}
		
		
	}
	
	public ResultSet getResultSet(String sql){
		ResultSet resultset =null;
		
		 try {
			resultset=getPreparedStatement(sql).getResultSet();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new org.whgc.util.MySqlException(e.getMessage());
		}
		 
		 return resultset;
		
	}
	public void beginTransaction() {
		
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MySqlException("SQL�쳣����͹���Ա��ϵ"+e.getMessage());
			
		}
	}

}
