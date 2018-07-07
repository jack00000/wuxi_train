package whgc.IDAO;

import whgc.model.Student;

import java.util.List;



public interface IStudentDao {
	
	Student getStudentById(int id);
	void addStudent(Student s);
	void delStudentById(Student s);
	void updateStudent(Student s);
	List<Student> findStudentBySurname(String surname);
	public List<Student> findStudentByAges(int start, int end);
	
	public List<Student> getALLStudents();
	
	public List<Student> getAllStudentOrderByAge();
	public abstract List<Student> getList();

}
