import java.util.Scanner;
import java.util.Random;

public class sayitahmini {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Random rnd = new Random();
		int sayi = rnd.nextInt(100);
		String burasi;
		System.out.println("1 ile 100 arasýnda sayý tahminini giriniz.");

		while (true) {
			int tahmin = s.nextInt();

			if (sayi > tahmin) {
				System.out.println("tamininizi arttýrýnýz.");
			} else if (sayi < tahmin) {
				System.out.println("tahmininizi azaltiniz.");
			} else {
				System.out.println("sayiyi bildiniz.");
				break;
			}

		}

	}

}
