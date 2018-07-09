
public class kelimeprogramý {
	public static int adetbulma(String[] dizi, int uzunluk, char aranilan) {
		if (uzunluk < 0)
			return 0;
		else if (dizi[uzunluk].charAt(0) == aranilan)
			return 1 + adetbulma(dizi, uzunluk - 1, aranilan);
		else
			return adetbulma(dizi, uzunluk - 1, aranilan);
	}

	public static void main(String[] args) {
		String dizi[] = { "ali", "samis", "yunus", "cevdet", "mehmet", "ayse" };
		char aranilan = 'a';
		int uzunluk = dizi.length;
		System.out.println(adetbulma(dizi, uzunluk - 1, aranilan));

	}

}
