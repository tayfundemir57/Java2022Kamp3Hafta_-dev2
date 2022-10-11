package abstractDemo;import javax.xml.crypto.Data;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new OracleDatabaseManager();
			
		customerManager.getCustomers();;
		
		
	}

}
