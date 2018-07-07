class Demo
{
 
	public static void main(String args[]){
	int id1=1;
	String name1="wl";
	int age1=23;
//封装
   Student s=new Student(id1,name1,age1);
  s=null;
   System.out.println(s.id);
   int age=s.getVirtualAge();
   System.out.println(age);

   //---------------
   Jx jx=new Jx(30,40);
	

	
	}
}

class Animal
{
}

class Student
{
//属性
int id;
String name;
int age;
//构造函数
public Student(int id1,String name1,int age1){

	id=id1;
	name=name1;
	age=age1;

}
//方法
int getVirtualAge(){
return age+1;
}

}


class Jx
{
//属性
int a;
int b;
//不写的话 给自动给一个不带参数的构造方法
Jx(int a1,int b1){
a=a1;
b=b1;
}

}

//分析的方法1 分析一句话里面的名词性的----class
//   2 分析class的属性//
  //4分析动词---是class里面的方法
  //分析类和类之间的关系 ---关联  依赖