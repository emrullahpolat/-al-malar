public class stringfonksiyonlar {

	public static boolean kelimeBul(String cumle, String kelime) {
		boolean sonuc = false;
		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.contains(kelime)) {
				sonuc = true;
			}

		}
		return sonuc;
	}

	public static int kelimeSay(String cumle, char harf) {
		int sonuc = 0;
		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.charAt(i) == harf) {
				sonuc = sonuc + 1;
			}

		}

		return sonuc;
	}

	public static int sesliHarfler(String cumle) {
		int sonuc = 0;
		char[] sesliHarfler = { 'a', 'e', 'i', 'ý', 'o', 'ö', 'ü', 'u' };
		for (int i = 0; i < cumle.length(); i++) {
			for (int j = 0; j < sesliHarfler.length; j++) {
				if (cumle.charAt(i) == sesliHarfler[j]) {
					sonuc = sonuc + 1;
				}
			}

		}

		return sonuc;
	}

	public static int sessizHarfler(String cumle) {
		int sonuc = 0;
		sonuc = cumle.length() - sesliHarfler(cumle);

		return sonuc;
	}

}
