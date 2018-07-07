package whgc.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import whgc.DAO.StudentDao;
import whgc.Factory.Factory;
import whgc.IDAO.IStudentDao;
import whgc.IServiceDao.IRegisterDao;
import whgc.model.Student;
import whgc.model.User;
import whgc.util.Application;

public class Test {


	public static void main(String[] args) {

		//输出原来学生信息
		System.out.println("输出原来所有学生信息");
		IStudentDao iso=Factory.getStudentDaoInstance();
		List<Student>list=iso.getAllStudentOrderByAge();
		for(Student s:list){
			System.out.println("学生的年龄"+s.getAge()+"  "+"学生的姓名"+s.getName()+" "+"学生id"+s.getId());
		}
        System.out.println();

		System.out.println("请输入用户名和密码以及具有的权限");
		User u=new User();
		Scanner scan=new Scanner(System.in);
		String role=scan.next();
		String password=scan.next();
		String permision=scan.next();
		u.setRole(role);
		u.setPassword(password);
		u.setPremision(permision);

		//相当于把输入数据存在数据库(这里是放在一个类的属性user里面的)
		Application a=new Application();
		a.setUser(u);

		System.out.println("输出Application里的user"+Application.getUser());
		//获取登录接口实例，调用实现类方法
		IRegisterDao ir=Factory.getRegisterInstance();
		if(ir.Register()){
			Student s=new Student(4,"fangjun",21);
			IStudentDao iso1=Factory.getStudentDaoProxyInstance();
			iso1.addStudent(s);


            IStudentDao ios2=Factory.getStudentDaoInstance();
			List<Student>list2= ios2.getList();
			for(Student student:list2){
				System.out.println("学生的年龄"+student.getAge()+"  "+"学生的姓名"+student.getName()+" "+"学生id"+student.getId());
			}



		}else {
			System.out.println("登录失败");
		}






		//




		
		//scan.
		//id.

	}

}

//  S