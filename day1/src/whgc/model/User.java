package whgc.model;

import whgc.DAO.StudentDao;
import whgc.Factory.Factory;
import whgc.IDAO.IStudentDao;

public  class User {
	
private String role;
private String password;
private String premision;

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

	public String getPremision() {
		return premision;
	}

	public void setPremision(String premision) {
		this.premision = premision;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
