package week3_2_abstractDemo;

public class CustomerManager {

	BaseDatabaseManager databaseManager;

	public void getCustomer() {
		databaseManager.getData();

		// OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
		// oracleDatabaseManager.getData();
	}
}
