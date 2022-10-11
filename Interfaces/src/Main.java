
public class Main {

	public static void main(String[] args) {
		
	CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal()); // Polymorphism ve interface kullanımı
	
	customerManager.add();
		
	}

}

// Class'larda tüm operasyonların tamamlanması gerekiyordu yani metotların içerinin doldurulması gerekmekteydi.
// Abstract'larda kimisi dolu olabilirdi kimisi boş olabilirdi ama onu inherit eden içini doldurmak zorundaydı.
// interface'ler temel anlamda tamamlanmamış operasyonlar içermektedir. 
// İnterfaceler'de abstract'lar gibi new işlemi yapılamazlar..

// Bir class birden fazla interface'si implemente edebilir.
