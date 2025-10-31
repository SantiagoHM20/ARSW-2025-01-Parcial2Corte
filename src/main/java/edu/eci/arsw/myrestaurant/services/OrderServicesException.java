package edu.eci.arsw.myrestaurant.services;


public class OrderServicesException extends Exception {

	private String NO_ORDERS = "No hay ordenes";

	public OrderServicesException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public OrderServicesException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


}
