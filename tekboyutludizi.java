import java.util.Scanner;
public class tekboyutludizi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int yas[]=new int[3];
String isim []=new String[3];
Scanner s=new Scanner(System.in);

System.out.print("birinci kisinin adini giriniz:");
isim[0]=s.next();
System.out.print("birinci kisinin yasini giriniz:");
yas[0]=s.nextInt();
//ikinci
System.out.print("ikinci kisinin adini giriniz:");
isim[1]=s.next();
System.out.print("ikinci kisinin yasini giriniz:");
yas[1]=s.nextInt();
//ücüncü
System.out.print("ücüncü kisinin adini giriniz:");
isim[2]=s.next();
System.out.print("ücüncü kisinin yasiini giriniz:");
yas[2]=s.nextInt();
System.out.println("birinci kisinin adi:" +isim[0] +",yasi:" +yas[0]);
System.out.println("ikinci kisinin adi:" +isim[1]+ ",yasi:" +yas[1] );
System.out.println("ucuncu kisinin adi:" +isim[2]+ "yasi:" +yas[2]);

	}

}
