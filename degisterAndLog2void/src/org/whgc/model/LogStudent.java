package org.whgc.model;

public class LogStudent {
	private int id;
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

	public LogStudent(int id, String logname, String logaction) {
		this.id = id;
		this.logname = logname;
		this.logaction = logaction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
