package com.whgc.test;

import com.whgc.model.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class Test {
    public static void main(String args[]){
        Class c1=Student.class;//获得大Class对象
        Student s=new Student(1,"王五");
        Class c2=s.getClass();
        try {
            Class c3=Class.forName("com.whgc.model.Student");
            //大Class可以创建对象
            try {
                Object o=c3.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            //获取其中的method信息
            Method[] methods=c3.getMethods();
            for(Method m1:methods){
                System.out.println(m1.getName());
            }
            //获取其中的成员变量信息
            Field[] fields=c3.getFields();
            for(Field field:fields){
                System.out.println(field.getName());
            }

            //有趣的例子
            //id-----对象   StudentDao 属性cd ----CardDao  文件实现关联
            //文件配置  id=20
            s.setId(20);//不通用

            //通用方法
            //没有出现类
            //依赖注入
            //在堆区中，使用大Class对象通过属性得到方法并运行d
            //特点没有新建类 所有类都可以用
            //换类 改Class.forName("com..........")

            //通过字符串实现方法自动运行
            String fieldname1="id";//在大Class对象通过id找到get set方法 并运行
            String methodname1="set"+fieldname1.substring(0,1).toUpperCase()+fieldname1.substring(1);

            System.out.println(methodname1);
            Method m2=null;
            for(Method m1:methods){
                if(m1.getName().equals(methodname1)){
                    m2=m1;
                    break;
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


/*
/home/fangjun/Downloads/jdk1.8.0_171/bin/java -javaagent:/home/fangjun/Downloads/idea-IU-181.4892.42/lib/idea_rt.jar=46567:/home/fangjun/Downloads/idea-IU-181.4892.42/bin -Dfile.encoding=UTF-8 -classpath /home/fangjun/Downloads/jdk1.8.0_171/jre/lib/charsets.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/deploy.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/ext/cldrdata.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/ext/dnsns.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/ext/jaccess.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/ext/jfxrt.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/ext/localedata.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/ext/nashorn.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/ext/sunec.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/ext/sunjce_provider.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/ext/sunpkcs11.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/ext/zipfs.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/javaws.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/jce.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/jfr.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/jfxswt.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/jsse.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/management-agent.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/plugin.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/resources.jar:/home/fangjun/Downloads/jdk1.8.0_171/jre/lib/rt.jar:/home/fangjun/Desktop/java/lesson10/reflectDemo/out/production/reflectDemo com.whgc.test.Test
        Picked up _JAVA_OPTIONS:   -Dawt.useSystemAAFontSettings=gasp
        java.lang.InstantiationException: com.whgc.model.Student
        setId
        at java.lang.Class.newInstance(Class.java:427)
        getName
        setName
        at com.whgc.test.Test.main(Test.java:19)
        getId
        Caused by: java.lang.NoSuchMethodException: com.whgc.model.Student.<init>()
        wait
        wait
        at java.lang.Class.getConstructor0(Class.java:3082)
        wait
        equals
        at java.lang.Class.newInstance(Class.java:412)
        toString
        ... 1 more
        hashCode
        getClass
        notify
        notifyAll
        setId

        Process finished with exit code 0
*/
