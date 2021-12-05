package day32_varrags_stringBuilder;

public class C03_Varags {

	public static void main(String[] args) {
		
		
KafanaGoreTopla(5,8,10,13,15,0);

	}

	private static void KafanaGoreTopla(int sayi1, int ...sayilar ) {
		int toplam=0;
		
		for (int each : sayilar) {
	 toplam+=each;
		
	}

	
	System.out.println("ilk sayi ile digerlerinin toplaminin carpim sonucu : " +sayi1 * toplam);
	}

}
