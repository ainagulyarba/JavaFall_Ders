package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {

		// kullanicidan isim ve soyisim isteyin
		// iki farkli method olusturun,
		// methodlardan biri girilen kelimeleri birlestirsin(concat)
		// ilk harf buyuk digerleri kucuk olacak sekilde birlestirsin
		// ikinci method isim ve soyisismin ilk harfleri buyuk harf,
		// kalan harfler * olacak sekilde birlestirsin
		// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
		// ve programin kalan kisminda isim ve soyisim kullanicinin istedigi sekilde
		// kullanin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen isminizi ve soyisminizi girin\nisimden sonra enter'a basin");

		String isim = scan.next();
		String soyisim = scan.next();

		System.out.println("isminizin acik sekilde yazilmasini istiyorsanis 1"
				+ "\nilk harf haric gizli yazilmasini istiyorsaniz 2 basin");
		int tercih = scan.nextInt();
		//bu satira kadar kullanicidan ismini,soyismini ve tercihini aldim
		
		String birlesmisIsim = null;// Emrah Saglam, E**** S*****

		if (tercih == 1) {
			birlesmisIsim = acikIsim(isim, soyisim);
		} else if (tercih == 2) {
			birlesmisIsim = isimGizle(isim, soyisim);
		} else {
			System.out.println("Lutfen 1 veya 2 secin");
		}

		// bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli
		// olarak kaydedildi
		System.out.println("kullanicin tercihi: " + birlesmisIsim);
	
		scan.close();
	}

	public static String isimGizle(String isim, String soyisim) {

		isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replace("\\w", "*");
		soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replace("\\w", "*");
		return isim + " " + soyisim;
	}

	public static String acikIsim(String isim, String soyisim) {

		isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		return isim + " " + soyisim;

	}

}
