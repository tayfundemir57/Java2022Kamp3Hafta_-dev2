package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) // Product Validatordaki sorgulamayı static olarak yaptığımız için new'lemeden direk class ismiyle metoda ulaştık.
		{
			System.out.println("Eklendi.");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		
		ProductValidator productValidator = new ProductValidator(); // Product Validatordaki birşey metodunu static yapmadık bu nedenle Product Validatoru new'lememiz gerekmektedir.
		
		productValidator.birsey();
	}
}

