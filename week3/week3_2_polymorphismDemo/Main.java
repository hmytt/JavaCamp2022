package week3_2_polymorphismDemo;

public class Main {

	public static void main(String[] args) {

		// Loglama yöntemi

//		BaseLogger[] loggers= new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};

//			for (BaseLogger logger : loggers) {
//			logger.Log("Log mesajı ");
//			}

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());

		// CustomerManager customerManager = new CustomerManager(new EmailLogger());

		customerManager.add();

	}

}
