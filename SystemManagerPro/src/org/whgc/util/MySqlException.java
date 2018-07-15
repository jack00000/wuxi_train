package org.whgc.util;

public class MySqlException extends RuntimeException {
	//private String message;

	public MySqlException(String message) {
		super(message);
		//this.message = message;
	}

}
