package com.whgc.test;

import com.whgc.util.PrivilegeAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.Class.*;

public class Test3 {

    public static void main(String args[]) {
        String role;
        Object o = null;
        try {
            Class c = forName("com.whgc.dao.StudentDao");

            try {
                o = c.newInstance();

                Method[] methods = c.getDeclaredMethods();
                for (Method m1 : methods) {
                    //找有没有带注释的方法
                    PrivilegeAnnotation p = m1.getDeclaredAnnotation(PrivilegeAnnotation.class);
                    if (p != null) {
                        System.out.println(p);
                    } else {
                        try {
                            m1.invoke(o, null);
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        m1.invoke(o,null);
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
  /*  Picked up _JAVA_OPTIONS:   -Dawt.useSystemAAFontSettings=gasp
@com.whgc.util.PrivilegeAnnotation(isValidate=true, roles=[admin, teacher])
addStudent

        Process finished with exit code 0
*/