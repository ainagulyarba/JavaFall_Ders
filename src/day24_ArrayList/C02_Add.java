package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		
		List <String> isimler = new ArrayList<>();
		
		System.out.println("Bos liste:"+ isimler);//Bos liste:[]
		
		isimler.add("Ali");
		
		System.out.println("Bir eleman:"+ isimler);//Bir eleman:[Ali]
		
		isimler.add("Veli");
		
		System.out.println("Iki eleman:"+ isimler);//Iki eleman:[Ali, Veli]
		// add method'u listenin sonuna ekleme yapar
		
		isimler.add("Can");
		
		System.out.println("Uc eleman:"+ isimler);//Uc eleman:[Ali, Veli, Can]
		
		isimler.add(1, "Ayse");
		System.out.println("1.indexe Ayse ekledik:"+ isimler);//1.indexe Ayse ekledik:[Ali, Ayse, Veli, Can]
	
		//isimler.add(5) => deklare ederken belirttigimiz data turu disinda bir data turunden ekleme yapamayiz
		
		List <String> liste2=new ArrayList<>();
		
		liste2.add("Gunter");
		liste2.add("Emrah");
		System.out.println("liste 2:" + liste2);
	
		isimler.addAll(4, liste2);
		System.out.println("sona liste 2 yi ekledik: "+isimler);
	
		isimler.addAll(liste2);
		System.out.println("index olmadan liste 2'yi tekrar ekledik: "+ isimler);
	
		
		System.out.println(isimler.size());
	
	}

}
