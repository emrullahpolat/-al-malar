import java.util.Scanner;

public class asalsayibulma {
	public static Boolean asalsayi(int sayi, int bolen) {
		if (bolen <= 1)
			return true;
		else if (sayi % bolen == 0)
			return false;
		else
			return asalsayi(sayi, bolen - 1);
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("bir sayi giriniz:");
		int sayi = s.nextInt();
		System.out.println(asalsayi(sayi, sayi / 2));

	}

}
