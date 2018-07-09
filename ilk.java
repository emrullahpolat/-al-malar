import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ilk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sayi1=0;
		
		try {
			sayi1 = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int sayi2=0;
		try {
			sayi2 = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int sonuc = sayi1+sayi2;
		
		System.out.println(sonuc);
	}

}
