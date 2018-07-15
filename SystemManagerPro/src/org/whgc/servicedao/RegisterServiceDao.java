package org.whgc.servicedao;

import org.whgc.dao.UserDao;
import org.whgc.idao.IUserDao;
import org.whgc.iservicedao.IRegisterServiceDao;

public class RegisterServiceDao implements IRegisterServiceDao {
       private IUserDao iud;

    @Override
    public void Register() {
        System.out.println("登录");
    }

    //配置文件的 u 而不是iud  和getU和setU有关
    public IUserDao getU() {
        return iud;
    }

    public void setU(IUserDao u) {
        this.iud = u;
    }
}
