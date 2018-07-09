import java.util.Scanner;
public class icicedöngü2 {
public static void main(String[]args){
	System.out.println("bu girilen sayi miktarýnca" 
			+ "baklava deseni yaptýran programdýr.");
	Scanner s=new Scanner(System.in);
	System.out.print("bir sayi giriniz:");
	int sayi=s.nextInt();
	if(sayi>=1){
		for(int i=0;i<sayi;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}for(int i=sayi;i>=0;i--){
			for(int k=0;k<=i;k++){
			System.out.print("*");}
			System.out.println();
		}
		
		
	}
	
	
	
}
}
