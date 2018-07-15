package org.whgc.factory;

import org.whgc.util.MyInnvactionHandler;

import java.lang.reflect.Proxy;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;


public class Factory {
	
	private static Properties   props=new Properties();

	static {
		
		ResourceBundle rb=ResourceBundle.getBundle("factory");
		//rb.
		
	    Enumeration<String> enumers= rb.getKeys();
	    while(enumers.hasMoreElements()) {
	    	
	    	String key=enumers.nextElement();
	    	String value=rb.getString(key);
	    	props.setProperty(key, value);
			System.out.println(key+value);
	    	
	    }
		
		
	}
	
    //dao 提供不带参数的构造方法
	public static Object getInstance(String name) {
		Object object=null;
		String value=props.getProperty(name);
		System.out.println(value);
		try {
			object=Class.forName(value).newInstance();
			System.out.println(object.getClass().getName());
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return object;
		
	}

	//通用事务方法 实现权限控制
	//创建动态代理。创建代理类
	public static Object getProxyInstance(String name){
		Object object=null;
		//创建实现类
		Object target=getInstance(name);
		//定义处理方式：权限控制等
		MyInnvactionHandler handler=new MyInnvactionHandler(target);
		//生产代理类并将实体类对象传给代理类，建立关联，方法属性：类加载器 接口类型  处理方式
		object=java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(),
			target.getClass().getInterfaces(),handler);

		return object;
	}

}
