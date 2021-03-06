package day33_stringBuilder;

public class C03_Equals {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Jata");
		StringBuilder sb2 = new StringBuilder("Java");

		System.out.println(sb1 == sb2);// false
		System.out.println(sb1.equals(sb2));// false
		//sb'da equals method'u String'deki mantikla calismaz, ++ mantigiyla calisir
		
		
		System.out.println(sb1.compareTo(sb2));//0  veya  "Jata" ve "Java" => -2 verir
		//ilk harflerden baslayarak bire bir StringBuilder'lari karsilastirir
		//eger tum karakterler ayni ise sonuc olarak 0 doner
		//farkli karakter bulursa, ilk yazilan sb, ikinci yazilandan kac onde onu doner
		
		// eger iki sb'nin esit olup olmadigini anlamak istersek
		//if (sb1.compareTo(sb2)==0) ile bakabiliriz
		
		String str = "Java";
		//System.out.println(sb1==str); ==sb ile String'i karsilastiramaz
		System.out.println(sb1.equals(str));//false
		//System.out.println(sb1.compareTo(str)); compare String icin kullanilamaz
		
		//System.out.println(sb1=="Java";);
		System.out.println(sb1.equals("Java"));//false
		//System.out.println(sb1.compareTo("Java"));
		
		
		
		
	}

}
