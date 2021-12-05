package day22_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		
		
		String isimler[] = {"Hacer", "Ainagul","Emine", "Murat", "Kutlu"};
		
		// Isimler array'inde Murat ismi var mi?
		//array'de arama yapmadan once siralama yapmaliyiz
		
		Arrays.sort(isimler);
		//arrays Calss'i ile sort yaptigimizda array'imiz kalici olarak degisir
		System.out.println(Arrays.toString(isimler));//[Ainagul, Emine, Hacer, Kutlu, Murat]

		//sort method'u elementleri naturel order'a gore siralar
		
		isimler[4]="Ainagul";
		System.out.println(Arrays.toString(isimler));//[Ainagul, Emine, Hacer, Kutlu, Ainagul]
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));//[Ainagul, Ainagul, Emine, Hacer, Kutlu]
		
		System.out.println(Arrays.binarySearch(isimler, "Murat"));//-6
		System.out.println(Arrays.binarySearch(isimler, "Mehmet"));//-6
		System.out.println(Arrays.binarySearch(isimler, "Tuba"));//-6
		System.out.println(Arrays.binarySearch(isimler, "Kursat"));//-5
		

	}

}
