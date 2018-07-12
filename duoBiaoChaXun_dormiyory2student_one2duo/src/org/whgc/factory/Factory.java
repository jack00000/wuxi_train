package org.whgc.factory;

import org.whgc.dao.DormitryDao;
import org.whgc.dao.DormitryDaoProxy;
import org.whgc.idao.IDormitryDao;

public class Factory {
	
	
	public static IDormitryDao getDormitryDaoInstance() {
		
		
		return new DormitryDao();
	}

	public static IDormitryDao getDormitryDaoProxyInstance() {
		
		return new DormitryDaoProxy(Factory.getDormitryDaoInstance());
		
	}
}
