package day16_forLoop;

import java.util.Scanner;

public class C06_soru4V {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen 100'den kucuk bir tam sayi girin: ");
		double num =scan.nextDouble();	
		int sayi=(int) num;
		
		//sayi negatif ise veya tam sayi degilse uyari verelim
		
		if (num<0) {
			System.out.println("negatif sayi giremezsiniz");
		} else if (sayi!=num) {
			System.out.println("Lutfen tam sayi giriniz");
		} else if(sayi>100){
			System.out.println("lutfen 100'den kucuk sayi giriniz");
		}else {
	
			for (int i=1 ; i<=num ; i++) {
		if (i%3==0) {
			System.out.print(i + " ");
		}
	}
		}
	
	}

}
