import java.util.Random;
import java.util.Scanner;

public class limitbakiye {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random a= new Random();
double bakiye= (double)a.nextInt(400);
double cekilecek=0;
double limit=500;
System.out.println("su anki bakiyeniz" +bakiye);
System.out.print("lutfen cekmek istediginiz miktari giriniz:");
Scanner s=new Scanner(System.in);
cekilecek=s.nextDouble();

if(cekilecek<=bakiye && cekilecek<=limit){
	bakiye=bakiye-cekilecek;
	System.out.println("cekilen para miktari:" +cekilecek);
	System.out.println("kalan bakiyeniz:" +bakiye);
}
//bakiye yüksekse
else{
if(cekilecek>bakiye){
	System.out.println("Bakiyeniz yeterli degildir!");
}
if(cekilecek>limit){
System.out.println("para çekmek icin limit yeterli degildir!");	
	
	
	
}
}

}




	}


