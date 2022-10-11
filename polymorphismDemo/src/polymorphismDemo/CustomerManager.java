package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	// metotlar küçük harfle başlar. (add)
	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log("Log mesajı");
	}
	
	
}
