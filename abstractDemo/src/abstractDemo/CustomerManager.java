package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager; 
	
	public void getCustomers() {
		databaseManager.getData();
	}
}


// BaseDatabaseManager databaseManager;  Bu işlemi tek bir database veri tabanına bağlı olmamak için yaptık. 

// Alttaki yöntem ile yapsaydık OracleDatabaseManager'e bağımlı olurduk müşteri farklı database istediğinde sorun olurdu.
/*
 * OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
 * OracleDatabaseManager.getData
 */