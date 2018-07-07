package whgc.DAO;


import whgc.IDAO.IStudentDao;
import whgc.model.Student;
import whgc.model.User;
import whgc.util.Application;

import java.util.List;


public class StudentDaoProxy implements IStudentDao {
	
	private IStudentDao sd;
	

	public StudentDaoProxy(IStudentDao sd) {
		super();
		this.sd = sd;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		//sd.getAllStudentOrderByAge(id);
		return null;
	}

	@Override
	public void addStudent(Student s) {
		/*// TODO Auto-generated method stub
		System.out.println("方法之前");*/
		User u=Application.getUser();
		if(u.getPremision().endsWith("add")){
			List<Student> list4=this.sd.getList();
			list4.add(s);
		}else {
			throw new RuntimeException("add权限不够");
		}







	}

	@Override
	public void delStudentById(Student s) {
		User u=Application.getUser();
		if(u.getPremision().endsWith("delete")){

			System.out.println("已成功删除Student对象");
		}else {
			throw new RuntimeException("delete权限不够");
		}
	}

	@Override
	public void updateStudent(Student s) {
		User u=Application.getUser();
		if(u.getPremision().endsWith("update")){
			sd.updateStudent(s);
			System.out.println("已成功更新Student对象");
		}else {
			throw new RuntimeException("update权限不够");
		}
	}

	@Override
	public List<Student> findStudentBySurname(String surname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findStudentByAges(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getALLStudents() {

		return null;
	}

	@Override
	public List<Student> getAllStudentOrderByAge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getList() {
		return null;
	}
}
