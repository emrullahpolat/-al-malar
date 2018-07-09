import java.util.Scanner;
public class fordöngüsü3 {
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		System.out.println("kac kisinin bilgisini girmek istiyorsunuz:");
		int sayi=s.nextInt();
		if(sayi<1){
			System.out.println("geçersiz bir sayi girdiniz!");
			return;	
		}
		int yas[] =new int[sayi];
		String isim[]=new String[sayi];
		for(int i=0;i<sayi;i++){
			System.out.println(i+1 +".kisinin adini giriniz");
			isim[i]=s.next();
			System.out.println(i+1 +".kisinin yasini giriniz");
			yas[i]=s.nextInt();
			}
		System.out.println("Girilen degerler");
		for(int i =0;i<sayi;i++){
			System.out.println(i+1 +".kisinin adi:" +isim[i]+",yasi:"+yas[i]);
			
		}
		
	}

}
