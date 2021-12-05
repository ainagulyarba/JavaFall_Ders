package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C06_whileLoop {

	public static void main(String[] args) {
		//kullanicidan toplamak uzere sayilar isteyin
		//sayi adedi 10'u gecerse veya toplam 500'u gecerse
		//"bu kadar sayi yeter, ...adet sayi girdin,toplami..." yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		int sayi = 0;
		int adet = 0;
		int toplam =0;
		
		while (!(adet>10 || toplam>500)) {
			System.out.println("Lutfen bir sayi giriniz:");
			sayi = scan.nextInt();
			toplam+=sayi;//toplam=toplam+sayi;
			adet=adet+1;//adet++;
		
		}
		
		System.out.println("bu kadar sayi yeter, " + adet + " adet sayi girdin, toplami: " + toplam);
		
		
		
		
	}

}
