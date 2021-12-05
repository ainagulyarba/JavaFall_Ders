package day14_methodCreations;

public class C01_MathodCreation {

	public static void main(String[] args) {
		// verilen  iki sayinin toplamini ve carpimini yapip yazdiran iki ayri method olusturun
		//method olusturmak icin 3 adim takip edelim
		//1.adim - method call yazalim
		//2.adim - methoda arguman yazacak miyiz
		
		int sayi1=4;
		int sayi2=5;
		
		toplama(sayi1,sayi2); //method call
		carpma(sayi1,sayi2);
		//3.adim - 1; ve 2. adimi aldiktan sonra javadan yardim alip methodu olustururuz
		
	}

	public static void toplama(int sayi1, int sayi2) {
		//4.adim - erisim duzenleyici ve return type'a karar veririz 
		// erisim duzenleyici access modifier: public yaptik
		//return type: bizden sadece yazdirma istedigi icin void kalabilir
		
		System.out.println("sayilarin toplami:"+ (sayi1+sayi2));
	
		
			
	}

	public static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin carpimi: " + (sayi1*sayi2));
		
	}

}
