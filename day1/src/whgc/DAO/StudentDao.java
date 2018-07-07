package whgc.DAO;

import whgc.IDAO.IStudentDao;
import whgc.model.Student;
import whgc.util.StudentComprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class StudentDao implements IStudentDao {
	
	private static List<Student> list=new ArrayList<Student>();
	static {
		list.add(new Student(1,"lisi",24));
		list.add(new Student(2,"lisi",22));
		list.add(new Student(3,"lisi",25));
		
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		
         list.add(s);
	}

	@Override
	public void delStudentById(Student s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Student> findStudentBySurname(String surname) {
		// TODO Auto-generated method stub
		return null;
	}
    
	public List<Student> findStudentByAges(int start,int end){
		List<Student> list=new ArrayList<Student>();
		
		
		//list.su
		
		return list;
		
		
		
	}

	@Override
	public List<Student> getALLStudents() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public List<Student> getAllStudentOrderByAge() {
		// TODO Auto-generated method stub
		
		List<Student> list_age=new ArrayList<Student>();
		list_age.addAll(list);
		
		Collections.sort(list_age, new StudentComprator());
		
		return list_age;
	}
    @Override
	public  List<Student> getList() {
		return list;
	}
}
