package week3_2_abstractDemo;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		// customerManager.databaseManager = new OracleDatabaseManager();

		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomer();
	}

}
