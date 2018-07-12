package org.whgc.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

import org.whgc.idao.IDormitryDao;
import org.whgc.model.Card;
import org.whgc.model.Dormitory;
import org.whgc.model.Student;
import org.whgc.util.Session;
import org.whgc.util.SessionFactory;

public class DormitryDao implements IDormitryDao {

	@Override
	public void addDormitry(Dormitory dorm) {
		// TODO Auto-generated method stub
		 Session session=null;
		 session=SessionFactory.getSession();
		  session.beginTransaction();//begin tran
		 // session.beginTransaction();
		  String sql="insert into dormitry values(?,?)";
		  
		java.sql.PreparedStatement statement=session.getPreparedStatement(sql);
		try {
			statement.setString(1, dorm.getDormitryid());
			statement.setString(2, dorm.getDromitrytype());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new org.whgc.util.MySqlException("sql错误"+e.getMessage());
		}
		
	
		
		  
		
		
		
		

	}

	@Override
	public Dormitory getDormitryById(String dormid) {
		// TODO Auto-generated method stub
		Dormitory dorm=null;
		 Session session=null;
		 session=SessionFactory.getSession();
		  session.beginTransaction();//begin tran
		  // insert update delete 
		  //select count(*)  from table
		  
		  String sql="select * from dormitory where dormitoryid=?";
		  StringBuffer buffer=new StringBuffer();
		  buffer.append("select a.* ,b.*,c.* from dormitory a left join student b ");
		  buffer.append("on a.dormitoryid=b.dormitoryid inner join card c on b.stuid=c.stuid ");
		  buffer.append("where a.dormitoryid=?");
		  
			java.sql.PreparedStatement statement=session.getPreparedStatement(buffer.toString());
			
			try {
				statement.setString(1, dormid);
				java.sql.ResultSet resultSet=statement.executeQuery();
				boolean flag=true;
				 Set<Student> stus=null;
				 Set<Card> scard=null;
				while(resultSet.next()) {

					if(flag) 
						{
							//把dormitory属性赋给dormitory对象
						dorm=new Dormitory(resultSet.getString(1),resultSet.getString(2));
						//获得dormitory对象属性Set<Student> stu容器
						stus=dorm.getStus();
						}
						//向stu容器添加Student对象属性
					 stus.add(new Student(resultSet.getString(3),resultSet.getString(4),resultSet.getInt(5)));
                     //用迭代器取出每一个Student对象并向其属性Set<Card> scard容器添加card的字段信息
					Iterator<Student> iterator=stus.iterator();
					while (iterator.hasNext()){
						Student student=iterator.next();
						scard=student.getScard();

						scard.add(new Card(resultSet.getString(7),resultSet.getString(8),resultSet.getInt(9)));
						student.setScard(scard);
						//把Student对象放入dormitory对象的属性Set<Student>容器中
						dorm.getStus().add(student);
					}

					dorm.setStus(stus);
					flag=false;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new org.whgc.util.MySqlException("sql错误"+e.getMessage());
			}
			
		 // java.sql.ResultSet result=session.getResultSet(sql)
		
		return dorm;
	}

}
