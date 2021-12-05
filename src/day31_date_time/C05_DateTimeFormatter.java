package day31_date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat = LocalDateTime.now();
		System.out.println(tarihSaat);//2021-12-02T21:44:34.421869
		
		//eger tarih veya saati kensi istedigimiz bicimde yazdirmak istersek
		//gun / ay / yil / haftanin gunu   saat:dakika
		
		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd / MMMM / YYYY / EEEE   HH : mm  a");
		System.out.println(duzenle.format(tarihSaat)); //02 / December / 2021 / Thursday   21 : 56  PM
		
		
		/* format olustururken
		GUN
		d: basta 0 varsa onu yazmadan gun numarasi
		dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		DDD: yilin kacinci gunu oldugunu yazar
		E, EE,EEE: gun isminin ilk 3 harfi
		EEEE: gun isminin tamamini 
		
		AY (Ay icin M, dakika icin m kullanilir
		M: basta 0 varsa onu yazmadan ay numarasi
		MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		MMM: Ay isminin ilk 3 harfi
		MMMM: Ay isminin tamami yazar
		
		YIL
		YY: Yilin son iki rakamini
		YYYY: Yilin tamamini yazar
		
		SAAT : (24 saat uzerinden istiyorsak H, 12 saat uzerinden istiyorsak h)
		HH: saatin tamami, tek rakamli saat olursa 02 gibi
		H : tek rakamli saat olursa sadece saati 
		
		a: yazarsak AM veya degerini yazar
		
		*/
		
		
		
		
		

	}

}
