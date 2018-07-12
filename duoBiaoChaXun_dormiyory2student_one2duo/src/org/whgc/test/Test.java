package org.whgc.test;

import org.whgc.factory.Factory;
import org.whgc.idao.IDormitryDao;
import org.whgc.model.Dormitory;
import org.whgc.model.Student;
import org.whgc.util.Session;
import org.whgc.util.SessionFactory;

import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Session session=SessionFactory.getSession();
		Session session1=SessionFactory.getSession();
		System.out.println(session==session1);*/
		
		//Thread thread=Thread.currentThread();
		//System.out.println(thread.getName());;
		
		//MyThread mt=new MyThread();
		//mt.start();


		IDormitryDao iDormitryDao=Factory.getDormitryDaoInstance();
		Dormitory dormitory =iDormitryDao.getDormitryById("A001");
		Set<Student> stu= dormitory.getStus();
		Iterator<Student> iterator=stu.iterator();
		while (iterator.hasNext()){

			Student student=iterator.next();
			System.out.println("学生id"+student.getStuid() +"\n" +"学生名字"+student.getStuname());
			System.out.println("学生宿舍id"+student.getDorm().getDormitryid() +"学生宿舍类型"+student.getDorm().getDromitrytype());

		}

	}

}

