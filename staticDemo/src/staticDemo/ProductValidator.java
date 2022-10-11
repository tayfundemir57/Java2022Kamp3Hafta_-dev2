package staticDemo;

public class ProductValidator {
	
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) { // isEmpty değer verilmiş m verilmemiş mi.
			return true;
		}
		else {
			return false;
		}
	}
	
	public void birsey() {
		
	}

	public void birsey() {
		// TODO Auto-generated method stub
		
	}
	
}
//Bir metodu Static yaptığınızda  class ismiyle direk çağırabilirsiniz.