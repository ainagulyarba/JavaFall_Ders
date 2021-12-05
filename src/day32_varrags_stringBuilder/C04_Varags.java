package day32_varrags_stringBuilder;

public class C04_Varags {

	public static void main(String[] args) {
	
		// Varags'da hic eleman olmasa da Java itiraz etmez
		//once int olarak tanimlanan sayilari eslestirir
		//kalan tum sayilari Varags'a doldurur
		
		
		KafanaGoreIslem(5,10,13,0);

	}

	private static void KafanaGoreIslem(int sayi1, int sayi2, int sayi3, int sayi4, int... sayilar ) {
		
		int toplam=0;
		
		for (int each : sayilar) {
			toplam+=each;
		
	}
	
	System.out.println("ilk sayi ile digerlerinin toplaminin carpim sonucu : " +sayi1 * toplam);

	
	}
}
