package org.whgc.test;

import org.whgc.factory.Factory;
import org.whgc.idao.IDormitryDao;
import org.whgc.model.Card;
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
		System.out.println("寝室id"+dormitory.getDormitryid()+"寝室类型"+dormitory.getDromitrytype());
		Set<Student> stu= dormitory.getStus();

		Iterator<Student> iterator=stu.iterator();
		while (iterator.hasNext()){

			Student student=iterator.next();
			System.out.println("寝室"+dormitory.getDormitryid()+"的"+"学生id"+student.getStuid() +"学生名字"+student.getStuname()+"学生年龄"+student.getAge());
			//获得该学生对象的Set<Card>容器
			Set<Card> scard=student.getScard();
			Iterator<Card> iterator1=scard.iterator();
			while (iterator1.hasNext()){

				Card card=iterator1.next();
				System.out.println("学生"+student.getStuname()+"的"+"卡id"+card.getCardid()+"卡类型"+card.getCardtype()+"卡的钱"+card.getMoney());
			}



		}

	}

}

