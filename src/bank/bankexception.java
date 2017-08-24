package bank;

public class bankexception extends Exception { //extending Exception class to create user defined exception

	bankexception(String message){
		super(message); //Constructs a new exception with the specified detail message.
	}
}