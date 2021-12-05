package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list ya da Array olusturalim, sonra list elemanlarini degistir method'u yazip
		//orada list elemanlarindan bazilarini degistirelim
		//method void olsun
		//main method'a dondukten sonra yeniden list'i yazdiralim
		
		
		List <String> harfler = new ArrayList<>();
		
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		// Java da List ve Array gibi objeler icinde Pass By Value gecerlidir
		// yani farkli bir Method'ta Array veya List'e yeni deger atamasi yaparsaniz
		//orijinal Array veya List degismez
		
		
		listElemanlarDegistir(harfler);
		
		System.out.println("Main method'a donunce list "+ harfler);//2 => Main method'a donunce list [A, B, C]
		
		listDegistir(harfler);// method'ta yeni deger atadigim halde harfler listesi degismedi
		
		System.out.println("List'e yeni list atadiktan sonra main method'a donunce list: "+harfler);// 4=>  [D, B, C]
		
	
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		harfler = new ArrayList<>();
		System.out.println("List'e yeni deger atayinca: "+harfler);//1 =>  []
		
	}

	private static void listDegistir(List<String> harfler) {
		
		harfler.set(0, "D");
		System.out.println("method'ta degistirdigimiz list "+harfler);// 3=>  [D, B, C]
		
	}

}
