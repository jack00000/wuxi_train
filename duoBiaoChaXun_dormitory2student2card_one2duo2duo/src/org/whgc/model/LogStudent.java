package org.whgc.model;

public class LogStudent {
private String logname;
private String logaction;
public String getLogname() {
	return logname;
}
public void setLogname(String logname) {
	this.logname = logname;
}
public String getLogaction() {
	return logaction;
}
public void setLogaction(String logaction) {
	this.logaction = logaction;
}
public LogStudent(String logname, String logaction) {
	super();
	this.logname = logname;
	this.logaction = logaction;
}
}
