package org.whgc.test;

import org.whgc.factory.RegiterDaoFactory;
import org.whgc.iservce.IRegisterSerivceDao;
import org.whgc.model.LogStudent;
import org.whgc.model.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IRegisterSerivceDao iRDao=RegiterDaoFactory.getRegisterServiceInstance();
		User uesr=new User(2,"002","wangshicong",28,"china");
		LogStudent logstu=new LogStudent(1,"wangshicong","add");
		iRDao.RegisterUser(uesr,logstu);

		
		//Thread thread=Thread.currentThread();
		//System.out.println(thread.getName());;
		
		//MyThread mt=new MyThread();
		//mt.start();

		
		
		

	}

}

