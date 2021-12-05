package day08_ifElse_Nested;

import java.util.Scanner;

public class C08_NestedIf {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen cinsiyetinizi girin \nErkek icin E, Kadin icin K");
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen yasinizi girin");
		double yas=scan.nextDouble();
		
		if (cinsiyet=='E') {
			if (yas>65) {
				System.out.println("emekli olabilirsin");
			} 
			else  {
				System.out.println("Emekli olamazsin"); } 
			} 
		
		else if(cinsiyet=='K') {
			if (yas>=60) {
				System.out.println("emekli olabilirsin"); } 
			else {
				System.out.println("Emekli olamazsin"); }
			} 
			else {
				System.out.println("Lutfen cinsiyet icin gecerli bir har secin"); }
		}

}
