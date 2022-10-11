
public class CustomerManager {
	// 1.Yöntem
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal= customerDal;
	}
	
	public void add() {
		// iş kodları bu kısıma yazılır.
		
		customerDal.Add();
	}
}
