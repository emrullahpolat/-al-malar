public class cumleyitersyazma {
	public static String harfleritersleme(String cumle) {
		String sonuc = "";
		for (int i = cumle.length(); i > 0; i--) {
			sonuc = sonuc + cumle.charAt(i - 1);

		}

		return sonuc;
	}

	public static int kelimesayma(String cumle) {
		int sonuc = 0;
		char[] ayrac = { ' ', ',', ';', '.', ':', '!', '?' };
		for (int i = 0; i < cumle.length(); i++) {
			for (int j = 0; j < ayrac.length; j++) {
				if (ayrac[j] == cumle.charAt(i)) {
					sonuc++;
				}
			}

		}

		return sonuc;
	}

}
