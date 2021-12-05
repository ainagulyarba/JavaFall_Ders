package day31_date_time;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {

	public static void main(String[] args) {
		//bir string ve bir int olusturalim
		//bir loop icerisinde bu variable'lari 1000 kere degistirelim
		//ve islem surelerini kiyaslayalim
		
		
		//verilen iki dogum tarihinin hangisinin daha once oldugunu bulunuz
		
		LocalTime saatS = LocalTime.now();

		System.out.println("baslangic saati "+saatS);//21:03:37.860292100
		
		
		String str = "Celil";
		
		for (int i = 0; i < 10000; i++) {
			
			str+=" ";
			
			
		}
			
		
		LocalTime saatBitisS = LocalTime.now();
		System.out.println("bitis saati "+saatBitisS);//bitis saati 21:08:53.684058
		
		
		
		double nanoS=saatS.getNano();
		double nanoBitisS = saatBitisS.getNano();
		System.out.println("String For loop "+ (nanoBitisS-nanoS)+ " nano saniyede tamamlandi");//String For loop 8.57706E7 nano saniyede tamamlandi
		
		double stringSure=nanoBitisS-nanoS;
		double intSure = nanoBitisS-nanoS;

		System.out.println("int String'den  "+ (stringSure-intSure)+ " nano saniyede daha hizli bitirdi");
		
		
		

	}

}
