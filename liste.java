import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class liste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> liste = new ArrayList<String>();
		Scanner scn = new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			System.out.println(i+1+". Elemaný Girin");
			liste.add(scn.next());
			
		}
		

	}

}
