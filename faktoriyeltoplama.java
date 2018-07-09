import java.util.Scanner;

public class faktoriyeltoplama {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int x = s.nextInt();
		int y[] = new int[x];
		int toplam = 0;
		for (int i = 1; i <= x; i++) {
			y[i - 1] = faktoriyel(i);
			toplam += y[i - 1];
		}
		for (int i = 1; i <= x; i++) {
			System.out.println(i + "! = " + y[i - 1]);
		}
		System.out.println("sayilarin toplami:" + toplam);
	}

	public static int faktoriyel(int a) {
		int f = 1;
		for (int i = 1; i <= a; i++) {
			f = f * i;
		}
		return f;
	}

}
