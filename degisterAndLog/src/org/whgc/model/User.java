package org.whgc.model;

public class User {
	private int id;
	private String userid;
	private String username;
	private int age;
	private String gj;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public User(int id, String userid, String username, int age, String gj) {
		this.id = id;
		this.userid = userid;
		this.username = username;
		this.age = age;
		this.gj = gj;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGj() {
		return gj;
	}
	public void setGj(String gj) {
		this.gj = gj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
