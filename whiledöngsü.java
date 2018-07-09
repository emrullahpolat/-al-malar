import java.util.Scanner;
public class whiledöngsü {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("bu program girilen sayiya kadar olan degerlerin karesini alir!");
System.out.print("kare alma islemini sonlandirmak istediginiz sayiyi giriniz");
int sayi=s.nextInt();
int sayac=0;

while (sayac<=sayi){
	System.out.println(sayac + "sayinin karesi:" +sayac*sayac);
	sayac++;
}
	}

}
