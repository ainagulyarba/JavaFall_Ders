package day17_forLoop;

import java.util.Scanner;

public class C05_soru10 {

	public static void main(String[] args) {
		//Soru 10 ) Kullanicidan iki sayi isteyin.
		//Girilen sayilar ve aralarindaki tum tamsayilari toplayip, 
		//sonucu yazdiran bir program yaziniz
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen iki sayi girin: ");
	
	int sayi1 = scan.nextInt();
	int sayi2 = scan.nextInt();
	int kucuk = 0;
	int buyuk = 0;
	
	if (sayi1>=sayi2) {
		buyuk=sayi1;
		kucuk=sayi2;
		}else {
			buyuk=sayi2;
			kucuk=sayi1;
		}
	
	int toplam =0;
	
	for (int i = kucuk; i <=buyuk; i++) {
		toplam+=i;
	}
	
	System.out.println("girilen sayilar ve aralarindaki sayilarin toplami: " +toplam);
	scan.close();
	
	}

}
