package day05_matematikselIslemler_Modulus;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		
		// kullanicidan 4 basamakli bir sayi alip
		// rakamlar toplamioni yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();//1234
		
		int rakamlarToplami=0;
		int rakam=sayi%10; 
		rakamlarToplami+=rakam;
		sayi/=10;
		
		// bu islemi basamak sayisi kadar tekrar edersek 
		// rakamlar toplamini buluruz
		
		
		rakam=sayi%10; 
		rakamlarToplami+=rakam;
		sayi/=10;
		
		
		rakam=sayi%10; 
		rakamlarToplami+=rakam;
		sayi/=10;
		
		
		rakam=sayi%10; 
		rakamlarToplami+=rakam;
		sayi/=10;
		
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		

		
		
		
	}

}
