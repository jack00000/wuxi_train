package whgc.DAO;

import whgc.Factory.Factory;
import whgc.IDAO.IStudentDao;
import whgc.IServiceDao.IRegisterDao;
import whgc.model.Student;
import whgc.model.User;
import whgc.util.Application;

public class RegisterDao  implements IRegisterDao {

    @Override
    public Boolean Register() {
        User u = Application.getUser();

        System.out.println("输出Application的user的所有信息: " + u.getRole() + "  " + u.getPassword() + "  " + u.getPremision());


        if (u.getRole().endsWith("admin") && u.getPassword().endsWith("123456")) {
            System.out.println("登录成功");
            System.out.println("你拥有的权限是" + u.getPremision());
            System.out.println("你可以对Student对象进行的操作" + u.getPremision());

            return true;


        } else {
            return false;
        }


    }
}