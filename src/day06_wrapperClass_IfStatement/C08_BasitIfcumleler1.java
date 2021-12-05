package day06_wrapperClass_IfStatement;

import java.util.Scanner;

public class C08_BasitIfcumleler1 {

	public static void main(String[] args) {
		
		        // Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		        //         ve dikdortgenin kare olup olmadigini yazdirin
		        
		        Scanner scan = new Scanner(System.in);
		        
		        System.out.println("Lutfen dikdorgenin bir kenar uzunlugunu girin");
		        
		        double kenar1=scan.nextDouble();
		        
		        System.out.println("Lutfen dikdorgenin diger kenar uzunlugunu girin");
		        
		        double kenar2=scan.nextDouble();
		        
		        
		        if (kenar1==kenar2) {
		            System.out.println("girilen dikdortgen kare");
		        }
		        
		        if (kenar1!=kenar2) {
		            System.out.println("girilen dikdortgen kare degil");
		        }
		       
		        // main method sonu
		        // class sonu
		    } 
	

	}


