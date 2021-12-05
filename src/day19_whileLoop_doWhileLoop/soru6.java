package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class soru6 {

	public static void main(String[] args) {
		//Soru 6 ) Kullanicidan bir sayi alin
		//ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin

		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bolenlerini bulmak icin pozitif bir tam sayi giriniz: ");
		int sayi = scan.nextInt();
		
		int sayac = 0;
		
		int bolen =1;//loop baslangic degeri
		
		while (bolen<=sayi) {
			if (sayi%bolen==0) {//sayi bolene tam bolunuyorsa//tek bir sart tek bir sonuc
				System.out.print(bolen + " ");
				sayac++;
				
			}
			
			bolen++;
			
		}
		
		
		System.out.println("");
		System.out.println(sayi+ " sayisinin " + sayac + " adet tam boleni vardir");

		
		
		
		
		
	}

}
