import java.util.Scanner;

public class obebbulma {
	public static String obeb(int sayi1, int sayi2, int sayac) {
		if (sayac > sayi1)
			return "";
		else if (sayi1 % sayac == 0 && sayi2 % sayac == 0)
			return sayac + " " + obeb(sayi1, sayi2, sayac + 1);
		else
			return obeb(sayi1, sayi2, sayac + 1);
	}

	public static void main(String args[]) {
		Scanner gir = new Scanner(System.in);
		System.out.println("kucuk sayiyi giriniz:");
		int sayi1 = gir.nextInt();
		System.out.println("buyuk sayiyi  giriniz:");
		int sayi2 = gir.nextInt();
		System.out.println(obeb(sayi1, sayi2, 1));

	}

}
