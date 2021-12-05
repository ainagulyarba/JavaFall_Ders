package day31_date_time;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {

		LocalTime saat = LocalTime.now();

		System.out.println("baslangic saati "+saat);//21:03:37.860292100
		
		
		int sayi = 10;
		
		for (int i = 0; i < 10000; i++) {
			
			sayi++;
			
			
		}
			// yeni bir obje olusturmadan gordugumuz saat=> bitis saati 21:05:57.382330800 
		
		LocalTime saatBitis = LocalTime.now();
		
		System.out.println("bitis saati "+saatBitis);//bitis saati 21:08:53.684058
		
		//eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak
		//Hem basinda, hem de sonunda LocalTime objesi olusturmaliyiz
		
		double nano1=saat.getNano();
		double nanoBitis = saatBitis.getNano();
		System.out.println("For loop "+ (nanoBitis-nano1)+ " nano saniyede tamamlandi");//For loop 2.69275E7 nano saniyede tamamlandi
		

		
		System.out.println(saat.getMinute());//28
		System.out.println(saat.plusMinutes(10000));//20:10:00.066756200
		
		
		LocalTime yerelSaat = LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat);//23:35:46.401855900
		
		
		
	}

}
