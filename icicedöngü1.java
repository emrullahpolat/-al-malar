import java.util.Scanner;
public class icicedöngü1 {
public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.print("bir sayi giriniz");
	int sayi=s.nextInt();
	if(sayi>=1){
		for(int i=0;i<sayi;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
	}
	
	
	
}
}
