package org.whgc.model;

import java.util.HashSet;
import java.util.Set;

public class Student {
	
	private String stuid;
	private String stuname;
	private int age;
	private Set<Card> scard=new HashSet<Card>();
    public Student(String stuid, String stuname, int age) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.age = age;
	}

	private Dormitory dorm;
	
	private Card card;
	
	private Set<Subject> subjects =new HashSet<Subject>();
	
	public Student() {
		super();
	}

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dormitory getDorm() {
		return dorm;
	}

	public void setDorm(Dormitory dorm) {
		this.dorm = dorm;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Set<Card> getScard() {
		return scard;
	}

	public void setScard(Set<Card> scard) {
		this.scard = scard;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
}
