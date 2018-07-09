import java.util.Random;
import java.util.Scanner;

public class bakiye {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		double bakiye = (double) random.nextInt(2000);
		double cekilecek = 0;
		System.out.println("suanki bakiyeniz:" + bakiye);
		System.out.print("lutfen cekmek istediginiz miktari giriniz:");
		Scanner s = new Scanner(System.in);
		cekilecek = s.nextDouble();
		if (cekilecek < bakiye) {
			bakiye = bakiye - cekilecek;
			System.out.println("cekilecek miktar:" + cekilecek);
			System.out.println("kalan bakiye:" + bakiye);
		} else {
			System.out.println("yeterli bakiyeniz bulunmamaktadýr!");
		}

	}

}
