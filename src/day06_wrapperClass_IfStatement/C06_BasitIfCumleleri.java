package day06_wrapperClass_IfStatement;

import java.util.Scanner;

public class C06_BasitIfCumleleri {

	public static void main(String[] args) {
		
		//soru &) Kullanicidan bir tamsayi ISTEYIN VE SAYININ tek veya cift oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("girdiginiz sayi cift bir sayi");
		}
		
		if (sayi%2==0) {
			System.out.println("girdiginiz sayi tek bir sayi");
		}
		
		}

	}


