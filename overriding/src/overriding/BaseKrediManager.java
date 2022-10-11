package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}

//overridable - ezmek / üzeirne yazılır demek. Diğer Manager classlarındaki faiz oranları değiştirmek işlemi bu anlama gelir. 

/*
 * public final class BaseKrediManager { public double hesapla(double tutar) { return
 * tutar * 1.18; } }
 * 
 *    public final class olarak final keywordünü kullanırsak diğer hiçbir class hesapla metodunu ezemez. BaseKrediManagerdeki hesapla metodunu kullanmak zorunda kalır.
 * 
 * 
 */