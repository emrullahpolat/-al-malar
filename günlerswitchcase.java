import java.util.Scanner;
public class g�nlerswitchcase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int gun;
System.out.print("lutfen gun degerini sayi olarak giriniz" + "(1-7) araliginda giriniz:");
Scanner s=new Scanner(System.in);
gun=s.nextInt();
switch(gun){
case 1:
	System.out.println("girdiginiz gun pazartesidir.");
	break;
case 2:
	System.out.println("girdiginiz gun salidir.");
	break;
case 3:
	System.out.println("girdiginiz gun carsambad�r.");
	break;
case 4:
	System.out.println("girdiginiz gun persembedir.");
	break;
case 5:
	System.out.println("girdiginiz gun cumadir.");
	break;
case 6:
	System.out.println("girdiginiz gun cumartesidir.");
	break;
case 7:
	System.out.println("girdiginiz gun pazardir.");
	break;


}
	}

}
