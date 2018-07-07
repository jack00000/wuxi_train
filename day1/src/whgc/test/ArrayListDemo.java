package whgc.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import whgc.model.Student;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����С�ǲ��ܸ��ĵ�
		//List ---vector
		//ArrayList
		List<Student> list=new ArrayList<Student>();
		
		Student s1=new Student(1,"ls",30);
		
		Student s2=new Student(2,"ww",40);
		list.add(s1);
		list.add(s2);
		list.remove(0);
		//-----------------------
		//list.get(0);
		for(int i=0;i<list.size();i++) {
			
			Student ss=list.get(i);
			System.out.println(ss.getName());;
			
		}
		
		for(Student s:list) {
			
			System.out.println(s.getId());
		}
		
		Iterator<Student> ite=list.iterator();
		while(ite.hasNext()) {
			
			Student s=ite.next();
			
		}
		
		
		
		
		
		
//list.get
	}

}
