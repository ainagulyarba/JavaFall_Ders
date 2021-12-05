package day10_nestedTernary_SwitchCase;

public class SMCharAt {

	public static void main(String[] args) {
		
		//charAt(istenilenIndex) method'u istedigimiz index'teki karakter bize verir
		
		String kurs = "Techproeducation";
		
		System.out.println(kurs.charAt(5)); // r
		
		// index 0'dan baslar
		
		System.out.println(kurs.charAt(15)); // Son harfi verir
		
		System.out.println(kurs.charAt(16)); //hata verir
		
		

	}

}
