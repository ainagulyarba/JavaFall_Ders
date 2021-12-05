package ainagulOdev1;

import java.util.Scanner;

public class NestedTernary {

	public static void main(String[] args) {
		// Soru1-	
		// (y>5) ? (y<10 ? 2*y :3*y) : (y>10 ? 2+y : 3+y) ;

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sayi giriniz");
		int y = scan.nextInt();
		
		System.out.println((y>5) ? (y<10 ? 2*y :3*y) : (y>10 ? 2+y : 3+y)); 
		
	}

}
