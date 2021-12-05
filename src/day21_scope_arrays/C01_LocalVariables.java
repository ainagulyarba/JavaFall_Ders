package day21_scope_arrays;

public class C01_LocalVariables {

	String okulIsmi;
	
	
	public static void main(String[] args) {
		//Java da local variable'lara default deger atamasi yapmaz
		//kodlarimizda sorun yasamamak icin
		//olusturdugumuz locak variable'lara uygun bir deger atamamizda fayda var
		
		int sayi=0; // int sayi; dersek java CTE veriyor
		System.out.println(sayi);

		//int sayi;  // bir local'de ayni isimde birden fazla variable olusturulamaz
		//String sayi;  // ona da izin vermez; data type farkli olsa da java buna izin vermez
		//sayi=20  //hangisinin bilemeyiz
		String isim ="Ali";
		
	
	}

	public static void staticMethod() {
	// sayi; 	// bir local'de olusturulan variable (method'larin static olup olmamasina
			//bagli olmaksizin) farkli local'de kullanilamaz
	
	String isim ="Veli";
	
	

	
	}
	
}
