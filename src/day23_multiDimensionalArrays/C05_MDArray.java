package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_MDArray {

	public static void main(String[] args) {

		//Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir cumle girin: ");
		String cumle = scan.next();
		
		String kelimeler []= cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));//
		
		System.out.println("Girilen cumlede " + kelimeler.length + " adet kelime var");
		
		
		
	}

}
