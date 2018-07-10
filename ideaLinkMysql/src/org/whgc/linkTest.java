package org.whgc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class linkTest {
    public static void main(String args[]){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功 ！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/Student?characterEncoding=UTF-8",
                            "root", "linux");
            System.out.println("连接成功，获取连接对象： " + c);
        } catch (SQLException e) {
            e.printStackTrace();
        }






    }
}
