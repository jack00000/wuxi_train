package org.whgc.model;

import java.util.HashSet;
import java.util.Set;

public class Dormitory {
	private String dormitryid;
	private String dromitrytype;
	private Set<Student> stus=new HashSet<Student>();
	public String getDormitryid() {
		return dormitryid;
	}
	public Set<Student> getStus() {
		return stus;
	}
	public void setStus(Set<Student> stus) {
		this.stus = stus;
	}
	public void setDormitryid(String dormitryid) {
		this.dormitryid = dormitryid;
	}
	public String getDromitrytype() {
		return dromitrytype;
	}
	public void setDromitrytype(String dromitrytype) {
		this.dromitrytype = dromitrytype;
	}
	public Dormitory(String dormitryid, String dromitrytype) {
		super();
		this.dormitryid = dormitryid;
		this.dromitrytype = dromitrytype;
	}
	

}
