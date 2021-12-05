package day17_forLoop;

import java.util.Scanner;

public class C03_soru8 {

	public static void main(String[] args) {
		//Soru 8 ) Interview Question Kullanicidan bir String isteyin 
        //ve Stringi tersine ceviren bir method yazin.	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir yazi girin:");
		String str = scan.next();
		System.out.println(tersineCevir (str));;
		
		
	}

	public static String tersineCevir(String str) {
		String tersStr="";
		
		for (int i = str.length()-1; i>=0; i--) {
			tersStr+=str.substring(i, i+1);

	
		}
		
		return tersStr;
	}

}
