import java.util.Scanner;

public class basitswitchcase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi;
		System.out.print("lutfen bir sayi giriniz");
		Scanner a = new Scanner(System.in);
		sayi = a.nextInt();
		switch (sayi) {
		case 1:
			System.out.println("girdiginiz sayi: 1");
			break;
		case 2:
			System.out.println("girdiginiz sayi: 2");
			break;
		default:
			System.out.println("girdiginiz sayi 1 ve 2 den farkli");

		}
	}

}
