package day08_ifElse_Nested;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		
		// Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		// ve dikdortgenin kare olup olmadigini yazdirin

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dikdortkenin bir kenar uzunlugunu girin");
		double kenar1=scan.nextDouble();
		
		System.out.println("Lutfen dikdortkenin diger kenar uzunlugunu girin");
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen olculer karedir");
			
		}
		
		if (kenar1!=kenar2) {
			System.out.println("girilen dikdortken kare degildir");
		
		} else {
			
			
			}	
		
		}
	}


