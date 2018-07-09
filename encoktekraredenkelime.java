import java.util.Scanner;

public class encoktekraredenkelime {
	public static int elemanlara(String dizi[], String kelime, int uzunluk) {
		if (uzunluk < 0)
			return 0;
		else if (dizi[uzunluk] == kelime)
			return 1 + elemanlara(dizi, kelime, uzunluk - 1);
		else
			return elemanlara(dizi, kelime, uzunluk - 1);
	}

	public static void main(String[] args) {
		String dizi[] = { "ali", "ali", "ali", "mustafa" };
		String kelime = "ali";
		int uzunluk = dizi.length;
		System.out.println(elemanlara(dizi, kelime, uzunluk - 1));

	}
}
