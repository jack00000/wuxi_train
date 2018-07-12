package org.whgc.dao;

import org.whgc.idao.IDormitryDao;
import org.whgc.model.Dormitory;
import org.whgc.util.Session;
import org.whgc.util.SessionFactory;

public class DormitryDaoProxy implements IDormitryDao {
	
	private IDormitryDao ido;

	public DormitryDaoProxy(IDormitryDao ido) {
		super();
		this.ido = ido;
	}

	@Override
	public void addDormitry(Dormitory dorm) {
		
		
		// TODO Auto-generated method stub
		Session session=null;
		
		try {
		session=SessionFactory.getSession();
		session.beginTransaction();
		ido.addDormitry(dorm);
		
		session.commitTransaction();
		
		}
		catch(Exception e) {
				//System.out.println(e.getMessage());
			//e.printStackTrace();
			session.rollbackTransaction();
			throw new org.whgc.util.MySqlException("-------------"+e.getMessage());
			
		}
		finally {
			
			session.closeSession();
			
		}
		
	

	}

	@Override
	public Dormitory getDormitryById(String dormid) {
		// TODO Auto-generated method stub
		Dormitory dorm=null;
		Session session=null;
		
		try {
			session=SessionFactory.getSession();
			session.beginTransaction();
			//ido.addDormitry(dorm);
			dorm=ido.getDormitryById(dormid);
			session.commitTransaction();
			
			}
			catch(Exception e) {
					//System.out.println(e.getMessage());
				//e.printStackTrace();
				session.rollbackTransaction();
				throw new org.whgc.util.MySqlException("-------------"+e.getMessage());
				
			}
			finally {
				
				session.closeSession();
				
			}
		
		
		return dorm;
	}

}
