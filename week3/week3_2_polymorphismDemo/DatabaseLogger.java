package week3_2_polymorphismDemo;

public class DatabaseLogger extends BaseLogger {

	public void log(String message) {

		System.out.println("Logged to database: " + message);
	}
}
