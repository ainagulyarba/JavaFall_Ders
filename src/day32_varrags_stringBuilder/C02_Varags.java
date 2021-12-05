package day32_varrags_stringBuilder;

public class C02_Varags {

	public static void main(String[] args) {

		//Varargs List gibi davranir ama Array method'lariyla calisir
		
		
topla(5,8,10,13,15,0);

	}

	private static void topla(int... sayilar) {

		int toplam=0;
		
		for (int each : sayilar) {
	 toplam+=each;
	 
	
}
	System.out.println("girilen sayilarin toplami : " + toplam);	
	}

}
