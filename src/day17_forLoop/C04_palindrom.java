package day17_forLoop;

import java.util.Scanner;

public class C04_palindrom {

	public static void main(String[] args) {
		//Soru 9 ) Interview Question: Kullanicidan bir String isteyin.
       //Kullanicinin girdigi String?in palindrome olup olmadigini kontrol eden bir program yazin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir yazi girin:");
		String str = scan.next();
		
		if (str.equals(tersineCevir(str))) {
			System.out.println("Girdiginiz String palindrome");
		}
			System.out.println("Girdiginiz String palindrome degil");	
		
	}

	public static String tersineCevir(String str) {
		String tersStr="";
		
		for (int i = str.length()-1; i>=0; i--) {
			tersStr+=str.substring(i, i+1);

	
		}
		
		return tersStr;
		
		
		
	}

}
