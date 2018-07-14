package com.whgc.factory;

import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

public class Factory {
    //文件+键值实现通用工厂
    private static Properties props=new Properties();
    static {
        ResourceBundle rb=ResourceBundle.getBundle("factory");

        Enumeration enumeration=rb.getKeys();//类似迭代器
        while (enumeration.hasMoreElements()){
            String key=enumeration.nextElement().toString();
            String value=rb.getString(key);
            props.setProperty(key,value);
        }
    }
    public static Object getInstance(String name){
        Object object=null;

        String value=props.getProperty(name);
        System.out.println(props);
        System.out.println(name);
        try {
            object=Class.forName(value).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return object;
    }
}

  /*  Picked up _JAVA_OPTIONS:   -Dawt.useSystemAAFontSettings=gasp
        {studentdao=com.whgc.dao.StudentDao}
        studentdao
        addStudent

        Process finished with exit code 0
*/