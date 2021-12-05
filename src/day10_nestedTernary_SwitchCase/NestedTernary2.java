package day10_nestedTernary_SwitchCase;

public class NestedTernary2 {

	public static void main(String[] args) {
		
	// Soru2 : Kullanicidan bir karakter isteyin
			// kucuk harf ise consola “Kucuk Harf” ,
			// buyuk harfse consola “Buyuk Harf”
			// yoksa “girdiginiz karakter harf degil” yazdirin.
		
		char krk = 'H';
//String sonuc = (krk>='a' && krk<='z') ? "kucuk harf" : (//sart yanlis ise sonuc);
		String sonuc = (krk>='a' && krk<='z') ? "kucuk harf" : 
			((krk>='A' && krk<='Z') ? "buyuk harf" : "girilen karakter harf degil");
			
		
		System.out.println(sonuc);
		
		
		
	}

}
