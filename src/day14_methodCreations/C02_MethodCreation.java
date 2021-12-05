package day14_methodCreations;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {

		// Kullanicidan iki sayi isteyin
		// sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
		// kullaniciya us sorun:
		// 2 yazarsa kareleri toplamini yapan method,
		// 3 yazarsa kupler toplamini yapan method calissin
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi girin \nilk sayidan sonra enter tusuna basin");
		
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		System.out.println("girilen kareler toplamini istiyorsaniz 2,\nkupler toplamini istiyorsaniz 3'e basiniz");
		
		int secim = scan.nextInt();
		
		switch(secim) {
		case 2:
			kareToplami(sayi1,sayi2);
		break;
		
		case 3:
			kupToplami(sayi1,sayi2);
			break;
			default:
				System.out.println("Lutfen istenen tercihlerden birini yapin");
		
		}
		/*
        Bir method'u 4 adimda olustururuz
        1- method'u javaya olusturtabilmek icin method call yapiyoruz
        2- arguman ihtiyaci var mi belirleyelim
        3- java'dan yardim alarak method'u olusturalim
        4- axcess modifier ve return type'a karar ver
        bundan sonra method'un yapacagi islevi gerceklestirecek kodlarimizi yazariz
        */
		
	}

	public static void kupToplami(double sayi1, double sayi2) {
		double kupToplami = sayi1*sayi1*sayi1 + sayi2*sayi2*sayi2;
		System.out.println("kuplertoplami: " + kupToplami);
		
	}

	public static void kareToplami(double sayi3, double sayi4) {
		 // bizim arguman isimlerimizle, parametre isimlerimiz ayni olmak zorunda degil
        // java isimlere degil degerlere bakar
        // bu bir zorunluluk degil imkandir, istedigimizi tercih edebiliriz
        
		double kareToplami = sayi3*sayi3 + sayi4*sayi4;
		System.out.println("kareler toplami: " + kareToplami);
	}

}
