/**
 * 
 */
package com.cookbook.exception;

/**
 * Exception that will be thrown when there are no results found from the query
 * 
 * @author lokesh
 * 
 */
public class EntityNotfoundException extends Exception {

	private static final long serialVersionUID = -3619151595743966232L;

	/**
	 * Constructor for the exception
	 */
	public EntityNotfoundException() {
		super();
	}

	/**
	 * @param message
	 */
	public EntityNotfoundException(String message) {
		super(message);
	}

	/**
	 * @param throwable
	 */
	public EntityNotfoundException(Throwable throwable) {
		super(throwable);
	}

	/**
	 * @param message
	 * @param throwable
	 */
	public EntityNotfoundException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
