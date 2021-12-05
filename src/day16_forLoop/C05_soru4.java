package day16_forLoop;

import java.util.Scanner;

public class C05_soru4 {

	public static void main(String[] args) {
		//soru 4)Kullanicidan 100'den kucuk bir tam sayi isteyin.
		//1'den baslayarak girilen sayiya kadar 
		//3'un kati olan sayilari yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen 100'den kucuk bir tam sayi girin: ");
		int num =scan.nextInt();
		//sayi negatif ise veya tam sayi degilse uyari verin
		for (int i = 1; i <=num; i++) {
			if (i%3==0) {
				System.out.print(i + " ");
			}
		}
		
		

	}

}
