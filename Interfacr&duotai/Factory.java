package org.whgc.demo;

public class Factory {
	
	public static Shape getInstance(int id) {
		Shape shape=null;
		if(id==1) shape=new Circle();
		
		if(id==2) shape=new Oval();
		if(id==3) shape=new Retangle();
		
		return shape;
		
		
	}

}
