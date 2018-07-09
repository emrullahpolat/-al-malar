import java.util.Scanner;
import java.util.Random;

public class yaziturafonk {
	public static void main(String args[]) {
		Scanner girdi = new Scanner(System.in);
		System.out.println("tahmin girin:\n1=tura \n2=yazi");
		int secim = girdi.nextInt();
		if (kontrol(secim)) {
			System.out.println("dogru tahmin tebrikler!!");
		} else {
			System.out.println("yanlis tahmin yaptiniz :(");
		}
	}

	public static boolean kontrol(int c) {
		Random rnd = new Random();
		int i = rnd.nextInt(2) + 1;
		System.out.println(i);
		if (i == c)
			return true;
		else
			return false;

	}
}