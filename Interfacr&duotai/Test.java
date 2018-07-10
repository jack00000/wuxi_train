package org.whgc.demo;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Shape> stack1=new Stack<Shape>();
		
		Stack<Shape> stack2=new Stack<Shape>();
		
		Shape s1=Factory.getInstance(1);
		Shape s2=Factory.getInstance(1);
		Shape s3=Factory.getInstance(1);
		
		stack1.push(s1);
		stack1.push(s2);
		stack1.push(s3);
		
		draw(stack1);
		Shape sp=stack1.pop();
		stack2.push(sp);
		
		stack1.push(stack2.pop());
		
		draw(stack1);

	}
	
	static void draw(Stack<Shape> stack1) {
		
		
		
	}

}
