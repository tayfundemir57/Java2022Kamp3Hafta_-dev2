package abstractClasses;

public class Main {

	public static void main(String[] args) {

		/*
		 * WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		 * womanGameCalculator.hesapla(); womanGameCalculator.gameOver();
		 */

		GameCalculator[] gameCalculators = new GameCalculator[] { new ManGameCalculator(), new WomanGameCalculator(),
				new KidsGameCalculator(), new OlderGameCalculator() };

		for (GameCalculator gameCalculator : gameCalculators) {
			gameCalculator.hesapla();
		}

	}

	// Abstract'lar tek başlarına kullanılamazlar. New işlemi yapmak iyi bir durum
	// değildir.
	// Normal classlar gibi new işlemi yapamıyoruz ve zorunlu operasyonlar
	// ekleyebiliyoruz. Yani zorunlu içi doldurulması gereken herkesin ayrı ayrı
	// doldurması gereken
	// operasyonlar doldurabiliyoruz. Base tek başına bir anlam ifade etmiyor,
	// sadece referans tutucu ve kuralları ortaya koyan görevi görmektedir.
}
