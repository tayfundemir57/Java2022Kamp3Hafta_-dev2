
public class MySqlCustomerDal implements ICustomerDal, IRepository{// Dal ifadesinin anlamı Data Access Layer ( Veri erişim katmanı )demektir.

	@Override
	public void Add() {
		System.out.println("My sql eklendi");
		
	} 

}
