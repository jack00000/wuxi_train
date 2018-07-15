package org.whgc.dao;

import org.whgc.idao.IUserDao;
import org.whgc.util.PrivilegeAnnotation;

public class UserDao implements IUserDao {
    @Override
    @PrivilegeAnnotation(isValidate = true,roles = {"admin"})
    public void addUser() {
        System.out.println("userdao 's addUser Method is invoked.......");;
    }

    @Override
    @PrivilegeAnnotation(isValidate=true,roles= {"teacher"})
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("userdao 's print Method is invoked.......");;
    }
}
