package day22_Arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
	
		//"Java ogrenmek cok guzel"
		//cumlesinin kelimelerini ters sirada yazdirin
		String str = "Java ogrenmek cok guzel";
		
		String arr1[]=str.split(",");
		System.out.println(Arrays.toString(arr1));//[Java ogrenmek cok guzel]
		
		String arr2[]=str.split(" ");
		System.out.println(Arrays.toString(arr2));//[Java, ogrenmek, cok, guzel]
		
		String arr3[]=str.split("");
		System.out.println(Arrays.toString(arr3));//[J, a, v, a,  , o, g, r, e, n, m, e, k,  , c, o, k,  , g, u, z, e, l]
		
		String arr4[]=str.split("\\s");
		System.out.println(Arrays.toString(arr4));//[Java, ogrenmek, cok, guzel]
		
		
		String cumle= "Java ogrenmek cok guzel";
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));//[Java, ogrenmek, cok, guzel]
		
		for (int i = kelimeler.length-1; i >=0; i--) {
			
			System.out.print(kelimeler[i]+" "); //guzel cok ogrenmek Java
			
			
			
			
			
		}
		
		
		
		
		
		

	}

}
