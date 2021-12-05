package day32_varrags_stringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {
		
		
		// Varargs'tan once farkli parametreler kullanilabilir
		// ama Varargs'tan sonra parametre yazilamaz
		// yazarsaniz Java varargs son parametre olmalidir diye sizi uyarur
		// ve CTE verir
		
		
		
		topla(5, 10, 13, 0);

	}

	private static void topla(int... sayilar) {

		int toplam = 0;

		for (int each : sayilar) {
			toplam += each;

		}
		System.out.println("girilen sayilarin toplami : " + toplam);

	}

}
