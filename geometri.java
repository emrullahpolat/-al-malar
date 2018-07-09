public class geometri {

	public static double kareAlan(double kenar) {
		double sonuc = 0;
		sonuc = kenar * kenar;
		return sonuc;
	}

	public static double kareCevre(double kenar) {
		double sonuc = 0;
		sonuc = kenar * 4;
		return sonuc;
	}

	public static double diktortgenAlan(double kenar1, double kenar2) {
		double sonuc = 0;
		sonuc = kenar1 * kenar2;

		return sonuc;
	}

	public static double daireAlan(double r) {
		double sonuc = 0;
		sonuc = r * r * 3.14;

		return sonuc;
	}

	public static double diktortgenCevre(double kenar1, double kenar2) {
		double sonuc = 0;
		sonuc = (2 * kenar1) + (2 * kenar2);

		return sonuc;
	}
}
