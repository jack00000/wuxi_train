package whgc.util;

import java.util.Comparator;

import whgc.model.Student;

public class StudentComprator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int result=0;
		
		if(o1.getAge()>o2.getAge()) result=1;
		
		if(o1.getAge()<o2.getAge()) result=-1;
		if(o1.getAge()==o2.getAge()) result=0;
		return result;
	}

}
