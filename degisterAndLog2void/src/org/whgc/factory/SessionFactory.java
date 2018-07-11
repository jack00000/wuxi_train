package org.whgc.factory;

import org.whgc.util.Session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SessionFactory {
	private static String url;
	private static String username;
	private static String pw;
	
	private static ThreadLocal<Session> threadloacl=new ThreadLocal<Session>();
	static {
		url="jdbc:mysql://127.0.0.1:3306/Student?characterEncoding=UTF-8";
		username="root";
		pw="linux";
		
	}
	
	
	public static Session getSession() {
		Session session=null;
		session=threadloacl.get();
		if(session==null) {
		session=new Session(SessionFactory.getConnection());
		threadloacl.set(session);
		}
		
		return session;
		
		
		
	}
	
	private static Connection getConnection() {
		
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager
					.getConnection(url,username,pw);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return conn;
		
	}

}
