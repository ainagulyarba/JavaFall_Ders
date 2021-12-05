package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C05_PassByValueArray {

	public static void main(String[] args) {
		
		int sayilar []= {3,4,5,6};
		
	
	arrayDegistir(sayilar);
	System.out.println("array'i degistir method'undan sonra : "+ Arrays.toString(sayilar));// 2=> [3, 4, 5, 6]
	
	elemanDegistir(sayilar);
	System.out.println("eleman degistir method'undan sonra: "+Arrays.toString(sayilar));// 4=> [10, 4, 5, 6]
	
	
	}

	private static void arrayDegistir(int[] sayilar) {
		sayilar= new int [6];// 1=> [0, 0, 0, 0, 0, 0]
		
		System.out.println("array'i degistir method'unda : "+ Arrays.toString(sayilar));
	}

	private static void elemanDegistir(int[] sayilar) {
		sayilar [0]=10;
		System.out.println("eleman degistir method'unda: "+Arrays.toString(sayilar));// 3=> [10, 4, 5, 6]
		
	}

}
