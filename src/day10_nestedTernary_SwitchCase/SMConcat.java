package day10_nestedTernary_SwitchCase;

public class SMConcat {

	public static void main(String[] args) {
		// String olarak verilen bir degisken + ile baska bir degiskenle isleme sokulursa
		// Java bunlari yan yana ekler. buna cancatenation denir
		
		String isim = "Ali";
		String soyisim = "Can";
		
		System.out.println(isim + "" + soyisim); // Ali Can
		
		// ayni islemi + sembolu yerine concat() ile de yapabiliriz
		
		System.out.println(isim.concat(soyisim));
		
		System.out.println(isim.concat(" ").concat(soyisim)); // Ali Can
 
	}

}
