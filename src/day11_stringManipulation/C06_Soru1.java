 package day11_stringManipulation;

import java.util.Scanner;

public class C06_Soru1 {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin,
		// harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle = scan.nextLine();
		System.out.println("lutfen varligini kontrol etmek icin bir harf giriniz");
		
		char krk=scan.next().charAt(0);
		
		int index=cumle.indexOf(krk);//girilen karakterin cumledeki index'ini verir
		
		if (index==(-1)) {
			System.out.println("girdiginiz harf verilen cumlede yok");
		}	else {
			System.out.println("girdiginiz harf verilen cumlede var");
		}
				
		
	}

}
