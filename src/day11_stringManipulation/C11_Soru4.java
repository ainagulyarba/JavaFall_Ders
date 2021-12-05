package day11_stringManipulation;

import java.util.Scanner;

public class C11_Soru4 {

	public static void main(String[] args) {
	// Kullanicidan email adresini girmesini isteyin, 
	// mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
	// @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ , 
	// @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir mail adresi giriniz");

		String email = scan.nextLine();
		int uzunluk = email.length();
		int index = email.lastIndexOf("@gmail.com");

		if (!email.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresi giriniz");

		} else if (index == uzunluk-10) {
			System.out.println("Email adresiniz kaydedildi");
		
		} else {
			System.out.println("Lutfen yazimi kontol edin");
		
		}
	}

}
