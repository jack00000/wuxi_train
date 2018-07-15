package org.whgc.util;

import java.lang.reflect.Method;

public class MyInnvactionHandler implements java.lang.reflect.InvocationHandler {
    //实现类
    private Object target;
    //通过构造函数传进来 代理与实现关联
    //工厂创建代理类
    public MyInnvactionHandler(Object target) {
        this.target = target;
    }
    public boolean isValidate(String[] roles,String role){
        boolean flag=false;
        return flag;
    }

    //实现代理对象调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        //根据method获得target实现类的method
        Method m1=target.getClass().getDeclaredMethod(method.getName(),method.getParameterTypes());//方法名 参数类型

        //加权限  找方法的注释
        PrivilegeAnnotation privilegeAnnotation=m1.getDeclaredAnnotation(PrivilegeAnnotation.class);

        Session session=SessionFactory.getSession();
        session.beginTransaction();
        result=method.invoke(target,args);

        //为空则不需要权限控制
        //取注释
        if(privilegeAnnotation==null){
            result=method.invoke(target,args);
        }else {
            boolean flag=privilegeAnnotation.isValidate();
            if(!flag){
                result=method.invoke(target,args);
            }else {
                String role=Application.getU().getRole();
                boolean flag1=privilegeAnnotation.isValidate();

                if(flag){
                    result=method.invoke(target,args);

                }else {
                    throw  new MySqlException("权限不够");
                }

            }
        }



        return null;
    }
}
