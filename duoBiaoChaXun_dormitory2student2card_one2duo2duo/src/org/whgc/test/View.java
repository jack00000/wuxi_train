package org.whgc.test;

import java.util.Iterator;
import java.util.Set;

import org.whgc.factory.Factory;
import org.whgc.idao.IDormitryDao;
import org.whgc.model.Dormitory;
import org.whgc.model.Student;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dormid="A000077";
		String dormtype="���˼�";
		
		Dormitory dorm=new Dormitory(dormid,dormtype);
		
		IDormitryDao ido=Factory.getDormitryDaoProxyInstance();
		
		try{
			
			//ido.addDormitry(dorm);
		Dormitory dorm1=ido.getDormitryById("A1001");
			
			System.out.println(dorm1.getDromitrytype()+"------"+dorm1.getDormitryid());
			Set<Student> stus=dorm1.getStus();
			Iterator<Student> ite=stus.iterator();
			while(ite.hasNext()) {
				
				Student s=ite.next();
				System.out.println(s.getStuname()+"-----------"+s.getStuid());
				
			}
			
			
		}
		catch(Exception e) {
			//e.printStackTrace();
			
			System.out.println("���ݿ��쳣,��͹���Ա��ϵ"+e.getMessage());
			
		}
		
		System.out.println("main������������");;
		

	}

}
