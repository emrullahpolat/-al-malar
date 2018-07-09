import java.util.Scanner;

public class girilensayininbolenleri {
	public static String bolenbul(int sayi, int ustsinir) {
		if (ustsinir >= sayi)
			return "";

		else if (sayi % ustsinir == 0)
			return Integer.toString(ustsinir) + " "
					+ bolenbul(sayi, ustsinir + 1);
		else
			return bolenbul(sayi, ustsinir + 1);
	}

	public static void main(String[] args) {
		Scanner gir = new Scanner(System.in);
		System.out.println("Bolenleri bulunacak sayiyi giriniz:");
		int sayi = gir.nextInt();
		System.out.println(bolenbul(sayi, 1));

	}

}
