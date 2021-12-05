package day17_forLoop;

import java.util.Scanner;

public class C07_NestedForLoop {

	public static void main(String[] args) {
		// 1'den 4'de kadar sayilari yan yana aralarinda 
		// bir bosluk birakarak yazdirin

		//soru13) 
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin: ");
		int sayi = scan.nextInt();
		for (int satir = 1; satir <= sayi; satir++) {
			for (int i = 1; i <= sayi; i++) {
				System.out.print(satir*i + " ");

			}
			
			System.out.println("");

		}

	}

}
