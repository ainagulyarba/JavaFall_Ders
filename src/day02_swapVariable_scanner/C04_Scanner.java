package day02_swapVariable_scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		// Kullanicidan isim ve soyismini ayri ayri isteyip
        // girilen ismi asagidaki gibi yazdiriniz
        
        // girilen isim : Mehmet Bulutluoz
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Lutfen isminizi giriniz...");
        
        String isim=scan.next();
        
        System.out.println("Lutfen soyisminizi yaziniz...");
        
        String soyisim=scan.next();
        
        System.out.println("girilen isim : " + isim + " " + soyisim );
        
	}

}