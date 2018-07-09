public class prizmalanlari {
	public static int karePrizmaHacim(int kenar) {
		int sonuc = 0;
		sonuc = kenar * kenar * kenar;
		return sonuc;
	}

	public static int karePrizmaAlan(int kenar, int h) {
		int sonuc = 0;
		sonuc = kenar * kenar * h;
		return sonuc;
	}

	public static int kureHacim(int yaricap) {
		int pi = 3;
		int sonuc = 0;
		sonuc = 4 / 3 * pi * yaricap * yaricap * yaricap;
		return sonuc;
	}

	public static int kureAlan(int yaricap) {
		int pi = 3;
		int sonuc = 0;
		sonuc = pi * 4 * yaricap * yaricap;
		return sonuc;
	}

	public static double uzaklik(double x1, double y1, double x2, double y2) {
		double sonuc = 0;

		sonuc = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

		return sonuc;
	}

}
