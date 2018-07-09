import java.util.Scanner;

public class fibnacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("bir sayi giriniz:");
		int n = s.nextInt();
		System.out.println("sonuc:" + fib(n));
	}

	public static int fib(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fib(n - 2) + fib(n - 1);
	}

}
